package de.hs_mannheim.imb.tpe.sose2016_gr04_uebung4;

public class Block {
	//true = grün false = rot
	private boolean signal = true;
	private final int startKm;
	private final int endKm;
	
	public Block(int startKm, int endKm){
		this.startKm = startKm;
		this.endKm = endKm;
	}
	
	public void setEinfahren(){
		signal = false;
	}
	
	public void setVerlassen(){
		signal = true;
	}
	
	public boolean getSignal(){
		return signal;
	}
	
	public int getEnde(){
		return endKm;
	}
}
