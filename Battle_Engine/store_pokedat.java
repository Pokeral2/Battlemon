package Battle_Engine;

import java.util.HashMap;
import java.util.Map;
import Database.Pokemon;

public class store_pokedat {
     public static Map<String, Integer> pokemonLevelMap = new HashMap<>();

    public static void map_name_to_level(String p, int level) {
        pokemonLevelMap.put(p, level);
    }

    public static void process_pokemon_levels(String uniqueId) {
        // Call StatsCalc.load_data with each key-value pair
        for (Map.Entry<String, Integer> entry : pokemonLevelMap.entrySet()) {
            String pokemonName = uniqueId.split("_")[0];
                Pokemon pokemon = Pokemon.get_by_name.values().stream()
                    .filter(p -> p.name.equals(pokemonName))
                    .findFirst()
                    .orElse(null);
            StatsCalc.load_data(pokemon, entry.getValue());
        }
        // Clear the map for the next run
        pokemonLevelMap.clear();
    }

    public static Integer get_pokemon_level(String p) {
        return pokemonLevelMap.get(p);
    }
}