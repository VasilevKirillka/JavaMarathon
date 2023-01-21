package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> count= new ArrayList<>();
        for (int i =0; i<=30; i=i+2){
            count.add(i);
        }
        for (int i =300; i<=350; i=i+2){
            count.add(i);
        }
        System.out.println(count);
        for(int x : count){
            System.out.println(x);
        }

    }
}
