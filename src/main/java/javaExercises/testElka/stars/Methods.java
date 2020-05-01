package javaExercises.testElka.stars;

public class Methods {

    String planetName;
    int numberOfPlanet;
    String starType;



    public Methods(String planetName,int numberOfPlanet,String starType ){

        this.planetName=planetName;
        this.numberOfPlanet=numberOfPlanet;
        this.starType=starType;

    }




    public void PlanetName(){

        System.out.println("Nazwa planety to "+planetName);

    }
    public void numberOfPlanet(){

        System.out.println("Numer planety wynosi: "+numberOfPlanet);

    }
    public void starType(){

        System.out.println("Rodzaj gwiazdy to: "+starType);

    }
}
