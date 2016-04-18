package de.hs_mannheim.imb.tpe.sose2016_gr04_uebung2;

public class CrypterXOR implements Crypter {
	
	private final static char[] ABC = { '@', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
		'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '[', '\\', ']', '^', '_' };

	CrypterXOR() {
		super();
	}
	
	@Override
	public void reset() {
		
		
	}

	@Override
	public char verschluesseln(char klartextZeichen) throws CrypterException {
		
		return 0;
	}

	@Override
	public char entschluesseln(char cypherTextZeichen) throws CrypterException {
		
		return 0;
	}

}
