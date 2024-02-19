/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Random;

/**
 *
 * @author RenzoF
 */
public class Pila {
    private NodoPila p;
    
    
    public Pila(){
        p=null;
    }
    public boolean empty(){
        return p==null;
    }
    
    public void push(int x){
        NodoPila nuevo = new NodoPila(x);
        nuevo.setSgte(p);
        p=nuevo;
    }
    
    public int pop(){
        int cima = p.getInfo();
        p=p.getSgte();
        return cima;
    }
    
    public int top(){
        return p.getInfo();
    }
    public void clear(){
        while(p!=null){
            p=p.getSgte();
        }
    } 
    
    public void agregarIds() {
        Random random= new Random();
        while(tamaño()< 50){
            int nuevoId= 1000 + random.nextInt(9000); // Generar un número aleatorio de 4 cifras
            if(!existeId(nuevoId)) {
                push(nuevoId); // Agregar el nuevo ID a la pila si no existe
            }
        }
    }

    private boolean existeId(int id) {
        NodoPila temp= p;
        while(temp!= null){
            if(temp.getInfo()== id) {
                return true;
            }
            temp= temp.getSgte();
        }
        return false;
    }

    private int tamaño(){
        int c= 0;
        NodoPila temp= p;
        while(temp!= null){
            c++;
            temp= temp.getSgte();
        }
        return c;
    }
    
}
