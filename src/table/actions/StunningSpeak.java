package src.table.actions;

import src.objects.Action;
import src.objects.Person;

public class StunningSpeak extends Action {
    Saying say = new Saying();
    public StunningSpeak(){}
    public void stunningSpeak (Person provocateur, Person listener){
        say.say(provocateur, "Погулять! А фета?");
        Stunned.stunned(listener, "как дети учатся говорить... как иностранцы?");
    }
}
