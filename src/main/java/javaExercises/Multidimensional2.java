package javaExercises;

public class Multidimensional2 {

    public static void main(String[] args)
    {

        int [][] a ={{4,6,7},{10,11,22},{15,18,20}};
        int minval= a[0][0];
        int maxval= 0;
        int maxcol=0;

        System.out.println(minval);

        for (int i=0; i<a.length;i++){

            for(int j=0;j<a.length;j++)
            {

                if(a[i][j]>minval)
                {
                    maxval=a[i][j];
                    maxcol=j;
                }
            }

        }
        System.out.println("max"+maxval);

        int k=0;
        int nev=0;
        while(k<a.length)
        {
            if(a[k][maxcol]<maxval)
            {
               nev= a[k][maxcol];
               break;
            }
        }
        System.out.println("Wartość nev "+nev);
    }
}
