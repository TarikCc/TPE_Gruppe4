package de.hs_mannheim.imb.tpe.sose2016_gr04_uebung3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MembershipList extends HashMap<Member, Member> implements Map<Member, Member> {

	/* (non-Javadoc)
	 * @see java.util.HashMap#size()
	 */
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return super.size();
	}


	/* (non-Javadoc)
	 * @see java.util.HashMap#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return super.isEmpty();
	}


	/* (non-Javadoc)
	 * @see java.util.HashMap#get(java.lang.Object)
	 */
	@Override
	public Member get(Object key) {
		// TODO Auto-generated method stub
		return super.get(key);
	}


	/* (non-Javadoc)
	 * @see java.util.HashMap#containsKey(java.lang.Object)
	 */
	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return super.containsKey(key);
	}


	/* (non-Javadoc)
	 * @see java.util.HashMap#put(java.lang.Object, java.lang.Object)
	 */
	@Override
	public Member put(Member key, Member value) {
		// TODO Auto-generated method stub
		return super.put(key, value);
	}


	/* (non-Javadoc)
	 * @see java.util.HashMap#putAll(java.util.Map)
	 */
	@Override
	public void putAll(Map<? extends Member, ? extends Member> m) {
		// TODO Auto-generated method stub
		super.putAll(m);
	}


	/* (non-Javadoc)
	 * @see java.util.HashMap#remove(java.lang.Object)
	 */
	@Override
	public Member remove(Object key) {
		// TODO Auto-generated method stub
		return super.remove(key);
	}


	/* (non-Javadoc)
	 * @see java.util.HashMap#clear()
	 */
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		super.clear();
	}


	/* (non-Javadoc)
	 * @see java.util.HashMap#containsValue(java.lang.Object)
	 */
	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return super.containsValue(value);
	}


	/* (non-Javadoc)
	 * @see java.util.HashMap#clone()
	 */
	@Override
	public Object clone() {
		// TODO Auto-generated method stub
		return super.clone();
	}


	/* (non-Javadoc)
	 * @see java.util.HashMap#keySet()
	 */
	@Override
	public Set<Member> keySet() {
		// TODO Auto-generated method stub
		return super.keySet();
	}


	/* (non-Javadoc)
	 * @see java.util.HashMap#values()
	 */
	@Override
	public Collection<Member> values() {
		// TODO Auto-generated method stub
		return super.values();
	}


	/* (non-Javadoc)
	 * @see java.util.HashMap#entrySet()
	 */
	@Override
	public Set<Entry<Member, Member>> entrySet() {
		// TODO Auto-generated method stub
		return super.entrySet();
	}


	/* (non-Javadoc)
	 * @see java.util.AbstractMap#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		return super.equals(o);
	}

	public int hashCode(Member key) {
		return key.getMitgliederID();
	}


	/* (non-Javadoc)
	 * @see java.util.AbstractMap#toString()
	 */
	@Override
	public String toString() {
		return "
	


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private int hash(Member key){
		return key.getMitgliederID();
		
	}

}
