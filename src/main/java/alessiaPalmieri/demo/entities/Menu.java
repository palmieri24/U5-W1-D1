package alessiaPalmieri.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class Menu {
    private List<Pizzas> listaPizze;
    private List<Toppings> listaToppings;
    private List<Drinks> listaDrink;

    @Override
    public String toString() {
        return "Menu{" +
                "Pizze=" + listaPizze +
                ", Toppings=" + listaToppings +
                ", Drink=" + listaDrink +
                '}';
    }

}
