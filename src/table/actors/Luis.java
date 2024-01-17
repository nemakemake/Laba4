package src.table.actors;

import src.enums.Condition;
import src.enums.ItemType;
import src.interfaces.Calling;
import src.objects.Item;
import src.objects.Person;

public class Luis extends Person implements Calling {
    private Item repants = new Item("Запасные штанишки", ItemType.CLOTHE, Condition.NORMAL);
    public Luis(Condition condition){
        super("Луис",condition, 100, 25, true);
        inventory.add(repants);
    }

    public Luis(Condition condition, int HP, int power){
        super("Луис", condition, HP, power, true);
        inventory.add(repants);
    }

    public String call(Person person) {return "эй, " + person;}
}
