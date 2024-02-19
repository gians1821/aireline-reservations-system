/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;
import entidades.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RenzoF
 */



//CLIENTES QUE TIENE UN DETERMINADO EMPLEADO




public class ListaClientes {
    private Nodo L;
    
    public void InsertarFinal(Cliente cliente){
        Nodo nuevo = new Nodo(cliente);
        if(L == null)
            L = nuevo;
        else{
           Nodo p = L;
           while(p.getSgte()!=null){
               p=p.getSgte();
           }
           p.setSgte(nuevo);       
        }
    }
    
    public boolean verificarID(String id){ //devuelve true si la ID ingresada pertenece a algún cliente
        Nodo p = L;
        while(p!=null){
            if(p.getInfo().getId().compareToIgnoreCase(id)==0)
                return true;
            p = p.getSgte();
        }
        return false;
    }
    
    public void Buscar(String id){ //el metodo que lo llama se asegura que el id se encuentre en la lista de clientes
        Nodo p = L;
        while(p!=null){
            if(p.getInfo().getId().compareToIgnoreCase(id)==0){
                JOptionPane.showMessageDialog(null, 
                            "DATOS DEL CLIENTE : \n" +
                            "NOMBRE: " + p.getInfo().getNombres()+ "\n" +
                            "DNI: " + p.getInfo().getDni()+ "\n" +
                            "DESTINO: " + p.getInfo().getDestino()+ "\n" +
                            "NUMERO DE ASIENTO: " +p.getInfo().getnAsiento() + "\n" +
                            "COSTO DEL PASAJE: " + p.getInfo().getCostoPasaje()+ "\n" +
                            "NOMBRE DEL AVION: " + p.getInfo().getNombreAvion() +  "\n" +
                            "CANTIDAD DE MALETAS: " + p.getInfo().getMaletas());
            }
            p = p.getSgte();
        }
    }
    
    public Cliente buscar (String id) {
        Nodo p = L;
        while (p != null) {
            if (p.getInfo().getId().compareToIgnoreCase(id) == 0) {
                return p.getInfo();
            }
            p = p.getSgte();
        }
        return null;
    }
    
    public boolean Eliminar(Cliente id){
        if(L.getInfo().equals(id)){
            L=L.getSgte();
            return true;
        }
        else{
            Nodo ant, p;
            ant = L;
            p=L.getSgte();
            while(p!=null && !p.getInfo().equals(id)){
                ant=p;
                p=p.getSgte();
            }
            if(p!=null){
                ant.setSgte(p.getSgte());
                return true;
            }
            else
                return false;
        } 
    }
    
    
    public void Modificar(String idCliente, double nuevoCostoPasaje, int nuevoNumeroAsiento, String nuevoDestino, String nuevoAvion) {
        if (L == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacía");
            return;
        }
        Nodo p = L;
        while (p != null) {
            if (p.getInfo().getId().equals(idCliente)) {
                p.getInfo().setnAsiento(nuevoNumeroAsiento);
                p.getInfo().setDestino(nuevoDestino);
                p.getInfo().setNombreAvion(nuevoAvion);
                p.getInfo().setCostoPasaje(nuevoCostoPasaje);
                JOptionPane.showMessageDialog(null, "Cliente modificado exitosamente");
                return;
            }
            p = p.getSgte();
        }
        JOptionPane.showMessageDialog(null, "Cliente con ID " + idCliente + " no encontrado");
    }
    
    public int contar(){
        int c=0;
        Nodo p = L;
        while(p!=null){
            c++;
            p = p.getSgte();
        }
        return c;
    }
    
    public void mostrar(DefaultTableModel modelo){
        
        Object datos[][] = new Object[contar()][8];
        String titulos[] = {"NOMBRES","DNI","DESTINO","N° ASIENTO","COSTO DEL PASAJE", "ID", "AVION", "N° MALETAS"};
        Nodo p = L;
        if(p!=null){
        for(int i=0;i<contar();i++){
            datos[i][0] = p.getInfo().getNombres();
            datos[i][1] = p.getInfo().getDni();
            datos[i][2] = p.getInfo().getDestino();
            datos[i][3] = p.getInfo().getnAsiento();
            datos[i][4] = p.getInfo().getCostoPasaje();
            datos[i][5] = p.getInfo().getId();
            datos[i][6] = p.getInfo().getNombreAvion();
            datos[i][7] = p.getInfo().getMaletas();
            p=p.getSgte();
        }
        }
        modelo.setDataVector(datos, titulos);
    }
    
    public ListaClientes obtenerClientesPorAvion(String nombreAvion){
        ListaClientes aux = new ListaClientes();
        Nodo p = L;
        while(p!=null){
            if(p.getInfo().getNombreAvion().compareToIgnoreCase(nombreAvion)==0){
                aux.InsertarFinal(p.getInfo());
            }
            p = p.getSgte();
        }
        return aux;
    }
    
}
