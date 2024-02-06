package alessiaPalmieri.demo.BeansConfig;


import alessiaPalmieri.demo.entities.Drinks;
import alessiaPalmieri.demo.entities.Menu;
import alessiaPalmieri.demo.entities.Pizzas;
import alessiaPalmieri.demo.entities.Toppings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class BeansConfig {
    @Bean
    Toppings tomato(){
        return new Toppings("tomato", 92, 0.69);
    }

    @Bean
    Toppings cheese(){
        return new Toppings("cheese", 92, 0.69);
    }
    @Bean
    Toppings ham(){
        return new Toppings("ham", 35, 0.99);
    }
    @Bean
    Toppings onion(){
        return new Toppings("onion", 22, 0.69);
    }
    @Bean
    Toppings pineapple(){
        return new Toppings("pineapple", 24, 0.79);
    }
    @Bean
    Toppings salami(){
        return new Toppings("salami", 86, 0.99);
    }

    @Bean
    Pizzas margheritaPizza(){
        List<Toppings> toppings = Arrays.asList(tomato(), cheese());
        return new Pizzas("Pizza Margherita", 1104, 4.99, toppings);
    }
    @Bean
    Pizzas hawaiianPizza(){
        List<Toppings> toppings = Arrays.asList(tomato(), cheese(), ham(), pineapple());
        return new Pizzas("Hawaiian Pizza", 1024, 6.49, toppings);
    }
    @Bean
    Pizzas salamiPizza(){
        List<Toppings> toppings = Arrays.asList(tomato(), cheese(), salami());
        return new Pizzas("Salami Pizza", 1160, 5.99, toppings);
    }

    @Bean
    Drinks lemonade(){
        return new Drinks("Lemonade", 128, 1.29 ,0.33);
    }
    @Bean
    Drinks water(){
        return new Drinks("Water", 0, 1.29 ,0.5);
    }
    @Bean
    Drinks wine(){
        return new Drinks("Wine", 607, 7.49 , 0.75);
    }

    @Bean
    Menu getMenu (){
        List<Pizzas> pizzaList = Arrays.asList(margheritaPizza(), hawaiianPizza(), salamiPizza());
        List<Toppings> toppings = Arrays.asList(cheese(), ham(), onion(), pineapple(), salami());
        List<Drinks> drinkList = Arrays.asList(lemonade(), water(), wine());

        return new Menu(pizzaList, toppings, drinkList);

}}
