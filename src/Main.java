import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
FirePokemon firepokemon = new FirePokemon("charmander", 4, "flame throw", "wroah","water","grass");
WaterPokemon waterpokemon = new WaterPokemon("squirtle", 3, "watersplash","squick","seaweed","water");
GrassPokemon grassPokemon = new GrassPokemon("Breloom", 6, "scatter toxic spores","brielooo","brown",2);
ElectricPokemon electricPokemon = new ElectricPokemon("Pikachu",8,"thunder","Pika pika","half full","usbc");

        List<SuperPokemon> pokemonList = new ArrayList<>();
        pokemonList.add(firepokemon);
        pokemonList.add(waterpokemon);
        pokemonList.add(grassPokemon);
        pokemonList.add(electricPokemon);

        for (int i = 0;
        i<pokemonList.size(); i++){
            SuperPokemon pokemon=pokemonList.get(i);
            System.out.println(pokemon.getName()+" "+pokemon.tackle());
        }

        System.out.println(" ");

        firepokemon.attack();
        firepokemon.healthPointsAfterAttack();

        System.out.println(" ");

        System.out.println("Volt of "+electricPokemon.getName()+" is "+electricPokemon.getVolt());

        electricPokemon.charge();

        System.out.println("Volt of "+electricPokemon.getName()+" is "+electricPokemon.getVolt());

        System.out.println(" ");

        System.out.println(grassPokemon.getName()+" is "+grassPokemon.getAge());

        grassPokemon.ageGrassPokemon();

        System.out.println(grassPokemon.getName()+" is "+grassPokemon.getAge());

    }
}
