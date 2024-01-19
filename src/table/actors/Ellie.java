package src.table.actors;

import src.enums.Condition;
import src.enums.Location;
import src.interfaces.Calling;
import src.objects.Person;

public class Ellie extends Person implements Calling {
    public Ellie(Location location, Condition condition){
        super("Элли", location,condition, 50, 10, false);
    }

    public Ellie(Location location,Condition condition, int HP, int power){
        super("Элли", location,condition, HP, power, false);
    }
    public String call(Person person) {return "хэй ты, " + person;}
}
