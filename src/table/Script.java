package src.table;

import src.enums.Condition;
import src.enums.Weather;
import src.innerfuncs.*;
import src.interfaces.GroupManager;
import src.interfaces.ItemManager;
import src.interfaces.ScriptInfo;
import src.objects.Item;
import src.objects.Nature;
import src.objects.Person;
import src.table.actions.*;
import src.table.actors.*;

import java.lang.reflect.Method;


public class Script implements ItemManager, GroupManager {
    //scriptInfo
    private String name;

    //actors
    Luis luis = new Luis("Луис", Condition.NORMAL);
    Gadge gadge = new Gadge("Гэдж", Condition.NORMAL);
    Jude jude = new Jude("Джуд", Condition.LIGHT_SORROW);
    Rachel rachel = new Rachel("Рошель", Condition.NORMAL);
    Ellie ellie = new Ellie("Элли", Condition.NORMAL);

    //items
    Item kite = new Item("воздушный змей", Condition.NORMAL);
    Item crayon = new Item("цветные фломастеры", Condition.NORMAL);
    Item book = new Item("книжка Элли", Condition.NORMAL);

    // actions
    PoopWakeUp poopWakeUp = new PoopWakeUp();
    ClotheChanging clotheChanging = new ClotheChanging();
    PlayingWith playWith = new PlayingWith();
    Remember remember = new Remember();
    Saying say = new Saying();
    Drawing drawing = new Drawing();
    Thinking thinking = new Thinking();
    StunningSpeak stunningSpeak = new StunningSpeak();

    public Script(String name){ this.name = name;}

    public String getName() {
        return name;
    }
    ScriptInfo scriptInfo = new ScriptInfo() {
        @Override
        public void scriptInfo(Script script) {
            System.out.println(script.getName());
        }
    };

    public void printScript() {
        scriptInfo.scriptInfo(this);
        PersonCreator.createPerson();
        Nature.WeatherForecast.printInfo();
        addTo(luis, Groups.getHomeGroup());
        addTo(gadge, Groups.getHomeGroup());
        addTo(rachel, Groups.getHomeGroup());
        addTo(ellie, Groups.getHomeGroup());
        addTo(jude, Groups.getOutGroup());
        TimeSkipper.timeSkip(41, true);
        printInfo(Groups.getHomeGroup());
        TimeSkipper.timeSkip(40,true);
        QualityChange.changeQuality(Condition.SLEEP, gadge, true);
        Groups.changeGroup(rachel);
        Groups.changeGroup(ellie);
        Item.Car car = (Item.Car)jude.getInventory().getFirst();
        car.drive(Groups.getOutGroup(), jude, "магазин");
        poopWakeUp.poopWakeUp(gadge, gadge.getInventory().get(0));
        clotheChanging.changeClothes(luis, gadge, gadge.getInventory().get(0));
        playWith.playWith(luis, gadge);
        WeatherChanger.changeWeather(Weather.WINDY);
        remember.remember(luis, kite);
        say.say(luis, luis.call(gadge));
        addItem(gadge, crayon);
        addItem(gadge, book);
        drawing.draw(gadge, gadge.getInventory().get(2),  gadge.getInventory().get(1));
        thinking.think(luis, "еще один шаг, питающий детскую ревность");
        say.say(gadge, "Что?");
        say.say(luis, "Хочешь пойти гулять?");
        stunningSpeak.stunningSpeak(gadge, luis);
    }
}
