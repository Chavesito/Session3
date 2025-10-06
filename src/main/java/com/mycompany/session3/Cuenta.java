/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.session3;

/**
 *
 * @author Leonardo Chavez
 */
class Cuenta {
    String numero;
    String titular;
    Double saldo;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Cuenta(double saldo) {
        // TODO Auto-generated constructor stub
        this.saldo = saldo;
    }

    public void ingresar(Double i) {
        // TODO Auto-generated method stub
        this.saldo += i;
    }

    public void retirar(Double i) {
        // TODO Auto-generated method stub
        this.saldo -= i;
    }
}
