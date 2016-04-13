package de.hs_mannheim.imb.tpe.sose2016_gr04_uebung2;

public class Key {

	private String key;

	public Key(String key, int verschMethode) {
		if (verschMethode == 0) {
			if (key.length() == 1) {
				if (Character.isLetter(key.charAt(0))) {
					this.key = key;

				}

			}

		} else if (verschMethode == 1) {
			if (key.length() == 26) {
				if (Character.isLetter(key.charAt(25))) {
					this.key = key;
				}
			}
			
		} else if (verschMethode == 3) {
			if (Character.isLetter(key.charAt(31))){
				this.key = key;
			}
		}
	}

}
