package de.hs_mannheim.imb.tpe.sose2016_gr04_uebung3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MembershipList extends HashMap<String, Member> implements Map<String, Member> {

	/**
	 * Anzahl der Elemente in der Map
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
	 * @param key
	 * @return key
	 */
	public String get(String key) {
		return key;
	}


	/**
	 * Testet ob Schlüssel key vorhanden ist
	 * @param key
	 * @return true or false
	 */
	public boolean containsKey(String key) {
		if( key != null) {
		return true;
		}else{
			return false;
		}
	}

	
	/**
	 * 
	 * @param key
	 * @param value
	 * @return
	 */
	@Override
	public Member put(String key, Member value) {
		return super.put(key, value);
	}
	
	/**
	 * 
	 * @param m
	 * @return
	 */
	public Member put(Member m) {
		return this.put(m.getMitgliederID(), m);
	}

	/**
	 * 
	 * @param m
	 */
    @Override
	public void putAll(Map<? extends String, ? extends Member> m) {
		super.putAll(m);
	}


    /**
     * 
     * @param key
     * @return
     */
	@Override
	public Member remove(Object key){
		return super.remove(key);
	}


	/**
	 * 
	 */
	@Override
	public void clear() {
		super.clear();
	}


	/**
	 * 
	 * @param value
	 * @return
	 */
	public boolean containsValue(Member value) {
		if (value != null){
			return true;
		}else{
			return false;
		}

	}
	/**
	 * 
	 * @return
	 */
	@Override
	public Set<String> keySet() {
		return super.keySet();
	}

	/**
	 * 
	 * @return
	 */
	@Override
	public Collection<Member> values() {
		return super.values();
	}

	/**
	 * 
	 * @return
	 */
	@Override
	public Set<Entry<String, Member>> entrySet() {
		return super.entrySet();
	}

	/**
	 * 
	 * @param o
	 * @return
	 */
	@Override
	public boolean equals(Object o) {
		return super.equals(o);
	}

	/**
	 * 
	 * @param key
	 * @return
	 */
	public int hashCode(String key) {
		return Integer.parseInt(key);
	}
	
	@Override
	public String toString() {
		return "Länge der MemberShipList:" + size() ;
	}

	public void iter(){
		
	}
}
