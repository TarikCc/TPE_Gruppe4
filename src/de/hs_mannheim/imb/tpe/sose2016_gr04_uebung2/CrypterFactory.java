package de.hs_mannheim.imb.tpe.sose2016_gr04_uebung2;

public class CrypterFactory {

	public static Crypter crypterTyp(VerschluesselungsTyp typ) {
		if (typ == VerschluesselungsTyp.CAESAR) {
			return new CrypterCaesar();
		} else if (typ == VerschluesselungsTyp.SUBSTITUTION) {
			return new CrypterSubstitution();
		} else if (typ == VerschluesselungsTyp.XOR) {
			return new CrypterSubstitution();
		} else {
			throw new IllegalArgumentException("Unbekannter Verschlüsselungstyp");
		}

	}
}
