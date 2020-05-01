package javaExercises.factory;

import java.util.Scanner;

public class Fabryka {

    public static void main (String [] args){

            Fabryka f = new Fabryka();
        System.out.print(" Podaj markę : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String marka=f.dajSamchod(str).getMarka();
        String klasa=f.dajSamchod(str).getClass().getName();
        System.out.println(marka);
        System.out.println(klasa);
    }

    public  Samochody dajSamchod(String marka){
        Samochody s;

        if(marka.equalsIgnoreCase("fiat")){
            s = new Fiat();
        }
        else if(marka.equalsIgnoreCase("ford")){
            s = new Ford();
        }
        else if(marka.equalsIgnoreCase("mercedes")){
            s = new Mercedes();
        }
        else{
            s = new Samochody();
        }

        return s;
    }
}
