package de.hs_mannheim.imb.tpe.sose2016_gr04_uebung4;

import java.util.ArrayList;
import java.util.List;

/**
 * Klasse Strecke, repr�sentiert Strecke auf der sich die Z�ge befinden,
 * eingeteil in Bl�cke
 *
 */
public class Strecke {
	private final int laenge;
	private List<Block> b = new ArrayList<Block>();

	/**
	 * Konstruktor
	 * 
	 * @param laenge
	 *            , die L�nge der Strecke
	 */
	public Strecke(int laenge) {
		this.laenge = laenge;
	}

	/**
	 * addMethode , f�r das Hinzuf�gen der Bl�cke in die Liste
	 * 
	 * @param laenge,
	 *            L�nge der Bl�cke
	 */
	public void addBlock(int laenge) {
		if (b.isEmpty()) {
			b.add(new Block(0, laenge));
		} else {
			b.add(new Block(b.get(b.size() - 1).getEndKm(), b.get(b.size() - 1).getEndKm() + laenge));
		}
	}

	/**
	 * Gibt die Liste der Bl�cke zur�ck
	 * 
	 * @return b, Liste der Bl�cke
	 */
	public List<Block> getBlockList() {
		return b;
	}

	/**
	 * Gibt die L�nge der Strecke zur�ck
	 * 
	 * @return laenge, L�nge der Strecke
	 */
	public int getLaenge() {
		return laenge;
	}
}
