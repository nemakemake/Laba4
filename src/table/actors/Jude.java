package src.table.actors;

import src.enums.Condition;
import src.interfaces.Calling;
import src.objects.Item;
import src.objects.Person;

public class Jude extends Person implements Calling {
    private Item.Car pikap = new Item(" ", Condition.NORMAL).new Car("пикап", Condition.OLD);
    public Jude(String name, Condition condition){
        super(name, condition, 80, 20, true);
        this.inventory.add(pikap);
    }

    public Jude(String name, Condition condition, int HP, int power){
        super(name, condition, HP, power, true);
        this.inventory.add(pikap);
    }

    public String call(Person person) {return "послушай меня, " + person;}
}
