package de.hs_mannheim.imb.tpe.sose2016_gr04_uebung2;

public class Key {

	@SuppressWarnings("unused")
	private String key;

	public Key(String key, VerschluesselungsTyp typ) {
		if (typ == VerschluesselungsTyp.CAESAR) {
			if (key.length() == 1) {
				if (Character.isLetter(key.charAt(0))) {
					this.key = key;

				}
					
				

			}

		} else if ( typ == VerschluesselungsTyp.SUBSTITUTION) {
			if (key.length() == 26) {
				if (Character.isLetter(key.charAt(25))) {
					this.key = key;
				}
			}
			
		} else if (typ == VerschluesselungsTyp.XOR) {
			if (Character.isLetter(key.charAt(31))){
				this.key = key;
			}
		}
	}
	static boolean checkUppercase(String text) {
		for (int i = 0; i < text.length(); i++) {
			// greifen in dem Text an die stelle i zu
			if (text.charAt(i) >= MINIMUM && text.charAt(i) <= MAXIMUM) {

			} else {
				return false;
			}
		}
		return true;
	}
}

