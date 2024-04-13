package it.uniroma3.diadia.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;
import it.uniroma3.diadia.giocatore.Borsa;

public class BorsaTest {

	private Borsa b= new Borsa();
	Attrezzo falce;
	Attrezzo katana;

	@Before
	public void steUp() {
		falce= new Attrezzo("falce", 12);
		katana= new Attrezzo("katana", 6);
	}

	@Test
	public void testAddAttrezzo(){
		assertTrue(b.addAttrezzo(katana));	
	}

    @Test
    public void testAggiungiAttrezzoConPesoMaggioreDiDieci() {
    	assertFalse(b.addAttrezzo(falce));
    }
    
    @Test
    public void testGetPeso(){
    	b.addAttrezzo(katana);
    	assertEquals(katana, b.getAttrezzo("katana"));
    }
    
    @Test
    public void testBorsaVuota() {
    	assertTrue(b.isEmpty());
    }
     
    @Test
    public void testRemoveAttrezzo(){
    	b.addAttrezzo(katana);
    	b.removeAttrezzo("katana");
    	assertTrue(b.isEmpty());
    
    }



}
