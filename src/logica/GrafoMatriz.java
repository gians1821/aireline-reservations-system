/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import javax.swing.JOptionPane;

/**
 *
 * @author espin
 */
public class GrafoMatriz {
    
    private final int numVertice;
    private final int ma[][];
    private final Vertice [] vertices;
    private final boolean[] visitado;
    private final boolean[] visitado2;
    
   
    public GrafoMatriz(int n){
        numVertice=n;
        ma=new int[n+1][n+1];
        vertices = new Vertice[n];
        for (int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                ma[i][j]=0;
            }
        }
        visitado = new boolean[n + 1];
        visitado2 = new boolean[n + 1];
    }
    
    public void InsertarArista(int i,int j,int distancia){
        ma[i][j]=distancia ;
        ma[j][i]=distancia;
    }
    //Este metodo sirve para agregar el nombre (CIUDAD) de cada vertice del grafo
    public void insertarVertice(int indice, String nombre) {
        vertices[indice] = new Vertice(nombre);
    }

    public int buscarVertice(String nombre){
        int i;
        for(i=0;i<numVertice;i++){
            if(vertices[i].getNombre().equalsIgnoreCase(nombre))
                return i;
        }
        return -1;
    }
    
    
    public String obtenerNombreVertice(int indice) {
    if(indice>= 0 && indice < numVertice && vertices[indice]!= null) {
        return vertices[indice].getNombre();
    } 
    else {
        // Manejar el caso en que el índice esté fuera de rango o el vértice sea nulo
        return "Vértice no encontrado";
    }
}
    
    private int MinDistancia(int[] distancias, Boolean[] visitados) {
        int distanciaMinima = Integer.MAX_VALUE;
        int indiceMinimo = -1;

        for(int vertice= 0; vertice< numVertice; vertice++)
            if (!visitados[vertice] && distancias[vertice] <= distanciaMinima) {
                distanciaMinima = distancias[vertice];
                indiceMinimo = vertice;
            }

        return indiceMinimo;
    }
    //  -  -  -  - D I J K S T R A - - - - -

    public void calcularDijkstra(int nodoOrigen, int nodoDestino) {
        int[] distancias = new int[numVertice];
        Boolean[] visitados = new Boolean[numVertice];
        int[] predecesores = new int[numVertice];
        
        
        //ESTADOS INICIALES DE TODOS LOS NODOS

        for(int i= 0; i< numVertice; i++) { //Se recorre todos los nodos del grafo
            distancias[i]= Integer.MAX_VALUE; // Declaramos todas las distancias en infinito
            visitados[i]= false; //Colocamos a todos los nodos como NO visitados
            predecesores[i]= -1;   //Indica que que no se ha encontrado ningún predecesor
        }

        distancias[nodoOrigen] = 0; //Declaramos la distancia del nodo origen así sisma como 0

        
        //ESTADO FINAL DE LOS NODOS
        
        //Recorremos todos los vertices hasta numVertice-1 ya que nos aseguraremos de visitar todos los nodos excepto el nodo del inicio
        for(int c=0;c< numVertice-1;c++) {
            //Selecciona el nodo con la distancia mínima no visitada utilizando la función MinDistancia y lo almacena en la variable u.
            int u= MinDistancia(distancias,visitados);
            //Marcamos el nodo visitado en true
            visitados[u] = true;
            //Ahora iteramos sobre los nodos vecinos
            for(int v= 0; v <numVertice; v++)
                if(!visitados[v] && ma[u][v]!= 0 && //Si el nodo vecino no ha sido visitado y si existe una conexción entre el nodo seleccionado y el nodo vecino
                    //Si el camino hacia el nodo vecino a través del nodo seleccionado es mas corto que el camino actual almacenado en distancia[v]
                    distancias[u]!= Integer.MAX_VALUE &&
                    distancias[u]+ ma[u][v] < distancias[v])
                {
                    //Actualizamos la distancia mas corta hacia el nodo vecino
                    distancias[v]= distancias[u] + ma[u][v];
                    //Actualizamos el predecesor del nodo vecino en el camino mas corto
                    predecesores[v]= u;
                }
        }
        // Mostrar el camino más corto para el destino especificado
        mostrarResultados(distancias, predecesores, nodoOrigen, nodoDestino);
    }

    // Método para mostrar el camino más corto desde el origen hasta el destino
    private void mostrarResultados(int[] distancias, int[] predecesores, int nodoOrigen, int destino) {
        if (destino >numVertice) { 
            JOptionPane.showMessageDialog(null, "El nodo de destino especificado excede el tamaño del grafo", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        StringBuilder mensaje = new StringBuilder();
        if (distancias[destino] == Integer.MAX_VALUE) {
            mensaje.append("No existe un camino desde el nodo ").append(obtenerNombreVertice(nodoOrigen)).append(" hasta ").append(obtenerNombreVertice(destino));
        } else {
            mensaje.append("La menor distancia entre ").append(obtenerNombreVertice(nodoOrigen)).append(" a su destino ").append(obtenerNombreVertice(destino)).append(" es de ").append(distancias[destino]).append(" KM \nRecorrido eficiente: \n");
            imprimirCamino(predecesores, destino, mensaje);
        }

        JOptionPane.showMessageDialog(null, mensaje.toString(), "Resultado de Dijkstra", JOptionPane.INFORMATION_MESSAGE);
    }
    private void imprimirCamino(int[] predecesores, int destino, StringBuilder mensaje) {
        if (destino == -1) { // 
            return;
        }
        imprimirCamino(predecesores, predecesores[destino], mensaje); // Llamada recursiva para el predecesor de destino
        mensaje.append(obtenerNombreVertice(destino)).append("     ");
    }

    public int GradoNoDirigidos(int v){ //Para recorrer filas 
        int g=0;
        for (int j=1;j<=numVertice;j++){
            if(ma[v][j]==ma[j][v]){
                g++;
            } 
        }
        return g;    
    }
    
}
