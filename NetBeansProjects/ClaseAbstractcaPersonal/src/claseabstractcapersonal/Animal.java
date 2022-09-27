/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseabstractcapersonal;

/**
 *
 * @author Martin Puga
 */
public abstract class Animal {
    private String nombre;
    
    public Animal(){
    }
    public void setNombre(String s){
        nombre=s;
    }
    public void comer(){
        System.out.println("El "+nombre+" esta comiendo.");
    }
    public abstract void moverse();
    
    public String getNombre(){
        return nombre;
    }
    
}
