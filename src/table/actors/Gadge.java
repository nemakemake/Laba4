package src.table.actors;

import src.enums.Condition;
import src.enums.ItemType;
import src.interfaces.Calling;
import src.objects.Item;
import src.objects.Person;

public class Gadge extends Person implements Calling {
    private Item pants = new Item("штанишки", ItemType.CLOTHE, Condition.NORMAL);
    public Gadge(Condition condition){
        super("Гэдж", condition, 30, 5, false);
        this.inventory.add(pants);
    }
    public Gadge(Condition condition, int HP, int power){
        super("Гэдж", condition, HP, power, false);
        this.inventory.add(pants);
    }

    public String call(Person person) {return "эй эй " + person + "!";}
}
