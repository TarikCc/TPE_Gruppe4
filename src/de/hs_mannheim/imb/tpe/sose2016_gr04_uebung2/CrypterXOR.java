package de.hs_mannheim.imb.tpe.sose2016_gr04_uebung2;

public class CrypterXOR implements Crypter {

	private char grundtext;
	private String schluessel;
	private final static char[] ABC = { '@', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
			'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
			'U', 'V', 'W', 'X', 'Y', 'Z', '[', '\\', ']', '^', '_' };

	CrypterXOR(String k) {
		schluessel = k;
	}

	CrypterXOR() {
		super();
	}

	@Override
	public void reset() {
		try {
			verschluesseln(grundtext);
		} catch (CrypterException e) {
			e.printStackTrace();
		}
	}

	@Override
	public char verschluesseln(char klartextZeichen) throws CrypterException {
		int stelle = 0;
		for (int i = 0; i <= ABC.length; i++) {
			if (klartextZeichen == ABC[i]) {
				for (int n = 0; n <= ABC.length; i++) {
					if (schluessel.charAt(0) == ABC[n]) {
						stelle = i ^ n;
					}
				}
			}
		}

		return ABC[stelle];
	}

	@Override
	public char entschluesseln(char cypherTextZeichen) throws CrypterException {

		return 0;
	}

}
