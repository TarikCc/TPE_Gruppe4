package de.hs_mannheim.imb.tpe.sose2016_gr04_uebung2;

public class CrypterFactory {
	/**
	 * Erzeugt die Verschl�sselungsimplementierungen
	 * und �bergabe des Schl�ssels
	 * 
	 * @param typ
	 * @param ki
	 * @return
	 * @throws CrypterException
	 */
	private static final String FEHLER = "Unbekannter Verschlüsselungstyp";
	public static Crypter crypterTyp(VerschluesselungsTyp typ, String ki)
			throws CrypterException {
		Key s = new Key();
		
		if (typ == VerschluesselungsTyp.CAESAR) {
			return new CrypterCaesar(s.schluessel(ki, typ));
		} else if (typ == VerschluesselungsTyp.SUBSTITUTION) {
			return new CrypterSubstitution(s.schluessel(ki, typ));
		} else if (typ == VerschluesselungsTyp.XOR) {
			return new CrypterSubstitution(s.schluessel(ki, typ));
		} else {
			throw new IllegalArgumentException(FEHLER);
		}
	}
}
