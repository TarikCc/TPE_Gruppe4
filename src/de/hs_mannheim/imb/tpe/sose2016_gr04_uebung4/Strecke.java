package de.hs_mannheim.imb.tpe.sose2016_gr04_uebung4;

import java.util.ArrayList;
import java.util.List;

public class Strecke {
	private final int laenge;
	private List<Block> b = new ArrayList<Block>();
	
	public Strecke(int laenge){
		this.laenge = laenge;
	}
	
	public void addBlock(int laenge){
		if(b.isEmpty()){
			b.add(new Block(0, laenge));
		}
		else{
			b.add(new Block(b.get(b.size()-1).getEndKm(),b.get(b.size()-1).getEndKm() + laenge));
		}
	}
	
	public List<Block> getBlockList(){
		return b;
	}
	
	public int getLaenge(){
		return laenge;
	}
}
