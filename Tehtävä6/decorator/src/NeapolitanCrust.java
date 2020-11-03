public class NeapolitanCrust extends PizzaFiller {
    private double price = 1.45;

    public NeapolitanCrust(IPizza pizza) {
        super(pizza);
    }

    public String fill() {
        return super.fill() + fillWithNeapolitanCrust();
    }

    public double price() {
        return super.price() + this.price;
    }

    private String fillWithNeapolitanCrust() {
        return " with neapolitan crust";
    }
}
