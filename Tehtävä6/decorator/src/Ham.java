public class Ham extends PizzaFiller {
    private double price = 0.70;

    public Ham(IPizza pizza) {
        super(pizza);
    }

    public String fill() {
        return super.fill() + fillWithHam();
    }

    public double price() {
        return super.price() + this.price;
    }

    private String fillWithHam() {
        return " with ham";
    }
}
