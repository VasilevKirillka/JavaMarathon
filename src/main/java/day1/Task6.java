package day1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k= sc.nextInt();
        int value = 0;
        for(int i =1; i<10; i++){
            System.out.printf("%d * %d = %d\n",i, k, i*k);
        }
        System.out.println("Задание 6.1");
        Scanner sc1 = new Scanner(System.in);
        k= sc1.nextInt();
        value=1;
        while (value<10){
            System.out.println(value + " * " + k + " = " + value*k);
            value++;
        }

    }
}
