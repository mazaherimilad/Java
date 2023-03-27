package generics;

import java.util.ArrayList;

public class MyCustomList<T> {
	ArrayList<T> listArray = new ArrayList<>();

	public void addElement(T element) {
		listArray.add(element);
	}

	public void removeElement(T element) {
		listArray.remove(element);
	}

	@Override
	public String toString() {
		return listArray.toString();
	}

	public T get(int i) {
		// TODO Auto-generated method stub
		return listArray.get(i);
	}

}
