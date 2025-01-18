package BattleMon;

import java.util.*;
import Battle_Engine.*;
import Database.WeatherCondition;
import Database.terrainInBattle;
import Database.Move;
import Database.PokemonState;
import Battle_Engine.DamageCalculator;

public class Battle {
    private List<PokemonUnderBattle> userPokemons;
    private List<PokemonUnderBattle> computerPokemons;
    public PokemonUnderBattle userActivePokemon;
    public PokemonUnderBattle computerActivePokemon;
    public Move currentMove;
    public WeatherCondition currentWeather;
    public terrainInBattle currentTerrain;

    public Battle(List<PokemonUnderBattle> userPokemons, List<PokemonUnderBattle> computerPokemons) throws Exception {
        this.userPokemons = userPokemons;
        this.computerPokemons = computerPokemons;
        this.currentWeather = WeatherCondition.CLEAR;
        this.currentTerrain = terrainInBattle.NORMAL_TERRAIN;
        commenceBattle();
    }

    private PokemonUnderBattle switchPokemonManually(List<PokemonUnderBattle> pokemons) {
        PokemonUnderBattle pokemon = null;
        printPokemons(pokemons);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the unique id of the pokemon you want to choose : ");
        String uniqueId = sc.nextLine();
        for (PokemonUnderBattle p : pokemons) {
            if (p.uniqueId.equals(uniqueId)) {
                if(p.currentState != PokemonState.FAINT){
                pokemon = p;
                return pokemon;
                }
                else {
                    System.out.println(p.uniqueId+" is already fainted. Choose another Pokemon.");
                    switchPokemonManually(pokemons);
                }
            }
        }
        System.out.println("Invalid unique id. Please enter a valid unique id.");
        switchPokemonManually(pokemons);
        return null;
    }

    private PokemonUnderBattle switchPokemonAtumatically(List<PokemonUnderBattle> pokemons) {
        Random random = new Random();
        return pokemons.get(random.nextInt(pokemons.size()));
    }

    private void printPokemons(List<PokemonUnderBattle> pokemons) {
        for (PokemonUnderBattle pokemon : pokemons) {
            System.out.println(pokemon.uniqueId + " : " + pokemon.currentHp + "/" + pokemon.maxHp);
        }
    }

    private void commenceBattle() throws Exception {
        Scanner sc = new Scanner(System.in);
        TypingEffect.printWithTypingEffect("Battle begins!");
        TypingEffect.printWithTypingEffect("Choose your first Pokémon.");
        userActivePokemon = switchPokemonManually(userPokemons);
        computerActivePokemon = switchPokemonAtumatically(computerPokemons);
        System.out
                .println("Computer choose " + computerActivePokemon.name + " at level " + computerActivePokemon.level);

        while (true) {
            Move moveSelectedByUser = userTurn();
            Move moveSelectedByComp = computerTurn();
            if (moveSelectedByComp.priority > moveSelectedByUser.priority) {
                performAttack(moveSelectedByComp, userActivePokemon, computerActivePokemon);
                if (userActivePokemon.currentHp <= 0) {
                    userPokemonFainted();
                }
                performAttack(moveSelectedByUser, computerActivePokemon, userActivePokemon);
                if (computerActivePokemon.currentHp <= 0) {
                    computerPokemonFainted();
                }
            } else if (moveSelectedByComp.priority < moveSelectedByUser.priority) {
                performAttack(moveSelectedByUser, computerActivePokemon, userActivePokemon);
                if (computerActivePokemon.currentHp <= 0) {
                    computerPokemonFainted();
                }
                performAttack(moveSelectedByComp, userActivePokemon, computerActivePokemon);
                if (userActivePokemon.currentHp <= 0) {
                    userPokemonFainted();
                }
            } else {
                if (userActivePokemon.speed > computerActivePokemon.speed) {
                    performAttack(moveSelectedByUser, computerActivePokemon, userActivePokemon);
                    if (computerActivePokemon.currentHp <= 0) {
                        computerPokemonFainted();
                    }
                    performAttack(moveSelectedByComp, userActivePokemon, computerActivePokemon);
                    if (userActivePokemon.currentHp <= 0) {
                        userPokemonFainted();
                    }
                } else if (userActivePokemon.speed < computerActivePokemon.speed) {
                    performAttack(moveSelectedByComp, userActivePokemon, computerActivePokemon);
                    if (userActivePokemon.currentHp <= 0) {
                        userPokemonFainted();
                    }
                    performAttack(moveSelectedByUser, computerActivePokemon, userActivePokemon);
                    if (computerActivePokemon.currentHp <= 0) {
                        computerPokemonFainted();
                    }
                } else {
                    Random random1 = new Random();
                    int randomInt = random1.nextInt(2);
                    if (randomInt == 0) {
                        performAttack(moveSelectedByUser, computerActivePokemon, userActivePokemon);
                        if (computerActivePokemon.currentHp <= 0) {
                            computerPokemonFainted();
                        }
                        performAttack(moveSelectedByComp, userActivePokemon, computerActivePokemon);
                        if (userActivePokemon.currentHp <= 0) {
                            userPokemonFainted();
                        }
                    } else {
                        performAttack(moveSelectedByComp, userActivePokemon, computerActivePokemon);
                        if (userActivePokemon.currentHp <= 0) {
                            userPokemonFainted();
                        }
                        performAttack(moveSelectedByUser, computerActivePokemon, userActivePokemon);
                        if (computerActivePokemon.currentHp <= 0) {
                            computerPokemonFainted();
                        }
                    }
                }
            }
        }
    }

    private Move userTurn() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a move");
        userActivePokemon.printMoves();
        int selectedMove = sc.nextInt();
        if (selectedMove < 1 || selectedMove > userActivePokemon.moves.size()) {
            System.out.println("Invalid move. Please enter a valid move.");
            userTurn();
        }
        return userActivePokemon.moves.get(selectedMove - 1);

    }

    private Move computerTurn() {
        Random random = new Random();
        int selectedMove = random.nextInt(computerActivePokemon.moves.size());
        return computerActivePokemon.moves.get(selectedMove);
    }
    
    private void performAttack(Move attack, PokemonUnderBattle defender, PokemonUnderBattle attacker) {
        double damage;
        currentMove = attack;
        damage = DamageCalculator.damage(this);
        defender.currentHp -= damage;

    }

    private void userPokemonFainted() {
        System.out.println(userActivePokemon.name + " fainted!");
        userActivePokemon.currentState = PokemonState.FAINT;
        switchPokemonManually(userPokemons);
        System.exit(0);
    }

    private void computerPokemonFainted() {
        System.out.println(computerActivePokemon.name + " fainted!");
        computerActivePokemon.currentState = PokemonState.FAINT;
        switchPokemonAtumatically(computerPokemons);
        System.exit(0);
    }
}