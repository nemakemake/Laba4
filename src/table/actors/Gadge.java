package src.table.actors;

import src.enums.Condition;
import src.interfaces.Calling;
import src.objects.Item;
import src.objects.Person;

public class Gadge extends Person implements Calling {
    private Item pants = new Item("штанишки", Condition.NORMAL);
    public Gadge(String name, Condition condition){
        super(name, condition, 30, 5, false);
        this.inventory.add(pants);
    }
    public Gadge(String name, Condition condition, int HP, int power){
        super(name, condition, HP, power, false);
        this.inventory.add(pants);
    }

    public String call(Person person) {return "эй эй " + person + "!";}
}
