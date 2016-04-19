package de.hs_mannheim.imb.tpe.sose2016_gr04_uebung2;

public class CrypterCaesar implements Crypter {

	private char grundtext;
	private String schluessel;

	CrypterCaesar(String k) {
		schluessel = k;
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
	public char verschluesseln(char klarTextZeichen) throws CrypterException {
		grundtext = klarTextZeichen;
		if (!Character.isLetter(klarTextZeichen)) {
			throw new CrypterException("Klartext enthält ungültiges Zeichen");
		}
		if (Character.isLowerCase(klarTextZeichen)) {
			throw new CrypterException("Klartext enthält Großbuchstaben");
		}
		if (klarTextZeichen >= 65 && klarTextZeichen <= 90) {
			int diff = schluessel.charAt(0)-65;
			return (char) (((klarTextZeichen - 65 + diff + 1)%26) + 65);
			
		}
		return 0;
	}

	@Override
	public char entschluesseln(char cypherTextZeichen) throws CrypterException {
		if (!Character.isLetter(cypherTextZeichen)) {
			throw new CrypterException("Geheimtext enthält ungültiges Zeichen");
		}
		if (Character.isLowerCase(cypherTextZeichen)) {
			throw new CrypterException("Geheimtext enthält Großbuchstaben");
		}
		if (cypherTextZeichen >= 65 && cypherTextZeichen <= 90) {
			int diff = schluessel.charAt(0)-65;
			return (char) (((cypherTextZeichen - 65 + diff + 1)%26) + 65);
		}
		return 0;
	}
	/** systemout Test f�r Caesar Verschl�sselung
	 	
	  	public static void main (String[] args){
		CrypterCaesar caesar = new CrypterCaesar("c");
	      String text = "caesar";
	      String kodiert = "";
	      System.out.println("output");
	      for(int i = 0; i < text.length(); i++)
	      {
	        char letter = text.charAt(i);
	        try
	        {
	          kodiert += caesar.verschluesseln(letter);
	        }
	        catch(CrypterException ce)
	        {
	          ce.printStackTrace();
	          return;
	        }
	      }
	      System.out.println(kodiert);
	}
	*/
}
