package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int count=0;
        while (count<5) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            count++;
            if (b == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(a / b);
        }

    }
}
