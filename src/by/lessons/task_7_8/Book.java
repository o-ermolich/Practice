package by.lessons.task_7_8;

public class Book {
    int id;
    String name;
    String author;
    String publishing;
    int year;
    int pages;
    double price;

    public Book(int id, String name, String author, String publishing, int year, int pages, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishing = publishing;
        this.year = year;
        this.pages = pages;
        this.price = price;
    }

    public Book() {
        //конструктор без параметров
    }

    public void info() {
        System.out.println("id = " + id + " name = " + name + " author = " + author + " publishing = " + publishing + " year = " + year + " pages = " + pages + " price = " + price);
        //"id = " + id + " name = " + name + " author = " + author + " publishing = " + publishing + " year = " + year + " pages = " + pages + " price = " + price;
        // return result;
    }

    public void changePrice(double newPrice) {
        price = newPrice;
    }

    public Book[] chgBook(Book[] books, int yearParam) {
        int count = 0;
        for (Book s : books) {
            if (s.year < yearParam) {
                count++;
            }
        }
        int j = 0;
        Book booksResult[] = new Book[count];
        for (int i = 0; i < books.length; i++) {
            if (books[i].year < yearParam) {
                booksResult[j] = books[i];
                j++;
            }
        }
        return booksResult;
    }
}
