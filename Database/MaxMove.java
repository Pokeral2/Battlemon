package Database;

public class MaxMove {
    public String name;
    public MoveType type;
    public MoveCategory category;
    public int power;
    public int accuracy;
    public int totalPP;
    public int priority;

    public MaxMove(String name, MoveType type, MoveCategory category, int power, int accuracy, int totalPP,int priority) {
        this.name = name;
        this.type = type;
        this.category = category;
        this.power = power;
        this.accuracy = accuracy;
        this.totalPP = totalPP;
        this.priority = priority;
    }

    public static MaxMove copyMove(MaxMove originalMove) {
        MaxMove copiedMove = new MaxMove(originalMove.name, originalMove.type, originalMove.category,
                originalMove.power, originalMove.accuracy, originalMove.totalPP, originalMove.priority);
        return copiedMove;
    }

    public static MaxMove maxStrike = new MaxMove("Max Strike", MoveType.NORMAL,null, 0, 0, 0, 0);
    public static MaxMove maxAirstream = new MaxMove("Max Airstream", MoveType.FLYING,null, 0, 0, 0, 0);
    public static MaxMove maxOoze = new MaxMove("Max Ooze", MoveType.POISON,null,0,0,0,0);
    public static MaxMove maxLightning = new MaxMove("Max Lightning", MoveType.ELECTRIC,null,0,0,0,0);
    public static MaxMove maxFlare = new MaxMove("Max Flare", MoveType.FIRE,null,0,0,0,0);
    public static MaxMove maxWyrmwind = new MaxMove("Max Wyrmwind", MoveType.DRAGON,null,0,0,0,0);
    public static MaxMove maxPhantasm = new MaxMove("Max Phantasm", MoveType.GHOST,null,0,0,0,0);
    public static MaxMove maxKnuckle = new MaxMove("Max Knuckle", MoveType.FIGHTING,null,0,0,0,0);
    public static MaxMove maxMindstorm = new MaxMove("Max Mindstorm", MoveType.PSYCHIC,null,0,0,0,0);
    public static MaxMove maxRockfall = new MaxMove("Max Rockfall", MoveType.ROCK,null,0,0,0,0);
    public static MaxMove maxQuake = new MaxMove("Max Quake", MoveType.GROUND,null,0,0,0,0);
    public static MaxMove maxGeyser = new MaxMove("Max Geyser", MoveType.WATER,null,0,0,0,0);
    public static MaxMove maxOvergrowth = new MaxMove("Max Overgrowth", MoveType.GRASS,null,0,0,0,0);
    public static MaxMove maxSteelspike = new MaxMove("Max Steelspike", MoveType.STEEL,null,0,0,0,0);
    public static MaxMove maxFlutterby = new MaxMove("Max Flutterby", MoveType.BUG,null,0,0,0,0);
    public static MaxMove maxHailstorm = new MaxMove("Max Hailstorm", MoveType.ICE,null,0,0,0,0);
    public static MaxMove maxStarfall = new MaxMove("Max Starfall", MoveType.FAIRY,null,0,0,0,0);
    public static MaxMove maxDarkness= new MaxMove("Max Darkness", MoveType.DARK,null,0,0,0,0);
    public static MaxMove maxGuard=new MaxMove ("Max Guard", MoveType.NORMAL,null,0,0,0,0);
    
    
    public static MaxMove GmaxWildfire=new MaxMove("G-Max Wildfire", MoveType.FIRE,null,0,0,0,0);
    public static MaxMove GmaxBefuddle=new MaxMove("G-Max Befuddle", MoveType.BUG,null,0,0,0,0);
    public static MaxMove GmaxVineLash=new MaxMove("G-Max Vine Lash", MoveType.GRASS,null,0,0,0,0);
    public static MaxMove GmaxVolcalith=new MaxMove("G-Max Volcalith", MoveType.ROCK,null,0,0,0,0);
    public static MaxMove GmaxSnooze=new MaxMove("G-Max Snooze", MoveType.DARK,null,0,0,0,0);
    public static MaxMove GmaxMalodor=new MaxMove("G-Max Malodor", MoveType.POISON,null,0,0,0,0);
    public static MaxMove GmaxSandblast=new MaxMove("G-Max Sandblast", MoveType.GROUND,null,0,0,0,0);
    public static MaxMove GmaxCentiferno=new MaxMove("G-Max Centiferno", MoveType.FIRE,null,0,0,0,0);
    public static MaxMove GmaxFoamburst=new MaxMove("G-Max Foamburst", MoveType.WATER,null,0,0,0,0);
    public static MaxMove GmaxResonance=new MaxMove("G-Max Resonance", MoveType.ICE,null,0,0,0,0);
    public static MaxMove GmaxCuddle=new MaxMove("G-Max Cuddle", MoveType.NORMAL,null,0,0,0,0);
    public static MaxMove GmaxGoldrush=new MaxMove("G-Max Goldrush", MoveType.NORMAL,null,0,0,0,0);
    public static MaxMove GmaxStunshock=new MaxMove("G-Max Stunshock", MoveType.ELECTRIC,null,0,0,0,0);
    public static MaxMove GmaxTartness=new MaxMove("G-Max Tartness", MoveType.GRASS,null,0,0,0,0);
    public static MaxMove GmaxChiStrike=new MaxMove("G-Max Chi Strike", MoveType.FIGHTING,null,0,0,0,0);
    public static MaxMove GmaxFinale=new MaxMove("G-Max Finale", MoveType.FAIRY,null,0,0,0,0);
    public static MaxMove GmaxReplenish=new MaxMove("G-Max Replenish", MoveType.NORMAL,null,0,0,0,0);
    public static MaxMove GmaxTerror=new MaxMove("G-Max Terror", MoveType.GHOST,null,0,0,0,0);
    public static MaxMove GmaxMeltdown=new MaxMove("G-Max Meltdown", MoveType.ICE,null,0,0,0,0);
    public static MaxMove GmaxGravitas=new MaxMove("G-Max Gravitas", MoveType.PSYCHIC,null,0,0,0,0);
    public static MaxMove GmaxOneBlow=new MaxMove("G-Max One Blow", MoveType.DARK,null,0,0,0,0);
    public static MaxMove GmaxRapidFlow=new MaxMove("G-Max Rapid Flow", MoveType.WATER,null,0,0,0,0);
    public static MaxMove GmaxSweetness=new MaxMove("G-Max Sweetness", MoveType.FAIRY,null,0,0,0,0);
    public static MaxMove GmaxSteelsurge=new MaxMove("G-Max Steelsurge", MoveType.STEEL,null,0,0,0,0);
    public static MaxMove GmaxDepletion=new MaxMove("G-Max Depletion", MoveType.DRAGON,null,0,0,0,0);
    public static MaxMove GmaxCannonade=new MaxMove("G-Max Cannonade", MoveType.WATER,null,0,0,0,0);
    public static MaxMove GmaxHydrosnipe=new MaxMove("G-Max Hydrosnipe", MoveType.WATER,null,0,0,0,0);
    public static MaxMove GmaxWindRage=new MaxMove("G-Max Wind Rage", MoveType.FLYING,null,0,0,0,0);
    public static MaxMove GmaxVoltCrash=new MaxMove("G-Max Volt Crash", MoveType.ELECTRIC,null,0,0,0,0);
    public static MaxMove GmaxDrumSolo=new MaxMove("G-Max Drum Solo", MoveType.NORMAL,null,0,0,0,0);
    public static MaxMove GmaxFireball=new MaxMove("G-Max Fireball", MoveType.FIRE,null,0,0,0,0);
    public static MaxMove GmaxStoneSurge=new MaxMove("G-Max Stone Surge", MoveType.ROCK,null,0,0,0,0);
    public static MaxMove GmaxSmite=new MaxMove("G-Max Smite", MoveType.FAIRY,null,0,0,0,0);
    
}