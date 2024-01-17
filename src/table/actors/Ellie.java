package src.table.actors;

import src.enums.Condition;
import src.interfaces.Calling;
import src.objects.Person;

public class Ellie extends Person implements Calling {
    public Ellie(Condition condition){
        super("Элли", condition, 50, 10, false);
    }

    public Ellie(Condition condition, int HP, int power){
        super("Элли", condition, HP, power, false);
    }
    public String call(Person person) {return "хэй ты, " + person;}
}
