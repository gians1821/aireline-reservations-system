/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;
import operaciones.*;

/**
 *
 * @author RenzoF
 */
public class Avion {
    private String nombre;
    private int capacidad;
    private int añoFabricacion;
    private Capitan capitan;
    private SubCapitan subcapitan;
    private String id;
    private ListaAsientosAbordo clientesAbordo;

    public Avion(String nombre, int capacidad, int añoFabricacion, Capitan capitan, SubCapitan subcapitan, String id) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.añoFabricacion = añoFabricacion;
        this.capitan = capitan;
        this.subcapitan = subcapitan;
        this.id = id;
        this.clientesAbordo=new ListaAsientosAbordo();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public Capitan getCapitan() {
        return capitan;
    }

    public void setCapitan(Capitan capitan) {
        this.capitan = capitan;
    }

    public SubCapitan getSubcapitan() {
        return subcapitan;
    }

    public void setSubcapitan(SubCapitan subcapitan) {
        this.subcapitan = subcapitan;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public ListaAsientosAbordo getClientesAbordo() {
        return clientesAbordo;
    }
    
    public void agregarClienteAbordo(int numeroAsiento, Cliente cliente){
        clientesAbordo.agregarAsientoAbordo(capacidad, cliente);
    }
  
}
