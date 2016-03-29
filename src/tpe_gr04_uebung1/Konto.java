package tpe_gr04_uebung1;

import java.util.Arrays;

/**
 * Klasse Konto ermöglicht Buchungen zu verwalten
 * @author Fabienne, Tarik, Mani
 *
 */

public class Konto {

	String inhaber;
	Betrag verlauf[] = new Betrag[100];
	int p = 0;
	Betrag guthaben;

	/**
	 * Konstruktur erzeugt Inhaber und Guthaben der Klasse Betrag
	 * @param inhaber - Inhaber des Kontos
	 * @param guthaben - Guthaben des Inhabers auf dem Konto
	 */
	public Konto(String inhaber, Betrag guthaben) {
		this.inhaber = inhaber;
		this.guthaben = guthaben;

	}

	/**
	 * Es könne Beträge auf das Konto gebucht werden (positive wie negative)
	 * wenn gebuchter Betrag in einer anderen Fremdwährung erfolgt wird er in
	 * die Währung des Kontos umgerechnet
	 * 
	 * @param betrag
	 *            - Betrag der auf das Konto gebucht wird
	 * 
	 */
	public void buche(Betrag betrag) {
		Waehrung neu = betrag.getWaehrung();

		if (neu == this.guthaben.getWaehrung()) {

			this.guthaben = guthaben.addiere(betrag);
			verlauf[p] = betrag;
			p++;

		} else {
			long betragLong = betrag.getWaehrung().umrechnen(
					betrag.getBetrag(), this.guthaben.getWaehrung());
			Betrag betragNeu = new Betrag(betragLong,
					this.guthaben.getWaehrung());

			guthaben = guthaben.addiere(betragNeu);
			verlauf[p] = betragNeu;
			p++;

		}

	}

	/**
	 * Liefert Summer aller Buchungen
	 * 
	 * @return- Guthaben, gibt vollen Betrag des Kontos zurück
	 */
	public Betrag saldo() {
		return this.guthaben;

	}

	/**
	 * Ermöglicht Abzug eines gewissen Promillesatz vom Konto
	 * 
	 * @param promille
	 *            - Promillesatz an Gebühren
	 */

	public void gebuehren(int promille) {
		double promilleSatz = (double) promille / 1000;

		Betrag prozentBetrag = guthaben.multi(promilleSatz);
		Betrag abzug = new Betrag(((-1) * prozentBetrag.getBetrag()),
				guthaben.getWaehrung());
		buche((abzug));
	}

	/**
	 * Liefert den Kontoinhaber
	 * 
	 * @return -gibt den Inhaber des Kontos zurück
	 */
	public String getInhaber() {
		return inhaber;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		String ausgabe = "Kontoinhaber: " + this.inhaber + "\nWährung: "
				+ this.guthaben.getWaehrung().getKuerzel() + "\n ------";

		for (int i = 0; i < p; i++) {

			ausgabe = ausgabe + "\n" + verlauf[i].inDouble() + " "
					+ verlauf[i].getWaehrung().getKuerzel();

		}

		return ausgabe + "\n ------\nSaldo:" + saldo().inDouble() + " "
				+ this.guthaben.getWaehrung().getKuerzel();
	}

	/**
	 * Liefert die Währung des Kontos
	 * 
	 * @return - gibt die Waherung des Kontos zurück
	 */
	public Waehrung getWaehrung() {
		return this.guthaben.getWaehrung();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((guthaben == null) ? 0 : guthaben.hashCode());
		result = prime * result + ((inhaber == null) ? 0 : inhaber.hashCode());
		result = prime * result + p;
		result = prime * result + Arrays.hashCode(verlauf);
		return result;
	}

	/* (non-Javadoc)
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
		if (!(obj instanceof Konto)) {
			return false;
		}
		Konto other = (Konto) obj;
		if (guthaben == null) {
			if (other.guthaben != null) {
				return false;
			}
		} else if (!guthaben.equals(other.guthaben)) {
			return false;
		}
		if (inhaber == null) {
			if (other.inhaber != null) {
				return false;
			}
		} else if (!inhaber.equals(other.inhaber)) {
			return false;
		}
		if (p != other.p) {
			return false;
		}
		if (!Arrays.equals(verlauf, other.verlauf)) {
			return false;
		}
		return true;
	}
	
}
