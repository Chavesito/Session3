/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.session3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author Leonardo Chavez
 */
class Test0014 {

    @Test
    void flujoConDosCuentas_y_limiteMenos500() {
        Cuenta c1 = new Cuenta("12345", "Alice", 50);  
        Cuenta c2 = new Cuenta("67890", "Bob", 0);   

        List<String> errores = new ArrayList<>();

        // 1
        c1.reintegro(200);              // 50-200 = -150
        // 2
        c2.reintegro(350);              // 0-350 = -350
        // 3
        c1.ingreso(100);                // -150+100 = -50
        // 4 (debe fallar)
        try {
            c2.reintegro(200);
        } catch (IllegalStateException e) {
            errores.add("error(4): " + e.getMessage());
        }
        // 5
        c2.reintegro(150);              // -350-150 = -500
        // 6
        c1.reintegro(200);              // -50-200 = -250
        // 7
        c2.ingreso(50);                 // -500+50 = -450
        // 8 (debe fallar)
        try {
            c2.reintegro(100);
        } catch (IllegalStateException e) {
            errores.add("error(8): " + e.getMessage());
        }

        // Saldos finales esperados
        assertEquals(-250.0, c1.getSaldo());
        assertEquals(-450.0, c2.getSaldo());

        // Fallos esperados: pasos 4 y 8
        assertEquals(2, errores.size());

    }
}
