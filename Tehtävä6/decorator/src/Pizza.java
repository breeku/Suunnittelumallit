public class Pizza implements IPizza {
    @Override
    public String fill() {
        return "Pizza";
    }

    @Override
    public double price() {
        return 0.0;
    }
}
