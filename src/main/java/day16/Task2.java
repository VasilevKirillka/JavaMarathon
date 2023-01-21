package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        try {
            PrintWriter pw1 = new PrintWriter(file1);
            int[] array = new int[1000];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 100);
                System.out.print(array[i] + " ");
                pw1.print(array[i] + " ");

            }
            System.out.println();
            pw1.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл 1 не найден");
        }
        try {
            PrintWriter pw2 = new PrintWriter(file2);
            Scanner scanner = new Scanner(file1);
            List<Integer> numbers = new ArrayList<>();
            int sum = 0;
            double average;

            while (scanner.hasNextLine()) {
                String line =scanner.nextLine();
                String[] numbersString = line.split(" ");

                for (String number : numbersString)
                numbers.add(Integer.parseInt(number));
            }
            for (int i = 0; i < numbers.size(); i += 20) {
                for (int j = i; j < i + 20; j++) {
                    sum += numbers.get(j);
                }
                average = sum / 20.0;
                pw2.print(average + " ");

                System.out.print(average + " ");
                sum = 0;
            }
            pw2.close();
            System.out.println();

        } catch (FileNotFoundException e) {
            System.out.println("Файл 2 не найден");
        }
        printResult(file2);
    }

    public static void printResult(File file) {
        try {
            Scanner sc = new Scanner(file);
            double sum = 0;
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] sumNumb= line.split(" ");
                for (String number : sumNumb)
                sum += Float.parseFloat(number);
            }
            System.out.println((int) sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }

}

//    File file1 = new File("file1.txt");
//    File file2 = new File("file2.txt");
//
//        try {
//                PrintWriter pw1 = new PrintWriter(file1);
//                int[] array = new int[1000];
//                for (int i = 0; i < array.length; i++) {
//        array[i] = (int) (Math.random() * 100);
//        System.out.print(array[i] + " ");
//        pw1.println(array[i]);
//
//        }
//        System.out.println();
//        pw1.close();
//
//        } catch (FileNotFoundException e) {
//        System.out.println("Файл 1 не найден");
//        }
//        try {
//        PrintWriter pw2 = new PrintWriter(file2);
//        Scanner scanner = new Scanner(file1);
//        List<Integer> numbers = new ArrayList<>();
//        int sum = 0;
//        double average;
//
//        while (scanner.hasNextLine()) {
//
//        String line = scanner.nextLine();
//        numbers.add(Integer.parseInt(line));
//        }
//        for (int i = 0; i < numbers.size(); i += 20) {
//        for (int j = i; j < i + 20; j++) {
//        sum += numbers.get(j);
//        }
//        average = sum / 20.0;
//        pw2.println(average);
//
//        System.out.print(average + " ");
//        sum = 0;
//        }
//        pw2.close();
//        System.out.println();
//
//        } catch (FileNotFoundException e) {
//        System.out.println("Файл 2 не найден");
//        }
//        printResult(file2);
//        }

//try {
//        Scanner sc = new Scanner(file);
//        double sum = 0;
//        while (sc.hasNextLine()) {
//        String line = sc.nextLine();
//
//        sum += Float.parseFloat(line);
//        }
//        System.out.print((int) sum);
//        } catch (FileNotFoundException e) {
//        System.out.println("Файл не найден");
//        }
