package library;

public class Book {
    private int id;
    private String title;
    private String author;
    private String edition;
    private int yearOfPublication;
    private int numberOfPages;
    private double price;

    public Book(int id, String title, String author, String edition, int yearOfPublication, int numberOfPages, double price) throws Exception {
        if (id == 0) {
            throw new Exception("Incorrect value of id!");
        }
        this.id = id;

        if (title.isEmpty()) {
            throw new Exception("Empty line of title!");
        }
        this.title = title;

        if (author.isEmpty()) {
            throw new Exception("Empty line of author!");
        }
        this.author = author;

        if (edition.isEmpty()) {
            throw new Exception("Empty line of edition!");
        }
        this.edition = edition;

        if (yearOfPublication <= 0 || yearOfPublication > 2020) {
            throw new Exception("Incorrect value of year!");
        }
        this.yearOfPublication = yearOfPublication;

        if (numberOfPages <= 0) {
            throw new Exception("Incorrect value of number of pages!");
        }
        this.numberOfPages = numberOfPages;

        if (price < 0.0) {
            throw new Exception("Incorrect value of price!");
        }
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws Exception {
        if (id == 0) {
            throw new Exception("Incorrect value of id!");
        }
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws Exception {
        if (title.isEmpty()) {
            throw new Exception("Empty line of title!");
        }
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) throws Exception {
        if (author.isEmpty()) {
            throw new Exception("Empty line of author!");
        }
        this.author = author;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) throws Exception {
        if (edition.isEmpty()) {
            throw new Exception("Empty line of edition!");
        }
        this.edition = edition;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) throws Exception {
        if (yearOfPublication <= 0 || yearOfPublication > 2020) {
            throw new Exception("Incorrect value of year!");
        }
        this.yearOfPublication = yearOfPublication;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) throws Exception {
        if (numberOfPages <= 0) {
            throw new Exception("Incorrect value of number of pages!");
        }
        this.numberOfPages = numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws Exception {
        if (price < 0.0) {
            throw new Exception("Incorrect value of price!");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book [" +
                "id:" + id +
                ", title: '" + title + '\'' +
                ", author: '" + author + '\'' +
                ", edition: '" + edition + '\'' +
                ", year of publication: " + yearOfPublication +
                ", number of pages: " + numberOfPages +
                ", price: " + price + "$" +
                ']';
    }
}