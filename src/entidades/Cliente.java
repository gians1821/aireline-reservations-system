/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author RenzoF
 */
public class Cliente {
    private String nombres;
    private String dni;
    private String destino;
    private int nAsiento;
    private double costoPasaje;
    private String id;
    private String nombreAvion;
    private int maletas;

    public Cliente(String nombres, String dni, String destino, int nAsiento, double costoPasaje, String id, String nombreAvion, int maletas) {
        this.nombres = nombres;
        this.dni = dni;
        this.destino = destino;
        this.nAsiento = nAsiento;
        this.costoPasaje = costoPasaje;
        this.id = id;
        this.nombreAvion = nombreAvion;
        this.maletas = maletas;
    }

    public Cliente(String id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getnAsiento() {
        return nAsiento;
    }

    public void setnAsiento(int nAsiento) {
        this.nAsiento = nAsiento;
    }

    public double getCostoPasaje() {
        return costoPasaje + calcularPMaletas(maletas);
    }

    public void setCostoPasaje(double costoPasaje) {
        this.costoPasaje = costoPasaje;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreAvion() {
        return nombreAvion;
    }

    public void setNombreAvion(String nombreAvion) {
        this.nombreAvion = nombreAvion;
    }

    public int getMaletas() {
        return maletas;
    }

    public void setMaletas(int maletas) {
        this.maletas = maletas;
    }
    
    public double calcularPMaletas(int maletas){
        return 500*maletas;
    }
    
    
    
    
}
