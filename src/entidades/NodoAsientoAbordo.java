/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author RenzoF
 */
public class NodoAsientoAbordo {
    private int numeroAsiento;
    private Cliente cliente;
    private NodoAsientoAbordo sgte;

    public NodoAsientoAbordo(int numeroAsiento, Cliente cliente) {
        this.numeroAsiento = numeroAsiento;
        this.cliente = cliente;
        this.sgte = null;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public NodoAsientoAbordo getSgte() {
        return sgte;
    }

    public void setSgte(NodoAsientoAbordo sgte) {
        this.sgte = sgte;
    }
}
