package de.hs_mannheim.imb.tpe.sose2016_gr04_uebung4;

import java.util.ArrayList;
import java.util.List;
/**
 * Klasse Strecke auf der die Züge fahren 
 * die einegteilt ist in Blöcke und eine feste Länge hat  
 *
 */
public class Strecke {
	private final int laenge;
	private List<Block> b = new ArrayList<Block>();
	
	/**
	 * Konsturktor
	 * @param laenge
	 */
	public Strecke(int laenge){
		this.laenge = laenge;
	}
	
	/**
	 * Fügt Blocke hinzu
	 * @param laenge
	 */
	public void addBlock(int laenge){
		if(b.isEmpty()){
			b.add(new Block(0, laenge));
		}
		else{
			b.add(new Block(b.get(b.size()-1).getEndKm(),b.get(b.size()-1).getEndKm() + laenge));
		}
	}
	/**
	 * Gibt Liste der Blöcke zurück
	 * @return b
	 */
	public List<Block> getBlockList(){
		return b;
	}
	
	/**
	 * Gibt die Länge des Blocks zurück
	 * @return laenge 
	 */
	public int getLaenge(){
		return laenge;
	}
}
