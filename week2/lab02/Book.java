public class Book {
    String title;
    String author;
    double price;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    } 
    
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
    }


    public void updatePrice(double newPrice) {
        if (newPrice >= 0) {
            this.price = newPrice;
        } else {
            System.out.println("Invalid price. Price should be a positive number.");
        }
    }
  
    public static void main(String[] args) {
    Book unknownBook = new Book();
    unknownBook.displayDetails();

    Book hp1Book = new Book("Harry Potter and the Philosopher\'s Stone", "J.K. Rowling", 350.00);
    hp1Book.displayDetails();

    hp1Book.updatePrice(32000.00);
    hp1Book.displayDetails();

    hp1Book.updatePrice(-5000.00);
    }    
}
