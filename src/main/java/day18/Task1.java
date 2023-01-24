package day18;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers={123, 453,657,5,-2345,7675,43,-665,2};
        System.out.println(recursionSum(numbers,0)); // вызываем метод, передает  аргументы сам массив и i ==0 (индексы в массиве начинаются с 0)



    }
    public static int recursionSum(int []numbers, int i){ // рекурсивный метод, принимает массив и целую переменную
       if(i==numbers.length) { // условие остановки метода, если i(индекс елемента в массиве) == длине массива, то возвращаем 0
       return 0;}
        return numbers[i] + recursionSum(numbers, i+1); /* обращается к элементу в массиве с индексом i(считываем данный элемент)
         и к нему прибавляем то, что нам вернем вызов метода recursionSum на том же массиве, но меняется индекс( i + 1)*/


        }

}
