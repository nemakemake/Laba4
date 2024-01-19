package src.table.actions;

import src.exceptions.UnrealInteractionException;
import src.innerfuncs.InteractCheck;
import src.interfaces.Describing;
import src.objects.Action;
import src.objects.Person;

import java.util.Random;

public class PlayingWith extends Action implements Describing {
    private final Random RND = new Random();
    public void playWith(Person player1, Person player2){
        System.out.println(player1 + " игрался c "+ player2);
        final double CHANCE = 0.5;
        try {
            if (!InteractCheck.checkOfSameLocation(player1, player2)) {
                throw new UnrealInteractionException(player1 + " и " + player2 + " находятся в разных локациях!");
            }
        } catch (UnrealInteractionException exception){
            System.out.println(exception.getMessage());
            System.exit(1);


        if (RND.nextDouble() < CHANCE) {
                Ignoring.ignore(player2, player1);
            }
            if (InteractCheck.checkForIgnoring(player1, player2)) {
                System.out.print("-> Неудача: ");
                System.out.println(player1 + " пытается привлечь внимание другим способом");
                BoxGame.setTheGame(player1, player2);
            } else {
                System.out.print("-> Удача: ");
                System.out.println(player2 + " обратил внимание на " + player1);
                RPSGamePlay.playing(player2, player1);
            }
    }
}
}
