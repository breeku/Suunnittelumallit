import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> lista = Arrays.asList("yksi", "kaksi", "kolme", "neljä", "viisi", "kuusi");
        FirstStrategy firstStrategy = new FirstStrategy();
        SecondStrategy secondStrategy = new SecondStrategy();
        ThirdStrategy thirdStrategy = new ThirdStrategy();

        System.out.println("First strategy:");
        System.out.println(firstStrategy.listToString(lista));

        System.out.println("Second strategy:");
        System.out.println(secondStrategy.listToString(lista));

        System.out.println("Third strategy:");
        System.out.println(thirdStrategy.listToString(lista));
    }
}
