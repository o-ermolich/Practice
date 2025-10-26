package by.lessons.task_12;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Олег", "Филимонов", "юридический");
        Student student2 = new Student("Ирина", "Косых", "математический");

        Table<Integer, Character> table1 = new Table<>();
        table1.setCharacterAtTable(student1);
        table1.printCharacter();

        Table<Integer, Character> table2 = new Table(512,student2);
        table2.printCharacter();
    }
}
