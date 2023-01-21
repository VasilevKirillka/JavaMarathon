package day7;

public class Task1 {
    public static void main(String[] args) {
Airplane airplane1=new Airplane("",0, 79,15000);
airplane1.setManufacturer("Боинг");

Airplane airplane2=new Airplane("",0,77,17000);
        airplane2.setManufacturer("Эйрбас");

        Airplane.compareAirplanes(airplane1,airplane2);
    }
}