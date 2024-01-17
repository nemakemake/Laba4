package src.table.actions;

import src.interfaces.Describing;
import src.objects.Action;
import src.objects.Person;
public class Saying extends Action implements Describing {
        public void say(Person speaker, String text) {
            describe(speaker + toSay(text));
        }
}
