package day8;

public class Task1 {
    public static void main(String[] args) {
        String numbers = "";
        long startTime = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            numbers += i + " ";
        }
        long stopTime = System.currentTimeMillis();
        System.out.println("\nДлительность: " + (stopTime - startTime));
        System.out.println(numbers);

        StringBuilder num = new StringBuilder("");
        startTime = System.currentTimeMillis();
        for(int i=0; i<=20000;i++){
           num.append(i).append(" ");
        }
        stopTime=System.currentTimeMillis();
        System.out.println("\nДлительность: " + (stopTime - startTime));
        System.out.println(num);
    }
}
