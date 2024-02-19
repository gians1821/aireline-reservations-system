/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;
import entidades.*;
import javax.swing.JOptionPane;

/**
 *
 * @author RenzoF
 */
public class ListaAsientos {
   private NodoAsiento p;
   
   public ListaAsientos() {
        p = null;       
    }

    // Método para agregar un asiento a la lista
    public void agregar(int numeroAsiento) {
        NodoAsiento nuevo = new NodoAsiento(numeroAsiento);
        if (p== null) {
            p= nuevo;
        } else {
            NodoAsiento actual =p;
            while (actual.getSgte()!= null) {
                actual = actual.getSgte();
            }
            actual.setSgte(nuevo);
        }
    }
    
    public void agregarAsientosDisponibles(){
       if(p!= null) {
            return;
        }
        // Agregar los 20 asientos disponibles en el avión
        for(int i= 1;i<=20;i++) {
            agregar(i);
        }
        JOptionPane.showMessageDialog(null, mostrarDisponibles());
    }

    // Método para verificar si un asiento está ocupado
    public boolean contiene(int numeroAsiento) {
        NodoAsiento actual =p;
        while(actual!= null) {
            if(actual.getNumeroAsiento() == numeroAsiento && actual.esOcupado()) {
                return true;
            }
            actual = actual.getSgte();
        }
        return false;
    } 
    
    public StringBuilder mostrarDisponibles(){
        NodoAsiento actual = p;
        StringBuilder cadena = new StringBuilder();
        cadena.append("Asientos Desocupados: ").append("\n");
        while(actual!=null){
            if(!actual.esOcupado()){
                cadena.append(actual.getNumeroAsiento()).append("\n");
            }
            actual=actual.getSgte();
        }
        return cadena;
    }
}
