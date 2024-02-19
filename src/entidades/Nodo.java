/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author RenzoF
 */
public class Nodo {
    private Cliente info;
    private Nodo sgte;
    
    public Nodo(){
        sgte=null;
    }
    //Constructor para cuando queramos agregar al final
    public Nodo(Cliente cliente){
        info = cliente;
        sgte=null;
    }
    //Constructor para cuando queramos agregar al inicio
    public Nodo(Cliente cliente, Nodo sig){
        info = cliente;
        sgte=sig;
    }

    public Cliente getInfo() {
        return info;
    }

    public void setInfo(Cliente info) {
        this.info = info;
    }

    public Nodo getSgte() {
        return sgte;
    }
    
    public void setSgte(Nodo sgte) {
        this.sgte = sgte;
    }
    
}
