package javaExercises;

public class MultidimensionalArrays {

    public static void main(String[] args)
    {
        int a[][]=new int[2][3];
        a[0][0]=5;
        a[0][1]=9;
        a[0][2]=4;
        a[1][0]=25;
        a[1][1]=56;
        a[1][2]=54;


        int b[][]={{4,5,6},{11,20,34},{176,543,3}};
        int min=b[0][0]; // określenie wartości wyjściowej do której będziemy porównywać
        int mincol=0; //inicjacja wartości (kolumna w której minimalna sie znajduje

        for(int i=0; i<b.length;i++)
        {
            for(int j=0; j<b.length;j++)
            {
                if(b[i][j]<min){
                    min=b[i][j];
                    mincol=j;
                }
            }
        }

        int max=b[2][mincol];
        System.out.println(max);

        int k=0;
        while(k<b.length)
        {
            if(b[k][mincol]>max){
                max=b[k][mincol];
            }
            k++;
        }
        System.out.println(max);


    }

    }
