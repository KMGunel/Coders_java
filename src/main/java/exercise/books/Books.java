package main.java.exercise.books;

public class Books {
    public String name;
    public String autor;
    public int pages;

    public Books(String name,String autor,int pages){
        this.name=name;
        this.autor=autor;
        this.pages=pages;
    }

    public void reading(){
        System.out.printf("%s  have already read\n",name);
    }
}
