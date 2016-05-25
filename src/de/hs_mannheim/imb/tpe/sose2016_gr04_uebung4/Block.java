package de.hs_mannheim.imb.tpe.sose2016_gr04_uebung4;

public class Block {
	//true = grün false = rot
	private boolean signal = true;
	private final int anfangKm;
	private final int endKm;
	
	public Block(int anfangKm, int endKm){
		this.anfangKm = anfangKm;
		this.endKm = endKm;
	}
	
	public synchronized void setEinfahren(){
		signal = false;
	}
	
	public synchronized void setAusfahren(){
		signal = true;
	}
	
	public int getEndKm(){
		return endKm;
	}
	
	public int getAnfangKm(){
		return anfangKm;
	}
	
	public boolean getSignal(){
		return signal;
	}
	
	public int getLaenge(){
		return endKm - anfangKm;
	}
	
}
