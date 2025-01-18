package Database;

public class MoveType
{
    public static MoveType NORMAL = new MoveType(1, "Normal");
    public static MoveType FIGHTING = new MoveType(2, "Fighting");  
    public static MoveType FLYING = new MoveType(3, "Flying");
    public static MoveType POISON = new MoveType(4, "Poison");
    public static MoveType GROUND = new MoveType(5, "Ground");
    public static MoveType ROCK = new MoveType(6, "Rock");
    public static MoveType BUG = new MoveType(7, "Bug");
    public static MoveType GHOST = new MoveType(8, "Ghost");
    public static MoveType STEEL = new MoveType(9, "Steel");
    public static MoveType FIRE = new MoveType(10, "Fire");
    public static MoveType WATER = new MoveType(11, "Water");
    public static MoveType GRASS = new MoveType(12, "Grass");
    public static MoveType ELECTRIC = new MoveType(13, "Electric");
    public static MoveType PSYCHIC = new MoveType(14, "Psychic");
    public static MoveType ICE = new MoveType(15, "Ice");
    public static MoveType DRAGON = new MoveType(16, "Dragon");
    public static MoveType DARK = new MoveType(17, "Dark");
    public static MoveType FAIRY = new MoveType(18, "Fairy");
    

 public int typeId;
    public String typeName;
    
    public MoveType(int typeId, String typeName){
        this.typeId = typeId;
        this.typeName = typeName;
    }

}
