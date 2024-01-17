package src.objects;

import src.enums.*;

import java.time.DayOfWeek;
import java.time.Month;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Nature {
    private static Weather weather = Weather.SUNNY;
    private static GregorianCalendar globalTime = new GregorianCalendar(1984, GregorianCalendar.JANUARY, 2);
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

    public static GregorianCalendar getGlobalTime() {
        return globalTime;
    }

    public static void setGlobalTime(GregorianCalendar globalTime) {
        Nature.globalTime = globalTime;
    }

    public static class WeatherForecast {
        public static void printInfo(){
            int remains = doomday.get(Calendar.WEEK_OF_YEAR) - globalTime.get(Calendar.WEEK_OF_YEAR);
            System.out.println("\n-----\nДень недели: " + DayOfWeek.of(globalTime.get(GregorianCalendar.DAY_OF_WEEK))
                    + "\nДата: " + Month.of(globalTime.get(GregorianCalendar.MONTH)+1) + " "
                    + globalTime.get(Calendar.DATE) + "\nПогода: " + weather +"\nДо рокового дня: "+
                    remains+ " недель\n-----\n");

        }
    }
}
