public class App {
    public static void main(String[] args) throws Exception {
        IPizza firstPizza = new Tomato(new Tuna(new ThickCrust(new Pizza())));
        IPizza secondPizza = new Tomato(new Ham(new NeapolitanCrust(new Pizza())));
        IPizza thirdPizza = new Tuna(new Tuna(new ThickCrust(new Pizza())));

        System.out.println(firstPizza.fill());
        System.out.println("Price: " + firstPizza.price());

        System.out.println(secondPizza.fill());
        System.out.println("Price: " + secondPizza.price());

        System.out.println(thirdPizza.fill());
        System.out.println("Price: " + thirdPizza.price());
    }
}
