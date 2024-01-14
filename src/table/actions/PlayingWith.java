package src.table.actions;

import src.interfaces.Describing;
import src.objects.Action;
import src.objects.Person;

import java.util.Random;

public class PlayingWith extends Action implements Describing {
    private final Random rnd = new Random();
    public void playWith(Person p1, Person p2){
        System.out.println(p1 + " игрался c "+ p2);
        double CHANCE = 0.5;
        if (rnd.nextDouble() < CHANCE) {
            System.out.print("-> Неудача: ");
            Ignoring.ignore(p2, p1);
        } else {
            System.out.print("-> Удача: ");
            Reacting.react(p2, p1);
        }
    }
}
