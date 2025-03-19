package BattleMon;

import java.util.*;
import java.util.stream.Collectors;
import Battle_Engine.RandomPokemonChooser;
import Database.Pokemon;
import Database.pokemons;
import Database.Move;
import Database.generate_battle_data;
import Battle_Engine.PokemonUnderBattle;

public class SelectionEngine {
    static Scanner sc = new Scanner(System.in);
    static Map<String, List<Move>> pokemonMovesMap = new HashMap<>();
    static List<PokemonUnderBattle> userPokemonList = new ArrayList<>(); // Map to store user's Pokémons
    static List<PokemonUnderBattle> computerPokemonList = new ArrayList<>();

    public static void main(String args[]) throws Exception {
        try {
            loadDatabase();

            int choice = getPokemonChoice();
            while (choice != 0) {
                userPokemonList.add(chooseManually());
                computerPokemonList.add(chooseAutomaticallly());
                choice--;
            }

            System.out.println("User's Pokémon:");
            for (PokemonUnderBattle p : userPokemonList) {
                TypingEffect.printWithTypingEffect(p.name + " at level " + p.level + " with Id " + p.uniqueId);
                p.printMoves();
            }
            System.out.println("Computer's Pokémon:");
            for (PokemonUnderBattle p : computerPokemonList) {
                TypingEffect.printWithTypingEffect(p.name + " at level " + p.level + " with Id " + p.uniqueId);
                p.printMoves();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sc != null) {
                System.out.println("Press Enter to continue");
                System.in.read();
                sc.close();

                Battle battle = new Battle(userPokemonList, computerPokemonList);
            }
        }
    }

    private static void loadDatabase() {
        // Load Pokémon data
        Database.Move.load_to_dict();
        pokemons.createPokemons();
    }

    private static int getPokemonChoice() {
        int choice;
        while (true) {
            System.out.println("Enter number of pokemons you want to choose (1-6):");
            choice = sc.nextInt();
            if (choice > 6) {
                System.out.println("You can only choose up to 6 pokemons. Please try again.");
            } else if (choice < 1) {
                System.out.println("You need to choose at least 1 pokemon. Please try again.");
            } else {
                break; // valid choice, exit the loop
            }
        }
        return choice;
    }

    private static PokemonUnderBattle chooseManually() {
        System.out.println("Enter the ID of Pokémon: ");
        int userLevel = 0, pokemonId = sc.nextInt();

        if (settings.currentGameMode == 2)
            userLevel = (int) (Math.random() * 100) + 1; // Generate random level between 1 and 100
        else if (settings.currentGameMode == 1)
            userLevel = 50;
        else if (settings.currentGameMode == 3) {
            System.out.println("Enter the level of Pokémon: ");
            userLevel = sc.nextInt();
        } 
        Pokemon userPokemon = Pokemon.get_by_name.get(pokemonId);
        if (userPokemon != null) {
            PokemonUnderBattle userPokemonUnderBattle = new PokemonUnderBattle(userPokemon, userLevel,
                    getUniqueKey(userPokemon.name));
            System.out.println("User chose Pokémon: " + userPokemon.name + " at level " + userLevel);
            return userPokemonUnderBattle;
        } else {
            System.out.println("Pokémon not found. Please try again.");
            chooseManually();
            return null;
        }
    }

    private static PokemonUnderBattle chooseAutomaticallly() {
        Pokemon computerPokemon = RandomPokemonChooser.chooseRandomPokemons(1)[0];
        int computerLevel = (int) (Math.random() * 100) + 1; // Generate random level between 1 and 100
        PokemonUnderBattle computerPokemonUnderBattle = new PokemonUnderBattle(computerPokemon, computerLevel,
                getUniqueKey(computerPokemon.name));
        System.out.println("Computer chose Pokémon: " + computerPokemon.name + " at level " + computerLevel);
        return computerPokemonUnderBattle;
    }

    public static List<Move> selectMoves(Pokemon pokemon, int level) {
        // Generate moves for the Pokémon
        final List<Move> allocatedMoves = generate_battle_data.getMoves(pokemon, level);

        // Ensure only up to 4 moves are stored
        List<Move> limitedMoves = allocatedMoves.stream().limit(4).collect(Collectors.toList());
        for (Move move : limitedMoves) {
            System.out.println(move.name);
            Move copiedMove = Move.copyMove(move);
        }
        return limitedMoves;
    }

    private static String getUniqueKey(String pokemonName) {
        return pokemonName + "_" + (userPokemonList.size() + 1);
    }

}