package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> auto =new ArrayList<>();
        auto.add("Lada");
        auto.add("Audi");
        auto.add("Toyota");
        auto.add("BMW");
        auto.add("Ford");

        System.out.println(auto);
//        for (String car : auto){
//            System.out.println(car);
//        }
        System.out.println();
auto.add(2, "MB");
        auto.remove(0);
//        for (int i=0; i<auto.size(); i++){
//            System.out.println(auto.get(i));
//        }
        System.out.println(auto);
        }

    }

