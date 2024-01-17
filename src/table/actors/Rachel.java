package src.table.actors;

import src.enums.Condition;
import src.enums.ItemType;
import src.interfaces.Calling;
import src.objects.Item;
import src.objects.Person;

public class Rachel extends Person implements Calling {
    private Item mashina = new Item("машина", ItemType.TRANSPORT, Condition.NORMAL).new Car("машина", Condition.NORMAL);
    public Rachel(Condition condition){
        super("Рошель", condition, 100, 15, true);
        this.inventory.add(mashina);
    }

    public Rachel(Condition condition, int HP, int power){
        super("Рошель", condition, HP, power, true);
        this.inventory.add(mashina);
    }
    public String call(Person person) {return "слушай, " + person;}
}
