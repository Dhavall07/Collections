package com.epam.collection;

import java.util.Arrays;

public class CustomList<T> {
    private int size = 0;
    private Object list_el[];
    final int capacity = 10;

    
    public CustomList() {
        list_el = new Object[capacity];
    }


    public void addElement(T t) {
        if(size == list_el.length) {
            increaseCapacity();
        }
        list_el[size++] = t;
    }


    @SuppressWarnings("unchecked")
    public T removeElement(int i) {
        if (i>=size || i<0) {
            throw new IndexOutOfBoundsException();
        }
        Object del_item = list_el[i];
        int nums = (list_el.length-1) - i;
        System.arraycopy(list_el, i+1 , list_el, i,nums);
        size--;
        return (T) del_item;
    }


    @SuppressWarnings("unchecked")
    public T get(int k) {
        if(k>=size || k<0) {
            throw new IndexOutOfBoundsException();
        }
        Object item = list_el[k];
        return (T) item;
    }


    public int size() {
        return size;
    }


    void increaseCapacity() {
        int newSize = list_el.length * 2;
        list_el = Arrays.copyOf(list_el, newSize);
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        for(int i=0;i<size;i++) {
            stringBuilder.append(list_el[i]);
            stringBuilder.append(" ");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}