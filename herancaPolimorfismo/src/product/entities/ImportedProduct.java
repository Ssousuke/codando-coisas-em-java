package product.entities;

public class ImportedProduct extends Product {
    private double customFee;

    public ImportedProduct(double customFee) {
        this.customFee = customFee;
    }

    public ImportedProduct(String name, double price, double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    public double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(double customFee) {
        this.customFee = customFee;
    }

    @Override
    public String priceTag() {
        String priceTag = getName() + " $" + getPrice() + " (Customizado: " + " $" + getCustomFee() + ")";
        return priceTag;
    }

    public double totalPrice() {
        return getPrice() + getCustomFee();
    }
}
