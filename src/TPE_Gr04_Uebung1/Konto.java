package TPE_Gr04_Uebung1;

/**
 * @author mariellefeil
 *
 */

public class Konto {

	String inhaber;
	Betrag verlauf[] = new Betrag[100];
	int p = 0;
	Betrag guthaben;

	public Konto(String inhaber, Betrag guthaben) {
		this.inhaber = inhaber;
		this.guthaben = guthaben;

	}

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

	public Betrag saldo() {
		return this.guthaben;

	}

	public void gebuehren(int promille) {
		double promilleSatz = (double) promille / 1000;

		Betrag prozentBetrag = guthaben.multi(promilleSatz);
		Betrag abzug = new Betrag((-1) * prozentBetrag.getBetrag(),
				guthaben.getWaehrung());
		buche((abzug));
	}

	/**
	 * @return the inhaber
	 */
	public String getInhaber() {
		return inhaber;
	}

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

	public Waehrung getWaehrung() {
		return this.guthaben.getWaehrung();
	}
}
