package TPE_Gr04_Uebung1;

/**
 * Die Klasse realisiert Beträge eines Kontos. Beim Anlegen eines Objektes muss
 * sowohl Betrag als auch die Währung angegeben werden. Man kann den Betrag
 * entweder als double oder als long angegeben. Es werden sowohl positive wie
 * auch negative Beträge verwaltet. Beträge können addiert, subtrahiert und mit
 * einem double-Wert oder int-Wert multipliziert werden. Brechenen eines
 * Prozentwertes von einem Betrag. Berechnen eines Promillewertes von einem
 * Betrag.
 * 
 * @author mariellefeil
 *
 */

public class Betrag {

	private long betrag;
	private Waehrung waehrung;

	/**
	 * Konstruktor, erzeugt Betrag in einer Währung als long
	 * 
	 * @param betrag
	 *            - z.B. 10$
	 * @param waehrung
	 *            - z.B. Euro
	 */
	public Betrag(long betrag, Waehrung waehrung) {
		this.betrag = betrag;
		this.waehrung = waehrung;
	}

	/**
	 * Konstruktor, erzeugt Betrag in Währung als double
	 * 
	 * @param betrag
	 * @param waehrung
	 */
	public Betrag(double betrag, Waehrung waehrung) {
		this.betrag = (long) (betrag * 10000);
		this.waehrung = waehrung;
	}

	/**
	 * Methode zum Feststellen ob Betrag postiv oder negativ.
	 * 
	 * @return gibt entweder 1 für positiv oder -1 für negativ zurück.
	 */
	public int getVorzeichen() {

		if (this.betrag > 0) {
			return 1;

		} else if (this.betrag < 0) {
			return -1;

		} else {
			return 1;
		}
	}

	/**
	 * Addiert zwei Beträge.
	 * 
	 * @param aBetrag
	 * @return
	 */
	public Betrag addiere(Betrag aBetrag) {

		if (aBetrag.waehrung == this.waehrung) {
			long addiereBetrag1 = aBetrag.betrag + this.betrag;
			Betrag ergeb1 = new Betrag(addiereBetrag1, this.waehrung);
			return ergeb1;
		} else {

			long neuBetrag = aBetrag.waehrung.umrechnen(aBetrag.betrag,
					this.waehrung);
			long addiereBetrag2 = neuBetrag + this.betrag;
			Betrag ergeb2 = new Betrag(addiereBetrag2, this.waehrung);
			return ergeb2;

		}

	}

	public Betrag subtrahiere(Betrag aBetrag) {

		if (aBetrag.waehrung == this.waehrung) {
			long subtrahiereBetrag1 = aBetrag.betrag + this.betrag;
			Betrag ergeb1 = new Betrag(subtrahiereBetrag1, this.waehrung);
			return ergeb1;

		} else {

			long neuBetrag = aBetrag.waehrung.umrechnen(aBetrag.betrag,
					this.waehrung);
			long subtrahiereBetrag2 = neuBetrag + this.betrag;
			Betrag ergeb2 = new Betrag(subtrahiereBetrag2, this.waehrung);
			return ergeb2;
		}
	}

	public Betrag multi(double wert) {
		long neuBetrag = (long) (wert * this.betrag);
		Betrag multiBetrag = new Betrag(neuBetrag, this.waehrung);
		return multiBetrag;

	}

	public Betrag multi(int wert) {
		long neuBetrag = (wert * this.betrag);
		Betrag multiBetrag = new Betrag(neuBetrag, this.waehrung);
		return multiBetrag;

	}

	public Betrag prozent(int prozentWert) {
		double prozentSatz = prozentWert / 100;
		double prozentBetrag = (prozentSatz * this.betrag);
		Betrag prozentErgeb = new Betrag(prozentBetrag, this.waehrung);
		return prozentErgeb;
	}

	public Betrag promille(int promilleWert) {
		double promilleSatz = promilleWert / 1000;
		double promilleBetrag = (promilleSatz * this.betrag);
		Betrag promilleErgeb = new Betrag(promilleBetrag, this.waehrung);
		return promilleErgeb;

	}

	public String toString() {
		return "" + getVorzeichen() + betrag + waehrung.getKuerzel();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Betrag)) {
			return false;
		}
		Betrag other = (Betrag) obj;
		if (betrag != other.betrag) {
			return false;
		}
		if (waehrung == null) {
			if (other.waehrung != null) {
				return false;
			}
		} else if (!waehrung.equals(other.waehrung)) {
			return false;
		}
		return true;
	}
}
