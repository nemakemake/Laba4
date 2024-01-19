package src.table.actions;

import src.objects.Action;
import src.objects.Person;

public class StunningSpeak extends Action {
    public StunningSpeak(){}
    public static void stunningSpeak (Person provocateur, Person listener, String stunningQuote, String thought){
        Saying say = new Saying();
        say.say(provocateur, listener,stunningQuote);
        Stunned.stunned(listener, thought);
        listener.getIgnoreList().add(provocateur);
    }
}
