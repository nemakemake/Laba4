package src.table.actors;

import src.enums.Condition;
import src.interfaces.Calling;
import src.objects.Item;
import src.objects.Person;

public class Rachel extends Person implements Calling {
    private Item mashina = new Item("машина", Condition.NORMAL);
    public Rachel(String name, Condition condition){
        super(name, condition, 100, 15, true);
        this.inventory.add(mashina);
    }

    public Rachel(String name, Condition condition, int HP, int power){
        super(name, condition, HP, power, true);
        this.inventory.add(mashina);
    }
    public String call(Person person) {return "слушай, " + person;}
}
