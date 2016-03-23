package TPE_Gr04_Uebung1;

public class Betrag {

	private long betrag;
	private Waehrung waehrung;

	public Betrag(long betrag, Waehrung waehrung) {
		this.betrag = betrag;
		this.waehrung = waehrung;
	}

	public Betrag(double betrag, Waehrung waehrung) {
		this.betrag = (long) (betrag * 10000);
		this.waehrung = waehrung;
	}

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
}
