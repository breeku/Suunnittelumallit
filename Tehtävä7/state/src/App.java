import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> moves = new ArrayList<String>() {
            private static final long serialVersionUID = 1L;
            {
                add("defend");
                add("slam");
                add("pound");
            }
        };
        Pokemon pokemon = new Pokemon(new Charizard());

        for (int i = 0; i < 20; i++) {
            String move = moves.get(new Random().nextInt(moves.size()));
            Method method = pokemon.getClass().getMethod(move, Pokemon.class);
            method.invoke(pokemon, pokemon);
        }
    }
}
