package de.hs_mannheim.imb.tpe.sose2016_gr04_uebung4;

@SuppressWarnings("serial")
public class SimulationException extends Exception {

	public SimulationException() {
		super();
		System.out.println("UNFALL!!!!");

	}

	public SimulationException(String message) {
		super(message);
		System.out.println("UNFALL!!!!");
	}
}
