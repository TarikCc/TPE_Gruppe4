package de.hs_mannheim.imb.tpe.sose2016_gr04_uebung4;

/**
 * Klasse Block mit den Eigenschaften Signal, anfangKm, endKm
 */
public class Block {
	// true = gr�n false = rot
	private boolean signal = true;
	private final int anfangKm;
	private final int endKm;

	/**
	 * Konstruktor
	 * 
	 * @param anfangKm
	 *            , Beginn des Blocks
	 * @param endKm
	 *            , Ende des Blocks
	 */
	public Block(int anfangKm, int endKm) {
		this.anfangKm = anfangKm;
		this.endKm = endKm;
	}

	/**
	 * �ndert Wert von Signal auf false (rot)
	 */
	public synchronized void setEinfahren() {
		signal = false;
	}

	/**
	 * �ndert Wert von Signal auf true (gr�n)
	 */
	public synchronized void setAusfahren() {
		signal = true;
	}

	/**
	 * Gibt Ende des Blocks zur�ck
	 * 
	 * @return endKm
	 */
	public int getEndKm() {
		return endKm;
	}

	/**
	 * Gibt Anfang des Blocks zur�ck
	 * 
	 * @return anfangKm
	 */
	public int getAnfangKm() {
		return anfangKm;
	}

	/**
	 * Gibt Signal des Blocks zur�ck
	 * 
	 * @return signal
	 */
	public boolean getSignal() {
		return signal;
	}

	/**
	 * Gibt die L�nge des Blocks zur�ck
	 * 
	 * @return endKm - anfangKm (L�nge)
	 */
	public int getLaenge() {
		return endKm - anfangKm;
	}

}
