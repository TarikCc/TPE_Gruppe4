package tpe_gr04_uebung1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BetragTest {


	@Test
	public void testCreation() {
		
		Betrag test = new Betrag (20000, Waehrungen.DOLLAR);
		
		assertEquals(20000, test.getBetrag());
		assertEquals(Waehrungen.DOLLAR, test.getWaehrung());
		
		Betrag test2 = new Betrag (10.000, Waehrungen.RUBEL);
		
		assertEquals(Waehrungen.RUBEL, test2.getWaehrung());
		assertEquals(100000, test2.getBetrag());
		
		
	}

	@Test
	public void testAddiere() {
       
		Betrag betrag1 = new Betrag(50000, Waehrungen.EURO);
		Betrag betrag2 = new Betrag(60000, Waehrungen.EURO);
		Betrag summe = new Betrag(110000, Waehrungen.EURO);
		
		assertEquals(betrag1.addiere(betrag2), summe);
	
		
		Betrag betrag3 = new Betrag(75380,Waehrungen.EURO);
		Betrag betrag4 = new Betrag(68281,Waehrungen.CHF);
		Betrag summe2= new Betrag (131925,Waehrungen.EURO);

		
		assertEquals(betrag3.addiere(betrag4), summe2);
		
		Betrag betrag5 = new Betrag (90000, Waehrungen.YEN);
		Betrag betrag6 = new Betrag (40000, Waehrungen.DOLLAR);
		Betrag summe3= new Betrag(4485604, Waehrungen.YEN);
		
		
		assertEquals(betrag5.addiere(betrag6), summe3);
		
		
		
		
	}

	@Test
	public void testSubtrahiere() {
		
		Betrag betrag1 = new Betrag (50000, Waehrungen.EURO);
		Betrag betrag2 = new Betrag (60000, Waehrungen.EURO);
		Betrag summe = new Betrag (-10000, Waehrungen.EURO);
		
		assertEquals(betrag1.subtrahiere(betrag2), summe);
	
		
		Betrag betrag3 = new Betrag (75380,Waehrungen.EURO);
		Betrag betrag4 = new Betrag(68281,Waehrungen.CHF);
		Betrag summe2= new Betrag (18835, Waehrungen.EURO);

		
		assertEquals(betrag3.subtrahiere(betrag4), summe2);
		
		Betrag betrag5 = new Betrag(90000, Waehrungen.YEN);
		Betrag betrag6 = new Betrag(40000, Waehrungen.DOLLAR);
		Betrag summe3= new Betrag(-4305604, Waehrungen.YEN);
		
		
		assertEquals(betrag5.subtrahiere(betrag6), summe3);

	}

	@Test
	public void testMulti() {
		Betrag testBetrag = new Betrag(50000,Waehrungen.CHF);
		Betrag summeBetrag = new Betrag (125000, Waehrungen.CHF);
		Betrag nullBetrag = new Betrag (0,Waehrungen.CHF);
		Betrag negativeBetrag = new Betrag (-150000, Waehrungen.CHF);
		
		assertEquals(testBetrag.multi(2.50), summeBetrag);
		assertEquals(testBetrag.multi(0), nullBetrag);
		assertEquals(testBetrag.multi(-3), negativeBetrag);
		
		
		Betrag produktBetrag = new Betrag (250000, Waehrungen.CHF);
		
		assertEquals(testBetrag.multi(5), produktBetrag);
		
	}

	public void testProzent() {
		
		Betrag prozentTest = new Betrag (343538, Waehrungen.CHF);
		Betrag prozentTest2 = new Betrag(111244, Waehrungen.DOLLAR);
	
		
		Betrag prozent1 = new Betrag (17176, Waehrungen.CHF);
		Betrag prozent2 = new Betrag ( 16686, Waehrungen.DOLLAR);
		Betrag prozentNull = new Betrag (0, Waehrungen.CHF);
		
		assertEquals(prozentTest.prozent(5), prozent1);
		assertEquals(prozentTest2.prozent(15), prozent2);
		assertEquals(prozentTest.prozent(0), prozentNull);
		
	}


	@Test
	public void testGetVorzeichen() {
		
		Betrag negativeBetrag = new Betrag (-100, Waehrungen.EURO);
		
		assertEquals(negativeBetrag.getVorzeichen(), -1);
		
		Betrag positiveBetrag = new Betrag (100, Waehrungen.EURO);
		
		assertEquals(positiveBetrag.getVorzeichen(), 1);
		
		Betrag zeroBetrag = new Betrag(0, Waehrungen.EURO);
		
		assertEquals(zeroBetrag.getVorzeichen(), 1);
	}

	@Test
	public void testInDouble() {
				
		Betrag negativeBetrag = new Betrag(-107362384, Waehrungen.EURO);
		
		assertEquals(negativeBetrag.inDouble(), -10736.23, 0.001d);
		
		Betrag positiveBetrag = new Betrag(107362384, Waehrungen.EURO);
		
		assertEquals(positiveBetrag.inDouble(), 10736.23, 0.001d);
		
		Betrag zeroBetrag = new Betrag(0, Waehrungen.EURO);
		
		assertEquals(zeroBetrag.inDouble(), 0.00, 0.001d);
	}

	@Test
	public void testGetWaehrung() {
		
		Betrag betragEuro = new Betrag(-232, Waehrungen.EURO);
		Betrag betragRubel = new Betrag(7436, Waehrungen.RUBEL);
		Betrag betragDollar = new Betrag(6783, Waehrungen.DOLLAR);
		Betrag betragYen = new Betrag(435, Waehrungen.YEN);
		Betrag betragChf = new Betrag(0, Waehrungen.CHF);
		
		assertEquals(betragEuro.getWaehrung(), Waehrungen.EURO);
		assertEquals(betragRubel.getWaehrung(), Waehrungen.RUBEL);
		assertEquals(betragDollar.getWaehrung(), Waehrungen.DOLLAR);
		assertEquals(betragYen.getWaehrung(), Waehrungen.YEN);
		assertEquals(betragChf.getWaehrung(), Waehrungen.CHF);
		
	}

	@Test
	public void testToString() {
		
		assertEquals("9900 RUB", new Betrag (9900, Waehrungen.RUBEL).toString());
		assertEquals("129000 €", new Betrag (129000, Waehrungen.EURO).toString());
		assertEquals("111900 $", new Betrag (111900, Waehrungen.DOLLAR).toString());
		assertEquals("11200 CHF", new Betrag(11200, Waehrungen.CHF).toString());
		assertEquals("329800 ¥", new Betrag(329800, Waehrungen.YEN).toString());
	}

	@Test
	public void testEqualsAndHashCode() {
		
		Betrag  betragEuro = new Betrag (-3232, Waehrungen.EURO);
		Betrag betragEuro2 = new Betrag (-3232, Waehrungen.EURO);
		Betrag  betragRubel = new Betrag (7436, Waehrungen.RUBEL);
		Betrag  betragDollar = new Betrag (6783,Waehrungen.DOLLAR);
		Betrag  betragYen = new Betrag (435, Waehrungen.YEN);
		Betrag  betragChf = new Betrag (0, Waehrungen.CHF);
		
		
		assertTrue(betragEuro.equals(betragEuro2));
		assertTrue(betragEuro2.equals(betragEuro));
		
		assertFalse(betragEuro.equals(betragYen));
		assertFalse(betragRubel.equals(betragDollar));
		assertFalse(betragChf.equals(betragYen));
		
		assertEquals(betragEuro.hashCode(), betragEuro2.hashCode());
		
	}
	
	@Test 
	public void testGetVorkomma() {
		
		Betrag betrag = new Betrag (12.10, Waehrungen.EURO);
		
		assertEquals(betrag.getVorkomma(), 12);
		
	}
	@Test
	public void testGetNachkomma() {
		
		Betrag betrag = new Betrag (12.55, Waehrungen.CHF);
		assertEquals(betrag.getNachkomma(),55);
	}
}
