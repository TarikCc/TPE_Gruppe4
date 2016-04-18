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
		if (!Character.isLetter(klarTextZeichen)){
			throw new CrypterException ("Klartext enthält ungültiges Zeichen");
		} 
		if (Character.isLowerCase(klarTextZeichen)) {
			throw new CrypterException ("Klartext enthält Großbuchstaben");
		}
	    if (klarTextZeichen >= "A" && <= "Z"){
	    	return (char) ((klarTextZeichen - "A" + Key.key) %26 + "A");
	    }
	    	
	    
		
			
		
		
		return 0;
	}

	@Override
	public char entschluesseln(char cypherTextZeichen) throws CrypterException {
		if (!Character.isLetter(cypherTextZeichen)){
			throw new CrypterException ("Geheimtext enthält ungültiges Zeichen");
		} if (Character.isLowerCase(cypherTextZeichen)) {
			throw new CrypterException ("Geheimtext enthält Großbuchstaben");
		}
		
		return 0;
	}

}
