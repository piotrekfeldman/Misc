package javaExercises.testElka;

import org.testng.annotations.Test;
@Test

public class DoWhile {


    
    public void Test(){
        
        int silnia=obliczSilnie(6);
    }
    private int obliczSilnie(int liczba) {

        int silnia=1;
        int i=2;

        if(liczba>1){

            while(i<=liczba)
            {
                silnia=silnia*i;
                i++;
            }

        }
    return silnia;
    }
}
