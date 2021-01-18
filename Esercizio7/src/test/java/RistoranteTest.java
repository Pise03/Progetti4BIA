/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Vector;
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
public class RistoranteTest {
    
    public RistoranteTest() {
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
     * Test of aggiungiPiatti method, of class Ristorante.
     */
    @Test
    public void testAggiungiPiatti() {
        System.out.println("aggiungiPiatti");
        piatto x = new piatto("Pasta", "Primo");
        Ristorante z = new Ristorante();
        z.aggiungiPiatti(x);
        assertEquals(z.getElenco_piatti().elementAt(0),x); 
    }

    /**
     * Test of rimuovi method, of class Ristorante.
     */
    @Test
    public void testRimuovi() {
        System.out.println("rimuovi");
        piatto x = null;
        Ristorante instance = new Ristorante();
        boolean expResult = false;
        boolean result = instance.rimuovi(x);
        assertEquals(expResult, result);
    }

    /**
     * Test of aggiungiOrdinazioni method, of class Ristorante.
     */
    @Test
    public void testAggiungiOrdinazioni() {
        System.out.println("aggiungiOrdinazioni");
        double prezzo = 10;
        Vector<piatto> lista = new Vector();
        ordine x = new ordine(lista, prezzo);
        Ristorante z = new Ristorante();
        z.aggiungiOrdinazioni(x);
        assertEquals(z.getElencoOrdinato().elementAt(0), x);
    }

    /**
     * Test of rimuoviOrdinazioni method, of class Ristorante.
     */
    @Test
    public void testRimuoviOrdinazioni() {
        System.out.println("rimuoviOrdinazioni");
        ordine x = null;
        Ristorante instance = new Ristorante();
        boolean expResult = false;
        boolean result = instance.rimuoviOrdinazioni(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cambioOrdine method, of class Ristorante.
     */
    @Test
    public void testCambioOrdine() {
        System.out.println("cambioOrdine");
        ordine x = null;
        int numeroOrdine = 0;
        Ristorante instance = new Ristorante();
        boolean expResult = false;
        boolean result = instance.cambioOrdine(x, numeroOrdine);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of incassoGiornaliero method, of class Ristorante.
     */
    @Test
    public void testIncassoGiornaliero() {
        System.out.println("incassoGiornaliero");
        Ristorante instance = new Ristorante();
        double expResult = 0.0;
        double result = instance.incassoGiornaliero();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of importoMaggiore method, of class Ristorante.
     */
    @Test
    public void testImportoMaggiore() {
        System.out.println("importoMaggiore");
        Ristorante instance = new Ristorante();
        double expResult = 0.0;
        double result = instance.importoMaggiore();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of elencoOrdinato method, of class Ristorante.
     */
    @Test
    public void testElencoOrdinato() {
        System.out.println("elencoOrdinato");
        Ristorante instance = new Ristorante();
        instance.elencoOrdinato();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stringa method, of class Ristorante.
     */
    @Test
    public void testStringa() {
        System.out.println("stringa");
        Ristorante instance = new Ristorante();
        instance.stringa();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrdiniCameriere method, of class Ristorante.
     */
    @Test
    public void testGetOrdiniCameriere() {
        System.out.println("getOrdiniCameriere");
        String nome = "";
        Ristorante instance = new Ristorante();
        Vector<ordine> expResult = null;
        Vector<ordine> result = instance.getOrdiniCameriere(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
