package src.innerfuncs;

import src.enums.Weather;
import src.objects.Nature;

public class WeatherChanger {
    public static void changeWeather(Weather weather){
        Nature.setWeather(weather);
        System.out.println("-> Погода стала " + weather);
    }
}
