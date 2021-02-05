package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCatName {
    public static void main(String[] args) throws IOException {
        ArrayList<Cat> cats = new ArrayList<>();
        Cat cat1=new Cat("Vas");
        cats.add(cat1);
        cats.add(new Cat("Murka"));
        cats.add(new Cat("Gavrik"));
        cats.add(new Cat("Ol"));
        cats.add(new Cat("Was"));


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        /*
        System.out.println("Before"+cats.toString());
        for(Cat cat : cats){
            cats.remove(cat);
        }

         */
        Iterator<Cat> catIterator = cats.iterator();
        while(catIterator.hasNext()){
            Cat cat = catIterator.next();
            if(cat.name.equals(name)){
                catIterator.remove();

            }

        }
        cats.removeIf(cat -> cat.name.equals(name));
        System.out.println("After"+cats.toString());


    }
}
