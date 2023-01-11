package day6;

import java.util.Random;

public class Teacher {
    private String teacherName;
    private String subject;

    Random rand = new Random();
    private int assessment;

    //private String result;

    public Teacher() {
    }

    public Teacher(String teacherName, String subject) {
        this.teacherName = teacherName;
        this.subject = subject;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evalute(Student student) {
        assessment = rand.nextInt(4) + 2;
        String result = "";
        System.out.print("Преподаватель " + getTeacherName() + " оценил студента с именем " + student.getStudentName()
                + " по предмету " + getSubject() + " на оценку " + result);
        switch (assessment) {
            case 5:
                result = "отлично";
                System.out.println(result);
                break;
            case 4:
                result = "хорошо";
                System.out.println(result);
                break;
            case 3:
                result = "удовлетворительно";
                System.out.println(result);
                break;
            case 2:
                result = "неудовлетворительно";
                System.out.println(result);
                break;
        }

    }
}
