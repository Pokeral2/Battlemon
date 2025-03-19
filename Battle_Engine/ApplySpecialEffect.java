package Battle_Engine;

import Database.*;
import java.util.Random;

import BattleMon.Battle;

public class ApplySpecialEffect {
    public static void applySpecialEffect(Move move, PokemonUnderBattle attacker, PokemonUnderBattle defender,
            Battle battle) {
        Random rand = new Random();
        int s1 = 0, s2 = 0;
        switch (move.name) {
            case "Megahorn":
                break;
            case "Attack Order":
                break;
            case "Bug Buzz":
                if (rand.nextInt(100) < 10) {
                    defender.specialDefense -= (2 * defender.baseMon.specialDefense) / 100;
                }
                break;
            case "First Impression": // Other effect
                break;
            case "Pollen Puff":
                break;
            case "Leech Life":
                break;
            case "Lunge":
                defender.attack--;
                break;
            case "X-Scissor":
                break;
            case "Signal Beam":
                if (rand.nextInt(100) < 10) {
                    defender.isConfused = true;
                }
                break;
            case "Skitter Smack":
                defender.specialAttack = (2 * defender.baseMon.specialAttack) / 100;
                break;
            case "U-turn":// Yet to implement
                break;
            case "Steamroller": // Yet to implement
                break;
            case "Bug Bite":// Lack of item implementation
                break;
            case "Silver Wind":
                if (rand.nextInt(100) < 10) {
                    attacker.attack += (2 * attacker.baseMon.attack) / 100;
                    attacker.defense += (2 * attacker.baseMon.defense) / 100;
                    attacker.specialAttack += (2 * attacker.baseMon.specialAttack) / 100;
                    attacker.specialDefense += (2 * attacker.baseMon.specialDefense) / 100;
                    attacker.speed += (2 * attacker.baseMon.speed) / 100;
                }
                break;
            case "Fell Stinger":
                if (defender.currentHp <= 0) {
                    attacker.attack += 2 * (2 * attacker.baseMon.attack) / 100;
                }
                break;
            case "Struggle Bug":
                defender.specialAttack += (2 * defender.baseMon.specialAttack) / 100;
                break;
            case "Fury Cutter":
                if (move.power < 40 * 16) {
                    move.power *= 2;
                }
                break;
            case "Pin Missile":
                int r = rand.nextInt(8);
                if (r < 3) {
                    defender.currentHp -= DamageCalculator.damage(battle);
                    defender.currentHp -= DamageCalculator.damage(battle);
                } else if (r < 6) {
                    defender.currentHp -= DamageCalculator.damage(battle);
                } else if (r < 7) {
                    defender.currentHp -= DamageCalculator.damage(battle);
                    defender.currentHp -= DamageCalculator.damage(battle);
                    defender.currentHp -= DamageCalculator.damage(battle);
                } else {
                    defender.currentHp -= DamageCalculator.damage(battle);
                    defender.currentHp -= DamageCalculator.damage(battle);
                    defender.currentHp -= DamageCalculator.damage(battle);
                    defender.currentHp -= DamageCalculator.damage(battle);
                }
                break;
            case "Twineedle":
                if (rand.nextInt(100) < 20) {
                    defender.currentState = PokemonState.POISONED;
                }
                break;
            case "Infestation":
                s1 = rand.nextInt(8);
                s2 = (s1 < 3) ? 2 : (s1 < 6) ? 3 : (s1 == 6) ? 4 : 5;
                if (defender.effects.get("Infestation") == null) {
                    defender.effects.put("Infestation", s2);
                } else {
                    defender.effects.put("Infestation", Math.max(defender.effects.get("Infestation"), s2));
                }
                break;
            case "Defend Order":
                attacker.defense += (2 * attacker.baseMon.defense) / 100;
                attacker.specialDefense += (2 * attacker.baseMon.specialDefense) / 100;
                break;
            case "Heal Order":
                attacker.currentHp = Math.max(attacker.maxHp, attacker.currentHp + attacker.maxHp / 2);
                break;
            case "Miracle Eye":
                // change damage modifier
                break;
            case "Power Split":
                attacker.attack = (attacker.attack + defender.attack) / 2;
                attacker.specialAttack = (attacker.specialAttack + defender.specialAttack) / 2;
                break;
            case "Power Swap":
                s1 = attacker.attack;
                attacker.attack = defender.attack;
                defender.attack = (int) s1;
                s1 = attacker.specialAttack;
                attacker.specialAttack = defender.specialAttack;
                defender.specialAttack = (int) s1;
                break;
            case "Power Trick":
                attacker.attack = StatsCalc.calc(attacker.attack, attacker.level);
                s1 = attacker.attack;
                attacker.attack = attacker.defense;
                attacker.defense = (int) s1;
                break;
            case "Psychic Terrain":
                battle.currentTerrain = terrainInBattle.PSYCHIC_TERRAIN;
                break;
            case "Psycho Shift":
                if (attacker.currentState == PokemonState.BURN) {
                    attacker.currentState = PokemonState.NORMAL;
                    defender.currentState = PokemonState.BURN;
                } else if (attacker.currentState == PokemonState.PARALYZED) {
                    attacker.currentState = PokemonState.NORMAL;
                    defender.currentState = PokemonState.PARALYZED;
                } else if (attacker.currentState == PokemonState.POISONED) {
                    attacker.currentState = PokemonState.NORMAL;
                    defender.currentState = PokemonState.POISONED;
                } else if (attacker.currentState == PokemonState.SLEEP) {
                    attacker.currentState = PokemonState.NORMAL;
                    defender.currentState = PokemonState.SLEEP;
                }
                break;
            case "Reflect":
                s2 = 5;
                if (defender.effects.get("Reflect") == null) {
                    defender.effects.put("Reflect", s2);
                } else {
                    defender.effects.put("Reflect", Math.max(defender.effects.get("Reflect"), s2));
                }

                break;
            case "Rest":
                s2 = 2;
                attacker.currentHp = attacker.maxHp;
                attacker.currentState = PokemonState.SLEEP;
                if (attacker.effects.get("Rest") == null) {
                    attacker.effects.put("Rest", s2);
                } else {
                    attacker.effects.put("Rest", Math.max(attacker.effects.get("Rest"), s2));
                }

                break;
            case "Role Play":
            //ability nhi hai abhi
                break;
            case "Skill Swap":
            //ability nhi hai abhi
                break;
            case "Speed Swap":
                s1 = attacker.speed;
                attacker.speed = defender.speed;
                defender.speed = (int) s1;
                break;
            case "Telekinesis":
            s2=3;
            if(defender.effects.get("Telekinesis")==null){
                defender.effects.put("Telekinesis", s2);
            }
            else{
                defender.effects.put("Telekinesis", Math.max(defender.effects.get("Telekinesis"), s2));
            }
                break;
            case "Teleport"://hatado
                break;
            case "Trick"://items nhi hai abhi
                break;
            case "Trick Room":
            s2=5;
            if(defender.effects.get("Trick Room")==null){
                defender.effects.put("Trick Room", s2);
            }
            else{
                defender.effects.put("Trick Room", Math.max(defender.effects.get("Trick Room"), s2));
            }

                break;
            case "Wonder Room":
            s2=5;
            if(defender.effects.get("Wonder Room")==null){
                defender.effects.put("Wonder Room", s2);
            }
            else{
                defender.effects.put("Wonder Room", Math.max(defender.effects.get("Wonder Room"), s2));
            }
                break;
            case "Head Smash":
            s2=(int)DamageCalculator.damage(battle);
            attacker.currentHp-=s2/2;
                break;
            case "Rock Wrecker":
            s2=1;
            if(defender.effects.get("Rock Wrecker")==null){
                defender.effects.put("Rock Wrecker", s2);
            }
            else{
                defender.effects.put("Rock Wrecker", Math.max(defender.effects.get("Rock Wrecker"), s2));
            }
                break;
            case "Meteor Beam":
            s2=1;
            if(defender.effects.get("Meteor Beam")==null){
                defender.effects.put("Meteor Beam", s2);
            }
            else{
                defender.effects.put("Meteor Beam", Math.max(defender.effects.get("Meteor Beam"), s2));
            }
                break;
            case "Diamond Storm":
            s1=rand.nextInt(100);
            if (s1 < 50) {
                attacker.defense += (2 * attacker.baseMon.defense) / 100;
                
            }
                break;
            case "Stone Edge":
            
                break;
            case "Power Gem":
                break;
            case "Rock Slide":
                break;
            case "Ancient Power":
                break;
            case "Rock Tomb":
                break;
            default:
                break;
        }
    }
}