package alessiaPalmieri.demo.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public abstract class FoodMenu {
    private String name;
    private double kcal;
    private double price;


    @Override
    public String toString() {
        return "FoodMenu{" +
                "name='" + name + '\'' +
                ", kcal=" + kcal +
                ", price=" + price +
                '}';
    }
}
