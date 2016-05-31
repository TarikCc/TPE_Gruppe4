package de.hs_mannheim.imb.tpe.sose2016_gr04_uebung4;

/**
 * Klasse Block in der die Strecke eingeteilt sind mit den Eigenschaften 
 * Signal (true = grün, false 0 rot),
 * anfangkm und endKm
 *
 */
public class Block {
	private boolean signal = true;
	private final int anfangKm;
	private final int endKm;

	/**
	 * Konstruktor
	 * 
	 * @param anfangKm,
	 *            Anfang des Blocks
	 * @param endKm,
	 *            Ende des Blocks
	 */
	public Block(int anfangKm, int endKm) {
		this.anfangKm = anfangKm;
		this.endKm = endKm;
	}

	/**
	 * ändert Signal auf false (rot)
	 */
	public synchronized void setEinfahren() {
		signal = false;
	}

	/**
	 * ändert Signal auf true (grün)
	 */
	public synchronized void setAusfahren() {
		signal = true;
	}

	/**
	 * Gibt EndKm zurück des Blocks
	 * 
	 * @return endKm
	 */
	public int getEndKm() {
		return endKm;
	}

	/**
	 * Gibt AnfangKm zurück des blocks
	 * 
	 * @return anfangKm
	 */
	public int getAnfangKm() {
		return anfangKm;
	}

	/**
	 * Gibt Signal zurück
	 * 
	 * @return signal
	 */
	public boolean getSignal() {
		return signal;
	}

	/**
	 * Gibt Länge des Blocks zurück
	 * 
	 * @return endKm - anfangKm
	 */
	public int getLaenge() {
		return endKm - anfangKm;
	}

}

}
