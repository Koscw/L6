package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code
        String[] arrString = new String[10];
        ArrayList<String> arrListString = new ArrayList<>();
        for (int i = 0; i < arrString.length ; i++) {
            arrString[i]="arr"+i;
            arrListString.add(i,"arrList"+i);
        }
        System.out.println(arrString.length);
        System.out.println(arrListString.size());

        arrString[3]="new arr "+3;
        arrListString.set(3,"new arrList"+3);
        System.out.println(arrString[3]);
        System.out.println(arrListString.get(3));

        arrListString.add("Add to the end");
        System.out.println(arrListString.get(10));

        System.out.println("Size before add to the middle "+arrListString.size());

        arrListString.add(3,"add to the middle");
        System.out.println("Size after add to the middle "+arrListString.size());
        arrListString.add(0,"add to the start");
        arrListString.remove(4);
        for(String str: arrListString){
            System.out.println(str);
        }
    }
}
