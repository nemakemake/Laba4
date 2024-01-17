package src.table.actors;

import src.enums.Condition;
import src.interfaces.Calling;
import src.objects.Item;
import src.objects.Person;

public class Luis extends Person implements Calling {
    private Item repants = new Item("Запасные штанишки", Condition.NORMAL);
    public Luis(String name, Condition condition){
        super(name,condition, 100, 25, true);
        inventory.add(repants);
    }

    public Luis(String name, Condition condition, int HP, int power){
        super(name, condition, HP, power, true);
        inventory.add(repants);
    }

    public String call(Person person) {return "эй, " + person;}
}
