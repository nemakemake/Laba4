package src.objects;

import src.enums.*;

import java.time.DayOfWeek;
import java.time.Month;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Nature {
    private static Weather weather = Weather.SUNNY;
    private static GregorianCalendar globTime = new GregorianCalendar(1984, GregorianCalendar.JANUARY, 2);
    private static final GregorianCalendar doomday = new GregorianCalendar(1984, GregorianCalendar.MAY, 12);

    public static GregorianCalendar getDoomday() {
        return doomday;
    }

    public static Weather getWeather() {
        return weather;
    }

    public static void setWeather(Weather weather) {
        Nature.weather = weather;
    }

    public static GregorianCalendar getGlobTime() {
        return globTime;
    }

    public static void setGlobTime(GregorianCalendar globTime) {
        Nature.globTime = globTime;
    }

    public static class WeatherForecast {
        public static void printInfo(){
            int remains = doomday.get(Calendar.WEEK_OF_YEAR) - globTime.get(Calendar.WEEK_OF_YEAR);
            System.out.println("\n-----\nДень недели: " + DayOfWeek.of(globTime.get(GregorianCalendar.DAY_OF_WEEK))
                    + "\nДата: " + Month.of(globTime.get(GregorianCalendar.MONTH)+1) + " "
                    + globTime.get(Calendar.DATE) + "\nПогода: " + weather +"\nДо рокового дня: "+
                    remains+ " недель\n-----\n");

        }
    }
}
