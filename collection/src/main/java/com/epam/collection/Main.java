package com.epam.collection;

public class Main {
    public static void main(String args[]) {
        CustomList<Integer> customList = new CustomList<Integer>();
        customList.addElement(new Integer(100));
        customList.addElement(new Integer(200));
        customList.addElement(new Integer(300));
        customList.addElement(new Integer(400));
        customList.addElement(new Integer(500));
        System.out.println(customList);
        System.out.println(customList.removeElement(0));
        System.out.println(customList);
        System.out.println(customList.size());
        System.out.println(customList.get(3));
        
    }
}