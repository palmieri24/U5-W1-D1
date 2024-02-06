package alessiaPalmieri.demo.entities;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Pizzas extends FoodMenu {
   private List<Toppings> ingredients;

    public Pizzas(String name, double kcal, double price, List<Toppings> ingredients) {
        super(name, kcal, price);
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Pizzas {" +
                "ingredients=" + ingredients +
                '}';
    }
}
