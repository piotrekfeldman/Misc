package javaExercises.tryAndCatchOdczytzPliku;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Pliki {

    public static void main(String[] args) throws IOException {
        String fileName = "src/test/pack/plik.txt";
        FileWriter fileWriter=null;

        try{
            fileWriter=new FileWriter(fileName);
            fileWriter.write("Tekst 1\n");
            fileWriter.write("Tekst 2\n");
        }
        catch (Exception e)
        {
            System.out.println("Problem z dostępem do pliku");
        }
        finally {
            if(fileWriter==null){
                System.out.println("Problem");
            }
            else
            {
                fileWriter.close();
            }
        }


        BufferedReader bf=null;

        try{
            bf=new BufferedReader(new FileReader(fileName));
            String linia=null;

            do {
                linia = bf.readLine();
                if (linia != null) {
                    System.out.println(linia);
                }
            }
                while (linia != null) ;
            }
                catch(IOException ex){
                    System.out.println("Problem z dostępem do pliku");
            }
        finally{
            bf.close();
        }
        }
    }
