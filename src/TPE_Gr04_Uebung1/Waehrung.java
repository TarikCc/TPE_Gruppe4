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

	public String getName() {
		return name;
	}

	public String getKuerzel() {
		return kuerzel;
	}

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

	public String toString() {
		return "" + getName() + "[" + getKuerzel() + "] 1$" + getKurs();

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