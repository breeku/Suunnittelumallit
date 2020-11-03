public class ThickCrust extends PizzaFiller {
    private double price = 1;

    public ThickCrust(IPizza pizza) {
        super(pizza);
    }

    public String fill() {
        return super.fill() + fillWithThickCrust();
    }

    public double price() {
        return super.price() + this.price;
    }

    private String fillWithThickCrust() {
        return " with thick crust";
    }
}
