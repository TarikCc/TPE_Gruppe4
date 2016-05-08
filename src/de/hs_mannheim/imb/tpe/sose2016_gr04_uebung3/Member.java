package de.hs_mannheim.imb.tpe.sose2016_gr04_uebung3;

/**
 * stellt Vereinsmitglied und dessen persönliche Daten dar, mit folgenden
 * Eigenschaften Mitglieder-ID Nachname Vorname Anzahl der Mitgliedsjahre im
 * Verein (Mitgliedschaft)
 *
 */
public class Member {

	private final int MITGLIEDERID;
	private String nachname;
	private String vorname;
	private int mitgliedschaft;

	/**
	 * Konstruktor der eom Vereinsmotglied darstellt
	 * 
	 * @param MitgliederID
	 * @param Nachname
	 * @param Vorname
	 * @param Mitgliedschaft
	 */
	public Member(int mitgliederId, String nachname, String vorname, int mitgliedschaft) {
		this.MITGLIEDERID = mitgliederId;
		this.nachname = nachname;
		this.vorname = vorname;
		this.mitgliedschaft = mitgliedschaft;
	}

	/**
	 * 
	 * @return Nachname
	 */
	public String getNachname() {
		return this.nachname;
	}

	/**
	 * 
	 * @param nachname
	 */
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	/**
	 * 
	 * @return Vorname
	 */
	public String getVorname() {
		return this.vorname;
	}

	/**
	 * 
	 * @param vorname
	 */
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	/**
	 * 
	 * @return Mitgliedschaft
	 */
	public int getMitgliedschaft() {
		return this.mitgliedschaft;
	}

	/**
	 * 
	 * @param mitgliedschaft
	 */
	public void setMitgliedschaft(int mitgliedschaft) {
		this.mitgliedschaft = mitgliedschaft;
	}

	/**
	 * 
	 * @return MitgliederID
	 */
	public int getMitgliederID() {
		return this.MITGLIEDERID;
	}

	@Override
	public String toString() {
		return "Member [MitgliederID=" + this.MITGLIEDERID + ", Nachname=" + this.nachname + ", Vorname=" + this.vorname
				+ ", Mitgliedschaft=" + this.mitgliedschaft + "]";
	}

	@Override
	public int hashCode() {
		return this.MITGLIEDERID;
	}

	public boolean equals(int ohtherMitgliederId) {
		if (ohtherMitgliederId == MITGLIEDERID){
			return true;
		}else {
			return false;
		}
	
	}

}
