package de.hs_mannheim.imb.tpe.sose2016_gr04_uebung4;

/**
 * Klasse Zug, implentiert Interface Runnable da Züge mittels Threads realisiert
 * werden mit den Eigenschaften: name, position auf der Strecke, Geschwindigkeit
 * umgerechnet in km/s, Strecke auf der sich die Züge befinden und eine
 * Geschwindigkeitm
 */
public class Zug implements Runnable {
	private final char name;
	private volatile int position;
	private Strecke u;
	private long tatges;

	/**
	 * Konstruktor
	 * 
	 * @param name
	 *            , Kennung des Zuges
	 * @param startPosi,
	 *            Startposition des Zuges auf der Strecke
	 * @param speed,
	 *            Geschwindigkeit in km/h
	 * @param u,
	 *            Strecke auf der sich der Zug befindet
	 */
	public Zug(char name, int startPosi, int speed, Strecke u) {
		this.name = name;
		this.position = startPosi;
		this.u = u;
		tatges = (long) (1000 / speed);
		u.getBlockList().get(blockIdPruefer()).setEinfahren();
	}

	/**
	 * 
	 * run-Methode des Interface Runnable
	 */
	@Override
	public synchronized void run() {
		while (position < u.getLaenge()) {
			if (position < u.getBlockList().get(blockIdPruefer()).getEndKm()) {
				try {
					Thread.sleep(tatges);
				} catch (InterruptedException e) {

				}
				position++;
				System.out.println(Simulation.printStrecke(u.getLaenge(), u.getBlockList()));
			} else {
				if (blockIdPruefer() < u.getBlockList().size()
						&& !u.getBlockList().get(blockIdPruefer() + 1).getSignal()) {

				} else {
					u.getBlockList().get(blockIdPruefer()).setAusfahren();
					u.getBlockList().get(blockIdPruefer() + 1).setEinfahren();
					position++;
					System.out.println(Simulation.printStrecke(u.getLaenge(), u.getBlockList()));
				}
			}
		}
		u.getBlockList().get(u.getBlockList().size() - 1).setAusfahren();
		System.out.println(Simulation.printStrecke(u.getLaenge(), u.getBlockList()));
		System.out.println("Zug " + name + " hat das ziel erreicht (Position: " + position + ")");
		position++;
	}

	/**
	 * Unfall-Methode
	 */
	private void unfall(int otherPosition) throws SimulationException {
		if (this.position == otherPosition){
			throw new SimulationException();
		}

	}

	/**
	 * Gibt den Index des Blocks zurück in dem sich der Zug aktuell befindet
	 * 
	 * @return d
	 */
	private int blockIdPruefer() {
		int d = 0;
		for (Block b : u.getBlockList()) {
			if (b.getAnfangKm() <= position && b.getEndKm() >= position) {
				break;
			} else {
				d++;
			}
		}
		return d;
	}

	/**
	 * Gibt die Postion des Zuges auf der Strecke zurück
	 * 
	 * @return position
	 */
	public int getPosition() {
		return position;
	}

	/**
	 * Gibt den Namen des Zuges zurück
	 * 
	 * @return name
	 */
	public char getName() {
		return name;
	}

}
