package com.mycompany.session3;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leonardo Chavez
 */
public class CalculadoraTest {

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
    }

    @BeforeEach
    void setUp() throws Exception {
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    void testSuma() {
        assertEquals(5, Calculadora.suma(2, 3));
    }

    @Test
    void testResta() {
        assertEquals(1, Calculadora.resta(3, 2));
    }

    @Test
    void testMultiplica() {
        assertEquals(6, Calculadora.multiplica(2, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2, Calculadora.divide(6, 3));
    }
}
