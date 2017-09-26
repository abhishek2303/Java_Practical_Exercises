package PS4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class PE6 {
	public static void main(String[] args) throws Exception {
		SortedSet set = new SortedSet();
		set.add("Hanuka");
		set.add("Sooke");
		set.add("Babadook");
		
		for(String s: set) {
			System.out.println(s);
		}
		for(String s: set.getSortedList()) {
			System.out.println(s);
		}
	}
	
}

class SortedSet implements Set<String> {
	private TreeSet<String> set;
	
	SortedSet() {
		set = new TreeSet<String>();
	}
	
	@Override
	public boolean add(String e) {
		// TODO Auto-generated method stub
		return set.add(e);
	}

	@Override
	public boolean addAll(Collection<? extends String> c) {
		// TODO Auto-generated method stub
		return set.addAll(c);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		set.clear();
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return set.contains(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return set.containsAll(c);
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return set.isEmpty();
	}

	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return set.iterator();
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return set.remove(o);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return set.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return set.retainAll(c);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return set.size();
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return set.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return set.toArray(a);
	}
	
	public List<String> getSortedList() {
		List<String> list = new ArrayList<String>();
		for(String item: set) {
			list.add(item);
		}
		
		return list;
	}
	
}