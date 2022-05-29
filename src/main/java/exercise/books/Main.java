package main.java.exercise.books;

public class Main {
    public static void main(String[] args) {
        Books book1 = new Books("Les Miserables","Victor Hugo",1232);
        System.out.printf("%s\n%s\n%d\n",book1.name,book1.autor,book1.pages);
        Books book2 = new Books("Crime and Punishment","FYODOR DOSTOYEVSKY",671);
        System.out.println(book2.autor);
        
        book1.reading();
        book2.reading();
    }


}
