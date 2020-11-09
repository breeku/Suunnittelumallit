public class Charizard implements PokemonState {
    private int evolve;

    @Override
    public void defend(Pokemon pokemon) {
        System.out.println("Charizard used defend!");
        evolve++;
        if (evolve == 3) {
            this.evolve(pokemon);
        }
    }

    @Override
    public void slam(Pokemon pokemon) {
        System.out.println("Charizard used slam!");
        evolve++;
        if (evolve == 3) {
            this.evolve(pokemon);
        }
    }

    @Override
    public void pound(Pokemon pokemon) {
        System.out.println("Charizard used pound!");
        evolve++;
        if (evolve == 3) {
            this.evolve(pokemon);
        }
    }

    @Override
    public void evolve(Pokemon pokemon) {
        System.out.println("Charizard is evolving into Charmander!");
        pokemon.setState(new Charmander());
    }
}
