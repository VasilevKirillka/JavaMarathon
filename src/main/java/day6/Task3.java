package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setTeacherName("Сильвестр Сталлоне");
        teacher.setSubject("Стрельба из пулемета");
        teacher.evalute(new Student("Терминатор Айлбибэков"));
    }
}
