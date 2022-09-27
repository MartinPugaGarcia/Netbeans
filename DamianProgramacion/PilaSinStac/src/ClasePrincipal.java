
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author martin puga
 */
public class ClasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pila obj = new Pila();
        Scanner op= new Scanner(System.in);
        int opcion;
        do { 
            System.out.println("Menu de la pila: ");
            System.out.println("1.Ingresar elementos(push):");
            System.out.println("2.-Eliminar elementos (pop):");
            System.out.println("3.-Mostrar la pila completa: ");
            System.out.println("4.- Salir.");
            System.out.println("Ingrese una opción: ");
            opcion=op.nextInt();
            switch(opcion)
            {
                case 1:
                    obj.push();
                    break;
                case 2:
                    obj.pop();
                case 3:
                    obj.mostrarPila();
                case 4:
                    break;
                default:
                    System.out.println("\nIngrese una opción válida.");
            }
        } while(opcion!=4);
        
    }
    
}
