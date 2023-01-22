package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file=new File("Day14Task1");
        printResult(file);


    }
    public static void printResult(File file) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            String[] numbersString = scanner.nextLine().split(" ");
            int sum = 0;
            for (String number : numbersString)
                sum += Integer.parseInt(number);
            double average= (double) sum/numbersString.length;
            String formatAverage = new DecimalFormat("#0.000").format(average);
            System.out.print(average+ " --> " + formatAverage);  // average+ " --> %.3f", average
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }
}

