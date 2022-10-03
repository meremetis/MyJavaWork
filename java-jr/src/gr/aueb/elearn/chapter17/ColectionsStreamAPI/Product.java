package gr.aueb.elearn.chapter17.ColectionsStreamAPI;

import java.util.Objects;

public class Product implements Comparable<Product> {
    private String description;
    private double price;
    private int quantity;

    public Product(){}

    public Product(String description, double price, int quanity) {
        this.description = description;
        this.price = price;
        this.quantity = quanity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuanity() {
        return quantity;
    }

    public void setQuanity(int quanity) {
        this.quantity = quanity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", quanity=" + quantity +
                '}';
    }

    @Override//alages
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return  getDescription().equals(product.getDescription());
    }

    @Override//alages
    public int hashCode() {
        return Objects.hash(getDescription());
    }


    /**Ean thelw san sorting na kanei me to description pou einai String
     *
     */
    @Override//xrisimopiw thn compare to poue xoun eidi ta string
    public int compareTo(Product o) {
        return description.compareTo(o.description);
    }

    /**
     * katataksh simfona me to quantity
     *
     */

/*    @Override
    public int compareTo(Product o) {
//        return this.quantity - o.getQuanity();
        if (this.getQuanity() < o.getQuanity()) return -1;
        else if (this.getQuanity() == o.quantity) return 0;
        else return 1;

    }*/

    /**
     * katataksh simfona me to price
     *
     */

  /*  @Override
    public int compareTo(Product o) {
        return Double.compare(this.price, o.getPrice()); //h klash double mou dinei thn compare
    }*/
}
