package de.hs_mannheim.imb.tpe.sose2016_gr04_uebung4;

/**
 * Klasse Block mit den Eigenschaften Signal, anfangKm, endKm
 */
public class Block {
	// true = grün false = rot
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
	 * ändert Wert von Signal auf false (rot)
	 */
	public synchronized void setEinfahren() {
		signal = false;
	}

	/**
	 * ändert Wert von Signal auf true (grün)
	 */
	public synchronized void setAusfahren() {
		signal = true;
	}

	/**
	 * Gibt Ende des Blocks zurück
	 * 
	 * @return endKm
	 */
	public int getEndKm() {
		return endKm;
	}

	/**
	 * Gibt Anfang des Blocks zurück
	 * 
	 * @return anfangKm
	 */
	public int getAnfangKm() {
		return anfangKm;
	}

	/**
	 * Gibt Signal des Blocks zurück
	 * 
	 * @return signal
	 */
	public boolean getSignal() {
		return signal;
	}

	/**
	 * Gibt die Länge des Blocks zurück
	 * 
	 * @return endKm - anfangKm (Länge)
	 */
	public int getLaenge() {
		return endKm - anfangKm;
	}

}
