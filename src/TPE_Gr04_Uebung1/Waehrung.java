package TPE_Gr04_Uebung1;

public class Waehrung {

	private String name;
	private String kuerzel;
	private long kurs;

	public Waehrung(String name, String kuerzel, long kurs) {
		this.name = name;
		this.kuerzel = kuerzel;
		this.kurs = kurs;

	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the kuerzel
	 */
	public String getKuerzel() {
		return kuerzel;
	}

	/**
	 * @return the kurs
	 */
	public long getKurs() {
		return kurs;
	}

	public long umrechnen(long betrag, Waehrung toWaehrung) {

		if (toWaehrung == Waehrungen.DOLLAR) {

			return betrag / this.kurs;
		}

		long betragNeu = betrag * this.getKurs();
		long endBetrag = betragNeu / toWaehrung.kurs;

		return endBetrag;
	}
}