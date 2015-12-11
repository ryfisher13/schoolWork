package Programs;

import java.util.Arrays;

//	E is the type of the elements of the list
public class MyArrayList<E> {
	private static final int DEFAULT_SIZE = 1;

	private E[] elements;
	private int size;

	// construct an array list with an initial size for the elements array
	public MyArrayList(int initialSize) {
		elements = (E[]) new Object[initialSize];
		size = 0;
	}

	// construct an array list with a default initial size for the elements
	// array
	public MyArrayList() {
		this(DEFAULT_SIZE);
	}

	// if we run have run out of room in the array, make it bigger
	public void resizeIfNeedBe() {
		if (size == elements.length) {
			// make a bigger array
			E[] newElements = (E[]) new Object[elements.length * 2];
			// System.out.println("Resizing to size " + newElements.length);
			// copy the elements of the old array to the bigger array
			for (int i = 0; i < elements.length; i++)
				newElements[i] = elements[i];
			// make the old array point at the bigger array
			elements = newElements;
		}
	}

	public void add(E num) {
		resizeIfNeedBe();
		// add the new number to the elements
		elements[size] = num;
		size++;
	}

	public void addFront(E num) {
		resizeIfNeedBe();
		for (int i = size; i > 0; i--) {
			elements[i] = elements[i - 1];
		}
		elements[0] = num;
		size++;
	}

	public E get(int i) {
		if (i >= size || i < 0)
			throw new IndexOutOfBoundsException(i + "");

		return elements[i];
	}

	public int size() {
		return size;
	}

	public String toString() {
		String result = "[";

		for (int i = 0; i < size - 1; i++) {
			result = result + elements[i] + ", ";
		}
		result = result + elements[size - 1];
		result = result + "]";

		return result;
	}

	public void delete(int i) {
		for (int j = i-1; j < elements.length - 1; j++) {
			elements[j] = elements[j + 1];
		}
		size--;
	}

	public boolean contains(E element) {
		for (int i=0;i<size;i++) {
			if (elements[i] == element) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(elements);
		result = prime * result + size;
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
		MyArrayList other = (MyArrayList) obj;
		if (size != other.size)
			return false;
		for(int i = 0; i<size;i++){
			if(!other.elements[i].equals(elements[i])){
				return false;
			}
		}
		return true;
	}

}