package tpe_gr04_uebung1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WaehrungTest {

	@Test
	public void testWaherung() {
		Waehrung test = Waehrungen.EURO;
		Waehrung test2 = Waehrungen.CHF;
		Waehrung test3 = Waehrungen.DOLLAR;
		Waehrung test4 = Waehrungen.RUBEL;
		Waehrung test5 = Waehrungen.YEN;
		

		assertEquals(test.getName(), "EURO");
		assertEquals(test.getKuerzel(), "€");
		assertEquals(test.getKurs(), 12690);

		assertEquals(test2.getName(), "Schweizer Franken");
		assertEquals(test2.getKuerzel(), "CHF");
		assertEquals(test2.getKurs(), 10509);
		
		assertEquals(test3.getName(), "DOLLAR");
		assertEquals(test3.getKuerzel(), "$");
		assertEquals(test3.getKurs(), 10000);
		
		assertEquals(test4.getName(), "RUBEL");
		assertEquals(test4.getKuerzel(), "RUB");
		assertEquals(test4.getKurs(), 255);
		
		assertEquals(test5.getName(), "YEN");
		assertEquals(test5.getKuerzel(), "¥");
		assertEquals(test5.getKurs(), 91);
		
	}

	@Test
	public void testUmrechnen() {
		Betrag betrag = new Betrag(10000, Waehrungen.EURO);
		Betrag betrag2 = new Betrag(24264,Waehrungen.CHF);

		assertEquals(
				betrag2.getWaehrung().umrechnen(betrag.getBetrag(),
						betrag.getWaehrung()), 8281);
		assertEquals(
				betrag.getWaehrung().umrechnen(betrag2.getBetrag(),
						betrag2.getWaehrung()), 29299);
	}
	
	@Test
	public void testGetKurs() {
		Waehrung test = Waehrungen.DOLLAR;
		Waehrung test1 = Waehrungen.CHF;
		Waehrung test2 = Waehrungen.EURO;
		Waehrung test3 = Waehrungen.RUBEL;
		Waehrung test4 = Waehrungen.YEN;
		

		assertEquals(test.getKurs(), 10000);
		assertEquals(test1.getKurs(), 10509);
		assertEquals(test2.getKurs(), 12690);
		assertEquals(test3.getKurs(), 255);
		assertEquals(test4.getKurs(), 91);
		
	}
	@Test
	public void testGetName() {
		Waehrung test1 = Waehrungen.CHF;
		Waehrung test2 = Waehrungen.DOLLAR;
		Waehrung test3 = Waehrungen.RUBEL;
		Waehrung test4 = Waehrungen.YEN;
		Waehrung test5 = Waehrungen.EURO;

		assertEquals(test1.getName(), "Schweizer Franken");
		assertEquals(test2.getName(), "DOLLAR");
		assertEquals(test3.getName(), "RUBEL");
		assertEquals(test4.getName(), "YEN");
		assertEquals(test5.getName(), "EURO");

	}

}