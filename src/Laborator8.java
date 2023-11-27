import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class Laborator8 {

    public static void main (String[] args) {
        try {
            FileWriter myWriter = new FileWriter("main.txt");
            myWriter.write("Vine Craciunul indata");
            myWriter.close();
            System.out.println("S-a scris cu succes codul");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try{
            File myObj = new File("main.txt");
            Scanner myReader = new Scanner(myObj);
            while(myReader.hasNextLine()){
                String data=myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }catch(FileNotFoundException e){
            System.out.println("Eroare:(");
            e.printStackTrace();
        }
    }
}