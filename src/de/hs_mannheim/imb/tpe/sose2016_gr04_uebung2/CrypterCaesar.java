package de.hs_mannheim.imb.tpe.sose2016_gr04_uebung2;

public class CrypterCaesar implements Crypter {
	
	CrypterCaesar() {
		super();
	}
	
	@Override
	public void reset() {
		
		
	}

	@Override
	public char verschluesseln(char klarTextZeichen) throws CrypterException {
		if (Character.isLowerCase(klarTextZeichen)) {
			klarTextZeichen.toUpperCase();
		}
			throw new CrypterException ("Nachricht enthält ungültiges Zeichen");
			
		String[] klartextZeichenArray = klarTextZeichen.toCharArray;
		
		return 0;
	}

	@Override
	public char entschluesseln(char cypherTextZeichen) throws CrypterException {
		
		return 0;
	}

}
