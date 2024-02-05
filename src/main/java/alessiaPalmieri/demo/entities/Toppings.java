package alessiaPalmieri.demo.entities;

public class Toppings extends Food {
    private String ingredients;

    public Toppings(double kalories, double price, String ingredients) {
        super(kalories, price);
        this.ingredients = ingredients;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Toppings{" +
                "ingredients='" + ingredients + '\'' +
                '}';
    }
}
