package src.table.actions;

import src.objects.Action;
import src.objects.Person;

public class Ignoring extends Action {
    public static void ignore(Person ignoramus, Person speaker){
        System.out.println(ignoramus + " игнорировал " + speaker);
        System.out.println(speaker + " пытается привлечь внимание другим способом");
        BoxGame.setTheGame(speaker, ignoramus);
    }
}
