package de.hs_mannheim.imb.tpe.sose2016_gr04_uebung4;

public class Zug implements Runnable{
	private final char name;
	private volatile int position;
	private Strecke u;
	private long tatges;
	
	public Zug(char name, int startPosi, int speed, Strecke u){
		this.name = name;
		this.position = startPosi;
		this.u = u;
		tatges = (long) (1000 / speed);
		u.getBlockList().get(blockIdPruefer()).setEinfahren();
	}
	
	@Override
	public synchronized void run()  {
		while(position < u.getLaenge()){
			if(position < u.getBlockList().get(blockIdPruefer()).getEndKm()){
					try {
						Thread.sleep(tatges);
					} catch (InterruptedException e) {
						
					}
					position++;
					System.out.println(Simulation.printStrecke(u.getLaenge(), u.getBlockList()));
			}
			else{
				if(blockIdPruefer() < u.getBlockList().size() && !u.getBlockList().get(blockIdPruefer()+1).getSignal()){

				}
				else{
					u.getBlockList().get(blockIdPruefer()).setAusfahren();
					u.getBlockList().get(blockIdPruefer()+1).setEinfahren();
					position++;
					System.out.println(Simulation.printStrecke(u.getLaenge(), u.getBlockList()));
				}
			}
		}
		u.getBlockList().get(u.getBlockList().size()-1).setAusfahren();
		System.out.println(Simulation.printStrecke(u.getLaenge(), u.getBlockList()));
		System.out.println("Zug "+name+" hat das ziel erreicht (Position: "+position+")");
		position++;
	}
	
	private void unfall() {
		
	}
	
	/**
	 * gibt den index des Blocks zurück in dem sich der zug aktuell befindet
	 * @return
	 */
	private int blockIdPruefer(){
		int d = 0;
		for (Block b : u.getBlockList()) {
			if(b.getAnfangKm() <= position && b.getEndKm() >= position){
				break;
			}
			else{
				d++;
			}
		}
		return d;
	}
	
	public int getPosition(){
		return position;
	}
	
	public char getName(){
		return name;
	}

}

