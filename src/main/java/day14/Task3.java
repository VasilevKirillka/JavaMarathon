package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people");
        System.out.println(parseFileToObjectList(file));


    }
    public static List<Person> parseFileToObjectList(File file){

        List<Person> people = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {                                                                                     // т.к. мы не знает количество строк, то делаем цикл, который будет работать пока в файле есть новые строки, пока сканер будет видеть следующую строку
                String line = scanner.nextLine();                                                                               // человек(имя)

                String[] person = line.split(" ");                                                                        // разделяем строку по пробелу

                if (Integer.parseInt(person[1]) < 0)                                                                            // в данном случае элемент под индексом 1 это возраст. с помощью метода Integer.parseInt перевозим возраст в целое число. и проверяет что возраст больше 0
                    throw new IllegalArgumentException();

                Person person1= new Person(person[0], Integer.parseInt(person[1]));
                people.add(person1);
            }

            return people;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e){
            System.out.println("Возраст не должен быть меньше 0");
        }

        return null;
    }

}
