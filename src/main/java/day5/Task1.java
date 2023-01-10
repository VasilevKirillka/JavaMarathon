package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Жигули");
        car1.setColor("Черный");
        car1.setYear(1989);
        System.out.println(car1);
        Car car2 = new Car();
        car2.setModel("Лада");
        car2.setColor("Красный");
        car2.setYear(2017);
        System.out.println(car2);
        Car car3 = new Car();
        car3.setModel("Audi");
        car3.setColor("Белый");
        car3.setYear(2022);
        System.out.println(car3);


    }
}

class Car {
    private String model;
    private String color;
    private int year;

    public String getModel() {
        return model;
    }

    public void setModel(String carModel) {
        model = carModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String carColor) {
        color = carColor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int carYear) {
        year = carYear;
    }

    public String toString() {
        return "Модель авто: " + getModel() + "\nЦвет авто: " + getColor() + "\nГод выпуска: " + getYear();
    }

}
