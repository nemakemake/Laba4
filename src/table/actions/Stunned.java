package src.table.actions;

import src.enums.Condition;
import src.innerfuncs.QualityChange;
import src.objects.Action;
import src.objects.Person;


public class Stunned extends Action {

    public static void stunned(Person p1, String t1) {
        Thinking thinking = new Thinking();
        thinking.think(p1, t1);
        QualityChange.changeQuality(Condition.STUNNED, p1, true);
    }
}
