package day4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //System.out.println("Введите число n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        //Random r=new Random();
        int count8=0;// больше 8
        int count1=0;// равен 1
        int count3=0; // нечетные
        int count2=0;// четные
        int sum=0; // сумма
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 10);
            sum=sum+array[i];}

        //array[i] = r.nextInt(10); при классе Random
        for (int x : array) {
            //System.out.println(Arrays.toString(array));
            System.out.print( x + " ");
            if(x>8){
                count8++;
            }
            if(x ==1){
                count1++;
            }
            if(x%2==0){
                count2++;
            }
            if(x%2!=0){
                count3++;
            }
        }

        System.out.println(array.length);
       System.out.println(count8);
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
        System.out.println(sum);

//        System.out.println("\nДлинна массива: " + array.length);
//        System.out.println("Количество чисел больше 8: " + count8);
//        System.out.println("Количество чисел равный 1: " + count1);
//        System.out.println("Количество четный чисел: " + count2);
//        System.out.println("Количество нечентый чисел: " + count3);
//        System.out.println("Сумма всех элементов массива: " + sum);

    }
}
