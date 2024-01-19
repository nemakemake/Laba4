package src.table.actors;

import src.enums.Condition;
import src.enums.ItemType;
import src.enums.Location;
import src.interfaces.Calling;
import src.objects.Item;
import src.objects.Person;

public class Gadge extends Person implements Calling {
    private Item pants = new Item("штанишки", Location.HOME,ItemType.CLOTHE, Condition.NORMAL);
    public Gadge(Location location,Condition condition){
        super("Гэдж", location,condition, 30, 5, false);
        this.inventory.add(pants);
    }
    public Gadge(Location location,Condition condition, int HP, int power){
        super("Гэдж", location,condition, HP, power, false);
        this.inventory.add(pants);
    }

    public String call(Person person) {return "эй эй " + person + "!";}
}
