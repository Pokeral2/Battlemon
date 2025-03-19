package Database;

public class PokemonState {

    public static PokemonState NORMAL = new PokemonState(1, "Normal");
    public static PokemonState BURN = new PokemonState(2, "Burn");
    public static PokemonState FROZEN = new PokemonState(3, "Frozen");
    public static PokemonState PARALYZED = new PokemonState(4, "Paralyzed");
    public static PokemonState POISONED = new PokemonState(5, "Poisoned");
    public static PokemonState SLEEP = new PokemonState(6, "Sleep");
        public static PokemonState FAINT = new PokemonState(8, "Faint");
        public int stateId;
    public String stateName;
    
    public PokemonState(int stateId , String stateName){
        this.stateId = stateId;
        this.stateName = stateName;
    }
}