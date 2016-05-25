package de.hs_mannheim.imb.tpe.sose2016_gr04_uebung4;



public class Zug implements Runnable{
	private final char name;
	private final int geschwindigkeit;
	private int startPosition;

	public Zug(char name, int geschwindigkeit, int startPosition){
		this.geschwindigkeit = geschwindigkeit;
		this.name = name;
		this.startPosition = startPosition;
	}

	@Override
	public void run() {
		while(){
			
		}
	}

}
