package javaExercises.builder;

public class Budowniczy {

    public static void main (String [] args){

        Pojazd n = new Pojazd.Builder().rejestracja("POlska").build();
        System.out.println(n.getRejestracja());


        System.out.println(n.getId());
        System.out.println(n.getMarka());


    }
}
