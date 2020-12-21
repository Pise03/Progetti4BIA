/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Alessandro
 */
public class TriangoloTest {
    
    public TriangoloTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of Classifica method, of class Triangolo.
     */
    @Test
    public void testClassifica() {
        System.out.println("Classifica");
        Triangolo instance = new Triangolo(32,32,15);
        int expResult = 2;
        int result = instance.Classifica();
        assertEquals(expResult, result); 
    }

    /**
     * Test of perimetro method, of class Triangolo.
     */
    @Test
    public void testPerimetro() {
        System.out.println("perimetro");
        Triangolo instance = new Triangolo(32,32,15);
        double expResult = 79;
        double result = instance.perimetro();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of area method, of class Triangolo.
     */
    @Test
    public void testArea() {
        System.out.println("area");
        double altezza = 20;
        Triangolo instance = new Triangolo(32,32,15);
        double expResult = 320;
        double result = instance.area(altezza);
        assertEquals(expResult, result, 0.0);
    }
    
}
