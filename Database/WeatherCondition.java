package Database;

public class WeatherCondition{

    public static WeatherCondition CLEAR = new WeatherCondition(1, "Clear");
    public static WeatherCondition RAIN = new WeatherCondition(2, "Rain");
    public static WeatherCondition SANDSTORM = new WeatherCondition(3, "Sandstorm");
    public static WeatherCondition HAIL = new WeatherCondition(4, "Hail");
    public static WeatherCondition HARSH_SUNLIGHT = new WeatherCondition(5, "Harsh Sunlight");
    //public static WeatherCondition FOG = new WeatherCondition(6, "Fog");
    public static WeatherCondition EXTREMELY_HARSH_SUNLIGHT = new WeatherCondition(7, "Extremely Harsh Sunlight");
    public static WeatherCondition HEAVYRAIN = new WeatherCondition(8, "Heavy Rain");
    public static WeatherCondition SHADOWY_AURA= new WeatherCondition(9, "Shadowy Aura");
    public static WeatherCondition STRONG_WINDS = new WeatherCondition(10, "Strong Winds");
    //public static WeatherCondition SNOW = new WeatherCondition(11, "Snow");
    
    public int weatherId;
    public String weatherName;

    public WeatherCondition(int weatherId, String weatherName){
        this.weatherId = weatherId;
        this.weatherName = weatherName;
    }
}