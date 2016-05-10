package de.hs_mannheim.imb.tpe.sose2016_gr04_uebung3;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClubTest {

	/**
	 * Testet die Methoden der MemberShipList Klasse
	 */
	@Test
	public void testMemberShipList() {

		MembershipList map = new MembershipList();
		Member m1 = new Member("M02", "Heinz", "Mustermann", 16);
		Member m2 = new Member("M06", "Anette", "Koch", 15);
		Member m3 = new Member("M05", "Bart", "Simpson", 9);
		Member m4 = new Member("M03", "Lisa", "Simpson", 5);
		Member m7 = new Member("M03", "Lisa", "Simpson", 5);
		Member m8 = new Member("M03", "Lisa", "Simpson", 5);

		map.put(m1);
		map.put(m2);
		map.put(m3);
		map.put(m4);
		map.put(m8);

		assertEquals(map.size(), 4);

		assertEquals(map.isEmpty(), false);

		assertEquals(map.containsKey("M03"), true);
		assertEquals(map.containsKey("M09"), false);

		assertEquals(map.containsValue(m1), true);
		assertEquals(map.containsValue(m7), false);

		assertEquals(map.equals(m8), false);

		assertEquals(map.toString(), "Länge der MemberShipList:" + 4);

	}
}
