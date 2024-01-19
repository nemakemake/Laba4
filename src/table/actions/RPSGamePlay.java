package src.table.actions;

import src.innerfuncs.RPSGame;
import src.objects.Action;
import src.objects.Person;

public class RPSGamePlay extends Action {
    public static void playing(Person reactPerson, Person speaker){
        System.out.println(speaker + " сказал: 'Давай сыграем в камень ножницы бумага!'");
        switch (RPSGame.setTheGame(reactPerson, speaker)){
            case(1):
                Schelban.schelban(reactPerson, speaker);
                break;
            case(2):
                Schelban.schelban(speaker, reactPerson);
                break;
        }
    }
}

