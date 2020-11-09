public class Pokemon implements PokemonState {
    private PokemonState state;

    public Pokemon(PokemonState state) {
        this.state = state;
    }

    public PokemonState getState() {
        return state;
    }

    public void setState(PokemonState state) {
        this.state = state;
    }

    @Override
    public void defend(Pokemon pokemon) {
        this.state.defend(this);
    }

    @Override
    public void slam(Pokemon pokemon) {
        this.state.slam(this);
    }

    @Override
    public void pound(Pokemon pokemon) {
        this.state.pound(this);
    }

    @Override
    public void evolve(Pokemon pokemon) {
        this.state.evolve(this);
    }

}
