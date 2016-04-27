package de.hs_mannheim.imb.tpe.sose2016_gr04_uebung3;

public class Member {

	final int MitgliederID;
	private String Nachname; 
	private String Vorname; 
	private int Mitgliedschaft; 
	
	
	
	public Member (int MitgliederID , String Nachname , String Vorname , int Mitgliedschaft){
		this.MitgliederID = MitgliederID;
		this.Nachname = Nachname;
		this.Vorname = Vorname; 
		this.Mitgliedschaft = Mitgliedschaft;
	}
	

}
