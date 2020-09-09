package LibrarySystem;

public class Book {

    public String signature;
    public String tile;
    public String author;
    public String ISBN;
    public String location;
    public String nrOfBooks;

    public Book(String signature, String tile, String author, String ISBN, String location, String nrOfBooks) {
        this.signature = signature;
        this.tile = tile;
        this.author = author;
        this.ISBN = ISBN;
        this.location = location;
        this.nrOfBooks = nrOfBooks;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getTile() {
        return tile;
    }

    public void setTile(String tile) {
        this.tile = tile;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNrOfBooks() {
        return nrOfBooks;
    }

    public void setNrOfBooks(String nrOfBooks) {
        this.nrOfBooks = nrOfBooks;
    }

    @Override
    public String toString() {
        return "Book{" +
                "signature='" + signature + '\'' +
                ", tile='" + tile + '\'' +
                ", author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", location='" + location + '\'' +
                ", nrOfBooks='" + nrOfBooks + '\'' +
                '}';
    }
}
