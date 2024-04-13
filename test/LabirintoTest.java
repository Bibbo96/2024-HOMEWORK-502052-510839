package it.uniroma3.diadia.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.ambienti.Stanza;


public class LabirintoTest {

	Labirinto l;
	Stanza b;
	Stanza d;
	
	@Before
	public void setup() {
		l=new Labirinto();
		l.creaStanze();
		b = new Stanza("Biblioteca");
	    d= new Stanza("DS1");
	}
	
	
	@Test
	public void testStanzaVincente() {
    assertEquals("Biblioteca",l.getStanzaVincente().getNome());
	}
    
	
	@Test
	public void testSetStanzaCorrente() {
	  l.setStanzaCorrente(d);
	 assertEquals(d, l.getStanzaCorrente() );
	}

	
	@Test
	public void testGetStanzaCorrente() {
		  assertEquals("Atrio",l.getStanzaCorrente().getNome());
	}


}
