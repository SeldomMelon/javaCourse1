package lesson_08.zdch2;

import book.Contact;

public class Category {
    private String name;
    private Product[] products;

    public Category (Product... products){
        this.products=products;
    }

 public Category(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }



}