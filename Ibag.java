package ceng112;

public interface Ibag<T> {
	/*
	 * adds a new entry to the bag
	 * @param newEntry the object to be added as a new entry
	 * @return true if the addition is successful, or false if not.
	 */
	public boolean add(T newEntry);
	/*
	 * sees whether this bag is empty 
	 * @return true if it is empty, or false if it is not.
	 */
	public boolean isEmpty();
	/*
	 * sees whether this bag is full
	 * @return true if it is full, or false if not.
	 */
	public boolean isFull();
	/*
	 * removes the indexed object.
	 * @param index that we selected to remove
	 * @return the generic type object that removed
	 */
	public T removeByIndex(int index);
	/*
	 * removes one occurrence of a given entry from this bag, if possible
	 * @param anEntry the entry to be removed
	 * @return true if the removal was successful , or false if not.
	 */
	public boolean remove(T anEntry);
	/*
	 * removes one unspecified entry from the bag,if possible
	 * @return if the removal successful returns the removed entry, or null
	 */
	public T remove();
	/*
	 * counts the number of times a given entry appears in this bag
	 * @param anEntry the entry to be counted
	 * @return the number of times anEntry appears in this bag
	 */
	public int getFrequencyOf(T anEntry);
	/*
	 * gets the index of the given entry
	 * @param anEntry whose index is required
	 * @return the integer number entry's index
	 */
	public int getIndexOf(T anEntry);
	/*
	 * 
	 */
	public boolean contains(T anEntry);
	//removes all entries from this bag.
	public void clear();
	/*
	 * 
	 */
	public void displayItems();
	/*
	 * Gets the current number of entries in this bag.
	 * @return the integer number of entries currently in the bag
	 */
	public int getCurrentSize();
	/*
	 * retrieves all entries in this bag
	 * @return a newly allocated array of all the entries in this bag
	 *        if the bag is empty ,the returned array is empty
	 */
	public T[] toArray();


}
