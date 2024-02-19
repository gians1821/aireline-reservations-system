/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;
import javax.swing.JOptionPane;
import operaciones.*;

/**
 *
 * @author RenzoF
 */
public class Empleado {
    private String nombre;
    private String dni;
    private final ListaClientes listaClientes;

    public Empleado(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.listaClientes=new ListaClientes();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public void asignarCapitan(Avion avion, Capitan capitan){
        avion.setCapitan(capitan);
    }
    
    public void asignarSCapitan(Avion avion, SubCapitan subcapitan){
        avion.setSubcapitan(subcapitan);
    }
    
    public void registrarCliente(Cliente cliente){
        listaClientes.InsertarFinal(cliente);
    }
    public void registrarNumeroAsiento(Cliente cliente, int numeroAsiento){
        cliente.setnAsiento(numeroAsiento);
    }
    
    public void registrarCostoPasaje(Cliente cliente, double costoPasaje) {
        cliente.setCostoPasaje(costoPasaje);
    }

    public void registrarID(Cliente cliente, String id) {
        cliente.setId(id);
    }

    public void asignarAvionYAgregarPasajero(Cliente cliente, Avion avion, int numeroAsiento) {
        cliente.setNombreAvion(avion.getNombre());
        if(avion.getClientesAbordo()!=null){
            avion.agregarClienteAbordo(numeroAsiento, cliente);
        }
        else{
            JOptionPane.showMessageDialog(null, "Error: La lista de pasajeros a bordo es nula.");
        }
    }
   
}
