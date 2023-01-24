package day4;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {
        int [] array=new int [30];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 1000);
        System.out.print(array[i]+ " ");}
        System.out.println();

        int max=0;
        int min=10000;
        int zero=0;
        int sum=0;
        for (int num : array){
            if(num>=max){
                max=num;
            }
            if(num<min){
                min=num;
            }
            if(num%10==0){
                zero++;
                sum+=num;

            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(zero);
        System.out.println(sum);




    }
}
