package alessiaPalmieri.demo.entities;

public class Drinks extends Food {
    private String drinkName;

    public Drinks(double kalories, double price, String drinkName) {
        super(kalories, price);
        this.drinkName = drinkName;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "drinkName='" + drinkName + '\'' +
                '}';
    }
}
