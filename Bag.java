package ceng112;

public class Bag<T> implements Ibag<T> {
	//***
	private final static int DEFAULT_CAPACITY = 10;
	private T[] bag;
	private int itemCount;
	
	public Bag() {
		this(DEFAULT_CAPACITY);
	}
	
	public Bag(int capacity) {
		@SuppressWarnings("unchecked")
		T[] tempBag = (T[]) new Object[capacity];
		bag = tempBag;
		itemCount = 0;
	}

	@Override
	public boolean add(T newEntry) {
		if (isFull()) {
			return false;
		}
		bag[itemCount] = newEntry;
		itemCount++;
		return true;
	}

	@Override
	public boolean isEmpty() {
		return itemCount == 0;
	}

	@Override
	public boolean isFull() {
		return itemCount == bag.length;
	}

	@Override
	public T removeByIndex(int index) {
		if (index <0 || index >= itemCount) {
			return null;
		}
		T result = bag[index];
		bag[index]= null;
		itemCount--;
		//***
		return result;
	}

	@Override
	public boolean remove(T anEntry) {
		int index = getIndexOf(anEntry);
		if (index>=0) {
			removeByIndex(index);
			return true;
		}
		return false;
	}

	@Override
	public T remove() {
		if (isEmpty()) {
			return null;
		}
		return removeByIndex(itemCount-1);
	}

	@Override
	public int getFrequencyOf(T anEntry) {
		int frequency = 0;
		for ( int i = 0; i < itemCount; i++) {
			if (bag[i].equals(anEntry)){
				frequency++;
			}
		}
		return frequency;
	}

	@Override
	public int getIndexOf(T anEntry) {
		for ( int i = 0; i < itemCount; i++) {
			if (bag[i].equals(anEntry)){
				return i;
			}
		}
		return -1;
	}

	@Override
	public boolean contains(T anEntry) {
		
		return getIndexOf(anEntry) != -1;
	}

	@Override
	public void clear() {
		while (!isEmpty()) {
			remove();
		}

	}

	@Override
	public void displayItems() {
		for ( int i = 0; i < itemCount; i++) {
			System.out.println(bag[i]);
		}

	}

	@Override
	public int getCurrentSize() {
		return itemCount ;
	}

	@Override
	public T[] toArray() {
		@SuppressWarnings("unchecked")
		T[] result = (T[]) new Object[itemCount];
		for ( int i = 0; i < itemCount; i++) {
			result[i]= bag[i];
		}
		return result;
	}

}
