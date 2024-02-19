/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;
import entidades.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListaEmpleados {
    private NodoEmpleado inicio;
    public static ListaEmpleados le = new ListaEmpleados();

    // Constructor
    public ListaEmpleados() {
        this.inicio= null;
    }

    // Método para insertar un empleado al final de la lista
    public void InsertarFinal(Empleado empleado) {
        NodoEmpleado nuevo = new NodoEmpleado(empleado);
        if (inicio== null) {
            inicio= nuevo;
        } 
        else {
            NodoEmpleado actual= inicio;
            while (actual.getSgte() != null) {
                actual = actual.getSgte();
            }
            actual.setSgte(nuevo);
        }
    }

    public NodoEmpleado Buscar(String dni) {
        NodoEmpleado p= inicio;
        while (p!= null) {
            if(p.getInfo().getDni().equals(dni)) {
                JOptionPane.showMessageDialog(null, "Empleado encontrado:\nNombre: " + p.getInfo().getNombre() + "\nDNI: " + p.getInfo().getDni());
                return p;
            }
            p= p.getSgte();
        }
        JOptionPane.showMessageDialog(null, "Empleado con DNI " + dni + " no encontrado");
        return null;
    }
    
    public int contar(){
        int c=0;
        NodoEmpleado p=inicio;
        while(p!=null){
            c++;
            p=p.getSgte();
        }
        return c;
    }

    public boolean Eliminar(String dni) {
        if(inicio== null) {
            return false;
        }
        if(inicio.getInfo().getDni().equals(dni)) {
            inicio= inicio.getSgte();
            return true;
        } 
        else {
            NodoEmpleado ant= inicio;
            NodoEmpleado p= inicio.getSgte();
            while (p!= null && !p.getInfo().getDni().equals(dni)) {
                ant= p;
                p= p.getSgte();
            }
            if(p!= null) {
                ant.setSgte(p.getSgte());
                return true;
            } 
            else {
                return false;
            }
        }
    }
    public void Mostrar(DefaultTableModel modeloListaEmpleados) {
        modeloListaEmpleados.setRowCount(0);
        NodoEmpleado p= inicio;
        while(p!= null){
            Empleado empleado= p.getInfo();
            Object[] fila={empleado.getNombre(),empleado.getDni()};
            modeloListaEmpleados.addRow(fila);
            p= p.getSgte();
        }
    }
    
    public String[] obtenerNombresEmpleados() {
        String[] nombres= new String[contar()];
        NodoEmpleado p= inicio;
        for(int i=0;i<contar();i++){
            if(p!=null){
                nombres[i] = p.getInfo().getNombre();
                p = p.getSgte();
            }
        }
        return nombres;
    }
    
    public NodoEmpleado getInicio() {
        return inicio;
    }
}
