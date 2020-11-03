public class Tuna extends PizzaFiller {
    private double price = 1.25;

    public Tuna(IPizza pizza) {
        super(pizza);
    }

    public String fill() {
        return super.fill() + fillWithTuna();
    }

    public double price() {
        return super.price() + this.price;
    }

    private String fillWithTuna() {
        return " with tuna";
    }
}
