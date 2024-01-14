package src.table.actions;

import src.innerFuncs.RPSGame;
import src.objects.Action;
import src.objects.Person;

public class Reacting extends Action {
    public static void react(Person p1, Person p2){
        System.out.println(p1 + " обратил внимание на " + p2);
        System.out.println(p2 + " сказал: 'Давай сыграем в камень ножницы бумага!'");
        switch (RPSGame.setTheGame(p1, p2)){
            case(1):
                Schelban.schelban(p1, p2);
                break;
            case(2):
                Schelban.schelban(p2, p1);
                break;
        }
    }
}

