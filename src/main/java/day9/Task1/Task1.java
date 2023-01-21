package day9.Task1;

public class Task1 {
    public static void main(String[] args) {

        Student st1=new Student("Кирилл", "Java разработка");
        Teacher teacher=new Teacher("Чип Дейлович", "Мультведение");
        st1.printInfo();
        teacher.printInfo();
    }
}
