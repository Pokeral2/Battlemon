package Battle_Engine;

import Database.PokemonType;
import Database.MoveType;
import Database.Pokemon;
import Database.PokemonState;
import Database.Move;
import java.util.*;
import Database.WeatherCondition;
import Database.terrainInBattle;
import BattleMon.Battle;
//DARK(1) PSYCHIC(2) GHOST(3)\nDRAGON(4) ICE(5) FAIRY(6)\nNORMAL(7) FIGHTING(8) POISON(9)\nFLYING(10) GROUND(11) BUG(12)\nROCK(13) STEEL(14) ELECTRIC(15)\nFIRE(16) WATER(17) GRASS(18)\n      ");

public class DamageCalculator {

    private double Weather(WeatherCondition condition, MoveType type, PokemonUnderBattle defendingPokemon) {

        if (condition == WeatherCondition.RAIN && type == MoveType.WATER) {
            return 1.5;

        } else if (condition == WeatherCondition.RAIN && type == MoveType.FIRE) {
            return 0.5;
        } else if (condition == WeatherCondition.HARSH_SUNLIGHT && type == MoveType.WATER) {
            return 0.5;
        } else if (condition == WeatherCondition.HARSH_SUNLIGHT && type == MoveType.FIRE) {
            return 1.5;
        }

        else if (condition == WeatherCondition.HEAVYRAIN && type == MoveType.WATER) {
            return 2;
        } else if (condition == WeatherCondition.HEAVYRAIN && type == MoveType.FIRE) {
            return 0;
        }

        else {
            return 1;
        }

    }

    private double Terrain(terrainInBattle terrain, MoveType type, PokemonUnderBattle attackingPokemon) {
        if (attackingPokemon.type1 == PokemonType.FLYING || attackingPokemon.type2 == PokemonType.FLYING) {
            return 1;
        }
        if (terrain == terrainInBattle.ELECTRIC_TERRAIN && type == MoveType.ELECTRIC) {
            return 1.3;
        } else if (terrain == terrainInBattle.MISTY_TERRAIN && type == MoveType.DRAGON) {
            return 0.5;
        } else if (terrain == terrainInBattle.GRASSY_TERRAIN && type == MoveType.GRASS) {
            return 1.3;
        } else if (terrain == terrainInBattle.PSYCHIC_TERRAIN && type == MoveType.PSYCHIC) {
            return 1.3;
        } else {
            return 1;
        }
    }

    private double STAB(MoveType moveType, PokemonUnderBattle attackingPokemon) {
        if (attackingPokemon.type1.getTypeName() == moveType.typeName
                || attackingPokemon.type2.getTypeName() == moveType.typeName) {
            return 1.5;
        } else {
            return 1;
        }
    }

    private static double random() {
        Random random = new Random();
        double rand = random.nextDouble() * 0.15 + 0.85;
        return rand;
    }

    // private static double critical() {
        
    // }

    public static double damage(Battle battle) {
        // double damage=
        // (((((2*level/5)+2)*power*attack/defense)/50)+2)*1*1*weather*1*critical*random*stab*type*status*zMove;
        return 50;
    }
}
