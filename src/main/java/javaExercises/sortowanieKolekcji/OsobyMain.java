package javaExercises.sortowanieKolekcji;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OsobyMain {

    public static void main (String [] args){

        List<Osoby> list=new ArrayList<>();
        list.add(new Osoby("Piotr","Lotr"));
        list.add(new Osoby("Albert","Norbert"));

        for (Osoby osoba: list){

            System.out.println(osoba);
        }

        System.out.println("-----------");
        list.sort(Comparator.comparing(Osoby::getImie));
       // Collections.sort(list,(Osoby o1,Osoby o2) ->o1.getImie().compareTo(o2.getImie()));
        for (Osoby osoba: list){

            System.out.println(osoba);
        }
    }

}
