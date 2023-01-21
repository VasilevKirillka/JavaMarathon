package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/resources/shoes.csv");
        File file2 =new File("data");
        List<String> shoes= new ArrayList<>();
        PrintWriter pw=  new PrintWriter(file2);

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] allShoes = line.split(";");


                if (Integer.parseInt(allShoes[2]) == 0) {
                    shoes.add(line);
                }
            }
                for(int i=0; i < shoes.size(); i++){
                        pw.println(shoes.get(i));}
                        pw.close();

            } catch(FileNotFoundException e){
                throw new RuntimeException(e);
            }
        }
    }

