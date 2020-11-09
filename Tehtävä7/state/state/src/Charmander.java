public class Charmander implements PokemonState {
    private int evolve;

    @Override
    public void defend(Pokemon pokemon) {
        System.out.println("Charmander used defend!");
        evolve++;
        if (evolve == 9) {
            this.evolve(pokemon);
        }
    }

    @Override
    public void slam(Pokemon pokemon) {
        System.out.println("Charmander used slam!");
        evolve++;
        if (evolve == 9) {
            this.evolve(pokemon);
        }
    }

    @Override
    public void pound(Pokemon pokemon) {
        System.out.println("Charmander used pound!");
        evolve++;
        if (evolve == 9) {
            this.evolve(pokemon);
        }
    }

    @Override
    public void evolve(Pokemon pokemon) {
        System.out.println("Charizard is evolving into Charmeleon!");
        pokemon.setState(new Charmeleon());
    }
}
