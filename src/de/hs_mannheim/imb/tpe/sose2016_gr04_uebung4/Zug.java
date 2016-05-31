package de.hs_mannheim.imb.tpe.sose2016_gr04_uebung4;

/**
 * Klasse Zug stellt die Züge die auf einer Strecke fahren da, als Threads mit
 * den Eigenschaften Name, Position; Strecke auf der er fährt und die
 * tatsächliche Geschwindigkeit die in km/sec umgerechnet wird
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
	 *            Startposition auf der Strecke
	 * @param speed,
	 *            Geschwindigkeit von km/h in km/sec umgerechnet
	 * @param u
	 *            , Strecke auf der der Zug fährt
	 */
	public Zug(char name, int startPosi, int speed, Strecke u) {
		this.name = name;
		this.position = startPosi;
		this.u = u;
		tatges = (long) (1000 / speed);
		u.getBlockList().get(blockIdPruefer()).setEinfahren();
	}

	/**
	 * Methode sorgt dafür dass die Züge fahren und zur richtigen Zeit stehen
	 * bleiben
	 */
	@Override
	public synchronized void run() {
		while (position < u.getLaenge()) {
			try {
				Simulation.unfallpruefer(position, name);
			} catch (SimulationException e1) {
			}
			if (position < u.getBlockList().get(blockIdPruefer()).getEndKm()) {
				try {
					Thread.sleep(tatges);
				} catch (InterruptedException e) {
					break;
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
		Simulation.zuegeImZiel++;
		Simulation.letzterZug();
	}

	/**
	 * Gibt den Index des Blocks zurück in dem sich der Zug aktuell befindet
	 * 
	 * @return d, Index des Blocks
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
	 * Gibt Position des Zuges zurück
	 * 
	 * @return position
	 */
	public int getPosition() {
		return position;
	}

	/**
	 * Gibt Name des Zuges zuück
	 * 
	 * @return name
	 */
	public char getName() {
		return name;
	}

}
