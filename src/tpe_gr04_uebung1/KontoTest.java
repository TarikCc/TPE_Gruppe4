package tpe_gr04_uebung1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class KontoTest {

		@Test
		public void testCreation() {
			Konto konto = new Konto("Kunde", new Betrag (100,Waehrungen.EURO));
			
			assertEquals("Kunde", konto.getInhaber());
			assertEquals(Waehrungen.EURO, konto.getWaehrung());
		}

		@Test
		public void testPost() {
			Konto konto = new Konto("Kunde", new Betrag (0,Waehrungen.EURO));
			konto.buche(new Betrag (100, Waehrungen.EURO));
			
			assertEquals(konto.saldo(), new Betrag (100, Waehrungen.EURO));
			
			konto.buche(new Betrag (80, Waehrungen.CHF));
			
			assertEquals(konto.saldo(), new Betrag (166, Waehrungen.EURO));
			
			
		}

		@Test
		public void testSaldo() {
			Konto konto = new Konto("Kunde", new Betrag (100,Waehrungen.EURO));
			Betrag betrag = new Betrag(100, Waehrungen.EURO);
			
			
			
			assertEquals(konto.saldo(),betrag);
			
			konto.buche(new Betrag (20,Waehrungen.EURO));
			Betrag betragNew = new Betrag (120,Waehrungen.EURO);
			
			assertEquals(konto.saldo(), betragNew);
		}

		@Test
		public void testGetWaehrung() {
			Konto kontoNew = new Konto ("Kunde", new Betrag (100,Waehrungen.CHF));
			Konto kontoNew2=new Konto ("Kunde1", new Betrag (100,Waehrungen.DOLLAR));
			
			assertEquals(kontoNew.getWaehrung(), Waehrungen.CHF);
			assertEquals(kontoNew2.getWaehrung(), Waehrungen.DOLLAR);
		}

		@Test
		public void testGetInhaber() {
			
			Konto kontoNew = new Konto ("Kunde", new Betrag (100,Waehrungen.CHF));
			Konto kontoNew2=new Konto ("Kunde1", new Betrag (100,Waehrungen.DOLLAR));
			
			assertEquals(kontoNew.getInhaber(), "Kunde");
			assertEquals(kontoNew2.getInhaber(), "Kunde1");
		}


		@Test
		public void testGebuehren() {
		Konto kontoNeu = new Konto("Kunde", new Betrag(100, Waehrungen.CHF));
		kontoNeu.gebuehren(2);

		Betrag promilleGuthaben = new Betrag (99.8, Waehrungen.CHF);

		assertEquals (kontoNeu.saldo(), promilleGuthaben);
		
		}

		@Test
		public void testToString() {
			Konto kontoNew = new Konto ("Kunde", new Betrag (10000,Waehrungen.CHF));
			
			String text= "Kontoinhaber: Kunde\nWährung: CHF\n ------\n ------\nSaldo:1.0 CHF";
			
			assertEquals(kontoNew.toString(), text);
			
			Konto kontoNew2= new Konto("Kunde Nr.2", new Betrag(0, Waehrungen.EURO));
			String text2 = "Kontoinhaber: Kunde Nr.2\nWährung: €\n ------\n1.0 €\n2.48 €\n-0.07 €\n ------\nSaldo:3.41 €";
			kontoNew2.buche(new Betrag(10000, Waehrungen.EURO));
			kontoNew2.buche(new Betrag(30000, Waehrungen.CHF));
			kontoNew2.buche(new Betrag(-100000, Waehrungen.YEN));
			
			assertEquals(kontoNew2.toString(), text2);
			
		}

		@Test
		public void testEqualsAndHashCode() {
			Konto kontoNew = new Konto ("Kunde", new Betrag (100,Waehrungen.CHF));
			Konto kontoNew1 = new Konto ("Kunde", new Betrag (100,Waehrungen.CHF));
			Konto kontoNew2=new Konto ("Kunde1", new Betrag (100,Waehrungen.DOLLAR));
			
			assertTrue(kontoNew.equals(kontoNew1));
			assertFalse(kontoNew.equals(kontoNew2));
			
			assertEquals(kontoNew.hashCode(), kontoNew1.hashCode());

		}
	}
