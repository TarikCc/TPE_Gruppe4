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
	 * Addiert zwei Beträge. Rechnet diese erst in gleiche Währung um.
	 * 
	 * @param addBetrag
	 *            - zu addierender Betrag
	 * @param addBetrag1
	 *            -
	 * @param addBetrag2
	 *            -
	 * @param neuBetrag
	 *            -
	 * @param ergeb1
	 *            -
	 * @param ergeb2
	 *            - Ergebnis
	 * @return - gibt das Ergebnis der Addition 2er Beträge zurück
	 */
	public Betrag addiere(Betrag addBetrag) {

		if (addBetrag.waehrung == this.waehrung) {
			long addBetrag1 = addBetrag.betrag + this.betrag;
			Betrag ergeb1 = new Betrag(addBetrag1, this.waehrung);
			return ergeb1;
		} else {

			long neuBetrag = addBetrag.waehrung.umrechnen(addBetrag.betrag,
					this.waehrung);
			long addBetrag2 = neuBetrag + this.betrag;
			Betrag ergeb2 = new Betrag(addBetrag2, this.waehrung);
			return ergeb2;

		}

	}

	/**
	 * @param addBetrag
	 * @return - gibt das Ergebnis der Subtraktion 2er Beträge zurück
	 */
	public Betrag subtrahiere(Betrag addBetrag) {

		if (addBetrag.waehrung == this.waehrung) {
			long subtrahiereBetrag1 = addBetrag.betrag + this.betrag;
			Betrag ergeb1 = new Betrag(subtrahiereBetrag1, this.waehrung);
			return ergeb1;

		} else {

			long neuBetrag = addBetrag.waehrung.umrechnen(addBetrag.betrag,
					this.waehrung);
			long subtrahiereBetrag2 = neuBetrag + this.betrag;
			Betrag ergeb2 = new Betrag(subtrahiereBetrag2, this.waehrung);
			return ergeb2;
		}
	}

	/**
	 * @param wert
	 * @return - gibt den multiplizierten Betrag mit einem double-Wert zurück
	 */
	public Betrag multi(double wert) {
		long neuBetrag = (long) (wert * this.betrag);
		Betrag multiBetrag = new Betrag(neuBetrag, this.waehrung);
		return multiBetrag;

	}

	/**
	 * @param wert
	 * @return - gibt den multiplizierten Betrag mit einem int-Wert zurück
	 */
	public Betrag multi(int wert) {
		long neuBetrag = (wert * this.betrag);
		Betrag multiBetrag = new Betrag(neuBetrag, this.waehrung);
		return multiBetrag;

	}

	/**
	 * @param prozentWert
	 * @return- gibt den Prozentwert von einem Betrag zurück
	 */
	public Betrag prozent(int prozentWert) {
		double prozentSatz = prozentWert / 100;
		double prozentBetrag = (prozentSatz * this.betrag);
		Betrag prozentErgeb = new Betrag(prozentBetrag, this.waehrung);
		return prozentErgeb;
	}

	/**
	 * @param promilleWert
	 * @return - gibt den Promillewert von einem Betrag zurück
	 */
	public Betrag promille(int promilleWert) {
		double promilleSatz = promilleWert / 1000;
		double promilleBetrag = (promilleSatz * this.betrag);
		Betrag promilleErgeb = new Betrag(promilleBetrag, this.waehrung);
		return promilleErgeb;

	}

	/**
	 * @return - gibt nur die Stellen vor dem Komma zurück
	 */
	public int getVorkomma() {
		return (int) this.betrag;

	}
	

	/**
	 * @return- gibt nur die Stellen nach dem Komma zurück
	 */
	public long getNachkomma() {
		return ((this.betrag * 100) % 100) ;
		
	}

	/**
	 * @return- gibt den gesamten Wert als String zurück, mit Währungsangabe ,führender Null 
	 * und Vorzeichen bei negativen Beträgen
	 */
	public String toString() {
		return "" + getVorzeichen() + betrag + waehrung.getKuerzel();
	}

	/**
	 * @return - eine Zahl wird in ein double-Wert komvertiert
	 */
	public double inDouble() {
		return ((this.betrag / 100) / 100.0);
	}

	/**
	 * @return the betrag
	 */
	public long getBetrag() {
		return betrag;
	}

	/**
	 * @return the waehrung
	 */
	public Waehrung getWaehrung() {
		return waehrung;
	}

	/**
	 * @param betrag
	 *            the betrag to set
	 */
	public void setBetrag(long betrag) {
		this.betrag = betrag;
	}

	/**
	 * @param waehrung
	 *            the waehrung to set
	 */
	public void setWaehrung(Waehrung waehrung) {
		this.waehrung = waehrung;
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
