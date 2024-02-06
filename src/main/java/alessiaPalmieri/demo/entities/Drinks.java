package alessiaPalmieri.demo.entities;

public class Drinks extends FoodMenu {
    private double quantity;

    public Drinks(String name, double kcal, double price, double quantity) {
        super(name, kcal, price);
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Drinks{" + this.getName() +
                "quantity=" + quantity + "l" +
                '}';
    }
}
