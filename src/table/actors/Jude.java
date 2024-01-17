package src.table.actors;

import src.enums.Condition;
import src.interfaces.Calling;
import src.objects.Item;
import src.objects.Person;

public class Jude extends Person implements Calling {
    private Item.Car pikap = new Item(" ", Condition.NORMAL).new Car("пикап", Condition.OLD);
    public Jude(Condition condition){
        super("Джуд", condition, 80, 20, true);
        this.inventory.add(pikap);
    }

    public Jude(Condition condition, int HP, int power){
        super("Джуд", condition, HP, power, true);
        this.inventory.add(pikap);
    }

    public String call(Person person) {return "послушай меня, " + person;}
}
