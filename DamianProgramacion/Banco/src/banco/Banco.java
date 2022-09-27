/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author martin puga
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Util u = new Util();
        u.menu();
    
    }
}

class Util {
    Scanner input = new Scanner(System.in);
    String opcion;
    Cuenta[] arregloCuenta = new Cuenta[20];
    boolean salir = false;

    public void menu() {
        do {
            System.out.println("1 para Crear Cuenta.\n2 para Retiro.\n3 para Deposito.\n4 para mostrar Saldo\n5 para Salir");
            opcion = input.next();


            switch (opcion) {
                case "1":

                    System.out.println("Introduzca un ID de cuenta: ");
                    int id = input.nextInt();
                    System.out.println("Introduzca tipo de cuenta: ");
                    String tipoCuenta = input.next();
                    System.out.println("Introduzca nombre del titular: ");
                    String titular = input.next();
                    System.out.println("Introduzca saldo: ");
                    double saldo = input.nextDouble();
                    Cuenta nuevaCuenta = new Cuenta(tipoCuenta, titular, saldo);
                    arregloCuenta[id] = nuevaCuenta;
                    break;

                case "2":

                    System.out.println("Introduzca ID de cuenta: ");
                    id = input.nextInt();
                    System.out.println("Introduzca cantidad a retirar: ");
                    double retiro = input.nextDouble();
                    arregloCuenta[id].retiro(retiro);
                    System.out.println("Retiró de la cuenta: " + retiro + ".\nEl nuevo saldo es de: " + arregloCuenta[id].getSaldo());
                    break;

                case "3":
                    System.out.println("Introduzca numero de cuenta del depositante: ");
                    id = input.nextInt();
                    System.out.println("Introduzca cantidad a depositar: ");
                    double deposito = input.nextDouble();
                    arregloCuenta[id].retiro(deposito);
                    System.out.println("Introduzca numero de cuenta de la persona que recibe:");
                    id = input.nextInt();
                    arregloCuenta[id].deposito(deposito);
                    System.out.println("Depositó a la cuenta: " + deposito + ".\nEl nuevo saldo es de: " + arregloCuenta[id].getSaldo());
                    break;

                case "4":

                    System.out.println("Introduzca numero de cuenta: ");
                    id = input.nextInt();
                    System.out.println(arregloCuenta[id].getSaldo());
                    break;

                case "5":
                    salir = true;
                    break;

            }
        } while (salir == false);
    }
}


    

