package src.table.actions;

import src.interfaces.Describing;
import src.objects.Action;
import src.objects.Person;

import java.util.Random;

public class PlayingWith extends Action implements Describing {
    private final Random RND = new Random();
    public void playWith(Person player1, Person player2){
        System.out.println(player1 + " игрался c "+ player2);
        final double CHANCE = 0.5;
        if (RND.nextDouble() < CHANCE) {
            System.out.print("-> Неудача: ");
            Ignoring.ignore(player2, player1);
        } else {
            System.out.print("-> Удача: ");
            Reacting.react(player2, player1);
        }
    }
}
