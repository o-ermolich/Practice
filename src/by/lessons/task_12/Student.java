package by.lessons.task_12;

public class Student extends Character {
    private String faculty;


    public Student(String name, String surname, String faculty) {
        super(name, surname);
        this.faculty = faculty;
    }
}
