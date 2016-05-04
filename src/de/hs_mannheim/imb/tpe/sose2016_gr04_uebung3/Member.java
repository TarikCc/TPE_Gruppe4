package de.hs_mannheim.imb.tpe.sose2016_gr04_uebung3;

/**
 * stellt Vereinsmitglied und dessen persönliche Daten dar, mit folgenden
 * Eigenschaften Mitglieder-ID Nachname Vorname Anzahl der Mitgliedsjahre im
 * Verein (Mitgliedschaft)
 *
 */
public class Member {

	final int MitgliederID;
	private String Nachname;
	private String Vorname;
	private int Mitgliedschaft;

	/**
	 * Konstruktor der eom Vereinsmotglied darstellt
	 * 
	 * @param MitgliederID
	 * @param Nachname
	 * @param Vorname
	 * @param Mitgliedschaft
	 */
	public Member(int MitgliederID, String Nachname, String Vorname, int Mitgliedschaft) {
		this.MitgliederID = MitgliederID;
		this.Nachname = Nachname;
		this.Vorname = Vorname;
		this.Mitgliedschaft = Mitgliedschaft;
	}

	/**
	 * 
	 * @return Nachname
	 */
	public String getNachname() {
		return Nachname;
	}

	/**
	 * 
	 * @param nachname
	 */
	public void setNachname(String nachname) {
		Nachname = nachname;
	}

	/**
	 * 
	 * @return Vorname
	 */
	public String getVorname() {
		return Vorname;
	}

	/**
	 * 
	 * @param vorname
	 */
	public void setVorname(String vorname) {
		Vorname = vorname;
	}

	/**
	 * 
	 * @return Mitgliedschaft
	 */
	public int getMitgliedschaft() {
		return Mitgliedschaft;
	}

	/**
	 * 
	 * @param mitgliedschaft
	 */
	public void setMitgliedschaft(int mitgliedschaft) {
		Mitgliedschaft = mitgliedschaft;
	}

	/**
	 * 
	 * @return MitgliederID
	 */
	public int getMitgliederID() {
		return MitgliederID;
	}

	@Override
	public String toString() {
		return "Member [MitgliederID=" + MitgliederID + ", Nachname=" + Nachname + ", Vorname=" + Vorname
				+ ", Mitgliedschaft=" + Mitgliedschaft + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + MitgliederID;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (MitgliederID != other.MitgliederID)
			return false;
		return true;
	}

}
