package de.hs_mannheim.imb.tpe.sose2016_gr04_uebung4;

import java.util.ArrayList;
import java.util.List;
/**
 * SIMON LABER KEINE SCHEIßE DAS IST GUT SO 
 * Grüße vom Komministen ;) :*
 * 
 *
 */

public class Strecke {
	private final int laenge;
	private List<Block> bloecke = new ArrayList<Block>();
	
	public Strecke(int laenge){
		this.laenge = laenge;
		
	}
	
	public int getLaenge(){
		return this.laenge;
	}
	
	
	public void blockEinfuegen(int laenge){
		if(bloecke.isEmpty()){
			bloecke.add(new Block(0, laenge));
		}
		else{
			bloecke.add(new Block(bloecke.get(bloecke.size()-1).getEnde(),bloecke.get(bloecke.size()-1).getEnde()+laenge));
		}
	}

}
