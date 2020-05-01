package javaExercises;

import java.util.ArrayList;

public class CTwo {

    public static void main(String[] args) {

        int a[] = {4, 5, 4,  5, 5, 77, 4, 5, 4,  5, 5, 77,0};
        ArrayList<Integer> ar=new ArrayList<>();

        for(int i=0;i<a.length;i++)
        {
            int k=0;
             k++;
            if(!ar.contains(a[i]))
            {
                ar.add(a[i]);
                for(int j=i+1;j<a.length;j++){
                    if(a[i]==a[j]){

                        k++;

                    }
                }
                if(k==1)
                {
                    System.out.println("Unikalną wartością jest liczba "+a[i]);

                }


            }

        }


    }
}
