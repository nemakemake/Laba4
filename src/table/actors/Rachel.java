package src.table.actors;

import src.enums.Condition;
import src.enums.Location;
import src.interfaces.Calling;
import src.objects.Car;
import src.objects.Item;
import src.objects.Person;

public class Rachel extends Person implements Calling {
    private Item mashina = new Car("машина", Location.OUT,Condition.NORMAL);
    public Rachel(Location location, Condition condition){
        super("Рошель", location,condition, 100, 15, true);
        this.inventory.add(mashina);
    }

    public Rachel(Location location,Condition condition, int HP, int power){
        super("Рошель",location, condition, HP, power, true);
        this.inventory.add(mashina);
    }
    public String call(Person person) {return "слушай, " + person;}
}
