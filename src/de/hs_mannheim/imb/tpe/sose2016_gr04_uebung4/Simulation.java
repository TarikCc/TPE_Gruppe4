package de.hs_mannheim.imb.tpe.sose2016_gr04_uebung4;

import java.util.ArrayList;
import java.util.List;

public class Simulation {
	private static List<Zug> z = new ArrayList<Zug>();
	public Simulation(){
		Strecke a = new Strecke(70);
		a.addBlock(10);
		a.addBlock(5);
		a.addBlock(10);
		a.addBlock(10);
		a.addBlock(15);
		a.addBlock(10);
		a.addBlock(5);
		a.addBlock(5);
		z.add(new Zug('A', 6, 5, a));
		z.add(new Zug('B', 11, 15, a));
		z.add(new Zug('C', 20, 5, a));
		z.add(new Zug('D', 30, 10, a));
		z.add(new Zug('E', 45, 6, a));
		
		System.out.println(printStrecke(a.getLaenge(), a.getBlockList()));
		
		Thread eins = new Thread(z.get(0));
		Thread zwei = new Thread(z.get(1));
		Thread drei = new Thread(z.get(2));
		Thread vier = new Thread(z.get(3));
		Thread fuenf = new Thread(z.get(4));
		
		eins.start();
		zwei.start();
		drei.start();
		vier.start();
		fuenf.start();
	}
	/**
	 * Gibt die strecke mit den aktuellen signalen und z�gen zur�ck
	 * @param laenge
	 * @param b
	 * @return
	 */
	public static String printStrecke(int laenge, List<Block> b){
		int n = 1;
		String str = "";
		for(Block bl : b){
			if(bl.getSignal()){
				str += "_";
			}
			else{
				str += "|";
			}
			for (int i = 0; i < bl.getLaenge(); i++) {
				char zas = ' ';
				for(Zug tschu : z){
					if(tschu.getPosition() == n){
						zas = tschu.getName();
					}
				}
				if(zas == ' '){
					str += "-";
				}
				else{
					str += zas;
					zas = ' ';
				}
				n++;
			}
		}
		for (int i = n; i < laenge; i++) {
			char zas = ' ';
			for(Zug tschu : z){
				if(tschu.getPosition() == n){
					zas = tschu.getName();
				}
			}
			if(zas == ' '){
				str += "-";
			}
			else{
				str += zas;
				zas = ' ';
			}
			n++;
		}
		return str;
	}


	public static void main(String[] args) {
		new Simulation();
	}

}
