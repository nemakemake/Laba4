package src.table.actions;

import src.interfaces.Describing;
import src.objects.Action;
import src.objects.Person;

import java.util.Objects;

public class Saying extends Action implements Describing {
        public void say(Person speaker, Person listener,String text) {
            describe(speaker + toSay(text));
            if (Objects.equals(text, speaker.call(listener))){initDialogue(speaker, listener);}
        }

        public void initDialogue(Person person1, Person person2){
            say(person2, person1,"Что?");
            say(person1, person2,"Хочешь пойти гулять?");
            StunningSpeak.stunningSpeak(person2, person1, "Погулять! А фета?", "как дети учатся говорить... как иностранцы?");
        }


}
