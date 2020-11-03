public abstract class PizzaFiller implements IPizza {
    private IPizza pizza;

    public PizzaFiller(IPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String fill() {
        return pizza.fill();
    }

    @Override
    public double price() {
        return pizza.price();
    }
}