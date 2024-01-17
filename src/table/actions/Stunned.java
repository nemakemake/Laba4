package src.table.actions;

import src.enums.Condition;
import src.innerfuncs.QualityChange;
import src.objects.Action;
import src.objects.Person;


public class Stunned extends Action {

    public static void stunned(Person person, String text) {
        Thinking thinking = new Thinking();
        thinking.think(person, text);
        QualityChange.changeQuality(Condition.STUNNED, person, true);
    }
}
