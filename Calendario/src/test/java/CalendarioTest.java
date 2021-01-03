import java.util.Date;
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
public class CalendarioTest {
    
    public CalendarioTest() {
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
     * Test of giorno method, of class Calendario.
     */
    @Test
    public void testGiorno() {
        System.out.println("Giorno");
        Date data = new Date(2020, 1, 28);
        Calendario instance = new Calendario(data);
        String expResult = "Sabato";
        String result = instance.giorno();
        assertEquals(expResult, result);
    }

    /**
     * Test of GiornoDopo method, of class Calendario.
     */
    @Test
    public void testGiornoDopo() {
        System.out.println("GiornoDopo");
        Date data = new Date(2020, 1, 28);
        Calendario instance = new Calendario(data);
        int expResult = 29;
        int result = instance.GiornoDopo();
        assertEquals(expResult, result);
    }
    
}
