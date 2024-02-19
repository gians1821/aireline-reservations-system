/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;
import entidades.*;

/**
 *
 * @author RenzoF
 */
public class ListaAsientosAbordo {
    private NodoAsientoAbordo inicio;

    public ListaAsientosAbordo() {
        this.inicio = null;
    }

    public void agregarAsientoAbordo(int numeroAsiento, Cliente cliente) {
        NodoAsientoAbordo nuevo = new NodoAsientoAbordo(numeroAsiento, cliente);
        if (inicio == null) {
            inicio = nuevo;
        } else {
            NodoAsientoAbordo actual = inicio;
            while (actual.getSgte() != null) {
                actual = actual.getSgte();
            }
            actual.setSgte(nuevo);
        }
    }
    
    public void eliminarAsientoAbordo(int numeroAsiento) {
        if(inicio== null) {
            return;
        }
        if (inicio.getNumeroAsiento()== numeroAsiento) {
            inicio= inicio.getSgte();
            return;
        }   
        NodoAsientoAbordo anterior = inicio;
        NodoAsientoAbordo actual = inicio.getSgte();
        while(actual != null && actual.getNumeroAsiento() != numeroAsiento) {
            anterior = actual;
            actual = actual.getSgte();
        }
        if (actual != null) {
            anterior.setSgte(actual.getSgte());
        }
    }
}
