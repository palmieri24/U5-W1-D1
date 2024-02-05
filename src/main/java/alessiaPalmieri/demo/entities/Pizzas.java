package alessiaPalmieri.demo.entities;



public class Pizzas extends Food {
    private String margherita;

    public Pizzas(double kalories, double price, String margherita) {
        super(kalories, price);
        this.margherita = margherita;
    }

    public String getMargherita() {
        return margherita;
    }

    public void setMargherita(String margherita) {
        this.margherita = margherita;
    }

    @Override
    public String toString() {
        return "Pizzas{" +
                "margherita='" + margherita + '\'' +
                '}';
    }
}
