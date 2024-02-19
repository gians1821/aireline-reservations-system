/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author RenzoF
 */
public class NodoAsiento {
    private int numeroAsiento;
    private boolean ocupado;
    private NodoAsiento siguiente;

    
    public NodoAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
        this.ocupado=false;
        this.siguiente = null;
    }

    public NodoAsiento(int numeroAsiento, NodoAsiento siguiente) {
        this.numeroAsiento = numeroAsiento;
        this.siguiente = siguiente;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public NodoAsiento getSgte() {
        return siguiente;
    }

    public void setSgte(NodoAsiento siguiente) {
        this.siguiente = siguiente;
    } 
    
    public boolean esOcupado(){
        return ocupado;
    }
}
