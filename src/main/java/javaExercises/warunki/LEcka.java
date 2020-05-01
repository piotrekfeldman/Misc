package javaExercises.warunki;

public class LEcka {

    public static void main(String [] args)
    {
        String imie="Piotr";
        String imie2="Marta";

        if(!imie.equalsIgnoreCase("Pitr")&&imie2.equalsIgnoreCase("Marta")&&imie.equalsIgnoreCase("Piotr"))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }

    }
}
