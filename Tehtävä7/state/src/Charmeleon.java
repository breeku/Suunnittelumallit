public class Charmeleon implements PokemonState {

    @Override
    public void defend(Pokemon pokemon) {
        System.out.println("Charmeleon used defend!");
    }

    @Override
    public void slam(Pokemon pokemon) {
        System.out.println("Charmeleon used slam!");
    }

    @Override
    public void pound(Pokemon pokemon) {
        System.out.println("Charmeleon used pound!");
    }

    @Override
    public void evolve(Pokemon pokemon) {
        System.out.println("Charmeleon tried to evolve but is already maxed!");
    }
}
