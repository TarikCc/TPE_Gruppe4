package de.hs_mannheim.imb.tpe.sose2016_gr04_uebung4;

import java.util.ArrayList;
import java.util.List;

/**
 * Klasse Simulation, erstellt eine Strecke die die Blöcke , die Züge und
 * startet diese
 *
 */
public class Simulation {
	private static List<Zug> z = new ArrayList<Zug>();
	private static Thread A, B, C, D, E;
	public static int zuegeImZiel = 0;
	private static List<Thread> threadPool = new ArrayList<Thread>();

	public Simulation() {
		Strecke a = new Strecke(70);
		a.addBlock(10);
		a.addBlock(5);
		a.addBlock(10);
		a.addBlock(10);
		a.addBlock(15);
		a.addBlock(10);
		a.addBlock(5);
		a.addBlock(5);
		// parameter 2 = startposition parameter 3 = geschwindikeit
		z.add(new Zug('A', 6, 5, a));
		z.add(new Zug('B', 11, 15, a));
		z.add(new Zug('C', 20, 5, a));
		z.add(new Zug('D', 30, 10, a));
		z.add(new Zug('E', 45, 6, a));
		// z.add(new Zug('E', 3, 10, a)); // zur simulation eines unfalls

		System.out.println(printStrecke(a.getLaenge(), a.getBlockList()));

		A = new Thread(z.get(0), "" + z.get(0).getName());
		B = new Thread(z.get(1), "" + z.get(1).getName());
		C = new Thread(z.get(2), "" + z.get(2).getName());
		D = new Thread(z.get(3), "" + z.get(3).getName());
		E = new Thread(z.get(4), "" + z.get(4).getName());

		threadPool.add(A);
		threadPool.add(B);
		threadPool.add(C);
		threadPool.add(D);
		threadPool.add(E);

		A.start();
		B.start();
		C.start();
		D.start();
		E.start();
	}

	/**
	 * prüft ob Unfall stattdindet und unterbricht den Thread(zug)
	 * 
	 * @param position
	 * @param name
	 * @throws SimulationException
	 */
	public static void unfallpruefer(int position, char name) throws SimulationException {
		for (Zug zugi : z) {
			if (zugi.getPosition() == position && name != zugi.getName()) {
				for (Thread zugThread : threadPool) {
					if (zugThread.getName().equals("" + name)) {
						zugThread.interrupt();
						throw new SimulationException();
					}
				}
			}
		}
	}

	/**
	 * Ermittelt den letzten Zug der ins Ziel kommt und Simultion beendet
	 * auszugeben
	 */
	public static void letzterZug() {
		if (z.size() == zuegeImZiel) {
			System.out.println("Simulation beendet");
		}
	}

	/**
	 * Gibt die Strecke mit den aktuellen Signalen und Zügen zurück
	 * 
	 * @param laenge
	 * @param b
	 * @return str
	 */
	public static String printStrecke(int laenge, List<Block> b) {
		int n = 1;
		String str = "";
		for (Block bl : b) {
			if (bl.getSignal()) {
				str += "_";
			} else {
				str += "|";
			}
			for (int i = 0; i < bl.getLaenge(); i++) {
				char zas = ' ';
				for (Zug tschu : z) {
					if (tschu.getPosition() == n) {
						zas = tschu.getName();
					}
				}
				if (zas == ' ') {
					str += "-";
				} else {
					str += zas;
					zas = ' ';
				}
				n++;
			}
		}
		for (int i = n; i < laenge; i++) {
			char zas = ' ';
			for (Zug tschu : z) {
				if (tschu.getPosition() == n) {
					zas = tschu.getName();
				}
			}
			if (zas == ' ') {
				str += "-";
			} else {
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
