package de.hs_mannheim.imb.tpe.sose2016_gr04_uebung3;

/**
 * stellt Vereinsmitglied und dessen persönliche Daten dar, mit folgenden
 * Eigenschaften Mitglieder-ID Nachname Vorname Anzahl der Mitgliedsjahre im
 * Verein
 *
 */
public class Member {

	private final String MITGLIEDERID;
	private String nachname;
	private String vorname;
	private int mitgliedsJahre;

	/**
	 * Konstruktor der ein Vereinsmitglied darstellt
	 * 
	 * @param MitgliederID
	 * @param Nachname
	 * @param Vorname
	 * @param MitgliedsJahre
	 */
	public Member(String mitgliederId, String vorname, String nachname, int mitgliedsJahre) {
		this.MITGLIEDERID = mitgliederId;
		this.nachname = nachname;
		this.vorname = vorname;
		this.mitgliedsJahre = mitgliedsJahre;
	}

	/**
	 * 
	 * @return Nachname
	 */
	public String getNachname() {
		return this.nachname;
	}

	/**
	 * verändert nachname
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
	 * verändert vorname
	 * 
	 * @param vorname
	 */
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	/**
	 * 
	 * @return MitgliedsJahre
	 */
	public int getMitgliedsJahre() {
		return this.mitgliedsJahre;
	}

	/**
	 * verändert Mitgliedsjahre
	 * 
	 * @param mitgliedsJahre
	 */
	public void setMitgliedsJahre(int mitgliedsJahre) {
		this.mitgliedsJahre = mitgliedsJahre;
	}

	/**
	 * 
	 * @return MitgliederID
	 */
	public String getMitgliederID() {
		return this.MITGLIEDERID;
	}

	/**
	 * @return gibt ein Member mit all seinen Eigenschaften aus
	 */
	@Override
	public String toString() {
		return "Member [MitgliederID = " + this.MITGLIEDERID + ", Nachname = " + this.nachname + ", Vorname = "
				+ this.vorname + ", Mitgliedsjahre = " + this.mitgliedsJahre + "]";
	}

	/**
	 * gibt einen int-Wert zurück zu eindeutigen Identifizierung eines Objektes
	 * 
	 * @return hashCode
	 */
	public int hashCode() {
		return Integer.parseInt(this.MITGLIEDERID);
	}

	/**
	 * überprüft ob die Mitglieder identisch sind
	 * 
	 * @param ohtherMitgliederId
	 * @return true or false
	 */
	public boolean equals(String ohtherMitgliederId) {
		if (ohtherMitgliederId.equals(MITGLIEDERID)) {
			return true;
		} else {
			return false;
		}

	}

}
