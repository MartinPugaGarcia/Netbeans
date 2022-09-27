/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseabstractcapersonal;

/**
 *
 * @author Martin Puga
 */
public class Perro extends Animal {
    
    public Perro(){
        super();
        setNombre("Perro");
    }
    
    @Override
    public void moverse(){
        System.out.println("El perro se esta moviendo");
    }
}
