package product.entities;

import java.util.Date;

public class UsedProduct extends Product {
    private Date manufatured;

    public UsedProduct(Date manufatured) {
        this.manufatured = manufatured;
    }

    public UsedProduct(String name, double price, Date manufatured) {
        super(name, price);
        this.manufatured = manufatured;
    }

    public Date getManufatured() {
        return manufatured;
    }

    public void setManufatured(Date manufatured) {
        this.manufatured = manufatured;
    }

    @Override
    public String priceTag() {
        String priceTag = getName() + " (Usado) " + " $" + getPrice() + " (Manufaturado em: " + getManufatured() + ")";
        return priceTag;
    }
}
