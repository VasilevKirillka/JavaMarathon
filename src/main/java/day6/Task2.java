package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("", 0, 0, 0);
        airplane.setManufacturer("Ил");
        airplane.setYear(1991);
        airplane.setLength(59);
        airplane.setFuel(0);
        airplane.setWeight(14900);
        airplane.fillUp(100);
        airplane.info();
        airplane.fillUp(400);
        airplane.info();
    }
}
