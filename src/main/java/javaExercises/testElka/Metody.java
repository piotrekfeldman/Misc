package javaExercises.testElka;

import org.testng.annotations.Test;

public class Metody {

    @Test
    public void example() {
        double poleTrapezuPierwszego =obliczPoleTrapezu(2,3,5);
        System.out.println(poleTrapezuPierwszego);
        boolean czyWiększa=czyWiększaniż100(101);
    }

     double obliczPoleTrapezu(double pierwszaPodstawa, double drugaPodstawa, double wysokość) {
        double poleTrapezu = ((pierwszaPodstawa + drugaPodstawa) * wysokość)/2;
        return poleTrapezu;
    }

    boolean czyWiększaniż100(int liczba)
    {

        return  liczba>100;
    }


    }
