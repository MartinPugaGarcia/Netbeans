/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseabstractcapersonal;

/**
 *
 * @author Martin Puga
 */
public class Ave extends Animal {
    
    public Ave(){
        super();
        setNombre("Ave");
    }
    @Override
    public void moverse(){
        System.out.println("El ave esta volando");
    }
}
