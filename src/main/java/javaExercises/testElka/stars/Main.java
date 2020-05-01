package javaExercises.testElka.stars;

public class Main {

    public static void main(String[]args)
    {
        Methods m1=new Methods("jowisz",9,"mały fiut");
        m1.PlanetName();
        m1.numberOfPlanet();
        m1.starType();
        System.out.println("--------------------------------------------------");
        Methods m2=new Methods("Mars",59,"OgnistoFalliczna");
        m2.PlanetName();
        m2.numberOfPlanet();
        m2.starType();
    }

}
