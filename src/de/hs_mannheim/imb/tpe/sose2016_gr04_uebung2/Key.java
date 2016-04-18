package de.hs_mannheim.imb.tpe.sose2016_gr04_uebung2;

public class Key {

	private String key;

	public String schluessel(String key, VerschluesselungsTyp typ)
			throws CrypterException {
		if (typ == VerschluesselungsTyp.CAESAR) {
			if (key.length() == 1) {
				if (Character.isLetter(key.charAt(0))) {
					return key;
				} else {
					return key.substring(0, 0);
				}
			}
		}
		if (typ == VerschluesselungsTyp.SUBSTITUTION) {
			if (key.length() == 26) {
				return key;
			} else {
				throw new CrypterException("Key ist zu kurz");
			}
		}
		if (typ == VerschluesselungsTyp.XOR) {
			if (key.length() == 1) {
				if (Character.isLetter(key.charAt(0))) {
					return key;
				} else {
					return key.substring(0, 0);
				}
			}
		}
		return null;
	}
}
