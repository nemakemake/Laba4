package src.table.actions;

import src.objects.Action;
import src.objects.Person;

public class Ignoring extends Action {
    public static void ignore(Person p1, Person p2){
        System.out.println(p1 + " игнорировал " + p2);
        System.out.println(p2 + " пытается привлечь внимание другим способом");
        BoxGame.setTheGame(p2, p1);
    }
}
