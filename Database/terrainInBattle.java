package Database;
public class terrainInBattle {
    public static terrainInBattle GRASSY_TERRAIN = new terrainInBattle(1, "Grassy Terrain");
    public static terrainInBattle MISTY_TERRAIN = new terrainInBattle(2, "Misty Terrain");
    public static terrainInBattle ELECTRIC_TERRAIN = new terrainInBattle(3, "Electric Terrain");
    public static terrainInBattle PSYCHIC_TERRAIN = new terrainInBattle(4, "Psychic Terrain");
    public static terrainInBattle NORMAL_TERRAIN = new terrainInBattle(5, "Normal Terrain");
    public int terrainId;
    public String terrainName;

    public terrainInBattle(int terrainId, String terrainName) {
        this.terrainId = terrainId;
        this.terrainName = terrainName;
    }

}