package javaExercises.skladoweStatyczne;

public class Main {

    private static int ilosc = 0;
    public static void main(String [ ]args){

        ilosc +=10;
        ilosc -=10;



        System.out.println(ilosc);
    }

}
