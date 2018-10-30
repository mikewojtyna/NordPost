package NordPost;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class readCSV {

    public static void load(){
        String fileName= "ask.csv";
        File file= new File(fileName);


        try{
            Scanner inputStream= new Scanner(file);
            while(inputStream.hasNext()){
                String data= inputStream.next();
                String[] values = data.split(",");
                //System.out.println(values[0]);
            }
            inputStream.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

}