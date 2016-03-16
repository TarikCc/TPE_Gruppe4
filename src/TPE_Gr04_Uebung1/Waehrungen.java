package TPE_Gr04_Uebung1;

public class Waehrungen {
	 /** US-Dollar */
		public static final Waehrung DOLLAR = new Waehrungen ("Dollar", "$", 10000 ,  true);

	    /** EURO */
	    public static final Waehrung  EURO   = new Waehrungen ( "Euro", "€",  12690 ,  true);
	    
	    /** Japanischer Yen */
	    public static final Waehrung  YEN    = new Waehrungen ( "Yen", "¥",  91 ,  false);

	    /** Rubel der russischen Foerderation */
	    public static final Waehrung RUBEL  = new Waehrungen ( "Rubel", "RUB",  255 ,  true);
	    		
	    /** Schweizer Franken */
	    public static final Waehrung CHF    = new Waehrungen ( "Schweizer Franken", "CHF",  10509 ,  true);
	}

