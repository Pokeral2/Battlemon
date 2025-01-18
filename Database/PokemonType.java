package Database;
//import java.util.*;
public class PokemonType {

    private final int typeNumber;
    private final String typeName;

    public static PokemonType NORMAL = new PokemonType(1,"NORMAL");
    public static PokemonType FIRE = new PokemonType(2,"FIRE");
    public static PokemonType WATER = new PokemonType(3,"WATER");
    public static PokemonType ELECTRIC = new PokemonType(4,"ELECTRIC");
    public static PokemonType GRASS = new PokemonType(5,"GRASS");
    public static PokemonType ICE = new PokemonType(6,"ICE");
    public static PokemonType FIGHTING = new PokemonType(7,"FIGHTING");
    public static PokemonType POISON = new PokemonType(8,"POISON");
    public static PokemonType GROUND = new PokemonType(9,"GROUND");
    public static PokemonType FLYING = new PokemonType(10,"FLYING");
    public static PokemonType PSYCHIC = new PokemonType(11,"PSYCHIC");
    public static PokemonType BUG = new PokemonType(12,"BUG");
    public static PokemonType ROCK = new PokemonType(13,"ROCK");
    public static PokemonType GHOST = new PokemonType(14,"GHOST");
    public static PokemonType DRAGON = new PokemonType(15,"DRAGON");
    public static PokemonType DARK = new PokemonType(16,"DARK");
    public static PokemonType STEEL = new PokemonType(17,"STEEL");
    public static PokemonType FAIRY = new PokemonType(18,"FAIRY");


    public static PokemonType NOTYPE = new PokemonType(0,"");

    PokemonType(int typeNumber,String typeName) {
        this.typeNumber = typeNumber;
        this.typeName = typeName;
    }

    public String getTypeName() {
        return this.typeName;
    }
    public int getTypeNumber(){
        return this.typeNumber;
    }
    

    // Method to get the integer value
    /* public int getTypeNumber() {
    return typeNumber;
    }*/
        public double typeEffectiveness(PokemonType type1,PokemonType type2, MoveType moveType)

    {
        double multiplier1=1;
        double multiplier2 = 1;
       

        // attacker changing
        if (moveType == MoveType.DARK && type1 == PokemonType.DARK)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.DARK && type1 == PokemonType.PSYCHIC)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.DARK && type1 == PokemonType.GHOST)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.DARK && type1 == PokemonType.DRAGON)
            multiplier1 = 1;
        else if (moveType == MoveType.DARK && type1 == PokemonType.ICE)
            multiplier1 = 1;
        else if (moveType == MoveType.DARK && type1 == PokemonType.FAIRY)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.DARK && type1 == PokemonType.NORMAL)
            multiplier1 = 1;
        else if (moveType == MoveType.DARK && type1 == PokemonType.FIGHTING)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.DARK && type1 == PokemonType.POISON)
            multiplier1 = 1;
        else if (moveType == MoveType.DARK && type1 == PokemonType.FLYING)
            multiplier1 = 1;
        else if (moveType == MoveType.DARK && type1 == PokemonType.GROUND)
            multiplier1 = 1;
        else if (moveType == MoveType.DARK && type1 == PokemonType.BUG)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.DARK && type1 == PokemonType.ROCK)
            multiplier1 = 1;
        else if (moveType == MoveType.DARK && type1 == PokemonType.STEEL)
            multiplier1 = 1;
        else if (moveType == MoveType.DARK && type1 == PokemonType.ELECTRIC)
            multiplier1 = 1;
        else if (moveType == MoveType.DARK && type1 == PokemonType.GRASS)
            multiplier1 = 1;
        else if (moveType == MoveType.DARK && type1 == PokemonType.FIRE)
            multiplier1 = 1;
        else if (moveType == MoveType.DARK && type1 == PokemonType.WATER)
            multiplier1 = 1;
        else if (moveType == MoveType.DARK && type1 == PokemonType.STEEL)
            multiplier1 = 1;
        else if (moveType == MoveType.DARK && type1 == PokemonType.ELECTRIC)
            multiplier1 = 1;

        else if (moveType == MoveType.PSYCHIC && type1 == PokemonType.DARK)
            multiplier1 = 0;
        else if (moveType == MoveType.PSYCHIC && type1 == PokemonType.PSYCHIC)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.PSYCHIC && type1 == PokemonType.GHOST)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.PSYCHIC && type1 == PokemonType.DRAGON)
            multiplier1 = 1;
        else if (moveType == MoveType.PSYCHIC && type1 == PokemonType.ICE)
            multiplier1 = 1;
        else if (moveType == MoveType.PSYCHIC && type1 == PokemonType.FAIRY)
            multiplier1 = 1;
        else if (moveType == MoveType.PSYCHIC && type1 == PokemonType.NORMAL)
            multiplier1 = 1;
        else if (moveType == MoveType.PSYCHIC && type1 == PokemonType.FIGHTING)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.PSYCHIC && type1 == PokemonType.POISON)
            multiplier1 = 1;
        else if (moveType == MoveType.PSYCHIC && type1 == PokemonType.FLYING)
            multiplier1 = 1;
        else if (moveType == MoveType.PSYCHIC && type1 == PokemonType.GROUND)
            multiplier1 = 1;
        else if (moveType == MoveType.PSYCHIC && type1 == PokemonType.BUG)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.PSYCHIC && type1 == PokemonType.ROCK)
            multiplier1 = 1;
        else if (moveType == MoveType.PSYCHIC && type1 == PokemonType.STEEL)
            multiplier1 = 1;
        else if (moveType == MoveType.PSYCHIC && type1 == PokemonType.ELECTRIC)
            multiplier1 = 1;
        else if (moveType == MoveType.PSYCHIC && type1 == PokemonType.FIRE)
            multiplier1 = 1;
        else if (moveType == MoveType.PSYCHIC && type1 == PokemonType.WATER)
            multiplier1 = 1;
        else if (moveType == MoveType.PSYCHIC && type1 == PokemonType.GRASS)
            multiplier1 = 1;

        else if (moveType == MoveType.GHOST && type1 == PokemonType.DARK)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.GHOST && type1 == PokemonType.PSYCHIC)
            multiplier1 = 1;
        else if (moveType == MoveType.GHOST && type1 == PokemonType.GHOST)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.GHOST && type1 == PokemonType.DRAGON)
            multiplier1 = 1;
        else if (moveType == MoveType.GHOST && type1 == PokemonType.ICE)
            multiplier1 = 1;
        else if (moveType == MoveType.GHOST && type1 == PokemonType.FAIRY)
            multiplier1 = 1;
        else if (moveType == MoveType.GHOST && type1 == PokemonType.NORMAL)
            multiplier1 = 0;
        else if (moveType == MoveType.GHOST && type1 == PokemonType.FIGHTING)
            multiplier1 = 1;
        else if (moveType == MoveType.GHOST && type1 == PokemonType.POISON)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.GHOST && type1 == PokemonType.FLYING)
            multiplier1 = 1;
        else if (moveType == MoveType.GHOST && type1 == PokemonType.GROUND)
            multiplier1 = 1;
        else if (moveType == MoveType.GHOST && type1 == PokemonType.BUG)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.GHOST && type1 == PokemonType.ROCK)
            multiplier1 = 1;
        else if (moveType == MoveType.GHOST && type1 == PokemonType.STEEL)
            multiplier1 = 1;
        else if (moveType == MoveType.GHOST && type1 == PokemonType.ELECTRIC)
            multiplier1 = 1;
        else if (moveType == MoveType.GHOST && type1 == PokemonType.FIRE)
            multiplier1 = 1;
        else if (moveType == MoveType.GHOST && type1 == PokemonType.WATER)
            multiplier1 = 1;
        else if (moveType == MoveType.GHOST && type1 == PokemonType.GRASS)
            multiplier1 = 1;

        else if (moveType == MoveType.DRAGON && type1 == PokemonType.DARK)
            multiplier1 = 1;
        else if (moveType == MoveType.DRAGON && type1 == PokemonType.PSYCHIC)
            multiplier1 = 1;
        else if (moveType == MoveType.DRAGON && type1 == PokemonType.GHOST)
            multiplier1 = 1;
        else if (moveType == MoveType.DRAGON && type1 == PokemonType.DRAGON)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.DRAGON && type1 == PokemonType.ICE)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.DRAGON && type1 == PokemonType.FAIRY)
            multiplier1 = 0;
        else if (moveType == MoveType.DRAGON && type1 == PokemonType.NORMAL)
            multiplier1 = 1;
        else if (moveType == MoveType.DRAGON && type1 == PokemonType.FIGHTING)
            multiplier1 = 1;
        else if (moveType == MoveType.DRAGON && type1 == PokemonType.POISON)
            multiplier1 = 1;
        else if (moveType == MoveType.DRAGON && type1 == PokemonType.FLYING)
            multiplier1 = 1;
        else if (moveType == MoveType.DRAGON && type1 == PokemonType.GROUND)
            multiplier1 = 1;
        else if (moveType == MoveType.DRAGON && type1 == PokemonType.BUG)
            multiplier1 = 1;
        else if (moveType == MoveType.DRAGON && type1 == PokemonType.ROCK)
            multiplier1 = 1;
        else if (moveType == MoveType.DRAGON && type1 == PokemonType.STEEL)
            multiplier1 = 1;
        else if (moveType == MoveType.DRAGON && type1 == PokemonType.ELECTRIC)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.DRAGON && type1 == PokemonType.FIRE)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.DRAGON && type1 == PokemonType.WATER)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.DRAGON && type1 == PokemonType.GRASS)
            multiplier1 = 1 * 2;

        else if (moveType == MoveType.ICE && type1 == PokemonType.DARK)
            multiplier1 = 1;
        else if (moveType == MoveType.ICE && type1 == PokemonType.PSYCHIC)
            multiplier1 = 1;
        else if (moveType == MoveType.ICE && type1 == PokemonType.GHOST)
            multiplier1 = 1;
        else if (moveType == MoveType.ICE && type1 == PokemonType.DRAGON)
            multiplier1 = 1;
        else if (moveType == MoveType.ICE && type1 == PokemonType.ICE)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.ICE && type1 == PokemonType.FAIRY)
            multiplier1 = 1;
        else if (moveType == MoveType.ICE && type1 == PokemonType.NORMAL)
            multiplier1 = 1;
        else if (moveType == MoveType.ICE && type1 == PokemonType.FIGHTING)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.ICE && type1 == PokemonType.POISON)
            multiplier1 = 1;
        else if (moveType == MoveType.ICE && type1 == PokemonType.FLYING)
            multiplier1 = 1;
        else if (moveType == MoveType.ICE && type1 == PokemonType.GROUND)
            multiplier1 = 1;
        else if (moveType == MoveType.ICE && type1 == PokemonType.BUG)
            multiplier1 = 1;
        else if (moveType == MoveType.ICE && type1 == PokemonType.ROCK)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.ICE && type1 == PokemonType.STEEL)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.ICE && type1 == PokemonType.ELECTRIC)
            multiplier1 = 1;
        else if (moveType == MoveType.ICE && type1 == PokemonType.FIRE)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.ICE && type1 == PokemonType.WATER)
            multiplier1 = 1;
        else if (moveType == MoveType.ICE && type1 == PokemonType.GRASS)
            multiplier1 = 1;

        else if (moveType == MoveType.FAIRY && type1 == PokemonType.DARK)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.FAIRY && type1 == PokemonType.PSYCHIC)
            multiplier1 = 1;
        else if (moveType == MoveType.FAIRY && type1 == PokemonType.GHOST)
            multiplier1 = 1;
        else if (moveType == MoveType.FAIRY && type1 == PokemonType.DRAGON)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.FAIRY && type1 == PokemonType.ICE)
            multiplier1 = 1;
        else if (moveType == MoveType.FAIRY && type1 == PokemonType.FAIRY)
            multiplier1 = 1;
        else if (moveType == MoveType.FAIRY && type1 == PokemonType.NORMAL)
            multiplier1 = 1;
        else if (moveType == MoveType.FAIRY && type1 == PokemonType.FIGHTING)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.FAIRY && type1 == PokemonType.POISON)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.FAIRY && type1 == PokemonType.FLYING)
            multiplier1 = 1;
        else if (moveType == MoveType.FAIRY && type1 == PokemonType.GROUND)
            multiplier1 = 1;
        else if (moveType == MoveType.FAIRY && type1 == PokemonType.BUG)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.FAIRY && type1 == PokemonType.ROCK)
            multiplier1 = 1;
        else if (moveType == MoveType.FAIRY && type1 == PokemonType.STEEL)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.FAIRY && type1 == PokemonType.ELECTRIC)
            multiplier1 = 1;
        else if (moveType == MoveType.FAIRY && type1 == PokemonType.FIRE)
            multiplier1 = 1;
        else if (moveType == MoveType.FAIRY && type1 == PokemonType.WATER)
            multiplier1 = 1;
        else if (moveType == MoveType.FAIRY && type1 == PokemonType.GRASS)
            multiplier1 = 1;

        else if (moveType == MoveType.NORMAL && type1 == PokemonType.DARK)
            multiplier1 = 1;
        else if (moveType == MoveType.NORMAL && type1 == PokemonType.PSYCHIC)
            multiplier1 = 1;
        else if (moveType == MoveType.NORMAL && type1 == PokemonType.GHOST)
            multiplier1 = 0;
        else if (moveType == MoveType.NORMAL && type1 == PokemonType.DRAGON)
            multiplier1 = 1;
        else if (moveType == MoveType.NORMAL && type1 == PokemonType.ICE)
            multiplier1 = 1;
        else if (moveType == MoveType.NORMAL && type1 == PokemonType.FAIRY)
            multiplier1 = 1;
        else if (moveType == MoveType.NORMAL && type1 == PokemonType.NORMAL)
            multiplier1 = 1;
        else if (moveType == MoveType.NORMAL && type1 == PokemonType.FIGHTING)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.NORMAL && type1 == PokemonType.POISON)
            multiplier1 = 1;
        else if (moveType == MoveType.NORMAL && type1 == PokemonType.FLYING)
            multiplier1 = 1;
        else if (moveType == MoveType.NORMAL && type1 == PokemonType.GROUND)
            multiplier1 = 1;
        else if (moveType == MoveType.NORMAL && type1 == PokemonType.BUG)
            multiplier1 = 1;
        else if (moveType == MoveType.NORMAL && type1 == PokemonType.ROCK)
            multiplier1 = 1;
        else if (moveType == MoveType.NORMAL && type1 == PokemonType.STEEL)
            multiplier1 = 1;
        else if (moveType == MoveType.NORMAL && type1 == PokemonType.ELECTRIC)
            multiplier1 = 1;
        else if (moveType == MoveType.NORMAL && type1 == PokemonType.FIRE)
            multiplier1 = 1;
        else if (moveType == MoveType.NORMAL && type1 == PokemonType.WATER)
            multiplier1 = 1;
        else if (moveType == MoveType.NORMAL && type1 == PokemonType.GRASS)
            multiplier1 = 1;

        else if (moveType == MoveType.FIGHTING && type1 == PokemonType.DARK)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.FIGHTING && type1 == PokemonType.PSYCHIC)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.FIGHTING && type1 == PokemonType.GHOST)
            multiplier1 = 0;
        else if (moveType == MoveType.FIGHTING && type1 == PokemonType.DRAGON)
            multiplier1 = 1;
        else if (moveType == MoveType.FIGHTING && type1 == PokemonType.ICE)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.FIGHTING && type1 == PokemonType.FAIRY)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.FIGHTING && type1 == PokemonType.NORMAL)
            multiplier1 = 1;
        else if (moveType == MoveType.FIGHTING && type1 == PokemonType.FIGHTING)
            multiplier1 = 1;
        else if (moveType == MoveType.FIGHTING && type1 == PokemonType.POISON)
            multiplier1 = 1;
        else if (moveType == MoveType.FIGHTING && type1 == PokemonType.FLYING)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.FIGHTING && type1 == PokemonType.GROUND)
            multiplier1 = 1;
        else if (moveType == MoveType.FIGHTING && type1 == PokemonType.BUG)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.FIGHTING && type1 == PokemonType.ROCK)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.FIGHTING && type1 == PokemonType.STEEL)
            multiplier1 = 1;
        else if (moveType == MoveType.FIGHTING && type1 == PokemonType.ELECTRIC)
            multiplier1 = 1;
        else if (moveType == MoveType.FIGHTING && type1 == PokemonType.FIRE)
            multiplier1 = 1;
        else if (moveType == MoveType.FIGHTING && type1 == PokemonType.WATER)
            multiplier1 = 1;
        else if (moveType == MoveType.FIGHTING && type1 == PokemonType.GRASS)
            multiplier1 = 1;

        else if (moveType == MoveType.POISON && type1 == PokemonType.DARK)
            multiplier1 = 1;
        else if (moveType == MoveType.POISON && type1 == PokemonType.PSYCHIC)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.POISON && type1 == PokemonType.GHOST)
            multiplier1 = 1;
        else if (moveType == MoveType.POISON && type1 == PokemonType.DRAGON)
            multiplier1 = 1;
        else if (moveType == MoveType.POISON && type1 == PokemonType.ICE)
            multiplier1 = 1;
        else if (moveType == MoveType.POISON && type1 == PokemonType.FAIRY)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.POISON && type1 == PokemonType.NORMAL)
            multiplier1 = 1;
        else if (moveType == MoveType.POISON && type1 == PokemonType.FIGHTING)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.POISON && type1 == PokemonType.POISON)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.POISON && type1 == PokemonType.FLYING)
            multiplier1 = 1;
        else if (moveType == MoveType.POISON && type1 == PokemonType.GROUND)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.POISON && type1 == PokemonType.BUG)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.POISON && type1 == PokemonType.ROCK)
            multiplier1 = 1;
        else if (moveType == MoveType.POISON && type1 == PokemonType.STEEL)
            multiplier1 = 0;
        else if (moveType == MoveType.POISON && type1 == PokemonType.ELECTRIC)
            multiplier1 = 1;
        else if (moveType == MoveType.POISON && type1 == PokemonType.FIRE)
            multiplier1 = 1;
        else if (moveType == MoveType.POISON && type1 == PokemonType.WATER)
            multiplier1 = 1;
        else if (moveType == MoveType.POISON && type1 == PokemonType.GRASS)
            multiplier1 = 1 * 2;

        else if (moveType == MoveType.FLYING && type1 == PokemonType.DARK)
            multiplier1 = 1;
        else if (moveType == MoveType.FLYING && type1 == PokemonType.PSYCHIC)
            multiplier1 = 1;
        else if (moveType == MoveType.FLYING && type1 == PokemonType.GHOST)
            multiplier1 = 1;
        else if (moveType == MoveType.FLYING && type1 == PokemonType.DRAGON)
            multiplier1 = 1;
        else if (moveType == MoveType.FLYING && type1 == PokemonType.ICE)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.FLYING && type1 == PokemonType.FAIRY)
            multiplier1 = 1;
        else if (moveType == MoveType.FLYING && type1 == PokemonType.NORMAL)
            multiplier1 = 1;
        else if (moveType == MoveType.FLYING && type1 == PokemonType.FIGHTING)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.FLYING && type1 == PokemonType.POISON)
            multiplier1 = 1;
        else if (moveType == MoveType.FLYING && type1 == PokemonType.FLYING)
            multiplier1 = 1;
        else if (moveType == MoveType.FLYING && type1 == PokemonType.GROUND)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.FLYING && type1 == PokemonType.BUG)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.FLYING && type1 == PokemonType.ROCK)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.FLYING && type1 == PokemonType.STEEL)
            multiplier1 = 1;
        else if (moveType == MoveType.FLYING && type1 == PokemonType.ELECTRIC)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.FLYING && type1 == PokemonType.FIRE)
            multiplier1 = 1;
        else if (moveType == MoveType.FLYING && type1 == PokemonType.WATER)
            multiplier1 = 1;
        else if (moveType == MoveType.FLYING && type1 == PokemonType.GRASS)
            multiplier1 = 1 * 2;

        else if (moveType == MoveType.GROUND && type1 == PokemonType.DARK)
            multiplier1 = 1;
        else if (moveType == MoveType.GROUND && type1 == PokemonType.PSYCHIC)
            multiplier1 = 1;
        else if (moveType == MoveType.GROUND && type1 == PokemonType.GHOST)
            multiplier1 = 1;
        else if (moveType == MoveType.GROUND && type1 == PokemonType.DRAGON)
            multiplier1 = 1;
        else if (moveType == MoveType.GROUND && type1 == PokemonType.ICE)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.GROUND && type1 == PokemonType.FAIRY)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.GROUND && type1 == PokemonType.NORMAL)
            multiplier1 = 1;
        else if (moveType == MoveType.GROUND && type1 == PokemonType.FIGHTING)
            multiplier1 = 1;
        else if (moveType == MoveType.GROUND && type1 == PokemonType.POISON)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.GROUND && type1 == PokemonType.FLYING)
            multiplier1 = 0;
        else if (moveType == MoveType.GROUND && type1 == PokemonType.GROUND)
            multiplier1 = 1;
        else if (moveType == MoveType.GROUND && type1 == PokemonType.BUG)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.GROUND && type1 == PokemonType.ROCK)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.GROUND && type1 == PokemonType.STEEL)
            multiplier1 = 1;
        else if (moveType == MoveType.GROUND && type1 == PokemonType.ELECTRIC)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.GROUND && type1 == PokemonType.FIRE)
            multiplier1 = 1;
        else if (moveType == MoveType.GROUND && type1 == PokemonType.WATER)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.GROUND && type1 == PokemonType.GRASS)
            multiplier1 = 1 / 2;

        else if (moveType == MoveType.BUG && type1 == PokemonType.DARK)
            multiplier1 = 1;
        else if (moveType == MoveType.BUG && type1 == PokemonType.PSYCHIC)
            multiplier1 = 1;
        else if (moveType == MoveType.BUG && type1 == PokemonType.GHOST)
            multiplier1 = 1;
        else if (moveType == MoveType.BUG && type1 == PokemonType.DRAGON)
            multiplier1 = 1;
        else if (moveType == MoveType.BUG && type1 == PokemonType.ICE)
            multiplier1 = 1;
        else if (moveType == MoveType.BUG && type1 == PokemonType.FAIRY)
            multiplier1 = 1;
        else if (moveType == MoveType.BUG && type1 == PokemonType.NORMAL)
            multiplier1 = 1;
        else if (moveType == MoveType.BUG && type1 == PokemonType.FIGHTING)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.BUG && type1 == PokemonType.POISON)
            multiplier1 = 1;
        else if (moveType == MoveType.BUG && type1 == PokemonType.FLYING)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.BUG && type1 == PokemonType.GROUND)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.BUG && type1 == PokemonType.BUG)
            multiplier1 = 1;
        else if (moveType == MoveType.BUG && type1 == PokemonType.ROCK)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.BUG && type1 == PokemonType.STEEL)
            multiplier1 = 1;
        else if (moveType == MoveType.BUG && type1 == PokemonType.ELECTRIC)
            multiplier1 = 1;
        else if (moveType == MoveType.BUG && type1 == PokemonType.FIRE)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.BUG && type1 == PokemonType.WATER)
            multiplier1 = 1;
        else if (moveType == MoveType.BUG && type1 == PokemonType.GRASS)
            multiplier1 = 1 * 2;

        else if (moveType == MoveType.ROCK && type1 == PokemonType.DARK)
            multiplier1 = 1;
        else if (moveType == MoveType.ROCK && type1 == PokemonType.PSYCHIC)
            multiplier1 = 1;
        else if (moveType == MoveType.ROCK && type1 == PokemonType.GHOST)
            multiplier1 = 1;
        else if (moveType == MoveType.ROCK && type1 == PokemonType.DRAGON)
            multiplier1 = 1;
        else if (moveType == MoveType.ROCK && type1 == PokemonType.ICE)
            multiplier1 = 1;
        else if (moveType == MoveType.ROCK && type1 == PokemonType.FAIRY)
            multiplier1 = 1;
        else if (moveType == MoveType.ROCK && type1 == PokemonType.NORMAL)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.ROCK && type1 == PokemonType.FIGHTING)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.ROCK && type1 == PokemonType.POISON)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.ROCK && type1 == PokemonType.FLYING)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.ROCK && type1 == PokemonType.GROUND)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.ROCK && type1 == PokemonType.BUG)
            multiplier1 = 1;
        else if (moveType == MoveType.ROCK && type1 == PokemonType.ROCK)
            multiplier1 = 1;
        else if (moveType == MoveType.ROCK && type1 == PokemonType.STEEL)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.ROCK && type1 == PokemonType.ELECTRIC)
            multiplier1 = 1;
        else if (moveType == MoveType.ROCK && type1 == PokemonType.FIRE)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.ROCK && type1 == PokemonType.WATER)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.ROCK && type1 == PokemonType.GRASS)
            multiplier1 = 1 / 2;

        else if (moveType == MoveType.STEEL && type1 == PokemonType.DARK)
            multiplier1 = 1;
        else if (moveType == MoveType.STEEL && type1 == PokemonType.PSYCHIC)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.STEEL && type1 == PokemonType.GHOST)
            multiplier1 = 1;
        else if (moveType == MoveType.STEEL && type1 == PokemonType.DRAGON)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.STEEL && type1 == PokemonType.ICE)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.STEEL && type1 == PokemonType.FAIRY)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.STEEL && type1 == PokemonType.NORMAL)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.STEEL && type1 == PokemonType.FIGHTING)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.STEEL && type1 == PokemonType.POISON)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.STEEL && type1 == PokemonType.FLYING)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.STEEL && type1 == PokemonType.GROUND)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.STEEL && type1 == PokemonType.BUG)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.STEEL && type1 == PokemonType.ROCK)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.STEEL && type1 == PokemonType.STEEL)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.STEEL && type1 == PokemonType.ELECTRIC)
            multiplier1 = 1;
        else if (moveType == MoveType.STEEL && type1 == PokemonType.FIRE)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.STEEL && type1 == PokemonType.WATER)
            multiplier1 = 1;
        else if (moveType == MoveType.STEEL && type1 == PokemonType.GRASS)
            multiplier1 = 1 * 2;

        else if (moveType == MoveType.ELECTRIC && type1 == PokemonType.DARK)
            multiplier1 = 1;
        else if (moveType == MoveType.ELECTRIC && type1 == PokemonType.PSYCHIC)
            multiplier1 = 1;
        else if (moveType == MoveType.ELECTRIC && type1 == PokemonType.GHOST)
            multiplier1 = 1;
        else if (moveType == MoveType.ELECTRIC && type1 == PokemonType.DRAGON)
            multiplier1 = 1;
        else if (moveType == MoveType.ELECTRIC && type1 == PokemonType.ICE)
            multiplier1 = 1;
        else if (moveType == MoveType.ELECTRIC && type1 == PokemonType.FAIRY)
            multiplier1 = 1;
        else if (moveType == MoveType.ELECTRIC && type1 == PokemonType.NORMAL)
            multiplier1 = 1;
        else if (moveType == MoveType.ELECTRIC && type1 == PokemonType.FIGHTING)
            multiplier1 = 1;
        else if (moveType == MoveType.ELECTRIC && type1 == PokemonType.POISON)
            multiplier1 = 1;
        else if (moveType == MoveType.ELECTRIC && type1 == PokemonType.FLYING)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.ELECTRIC && type1 == PokemonType.GROUND)
            multiplier1 = 0;
        else if (moveType == MoveType.ELECTRIC && type1 == PokemonType.BUG)
            multiplier1 = 1;
        else if (moveType == MoveType.ELECTRIC && type1 == PokemonType.ROCK)
            multiplier1 = 1;
        else if (moveType == MoveType.ELECTRIC && type1 == PokemonType.STEEL)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.ELECTRIC && type1 == PokemonType.ELECTRIC)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.ELECTRIC && type1 == PokemonType.FIRE)
            multiplier1 = 1;
        else if (moveType == MoveType.ELECTRIC && type1 == PokemonType.WATER)
            multiplier1 = 1;
        else if (moveType == MoveType.ELECTRIC && type1 == PokemonType.GRASS)
            multiplier1 = 1;

        else if (moveType == MoveType.FIRE && type1 == PokemonType.DARK)
            multiplier1 = 1;
        else if (moveType == MoveType.FIRE && type1 == PokemonType.PSYCHIC)
            multiplier1 = 1;
        else if (moveType == MoveType.FIRE && type1 == PokemonType.GHOST)
            multiplier1 = 1;
        else if (moveType == MoveType.FIRE && type1 == PokemonType.DRAGON)
            multiplier1 = 1;
        else if (moveType == MoveType.FIRE && type1 == PokemonType.ICE)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.FIRE && type1 == PokemonType.FAIRY)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.FIRE && type1 == PokemonType.NORMAL)
            multiplier1 = 1;
        else if (moveType == MoveType.FIRE && type1 == PokemonType.FIGHTING)
            multiplier1 = 1;
        else if (moveType == MoveType.FIRE && type1 == PokemonType.POISON)
            multiplier1 = 1;
        else if (moveType == MoveType.FIRE && type1 == PokemonType.FLYING)
            multiplier1 = 1;
        else if (moveType == MoveType.FIRE && type1 == PokemonType.GROUND)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.FIRE && type1 == PokemonType.BUG)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.FIRE && type1 == PokemonType.ROCK)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.FIRE && type1 == PokemonType.STEEL)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.FIRE && type1 == PokemonType.ELECTRIC)
            multiplier1 = 1;
        else if (moveType == MoveType.FIRE && type1 == PokemonType.FIRE)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.FIRE && type1 == PokemonType.WATER)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.FIRE && type1 == PokemonType.GRASS)
            multiplier1 = 1 * 2;

        else if (moveType == MoveType.WATER && type1 == PokemonType.DARK)
            multiplier1 = 1;
        else if (moveType == MoveType.WATER && type1 == PokemonType.PSYCHIC)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.WATER && type1 == PokemonType.GHOST)
            multiplier1 = 1;
        else if (moveType == MoveType.WATER && type1 == PokemonType.DRAGON)
            multiplier1 = 1;
        else if (moveType == MoveType.WATER && type1 == PokemonType.ICE)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.WATER && type1 == PokemonType.FAIRY)
            multiplier1 = 1;
        else if (moveType == MoveType.WATER && type1 == PokemonType.NORMAL)
            multiplier1 = 1;
        else if (moveType == MoveType.WATER && type1 == PokemonType.FIGHTING)
            multiplier1 = 1;
        else if (moveType == MoveType.WATER && type1 == PokemonType.POISON)
            multiplier1 = 1;
        else if (moveType == MoveType.WATER && type1 == PokemonType.FLYING)
            multiplier1 = 1;
        else if (moveType == MoveType.WATER && type1 == PokemonType.GROUND)
            multiplier1 = 1;
        else if (moveType == MoveType.WATER && type1 == PokemonType.BUG)
            multiplier1 = 1;
        else if (moveType == MoveType.WATER && type1 == PokemonType.ROCK)
            multiplier1 = 1;
        else if (moveType == MoveType.WATER && type1 == PokemonType.STEEL)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.WATER && type1 == PokemonType.ELECTRIC)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.WATER && type1 == PokemonType.FIRE)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.WATER && type1 == PokemonType.WATER)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.WATER && type1 == PokemonType.GRASS)
            multiplier1 = 1 / 2;

        else if (moveType == MoveType.GRASS && type1 == PokemonType.DARK)
            multiplier1 = 1;
        else if (moveType == MoveType.GRASS && type1 == PokemonType.PSYCHIC)
            multiplier1 = 1;
        else if (moveType == MoveType.GRASS && type1 == PokemonType.GHOST)
            multiplier1 = 1;
        else if (moveType == MoveType.GRASS && type1 == PokemonType.DRAGON)
            multiplier1 = 1;
        else if (moveType == MoveType.GRASS && type1 == PokemonType.ICE)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.GRASS && type1 == PokemonType.FAIRY)
            multiplier1 = 1;
        else if (moveType == MoveType.GRASS && type1 == PokemonType.NORMAL)
            multiplier1 = 1;
        else if (moveType == MoveType.GRASS && type1 == PokemonType.FIGHTING)
            multiplier1 = 1;
        else if (moveType == MoveType.GRASS && type1 == PokemonType.POISON)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.GRASS && type1 == PokemonType.FLYING)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.GRASS && type1 == PokemonType.GROUND)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.GRASS && type1 == PokemonType.BUG)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.GRASS && type1 == PokemonType.ROCK)
            multiplier1 = 1;
        else if (moveType == MoveType.GRASS && type1 == PokemonType.STEEL)
            multiplier1 = 1;
        else if (moveType == MoveType.GRASS && type1 == PokemonType.ELECTRIC)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.GRASS && type1 == PokemonType.FIRE)
            multiplier1 = 1 / 2;
        else if (moveType == MoveType.GRASS && type1 == PokemonType.WATER)
            multiplier1 = 1 * 2;
        else if (moveType == MoveType.GRASS && type1 == PokemonType.GRASS)
            multiplier1 = 1 * 2;

        if (type2 != PokemonType.NOTYPE) {
            if (moveType == MoveType.DARK && type2 == PokemonType.DARK)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.DARK && type2 == PokemonType.PSYCHIC)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.DARK && type2 == PokemonType.GHOST)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.DARK && type2 == PokemonType.DRAGON)
                multiplier2 = 1;
            else if (moveType == MoveType.DARK && type2 == PokemonType.ICE)
                multiplier2 = 1;
            else if (moveType == MoveType.DARK && type2 == PokemonType.FAIRY)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.DARK && type2 == PokemonType.NORMAL)
                multiplier2 = 1;
            else if (moveType == MoveType.DARK && type2 == PokemonType.FIGHTING)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.DARK && type2 == PokemonType.POISON)
                multiplier2 = 1;
            else if (moveType == MoveType.DARK && type2 == PokemonType.FLYING)
                multiplier2 = 1;
            else if (moveType == MoveType.DARK && type2 == PokemonType.GROUND)
                multiplier2 = 1;
            else if (moveType == MoveType.DARK && type2 == PokemonType.BUG)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.DARK && type2 == PokemonType.ROCK)
                multiplier2 = 1;
            else if (moveType == MoveType.DARK && type2 == PokemonType.STEEL)
                multiplier2 = 1;
            else if (moveType == MoveType.DARK && type2 == PokemonType.ELECTRIC)
                multiplier2 = 1;
            else if (moveType == MoveType.DARK && type2 == PokemonType.GRASS)
                multiplier2 = 1;
            else if (moveType == MoveType.DARK && type2 == PokemonType.FIRE)
                multiplier2 = 1;
            else if (moveType == MoveType.DARK && type2 == PokemonType.WATER)
                multiplier2 = 1;
            else if (moveType == MoveType.DARK && type2 == PokemonType.STEEL)
                multiplier2 = 1;
            else if (moveType == MoveType.DARK && type2 == PokemonType.ELECTRIC)
                multiplier2 = 1;

            else if (moveType == MoveType.PSYCHIC && type2 == PokemonType.DARK)
                multiplier2 = 0;
            else if (moveType == MoveType.PSYCHIC && type2 == PokemonType.PSYCHIC)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.PSYCHIC && type2 == PokemonType.GHOST)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.PSYCHIC && type2 == PokemonType.DRAGON)
                multiplier2 = 1;
            else if (moveType == MoveType.PSYCHIC && type2 == PokemonType.ICE)
                multiplier2 = 1;
            else if (moveType == MoveType.PSYCHIC && type2 == PokemonType.FAIRY)
                multiplier2 = 1;
            else if (moveType == MoveType.PSYCHIC && type2 == PokemonType.NORMAL)
                multiplier2 = 1;
            else if (moveType == MoveType.PSYCHIC && type2 == PokemonType.FIGHTING)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.PSYCHIC && type2 == PokemonType.POISON)
                multiplier2 = 1;
            else if (moveType == MoveType.PSYCHIC && type2 == PokemonType.FLYING)
                multiplier2 = 1;
            else if (moveType == MoveType.PSYCHIC && type2 == PokemonType.GROUND)
                multiplier2 = 1;
            else if (moveType == MoveType.PSYCHIC && type2 == PokemonType.BUG)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.PSYCHIC && type2 == PokemonType.ROCK)
                multiplier2 = 1;
            else if (moveType == MoveType.PSYCHIC && type2 == PokemonType.STEEL)
                multiplier2 = 1;
            else if (moveType == MoveType.PSYCHIC && type2 == PokemonType.ELECTRIC)
                multiplier2 = 1;
            else if (moveType == MoveType.PSYCHIC && type2 == PokemonType.FIRE)
                multiplier2 = 1;
            else if (moveType == MoveType.PSYCHIC && type2 == PokemonType.WATER)
                multiplier2 = 1;
            else if (moveType == MoveType.PSYCHIC && type2 == PokemonType.GRASS)
                multiplier2 = 1;

            else if (moveType == MoveType.GHOST && type2 == PokemonType.DARK)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.GHOST && type2 == PokemonType.PSYCHIC)
                multiplier2 = 1;
            else if (moveType == MoveType.GHOST && type2 == PokemonType.GHOST)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.GHOST && type2 == PokemonType.DRAGON)
                multiplier2 = 1;
            else if (moveType == MoveType.GHOST && type2 == PokemonType.ICE)
                multiplier2 = 1;
            else if (moveType == MoveType.GHOST && type2 == PokemonType.FAIRY)
                multiplier2 = 1;
            else if (moveType == MoveType.GHOST && type2 == PokemonType.NORMAL)
                multiplier2 = 0;
            else if (moveType == MoveType.GHOST && type2 == PokemonType.FIGHTING)
                multiplier2 = 1;
            else if (moveType == MoveType.GHOST && type2 == PokemonType.POISON)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.GHOST && type2 == PokemonType.FLYING)
                multiplier2 = 1;
            else if (moveType == MoveType.GHOST && type2 == PokemonType.GROUND)
                multiplier2 = 1;
            else if (moveType == MoveType.GHOST && type2 == PokemonType.BUG)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.GHOST && type2 == PokemonType.ROCK)
                multiplier2 = 1;
            else if (moveType == MoveType.GHOST && type2 == PokemonType.STEEL)
                multiplier2 = 1;
            else if (moveType == MoveType.GHOST && type2 == PokemonType.ELECTRIC)
                multiplier2 = 1;
            else if (moveType == MoveType.GHOST && type2 == PokemonType.FIRE)
                multiplier2 = 1;
            else if (moveType == MoveType.GHOST && type2 == PokemonType.WATER)
                multiplier2 = 1;
            else if (moveType == MoveType.GHOST && type2 == PokemonType.GRASS)
                multiplier2 = 1;

            else if (moveType == MoveType.DRAGON && type2 == PokemonType.DARK)
                multiplier2 = 1;
            else if (moveType == MoveType.DRAGON && type2 == PokemonType.PSYCHIC)
                multiplier2 = 1;
            else if (moveType == MoveType.DRAGON && type2 == PokemonType.GHOST)
                multiplier2 = 1;
            else if (moveType == MoveType.DRAGON && type2 == PokemonType.DRAGON)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.DRAGON && type2 == PokemonType.ICE)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.DRAGON && type2 == PokemonType.FAIRY)
                multiplier2 = 0;
            else if (moveType == MoveType.DRAGON && type2 == PokemonType.NORMAL)
                multiplier2 = 1;
            else if (moveType == MoveType.DRAGON && type2 == PokemonType.FIGHTING)
                multiplier2 = 1;
            else if (moveType == MoveType.DRAGON && type2 == PokemonType.POISON)
                multiplier2 = 1;
            else if (moveType == MoveType.DRAGON && type2 == PokemonType.FLYING)
                multiplier2 = 1;
            else if (moveType == MoveType.DRAGON && type2 == PokemonType.GROUND)
                multiplier2 = 1;
            else if (moveType == MoveType.DRAGON && type2 == PokemonType.BUG)
                multiplier2 = 1;
            else if (moveType == MoveType.DRAGON && type2 == PokemonType.ROCK)
                multiplier2 = 1;
            else if (moveType == MoveType.DRAGON && type2 == PokemonType.STEEL)
                multiplier2 = 1;
            else if (moveType == MoveType.DRAGON && type2 == PokemonType.ELECTRIC)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.DRAGON && type2 == PokemonType.FIRE)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.DRAGON && type2 == PokemonType.WATER)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.DRAGON && type2 == PokemonType.GRASS)
                multiplier2 = 1 * 2;

            else if (moveType == MoveType.ICE && type2 == PokemonType.DARK)
                multiplier2 = 1;
            else if (moveType == MoveType.ICE && type2 == PokemonType.PSYCHIC)
                multiplier2 = 1;
            else if (moveType == MoveType.ICE && type2 == PokemonType.GHOST)
                multiplier2 = 1;
            else if (moveType == MoveType.ICE && type2 == PokemonType.DRAGON)
                multiplier2 = 1;
            else if (moveType == MoveType.ICE && type2 == PokemonType.ICE)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.ICE && type2 == PokemonType.FAIRY)
                multiplier2 = 1;
            else if (moveType == MoveType.ICE && type2 == PokemonType.NORMAL)
                multiplier2 = 1;
            else if (moveType == MoveType.ICE && type2 == PokemonType.FIGHTING)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.ICE && type2 == PokemonType.POISON)
                multiplier2 = 1;
            else if (moveType == MoveType.ICE && type2 == PokemonType.FLYING)
                multiplier2 = 1;
            else if (moveType == MoveType.ICE && type2 == PokemonType.GROUND)
                multiplier2 = 1;
            else if (moveType == MoveType.ICE && type2 == PokemonType.BUG)
                multiplier2 = 1;
            else if (moveType == MoveType.ICE && type2 == PokemonType.ROCK)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.ICE && type2 == PokemonType.STEEL)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.ICE && type2 == PokemonType.ELECTRIC)
                multiplier2 = 1;
            else if (moveType == MoveType.ICE && type2 == PokemonType.FIRE)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.ICE && type2 == PokemonType.WATER)
                multiplier2 = 1;
            else if (moveType == MoveType.ICE && type2 == PokemonType.GRASS)
                multiplier2 = 1;

            else if (moveType == MoveType.FAIRY && type2 == PokemonType.DARK)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.FAIRY && type2 == PokemonType.PSYCHIC)
                multiplier2 = 1;
            else if (moveType == MoveType.FAIRY && type2 == PokemonType.GHOST)
                multiplier2 = 1;
            else if (moveType == MoveType.FAIRY && type2 == PokemonType.DRAGON)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.FAIRY && type2 == PokemonType.ICE)
                multiplier2 = 1;
            else if (moveType == MoveType.FAIRY && type2 == PokemonType.FAIRY)
                multiplier2 = 1;
            else if (moveType == MoveType.FAIRY && type2 == PokemonType.NORMAL)
                multiplier2 = 1;
            else if (moveType == MoveType.FAIRY && type2 == PokemonType.FIGHTING)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.FAIRY && type2 == PokemonType.POISON)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.FAIRY && type2 == PokemonType.FLYING)
                multiplier2 = 1;
            else if (moveType == MoveType.FAIRY && type2 == PokemonType.GROUND)
                multiplier2 = 1;
            else if (moveType == MoveType.FAIRY && type2 == PokemonType.BUG)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.FAIRY && type2 == PokemonType.ROCK)
                multiplier2 = 1;
            else if (moveType == MoveType.FAIRY && type2 == PokemonType.STEEL)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.FAIRY && type2 == PokemonType.ELECTRIC)
                multiplier2 = 1;
            else if (moveType == MoveType.FAIRY && type2 == PokemonType.FIRE)
                multiplier2 = 1;
            else if (moveType == MoveType.FAIRY && type2 == PokemonType.WATER)
                multiplier2 = 1;
            else if (moveType == MoveType.FAIRY && type2 == PokemonType.GRASS)
                multiplier2 = 1;

            else if (moveType == MoveType.NORMAL && type2 == PokemonType.DARK)
                multiplier2 = 1;
            else if (moveType == MoveType.NORMAL && type2 == PokemonType.PSYCHIC)
                multiplier2 = 1;
            else if (moveType == MoveType.NORMAL && type2 == PokemonType.GHOST)
                multiplier2 = 0;
            else if (moveType == MoveType.NORMAL && type2 == PokemonType.DRAGON)
                multiplier2 = 1;
            else if (moveType == MoveType.NORMAL && type2 == PokemonType.ICE)
                multiplier2 = 1;
            else if (moveType == MoveType.NORMAL && type2 == PokemonType.FAIRY)
                multiplier2 = 1;
            else if (moveType == MoveType.NORMAL && type2 == PokemonType.NORMAL)
                multiplier2 = 1;
            else if (moveType == MoveType.NORMAL && type2 == PokemonType.FIGHTING)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.NORMAL && type2 == PokemonType.POISON)
                multiplier2 = 1;
            else if (moveType == MoveType.NORMAL && type2 == PokemonType.FLYING)
                multiplier2 = 1;
            else if (moveType == MoveType.NORMAL && type2 == PokemonType.GROUND)
                multiplier2 = 1;
            else if (moveType == MoveType.NORMAL && type2 == PokemonType.BUG)
                multiplier2 = 1;
            else if (moveType == MoveType.NORMAL && type2 == PokemonType.ROCK)
                multiplier2 = 1;
            else if (moveType == MoveType.NORMAL && type2 == PokemonType.STEEL)
                multiplier2 = 1;
            else if (moveType == MoveType.NORMAL && type2 == PokemonType.ELECTRIC)
                multiplier2 = 1;
            else if (moveType == MoveType.NORMAL && type2 == PokemonType.FIRE)
                multiplier2 = 1;
            else if (moveType == MoveType.NORMAL && type2 == PokemonType.WATER)
                multiplier2 = 1;
            else if (moveType == MoveType.NORMAL && type2 == PokemonType.GRASS)
                multiplier2 = 1;

            else if (moveType == MoveType.FIGHTING && type2 == PokemonType.DARK)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.FIGHTING && type2 == PokemonType.PSYCHIC)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.FIGHTING && type2 == PokemonType.GHOST)
                multiplier2 = 0;
            else if (moveType == MoveType.FIGHTING && type2 == PokemonType.DRAGON)
                multiplier2 = 1;
            else if (moveType == MoveType.FIGHTING && type2 == PokemonType.ICE)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.FIGHTING && type2 == PokemonType.FAIRY)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.FIGHTING && type2 == PokemonType.NORMAL)
                multiplier2 = 1;
            else if (moveType == MoveType.FIGHTING && type2 == PokemonType.FIGHTING)
                multiplier2 = 1;
            else if (moveType == MoveType.FIGHTING && type2 == PokemonType.POISON)
                multiplier2 = 1;
            else if (moveType == MoveType.FIGHTING && type2 == PokemonType.FLYING)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.FIGHTING && type2 == PokemonType.GROUND)
                multiplier2 = 1;
            else if (moveType == MoveType.FIGHTING && type2 == PokemonType.BUG)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.FIGHTING && type2 == PokemonType.ROCK)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.FIGHTING && type2 == PokemonType.STEEL)
                multiplier2 = 1;
            else if (moveType == MoveType.FIGHTING && type2 == PokemonType.ELECTRIC)
                multiplier2 = 1;
            else if (moveType == MoveType.FIGHTING && type2 == PokemonType.FIRE)
                multiplier2 = 1;
            else if (moveType == MoveType.FIGHTING && type2 == PokemonType.WATER)
                multiplier2 = 1;
            else if (moveType == MoveType.FIGHTING && type2 == PokemonType.GRASS)
                multiplier2 = 1;

            else if (moveType == MoveType.POISON && type2 == PokemonType.DARK)
                multiplier2 = 1;
            else if (moveType == MoveType.POISON && type2 == PokemonType.PSYCHIC)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.POISON && type2 == PokemonType.GHOST)
                multiplier2 = 1;
            else if (moveType == MoveType.POISON && type2 == PokemonType.DRAGON)
                multiplier2 = 1;
            else if (moveType == MoveType.POISON && type2 == PokemonType.ICE)
                multiplier2 = 1;
            else if (moveType == MoveType.POISON && type2 == PokemonType.FAIRY)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.POISON && type2 == PokemonType.NORMAL)
                multiplier2 = 1;
            else if (moveType == MoveType.POISON && type2 == PokemonType.FIGHTING)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.POISON && type2 == PokemonType.POISON)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.POISON && type2 == PokemonType.FLYING)
                multiplier2 = 1;
            else if (moveType == MoveType.POISON && type2 == PokemonType.GROUND)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.POISON && type2 == PokemonType.BUG)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.POISON && type2 == PokemonType.ROCK)
                multiplier2 = 1;
            else if (moveType == MoveType.POISON && type2 == PokemonType.STEEL)
                multiplier2 = 0;
            else if (moveType == MoveType.POISON && type2 == PokemonType.ELECTRIC)
                multiplier2 = 1;
            else if (moveType == MoveType.POISON && type2 == PokemonType.FIRE)
                multiplier2 = 1;
            else if (moveType == MoveType.POISON && type2 == PokemonType.WATER)
                multiplier2 = 1;
            else if (moveType == MoveType.POISON && type2 == PokemonType.GRASS)
                multiplier2 = 1 * 2;

            else if (moveType == MoveType.FLYING && type2 == PokemonType.DARK)
                multiplier2 = 1;
            else if (moveType == MoveType.FLYING && type2 == PokemonType.PSYCHIC)
                multiplier2 = 1;
            else if (moveType == MoveType.FLYING && type2 == PokemonType.GHOST)
                multiplier2 = 1;
            else if (moveType == MoveType.FLYING && type2 == PokemonType.DRAGON)
                multiplier2 = 1;
            else if (moveType == MoveType.FLYING && type2 == PokemonType.ICE)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.FLYING && type2 == PokemonType.FAIRY)
                multiplier2 = 1;
            else if (moveType == MoveType.FLYING && type2 == PokemonType.NORMAL)
                multiplier2 = 1;
            else if (moveType == MoveType.FLYING && type2 == PokemonType.FIGHTING)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.FLYING && type2 == PokemonType.POISON)
                multiplier2 = 1;
            else if (moveType == MoveType.FLYING && type2 == PokemonType.FLYING)
                multiplier2 = 1;
            else if (moveType == MoveType.FLYING && type2 == PokemonType.GROUND)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.FLYING && type2 == PokemonType.BUG)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.FLYING && type2 == PokemonType.ROCK)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.FLYING && type2 == PokemonType.STEEL)
                multiplier2 = 1;
            else if (moveType == MoveType.FLYING && type2 == PokemonType.ELECTRIC)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.FLYING && type2 == PokemonType.FIRE)
                multiplier2 = 1;
            else if (moveType == MoveType.FLYING && type2 == PokemonType.WATER)
                multiplier2 = 1;
            else if (moveType == MoveType.FLYING && type2 == PokemonType.GRASS)
                multiplier2 = 1 * 2;

            else if (moveType == MoveType.GROUND && type2 == PokemonType.DARK)
                multiplier2 = 1;
            else if (moveType == MoveType.GROUND && type2 == PokemonType.PSYCHIC)
                multiplier2 = 1;
            else if (moveType == MoveType.GROUND && type2 == PokemonType.GHOST)
                multiplier2 = 1;
            else if (moveType == MoveType.GROUND && type2 == PokemonType.DRAGON)
                multiplier2 = 1;
            else if (moveType == MoveType.GROUND && type2 == PokemonType.ICE)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.GROUND && type2 == PokemonType.FAIRY)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.GROUND && type2 == PokemonType.NORMAL)
                multiplier2 = 1;
            else if (moveType == MoveType.GROUND && type2 == PokemonType.FIGHTING)
                multiplier2 = 1;
            else if (moveType == MoveType.GROUND && type2 == PokemonType.POISON)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.GROUND && type2 == PokemonType.FLYING)
                multiplier2 = 0;
            else if (moveType == MoveType.GROUND && type2 == PokemonType.GROUND)
                multiplier2 = 1;
            else if (moveType == MoveType.GROUND && type2 == PokemonType.BUG)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.GROUND && type2 == PokemonType.ROCK)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.GROUND && type2 == PokemonType.STEEL)
                multiplier2 = 1;
            else if (moveType == MoveType.GROUND && type2 == PokemonType.ELECTRIC)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.GROUND && type2 == PokemonType.FIRE)
                multiplier2 = 1;
            else if (moveType == MoveType.GROUND && type2 == PokemonType.WATER)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.GROUND && type2 == PokemonType.GRASS)
                multiplier2 = 1 / 2;

            else if (moveType == MoveType.BUG && type2 == PokemonType.DARK)
                multiplier2 = 1;
            else if (moveType == MoveType.BUG && type2 == PokemonType.PSYCHIC)
                multiplier2 = 1;
            else if (moveType == MoveType.BUG && type2 == PokemonType.GHOST)
                multiplier2 = 1;
            else if (moveType == MoveType.BUG && type2 == PokemonType.DRAGON)
                multiplier2 = 1;
            else if (moveType == MoveType.BUG && type2 == PokemonType.ICE)
                multiplier2 = 1;
            else if (moveType == MoveType.BUG && type2 == PokemonType.FAIRY)
                multiplier2 = 1;
            else if (moveType == MoveType.BUG && type2 == PokemonType.NORMAL)
                multiplier2 = 1;
            else if (moveType == MoveType.BUG && type2 == PokemonType.FIGHTING)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.BUG && type2 == PokemonType.POISON)
                multiplier2 = 1;
            else if (moveType == MoveType.BUG && type2 == PokemonType.FLYING)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.BUG && type2 == PokemonType.GROUND)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.BUG && type2 == PokemonType.BUG)
                multiplier2 = 1;
            else if (moveType == MoveType.BUG && type2 == PokemonType.ROCK)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.BUG && type2 == PokemonType.STEEL)
                multiplier2 = 1;
            else if (moveType == MoveType.BUG && type2 == PokemonType.ELECTRIC)
                multiplier2 = 1;
            else if (moveType == MoveType.BUG && type2 == PokemonType.FIRE)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.BUG && type2 == PokemonType.WATER)
                multiplier2 = 1;
            else if (moveType == MoveType.BUG && type2 == PokemonType.GRASS)
                multiplier2 = 1 * 2;

            else if (moveType == MoveType.ROCK && type2 == PokemonType.DARK)
                multiplier2 = 1;
            else if (moveType == MoveType.ROCK && type2 == PokemonType.PSYCHIC)
                multiplier2 = 1;
            else if (moveType == MoveType.ROCK && type2 == PokemonType.GHOST)
                multiplier2 = 1;
            else if (moveType == MoveType.ROCK && type2 == PokemonType.DRAGON)
                multiplier2 = 1;
            else if (moveType == MoveType.ROCK && type2 == PokemonType.ICE)
                multiplier2 = 1;
            else if (moveType == MoveType.ROCK && type2 == PokemonType.FAIRY)
                multiplier2 = 1;
            else if (moveType == MoveType.ROCK && type2 == PokemonType.NORMAL)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.ROCK && type2 == PokemonType.FIGHTING)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.ROCK && type2 == PokemonType.POISON)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.ROCK && type2 == PokemonType.FLYING)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.ROCK && type2 == PokemonType.GROUND)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.ROCK && type2 == PokemonType.BUG)
                multiplier2 = 1;
            else if (moveType == MoveType.ROCK && type2 == PokemonType.ROCK)
                multiplier2 = 1;
            else if (moveType == MoveType.ROCK && type2 == PokemonType.STEEL)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.ROCK && type2 == PokemonType.ELECTRIC)
                multiplier2 = 1;
            else if (moveType == MoveType.ROCK && type2 == PokemonType.FIRE)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.ROCK && type2 == PokemonType.WATER)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.ROCK && type2 == PokemonType.GRASS)
                multiplier2 = 1 / 2;

            else if (moveType == MoveType.STEEL && type2 == PokemonType.DARK)
                multiplier2 = 1;
            else if (moveType == MoveType.STEEL && type2 == PokemonType.PSYCHIC)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.STEEL && type2 == PokemonType.GHOST)
                multiplier2 = 1;
            else if (moveType == MoveType.STEEL && type2 == PokemonType.DRAGON)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.STEEL && type2 == PokemonType.ICE)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.STEEL && type2 == PokemonType.FAIRY)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.STEEL && type2 == PokemonType.NORMAL)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.STEEL && type2 == PokemonType.FIGHTING)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.STEEL && type2 == PokemonType.POISON)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.STEEL && type2 == PokemonType.FLYING)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.STEEL && type2 == PokemonType.GROUND)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.STEEL && type2 == PokemonType.BUG)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.STEEL && type2 == PokemonType.ROCK)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.STEEL && type2 == PokemonType.STEEL)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.STEEL && type2 == PokemonType.ELECTRIC)
                multiplier2 = 1;
            else if (moveType == MoveType.STEEL && type2 == PokemonType.FIRE)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.STEEL && type2 == PokemonType.WATER)
                multiplier2 = 1;
            else if (moveType == MoveType.STEEL && type2 == PokemonType.GRASS)
                multiplier2 = 1 * 2;

            else if (moveType == MoveType.ELECTRIC && type2 == PokemonType.DARK)
                multiplier2 = 1;
            else if (moveType == MoveType.ELECTRIC && type2 == PokemonType.PSYCHIC)
                multiplier2 = 1;
            else if (moveType == MoveType.ELECTRIC && type2 == PokemonType.GHOST)
                multiplier2 = 1;
            else if (moveType == MoveType.ELECTRIC && type2 == PokemonType.DRAGON)
                multiplier2 = 1;
            else if (moveType == MoveType.ELECTRIC && type2 == PokemonType.ICE)
                multiplier2 = 1;
            else if (moveType == MoveType.ELECTRIC && type2 == PokemonType.FAIRY)
                multiplier2 = 1;
            else if (moveType == MoveType.ELECTRIC && type2 == PokemonType.NORMAL)
                multiplier2 = 1;
            else if (moveType == MoveType.ELECTRIC && type2 == PokemonType.FIGHTING)
                multiplier2 = 1;
            else if (moveType == MoveType.ELECTRIC && type2 == PokemonType.POISON)
                multiplier2 = 1;
            else if (moveType == MoveType.ELECTRIC && type2 == PokemonType.FLYING)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.ELECTRIC && type2 == PokemonType.GROUND)
                multiplier2 = 0;
            else if (moveType == MoveType.ELECTRIC && type2 == PokemonType.BUG)
                multiplier2 = 1;
            else if (moveType == MoveType.ELECTRIC && type2 == PokemonType.ROCK)
                multiplier2 = 1;
            else if (moveType == MoveType.ELECTRIC && type2 == PokemonType.STEEL)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.ELECTRIC && type2 == PokemonType.ELECTRIC)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.ELECTRIC && type2 == PokemonType.FIRE)
                multiplier2 = 1;
            else if (moveType == MoveType.ELECTRIC && type2 == PokemonType.WATER)
                multiplier2 = 1;
            else if (moveType == MoveType.ELECTRIC && type2 == PokemonType.GRASS)
                multiplier2 = 1;

            else if (moveType == MoveType.FIRE && type2 == PokemonType.DARK)
                multiplier2 = 1;
            else if (moveType == MoveType.FIRE && type2 == PokemonType.PSYCHIC)
                multiplier2 = 1;
            else if (moveType == MoveType.FIRE && type2 == PokemonType.GHOST)
                multiplier2 = 1;
            else if (moveType == MoveType.FIRE && type2 == PokemonType.DRAGON)
                multiplier2 = 1;
            else if (moveType == MoveType.FIRE && type2 == PokemonType.ICE)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.FIRE && type2 == PokemonType.FAIRY)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.FIRE && type2 == PokemonType.NORMAL)
                multiplier2 = 1;
            else if (moveType == MoveType.FIRE && type2 == PokemonType.FIGHTING)
                multiplier2 = 1;
            else if (moveType == MoveType.FIRE && type2 == PokemonType.POISON)
                multiplier2 = 1;
            else if (moveType == MoveType.FIRE && type2 == PokemonType.FLYING)
                multiplier2 = 1;
            else if (moveType == MoveType.FIRE && type2 == PokemonType.GROUND)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.FIRE && type2 == PokemonType.BUG)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.FIRE && type2 == PokemonType.ROCK)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.FIRE && type2 == PokemonType.STEEL)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.FIRE && type2 == PokemonType.ELECTRIC)
                multiplier2 = 1;
            else if (moveType == MoveType.FIRE && type2 == PokemonType.FIRE)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.FIRE && type2 == PokemonType.WATER)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.FIRE && type2 == PokemonType.GRASS)
                multiplier2 = 1 * 2;

            else if (moveType == MoveType.WATER && type2 == PokemonType.DARK)
                multiplier2 = 1;
            else if (moveType == MoveType.WATER && type2 == PokemonType.PSYCHIC)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.WATER && type2 == PokemonType.GHOST)
                multiplier2 = 1;
            else if (moveType == MoveType.WATER && type2 == PokemonType.DRAGON)
                multiplier2 = 1;
            else if (moveType == MoveType.WATER && type2 == PokemonType.ICE)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.WATER && type2 == PokemonType.FAIRY)
                multiplier2 = 1;
            else if (moveType == MoveType.WATER && type2 == PokemonType.NORMAL)
                multiplier2 = 1;
            else if (moveType == MoveType.WATER && type2 == PokemonType.FIGHTING)
                multiplier2 = 1;
            else if (moveType == MoveType.WATER && type2 == PokemonType.POISON)
                multiplier2 = 1;
            else if (moveType == MoveType.WATER && type2 == PokemonType.FLYING)
                multiplier2 = 1;
            else if (moveType == MoveType.WATER && type2 == PokemonType.GROUND)
                multiplier2 = 1;
            else if (moveType == MoveType.WATER && type2 == PokemonType.BUG)
                multiplier2 = 1;
            else if (moveType == MoveType.WATER && type2 == PokemonType.ROCK)
                multiplier2 = 1;
            else if (moveType == MoveType.WATER && type2 == PokemonType.STEEL)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.WATER && type2 == PokemonType.ELECTRIC)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.WATER && type2 == PokemonType.FIRE)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.WATER && type2 == PokemonType.WATER)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.WATER && type2 == PokemonType.GRASS)
                multiplier2 = 1 / 2;

            else if (moveType == MoveType.GRASS && type2 == PokemonType.DARK)
                multiplier2 = 1;
            else if (moveType == MoveType.GRASS && type2 == PokemonType.PSYCHIC)
                multiplier2 = 1;
            else if (moveType == MoveType.GRASS && type2 == PokemonType.GHOST)
                multiplier2 = 1;
            else if (moveType == MoveType.GRASS && type2 == PokemonType.DRAGON)
                multiplier2 = 1;
            else if (moveType == MoveType.GRASS && type2 == PokemonType.ICE)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.GRASS && type2 == PokemonType.FAIRY)
                multiplier2 = 1;
            else if (moveType == MoveType.GRASS && type2 == PokemonType.NORMAL)
                multiplier2 = 1;
            else if (moveType == MoveType.GRASS && type2 == PokemonType.FIGHTING)
                multiplier2 = 1;
            else if (moveType == MoveType.GRASS && type2 == PokemonType.POISON)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.GRASS && type2 == PokemonType.FLYING)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.GRASS && type2 == PokemonType.GROUND)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.GRASS && type2 == PokemonType.BUG)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.GRASS && type2 == PokemonType.ROCK)
                multiplier2 = 1;
            else if (moveType == MoveType.GRASS && type2 == PokemonType.STEEL)
                multiplier2 = 1;
            else if (moveType == MoveType.GRASS && type2 == PokemonType.ELECTRIC)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.GRASS && type2 == PokemonType.FIRE)
                multiplier2 = 1 / 2;
            else if (moveType == MoveType.GRASS && type2 == PokemonType.WATER)
                multiplier2 = 1 * 2;
            else if (moveType == MoveType.GRASS && type2 == PokemonType.GRASS)
                multiplier2 = 1 * 2;
        }
        return multiplier1*multiplier2;

    }
}

