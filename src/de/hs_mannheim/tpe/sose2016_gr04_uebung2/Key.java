package de.hs_mannheim.tpe.sose2016_gr04_uebung2;

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
			
		}
	}

}
