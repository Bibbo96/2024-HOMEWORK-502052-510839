package it.uniroma3.diadia.test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class StanzaTest {
	// creo delle stanze 
		Stanza s1=  new Stanza("S1");
	    Stanza s2= new Stanza("s2");
        Attrezzo p= new Attrezzo("pistola", 50);


  @Test
  public void testGestStanzaAdiacente(){
	  assertNull(s1.getStanzaAdiacente("sud"));
  }

  @Test
  public void testImpostaStanzaAdiacente(){
	  s1.impostaStanzaAdiacente("sud", s2);
  }
  @Test
  public void testAddAttrezzo(){
	  assertTrue(s1.addAttrezzo(p));
  }








}

