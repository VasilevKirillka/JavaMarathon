package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Ока");
        car.setColor("Ржавая");
        car.setYear(1990);
        car.info();
        System.out.println("Разница лет: " + car.yearDifference(2023));
    }
}

