/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author RenzoF
 */
public class NodoPila {
    private int info;
    private NodoPila sgte;
    
    public NodoPila(){
        sgte=null;
    }
    public NodoPila (int x){
        info=x;
        sgte=null;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public NodoPila getSgte() {
        return sgte;
    }

    public void setSgte(NodoPila sgte) {
        this.sgte = sgte;
    }  
}
