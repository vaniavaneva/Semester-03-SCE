package lab8.ex01;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String name;
    private int badges;
    private List<Pokemon> pokemons;

    public Trainer(String name) {
        this.name = name;
        this.badges = 0;
        this.pokemons = new ArrayList<>();
    }

    public void addPokemon(Pokemon pokemon) {
        pokemons.add(pokemon);
    }

    public void processTournament(String element) {
        boolean hasElement = pokemons.stream()
                .anyMatch(p -> p.getElement().equals(element));

        if (hasElement) {
            badges++;
        } else {
            pokemons.forEach(p -> p.reduceHealth(10));
            pokemons.removeIf(p -> !p.isAlive());
        }
    }

    public int getBadges() {
        return badges;
    }

    public String getName() {
        return name;
    }

    public int getPokemonCount() {
        return pokemons.size();
    }

    @Override
    public String toString() {
        return name + " " + badges + " " + pokemons.size();
    }
}
