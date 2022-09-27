/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author martin puga
 */
public class Cuenta {
    
    
    private String tipoCuenta;
    private String titular;
    private double saldo;
    public Cuenta(String tipoCuenta, String titular, double saldo) {
        this.tipoCuenta = tipoCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }
   
    public String getTipoCuenta() {
        return tipoCuenta;
    }
   
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setTipoCuenta(String tipo) {
        this.tipoCuenta = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
       
    public void retiro(double monto) {
        this.saldo = saldo - monto;
    }
   
    public void deposito(double monto) {
        this.saldo = saldo + monto;
    }
    

}
