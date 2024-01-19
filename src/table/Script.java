package src.table;

import src.enums.Condition;
import src.enums.ItemType;
import src.enums.Location;
import src.enums.Weather;
import src.exceptions.WrongWayOfUsingException;
import src.groups.Out;
import src.innerfuncs.*;
import src.interfaces.GroupManager;
import src.interfaces.ItemManager;
import src.interfaces.ScriptInfo;
import src.objects.Car;
import src.objects.Item;
import src.objects.Nature;
import src.table.actions.*;
import src.table.actors.*;



public class Script implements ItemManager, GroupManager {
    //scriptInfo
    private final String NAME;


    //actors
    Luis luis = new Luis(Location.HOME, Condition.NORMAL);
    Gadge gadge = new Gadge(Location.HOME, Condition.NORMAL);
    Jude jude = new Jude(Location.OUT, Condition.LIGHT_SORROW);
    Rachel rachel = new Rachel(Location.HOME, Condition.NORMAL);
    Ellie ellie = new Ellie(Location.HOME, Condition.NORMAL);

    //items
    Item kite = new Item("воздушный змей", Location.HOME, ItemType.TOY, Condition.NORMAL);
    Item crayon = new Item("цветные фломастеры",Location.HOME, ItemType.DRAWINGTOOL, Condition.NORMAL);
    Item book = new Item("книжка Элли", Location.HOME, ItemType.CANVAS, Condition.NORMAL);

    // actions
    PoopWakeUp poopWakeUp = new PoopWakeUp();
    Drawing drawing = new Drawing();
    WindEvent windEvent = new WindEvent();

    public Script(String name){ this.NAME = name;}

    public String getName() {
        return NAME;
    }
    ScriptInfo scriptInfo = new ScriptInfo() {
        @Override
        public void scriptInfo(Script script) {
            System.out.println(script.getName());
        }
    };

    public void printScript() {
        scriptInfo.scriptInfo(this);
        Nature.WeatherForecast.printInfo();
        TimeSkipper.timeSkip(41, true);
        printInfo(Location.HOME);
        TimeSkipper.timeSkip(40,true);
        QualityChange.changeQuality(Condition.SLEEP, gadge, true);
        changeGroup(rachel);
        changeGroup(ellie);
        Car car = (Car)jude.getInventory().getFirst();
        car.drive(Out.getGroup(), jude, "магазин");
        poopWakeUp.poopWakeUp(gadge, luis,gadge.getInventory().get(0));
        addItem(gadge, crayon);
        addItem(gadge, book);
        drawing.draw(gadge, luis, gadge.getInventory().get(2),  gadge.getInventory().get(1));
        windEvent.startEvent(luis, gadge, kite);
    }
}
