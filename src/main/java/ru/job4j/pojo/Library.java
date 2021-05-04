package ru.job4j.pojo;

public class Library extends Book {
    public Library(String name, int countOfPage) {
        super(name, countOfPage);
    }

    public static void main(String[] args) {
        Book cleanCode = new Book("cleanCode", 300);
        Book javaRush = new Book("javaRush", 200);
        Book job4j = new Book("job4j", 120);
        Book geekBrains = new Book("geekBrains", 250);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = javaRush;
        books[2] = job4j;
        books[3] = geekBrains;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " = " + bk.getCountOfPage());
        }
        System.out.println(" swap 0 and 3 ");
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            Book tmp = books[0];
            books[0] = books[3];
            books[3] = tmp;
            System.out.println(bk.getName() + " = " + bk.getCountOfPage());

        }

        System.out.println(" Just book where name like 'clean code'");
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if ("Clean code".equals(bk.getName())) {
                System.out.println(bk.getName() + " = " + bk.getCountOfPage());
            }
        }
    }
}