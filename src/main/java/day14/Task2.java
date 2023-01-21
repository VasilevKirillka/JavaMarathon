//package day14;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Task2 {
//    public static void main(String[] args) {
//        File file = new File("people");
//        System.out.println(parseFileToStringList(file));
//
//    }
//
//    public static List<String> parseFileToStringList(File file){
//        //File file = new File("people");
//        List<String> people = new ArrayList<>();
//
//        try {
//            Scanner scanner = new Scanner(file);
//
//            while (scanner.hasNextLine()) {                                                                                     // т.к. мы не знает количество строк, то делаем цикл, который будет работать пока в файле есть новые строки, пока сканер будет видеть следующую строку
//                String line = scanner.nextLine();                                                                               // человек(имя)
//
//                String[] person = line.split(" ");                                                                        // разделяем строку по пробелу
//
//                if (Integer.parseInt(person[1]) < 0)                                                                            // в данном случае элемент под индексом 1 это возраст. с помощью метода Integer.parseInt перевозим возраст в целое число. и проверяет что возраст больше 0
//                    throw new IllegalArgumentException();
//
//
//                people.add(line);
//            }
//
//            return people;
//        } catch (FileNotFoundException e) {
//            System.out.println("Файл не найден");
//        } catch (IllegalArgumentException e){
//            System.out.println("Возраст не должен быть меньше 0");
//        }
//
//        return null;
//    }
//}
