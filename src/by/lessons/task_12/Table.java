package by.lessons.task_12;

public class Table<T1 extends Integer, T2 extends Character> {
    private T1 number;
    private T2 characterAtTable;

    public void printCharacter() {
        System.out.println(characterAtTable.getName() + " " + characterAtTable.getSurname());
    }

    public T1 getNumber() {
        return number;
    }

    public void setNumber(T1 number) {
        this.number = number;
    }

    public T2 getCharacterAtTable() {
        return characterAtTable;
    }

    public void setCharacterAtTable(T2 characterAtTable) {
        this.characterAtTable = characterAtTable;
    }

    public Table() {
    }

    public Table(T1 number, T2 characterAtTable) {
        this.number = number;
        this.characterAtTable = characterAtTable;
    }
}
