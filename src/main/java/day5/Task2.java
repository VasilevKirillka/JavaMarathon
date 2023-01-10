package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike bike1= new Motorbike("Сузуки", "Красный", 2009);
        System.out.println(bike1);
        Motorbike bike2= new Motorbike("Кавасаки", "Зеленый", 2012);
        System.out.println(bike2);
        Motorbike bike3= new Motorbike("Харлей", "Черный", 2017);
        System.out.println("Модель: " + bike3.getModel()+ "\nЦвет: " + bike3.getColor() + "\nГод: " + bike3.getYear());


    }
}
class Motorbike {
    private String model;
    private String color;
    private int year;

    public Motorbike(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String getModel() {
        return model;
    }



    public String getColor() {
        return color;
    }



    public int getYear() {
        return year;
    }


    public String toString() {
        return "Модель мотоцикла: " + getModel() + "\nЦвет мотоцикла: " + getColor() + "\nГод выпуска: " + getYear();
    }

}