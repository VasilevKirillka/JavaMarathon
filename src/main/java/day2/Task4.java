package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //System.out.println("Введите число x: ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y;
        if (x >= 5) {
            y = (x * x - 10) / (x + 7);
            System.out.println(y);
        }
        else if (x > -3 && x < 5) {
            y = (x + 3) * (x * x - 2);
            System.out.println(y);
        } else {
            y = 420.0;
            System.out.println(y);
        }
    }
}
