package javaExercises.ŁańcuchyZnaków;

public class Main {

    public static void main (String []args)
    {

        String str="piotrek";
        System.out.println(firstToUpperCase(str));
    }

    public static String firstToUpperCase(String tekst)
    {
        String firstUpper=tekst.valueOf(tekst.charAt(0)).toUpperCase();
        String rest=tekst.substring(1);
        String fin= firstUpper.concat(rest);
        return fin;
    }
}
