public class Tomato extends PizzaFiller {
    private double price = 0.50;

    public Tomato(IPizza pizza) {
        super(pizza);
    }

    public String fill() {
        return super.fill() + fillWithTomato();
    }

    public double price() {
        return super.price() + this.price;
    }

    private String fillWithTomato() {
        return " with tomato";
    }
}
