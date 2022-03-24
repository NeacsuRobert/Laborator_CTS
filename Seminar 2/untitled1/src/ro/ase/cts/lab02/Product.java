package ro.ase.cts.lab02;

public class Product {
    private int id;
    private String name; //length > 5
    private double price; // > 0
    private String details;//allows " "

    public Product(int id, String name, double price, String details) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.details = details;
    }

    public void applyPercentageDiscount(float discountPercentage){
            this.price -= discountPercentage/100*this.price;
    }

    public void applyAmountDiscount(double discountAmount){
            this.price -= discountAmount;
    }

    public void increasePricePercentage(float increasePercentage){
        this.price += increasePercentage/100*this.price;
    }

    public void increasePriceAmount(double increaseAmount){

    }

    public boolean equals(Product product){
        return this.id == product.id && product.name.equals(this.name) && this.price == product.price && product.details.equals(this.details);
    }


}
