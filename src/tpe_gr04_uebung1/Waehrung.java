package tpe_gr04_uebung1;

/**
 * Verwaltung von Waehrungen, welche über einen Namen , ein Kuerzel und einen
 * Kurs zum Dollar verfügt. Die Daten gelangen über den Konstruktor in das
 * Objekt und können danach nicht mehr verändert werden. Die Klasse kann Beträge
 * der einen Waehrung in eine andere umrechnen.
 * 
 * @author Tarik,Mani,Fabienne
 *
 */

public final class Waehrung {

	private String name;
	private String kuerzel;
	private long kurs;

	/**
	 * Konstruktor, erzeugt eine Waehrung
	 * 
	 * @param name
	 *            - Name der Währung z.B. Euro
	 * @param kuerzel
	 *            - Kürzel der Währung z.B. $
	 * @param kurs
	 *            - Wechselkurs zum Dollar mit der Genauigkeit von 4
	 *            Nachkommastellen
	 */
	public Waehrung(String name, String kuerzel, long kurs) {
		this.name = name;
		this.kuerzel = kuerzel;
		this.kurs = kurs;

	}

	/**
	 * Liefert den Namen der Währung
	 * 
	 * @return - gibt den Namen der Währung zurück
	 */
	public String getName() {
		return name;
	}

	/**
	 * Liefert das Kürzel der Währung
	 * 
	 * @return - gibt das Kürzel der Währung zurück
	 */
	public String getKuerzel() {
		return kuerzel;
	}

	/**
	 * Liefert den Wechselkurs zum Dollar
	 * 
	 * @return - gibt den Wechselkurs zum Dollar zurück
	 */
	public long getKurs() {
		return kurs;
	}

	/**
	 * Rechnet Beträge von einer Währung in eine andere um
	 * 
	 * @param betrag
	 * @param zielWaehrung
	 *            - Währung in die man den Betrag umrechnen will
	 * @return - gibt den Betrag in der gewünschten Währung zurück
	 */
	public long umrechnen(long betrag, Waehrung zielWaehrung) {

		if (zielWaehrung == Waehrungen.DOLLAR) {
			long endBetrag = betrag / this.kurs;
			return endBetrag;

		} else {

			long betragDol = betrag * this.getKurs();
			long endBetrag = betragDol / zielWaehrung.kurs;

			return endBetrag;
		}
	}

	/**
	 * @return Gibt die Informationen zur Währung als String zurück
	 */
	public String toString() {
		return "" + getName() + "[" + getKuerzel() + "] 1$ = " + getKurs();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kuerzel == null) ? 0 : kuerzel.hashCode());
		result = prime * result + (int) (kurs ^ (kurs >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Waehrung)) {
			return false;
		}
		Waehrung other = (Waehrung) obj;
		if (kuerzel == null) {
			if (other.kuerzel != null) {
				return false;
			}
		} else if (!kuerzel.equals(other.kuerzel)) {
			return false;
		}
		if (kurs != other.kurs) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

}