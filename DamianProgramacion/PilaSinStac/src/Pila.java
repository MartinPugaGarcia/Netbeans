
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author martin puga
 */
public class Pila {
            Scanner teclado = new Scanner(System.in);
        int pilaNumerica[]=new int[5];
        int tope=-1;
        //Método para ingresar elementos a la pila:
        public void push() //tope=-1
        {
            if(tope>=pilaNumerica.length-1)
            {
                System.out.println("La pila está llena. ");
            }
            else
            {
                tope+=1; //tope=0
                System.out.println("Ingrese el dato: ");
                pilaNumerica[tope]=teclado.nextInt();
            }
        }
        public void pop()
        {
            if(tope==-1)
            {
                System.out.println("La pila está vacía.");
            }
            else{
                System.out.println("Se ha eliminado un elemento de la pila.");
                pilaNumerica[tope]=0;
            }
            tope--; 
        }
        public void mostrarPila()
        {
            for(int tope=4; tope>=0; tope--) 
            {
                System.out.println("Datos de la pila: "+pilaNumerica[tope]);
            }
        }
}
