package src.table.actors;

import src.enums.Condition;
import src.enums.Location;
import src.interfaces.Calling;
import src.objects.Car;
import src.objects.Person;

public class Jude extends Person implements Calling {
    private Car pikap = new Car("пикап",Location.OUT ,Condition.OLD);
    public Jude(Location location,Condition condition){
        super("Джуд",location,condition, 80, 20, true);
        this.inventory.add(pikap);
    }

    public Jude(Condition condition, Location location, int HP, int power){
        super("Джуд", location, condition, HP, power, true);
        this.inventory.add(pikap);
    }

    public String call(Person person) {return "послушай меня, " + person;}
}
