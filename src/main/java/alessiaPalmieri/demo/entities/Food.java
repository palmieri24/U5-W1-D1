package alessiaPalmieri.demo.entities;

public abstract class Food {
    private double kalories;
    private double price;

    public Food(double kalories, double price) {
        this.kalories = kalories;
        this.price = price;
    }

    public Food() {
    }

    public double getKalories() {
        return kalories;
    }

    public void setKalories(double kalories) {
        this.kalories = kalories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Food {" +
                "kalories=" + kalories +
                ", price=" + price +
                '}';
    }
}
