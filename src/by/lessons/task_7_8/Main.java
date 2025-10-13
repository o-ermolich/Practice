package by.lessons.task_7_8;

public class Main {
    public static void main(String[] args) {

        Book book = new Book(6, "Karry", "King", "AST", 1988, 433, 35.14);
        book.info();
        book.changePrice(34.22);
        book.info(); //выводим инфо о книге с новой ценой
               book.chgBook(books(), 2002);

    }
        public static Book[] books () {
            Book book1 = new Book(1, "Паутина", "Кристи", "Азбука", 2002, 204, 12.4);
            Book book2 = new Book(2, "Мизери", "Кинг", "АСТ", 1992, 307, 33);
            Book book3 = new Book(3, "Невидимки", "Паланик", "Азбука", 2000, 113, 25.6);
            Book book4 = new Book(4, "Гранатовый браслет", "Куприн", "Мировая классика", 1914, 213, 20);
            Book book5 = new Book(5, "Чёрный кофе", "Кристи", "АСТ", 1995, 200, 12.4);

            Book arrayBooks[] = {book1, book2, book3, book4, book5};
            return arrayBooks;
        }

    }