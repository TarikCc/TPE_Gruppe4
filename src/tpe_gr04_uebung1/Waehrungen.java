package tpe_gr04_uebung1;

/**
 * Diese Klasse enthält vorgefertigte Objekte von Waehrungen mit den jeweiligen
 * Wechselkursen, dient zur Wiederverwundung innerhalb des Programms DOLLAR ,
 * EURO, YEN , RUBEL, SCHWEIZER FRANKEN
 * 
 * @author Tarik, Mani, Fabienne
 *
 */

public class Waehrungen {

	public static final Waehrung DOLLAR = new Waehrung("DOLLAR", "$", 10000);

	public static final Waehrung EURO = new Waehrung("EURO", "€", 12690);

	public static final Waehrung YEN = new Waehrung("YEN", "¥", 91);

	public static final Waehrung RUBEL = new Waehrung("RUBEL", "RUB", 255);

	public static final Waehrung CHF = new Waehrung("Schweizer Franken", "CHF",
			10509);
}
