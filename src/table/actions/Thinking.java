package src.table.actions;

import src.interfaces.Describing;
import src.objects.Action;
import src.objects.Person;

public class Thinking extends Action implements Describing {
    public void think(Person person, String text){
        describe(person + toQuote(text));
    }
}
