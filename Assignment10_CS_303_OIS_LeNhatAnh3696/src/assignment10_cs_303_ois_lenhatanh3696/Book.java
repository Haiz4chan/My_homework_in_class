package assignment10_cs_303_ois_lenhatanh3696;

public class Book {

    private String Title;
    private String Author;
    private double Price;

    Book() {
    }

    Book(String Title, String Author, double Price) {
        this.Author = Author;
        this.Price = Price;
        this.Title = Title;
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }

    public double getPrice() {
        return Price;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public void setAuthor(String Author) {
        this.Author = Author;

    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public String toString() {
        return "Book: " + Title + ", Author: " + Author + ", Price: " + Price;
    }
}
