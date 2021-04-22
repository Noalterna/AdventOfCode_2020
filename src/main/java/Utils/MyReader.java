package Utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyReader {
    public static ArrayList<Integer> readToList(String filePath){
        ArrayList<Integer> list = new ArrayList<Integer>();
        try {
            File myFile = new File(filePath);
            Scanner reader = new Scanner(myFile);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                list.add(Integer.parseInt(line));
            }
            reader.close();
        }catch(FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return list;
    }

}
