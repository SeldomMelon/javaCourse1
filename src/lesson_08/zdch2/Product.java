package lesson_08.zdch2;

public class Product {
    private int price;
    private double rating;

    public Product(int price, double rating) {
        this.price = price;
        this.rating = rating;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

}
