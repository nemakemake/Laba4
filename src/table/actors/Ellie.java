package src.table.actors;

import src.enums.Condition;
import src.interfaces.Calling;
import src.objects.Person;

public class Ellie extends Person implements Calling {
    public Ellie(String name, Condition condition){
        super(name, condition, 50, 10, false);
    }

    public Ellie(String name, Condition condition, int HP, int power){
        super(name, condition, HP, power, false);
    }
    public String call(Person person) {return "хэй ты, " + person;}
}
