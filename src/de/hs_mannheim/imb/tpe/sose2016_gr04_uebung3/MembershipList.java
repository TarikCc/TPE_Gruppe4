package de.hs_mannheim.imb.tpe.sose2016_gr04_uebung3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MembershipList extends HashMap<String, Member> implements Map<String, Member> {

	/**
	 * Anzahl der Elemente in der Map
	 * 
	 * @return gibt Anzahl der Elemente zurück
	 */
	@Override
	public int size() {
		return super.size();
	}

	/**
	 * Testet ob Elemente vorhanden sind in der Map
	 * 
	 * @return true or false
	 */
	public boolean isEmpty() {
		if (size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Liest den Wert zum Schlüssel Key
	 * 
	 * @param key
	 * @return key
	 */
	public String get(String key) {
		return key;
	}

	/**
	 * Testet ob Schlüssel key vorhanden ist
	 * 
	 * @param key
	 * @return true or false
	 */
	public boolean containsKey(String key) {
		return super.containsKey(key);
	}

	/**
	 * Setzt Schlüssel key und Wert value
	 * 
	 * @param key
	 * @param value
	 * @return key,value
	 */
	@Override
	public Member put(String key, Member value) {
		return super.put(key, value);
	}

	/**
	 * Setzt member
	 * 
	 * @param key
	 * @param m
	 * @return m
	 */
	public Member put(Member m) {
		return this.put(m.getMitgliederID(), m);
	}

	/**
	 * Fügt eine ganze Map hinzu
	 * 
	 * @param m
	 */
	@Override
	public void putAll(Map<? extends String, ? extends Member> m) {
		super.putAll(m);
	}

	/**
	 * Entfernt den Wert zu key (und key selbst)
	 * 
	 * @param key
	 * @return
	 */
	@Override
	public Member remove(Object key) {
		return super.remove(key);
	}

	/**
	 * Löscht die Map
	 */
	@Override
	public void clear() {
		super.clear();
	}

	/**
	 * Testet ob Wert value vorhanden ist
	 * 
	 * @param value
	 * @return
	 */
	public boolean containsValue(Member value) {
		return super.containsValue(value);

	}

	/**
	 * Alle Schlüssel als Set
	 * 
	 * @return keySet
	 */
	@Override
	public Set<String> keySet() {
		return super.keySet();
	}

	/**
	 * Alle Werte als Collection
	 * 
	 * @return
	 */
	@Override
	public Collection<Member> values() {
		return super.values();
	}

	/**
	 * Alle Einträge als spezielles Set
	 * 
	 * @return
	 */
	@Override
	public Set<Entry<String, Member>> entrySet() {
		return super.entrySet();
	}

	@Override
	public boolean equals(Object o) {
		return super.equals(o);
	}

	public int hashCode(String key) {
		return Integer.parseInt(key);
	}

	@Override
	public String toString() {
		return "Länge der MemberShipList:" + size();
	}

}
