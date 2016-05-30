package de.hs_mannheim.imb.tpe.sose2016_gr04_uebung4;

import java.util.ArrayList;
import java.util.List;

/**
 * Klasse Strecke, repräsentiert Strecke auf der sich die Züge befinden,
 * eingeteil in Blöcke
 *
 */
public class Strecke {
	private final int laenge;
	private List<Block> b = new ArrayList<Block>();

	/**
	 * Konstruktor
	 * 
	 * @param laenge
	 *            , die Länge der Strecke
	 */
	public Strecke(int laenge) {
		this.laenge = laenge;
	}

	/**
	 * addMethode , für das Hinzufügen der Blöcke in die Liste
	 * 
	 * @param laenge,
	 *            Länge der Blöcke
	 */
	public void addBlock(int laenge) {
		if (b.isEmpty()) {
			b.add(new Block(0, laenge));
		} else {
			b.add(new Block(b.get(b.size() - 1).getEndKm(), b.get(b.size() - 1).getEndKm() + laenge));
		}
	}

	/**
	 * Gibt die Liste der Blöcke zurück
	 * 
	 * @return b, Liste der Blöcke
	 */
	public List<Block> getBlockList() {
		return b;
	}

	/**
	 * Gibt die Länge der Strecke zurück
	 * 
	 * @return laenge, Länge der Strecke
	 */
	public int getLaenge() {
		return laenge;
	}
}
