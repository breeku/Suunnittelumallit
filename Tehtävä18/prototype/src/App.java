public class App {
    public static void main(String[] args) throws Exception {
        Pointer seconds = new Pointer();
        Pointer minutes = new Pointer();
        Pointer hours = new Pointer();

        Clock clock = new Clock(seconds, minutes, hours);

        for (int i = 0; i < 1000; i++) {
            clock.tick();
        }
        System.out.println("Original: " + clock.toString());

        Clock clone = clock.copy();

        for (int i = 0; i < 1000; i++) {
            clone.tick();
        }

        System.out.println("Copy: " + clock.toString());
    }
}
