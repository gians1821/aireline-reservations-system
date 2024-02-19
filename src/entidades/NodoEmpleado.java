/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author RenzoF
 */
public class NodoEmpleado {
    private Empleado info;
    private NodoEmpleado sgte;

    public NodoEmpleado() {
        this.info = null;
        this.sgte = null;
    }

    public NodoEmpleado(Empleado info) {
        this.info = info;
        this.sgte = null;
    }

    public Empleado getInfo() {
        return info;
    }

    public void setInfo(Empleado info) {
        this.info = info;
    }

    public NodoEmpleado getSgte() {
        return sgte;
    }

    public void setSgte(NodoEmpleado sgte) {
        this.sgte = sgte;
    } 
}
