package de.hs_mannheim.imb.tpe.sose2016_gr04_uebung2;

public class CrypterSubstitution implements Crypter {

	String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	private String schluessel;
	private char grundtext;

	CrypterSubstitution(String k) {
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
	public char verschluesseln(char klartextZeichen) throws CrypterException {
		for (int i = 0; i <= abc.length(); i++) {
			if (klartextZeichen == abc.charAt(i)) {
				return schluessel.charAt(i);
			}
		}
		return 0;
	}

	@Override
	public char entschluesseln(char cypherTextZeichen) throws CrypterException {
		for (int i = 0; i <= schluessel.length(); i++) {
			if (cypherTextZeichen == schluessel.charAt(i)) {
				return abc.charAt(i);
			}
		}
		return 0;
	}
	public static void main (String[] args){
		CrypterSubstitution caesar = new CrypterSubstitution("3");
		String text = "CAESAR";
		String kodiert = "";
		System.out.println("");
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
}