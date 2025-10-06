/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.session3;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Leonardo Chavez
 */
public class CuentaTest {

    private static Cuenta cuenta;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        cuenta = new Cuenta(0);
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
    }

    @BeforeEach
    void setUp() throws Exception {
        cuenta.setSaldo(0.0);
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    void testIngresar() {
        cuenta.ingresar(500.0);
        assertEquals(500, cuenta.getSaldo());
    }

    @Test
    void testRetirar() {
        cuenta.retirar(500.0);
        assertEquals(-500, cuenta.getSaldo());
    }
}
