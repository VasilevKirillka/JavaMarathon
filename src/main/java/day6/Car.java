package day6;

public class Car {
    private String model;
    private String color;
    private int year;
    private int yearDifference;

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int yearDifference(int inputYear) {
        return yearDifference = Math.abs(year - inputYear);
    }

    public void info() {
        System.out.println("Это автомобиль");
    }
}
