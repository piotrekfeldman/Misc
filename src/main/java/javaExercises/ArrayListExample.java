package javaExercises;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[]args){

        ArrayList<String> ar=new ArrayList();
        ar.add("Piotr");
        ar.add("Marta");
        ar.add("Dominik");

        ar.remove("Dominik");
        System.out.println(ar.indexOf("Piotr"));

        System.out.println(ar);
    }
}
