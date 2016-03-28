package tpe_gr04_uebung1;

/**
 * 
 * @author Fabienne, Tarik, Mani
 *
 */

public class Konto {

	String inhaber;
	Betrag verlauf[] = new Betrag[100];
	int p = 0;
	Betrag guthaben;

	/**
	 * @param inhaber
	 * @param guthaben
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
		Betrag abzug = new Betrag((-1) * prozentBetrag.getBetrag(),
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
}
