/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.session3;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Leonardo Chavez
 */

public class Cuenta {

    // Atributos del diagrama
    private String numero;
    private String titular;
    private Double saldo;

    // Composición 1..* con Movimiento
    private final List<Movimiento> movimientos = new ArrayList<>();

    public static final double LIMITE_DESCUBIERTO = -500.0;

    public Cuenta(String numero, String titular, double saldoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void ingreso(double cantidad) {
        saldo += cantidad;
        movimientos.add(new Movimiento(cantidad, Signo.H, "Ingreso"));
    }

    public void reintegro(double cantidad) {
        if (saldo - cantidad < LIMITE_DESCUBIERTO) {
            throw new IllegalStateException(
                    "Fondos insuficientes (saldo " + formato(saldo)
                    + ") para reintegro de " + formato(cantidad));
        }
        saldo -= cantidad;
        movimientos.add(new Movimiento(cantidad, Signo.D, "Reintegro"));
    }

    // --- Getters mínimos ---
    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public List<Movimiento> getMovimientos() {
        return movimientos;
    }

    private static String formato(double x) {
        return String.format("%.0f€", x);
    }
}
