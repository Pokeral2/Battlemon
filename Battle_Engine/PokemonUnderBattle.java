package Battle_Engine;
import Database.Move;
import Database.MoveCategory;
import Database.Pokemon;
import Database.PokemonState;
import Database.PokemonType;
import BattleMon.*;
import java.util.*;
import Database.MaxMove;

public class PokemonUnderBattle
{   public List<MaxMove> move;
    public int accuracy;
    public int evasiveness;
    public int attack;
    public int defense;
    public int specialAttack;
    public int specialDefense;
    public int speed;
    public int level;
    public int maxHp;
    public int currentHp;
    public PokemonType type1;
    public PokemonType type2;
    public PokemonState currentState;
    public List<Move> moves;
    public String uniqueId;
    public String name;
    public PokemonUnderBattle(Pokemon p,int level,String uniqueId)
    {
        this.level=level;
        this.uniqueId=uniqueId;
        maxHp=StatsCalc.calc_hp(p.hp,level);
        attack=StatsCalc.calc(p.attack,level);
        defense=StatsCalc.calc(p.defense,level);
        specialAttack=StatsCalc.calc(p.specialAttack,level);
        specialDefense=StatsCalc.calc(p.specialDefense,level);
        speed=StatsCalc.calc(p.speed,level);
        currentHp=maxHp;
        moves=SelectionEngine.selectMoves(p,level);
        currentState=PokemonState.NORMAL;
        name=p.name;
        type1=p.type1;
        type2=p.type2;
    }
    
    public void printMoves(){
        int i=0;
        for(Move move : moves){
            System.out.println(++i +". " + move.name);
        }
    }

    public void printStats(){
        System.out.println("Level: " + level);
        System.out.println("HP: " + currentHp + "/" + maxHp);
        System.out.println("Attack: " + attack);
        System.out.println("Defense: " + defense);
        System.out.println("Special Attack: " + specialAttack);
        System.out.println("Special Defense: " + specialDefense);
        System.out.println("Speed: " + speed);
    }

    public void changeState(PokemonState state){
        currentState = state;
    }
    
}