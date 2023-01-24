package day18;

public class Task2 {
    public static void main(String[] args) { // количество цифры 7 в числе
        System.out.println(count7(173473277));
        /* 173473277 / 10 = 17347327 остаток 7,
           17347327 / 10 = 1734732 остаток 7,
           1734732 / 10 = 173473 остаток 2,
           173473 / 10 = 17347 остаток 3,
           17347 / 10= 1734 остаток 7,
           1734 / 10 = 173 остаток 4,
           173 / 10 = 17 остаток 3,
           17 / 10 = 1 остаток 7,
           1 / 10 = 0

           */
    }
    public static int count7(int num){
        if(num == 0){
            return 0;
        }
        if(num%10==7){  // если последняя цифра 7, то
           return  1+count7(num/10);
        } else { // если последняя цифра другоая, то
            return count7(num/10);
        }
    }
}
