package src.table.actions;

import src.enums.Weather;
import src.innerfuncs.WeatherChanger;
import src.objects.Item;
import src.objects.Person;


public class WindEvent {
    Remember remember = new Remember();
    Saying saying =new Saying();
    public void startEvent(Person person1, Person person2, Item kite){
        WeatherChanger.changeWeather(Weather.WINDY);
        remember.remember(person1, kite);
        saying.say(person1, person2,person1.call(person2));
    }
}
