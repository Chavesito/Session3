/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.session3;

/**
 *
 * @author Leonardo Chavez
 */
public class Movimiento {

    private Double importe;
    private Signo signo;     
    private String detalle;

    public Movimiento(Double importe, Signo signo, String detalle) {
        this.importe = importe;
        this.signo = signo;
        this.detalle = detalle;
    }

    public Double getImporte() {
        return importe;
    }

    public Signo getSigno() {
        return signo;
    }

    public String getDetalle() {
        return detalle;
    }
}
