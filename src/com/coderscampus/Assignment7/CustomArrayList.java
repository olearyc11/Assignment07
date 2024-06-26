package com.coderscampus.Assignment7;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {

	Object[] items = new Object[10];
	int size = 0;
	
	@Override
	public boolean add(T item) {
		if (size == items.length) {
			items = Arrays.copyOf(items, items.length * 2);
		}
		items[size++] = item;
		return true;
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		if (size == items.length) {
			items = Arrays.copyOf(items, items.length * 2);
		}
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Index out of bounds");
		}
		
		for (int i = size -1; i >= index; i--) {
			items[i + 1] = items[i];
		}
		items[index] = item;
		size++;
		return true;
	}

	@Override
	public int getSize() {
		return size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) throws IndexOutOfBoundsException {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index out of bounds");
		}
		return (T) items[index];
	}

	@SuppressWarnings("unchecked")
	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index out of bounds");
		}
		T removedItem = (T) items[index];
		items[index] = null;
		for (int i = index; i < size - 1; i++) {
			items[i] = items[i + 1];
		}
		items[size-1] = null;
		size--;
		return removedItem;
	}
	
	

}
