package src.innerfuncs;

import src.enums.RPS;
import src.objects.Person;

public class RPSGame {
    public static int setTheGame(Person player1, Person player2){
        RPS p1 = RPS.randomRPS();
        RPS p2 = RPS.randomRPS();
        System.out.println(player1 + " поставил "+ p1 + ", "+ player2 + " поставил "+ p2);
        if (p1 == RPS.PAPER && p2 == RPS.ROCK || p1 == RPS.ROCK && p2 == RPS.SCISSORS || p1 == RPS.SCISSORS && p2 == RPS.PAPER) {
            System.out.println("-> Победил "+ player1 + "!");
            return 1;
        } else if (p2 == RPS.PAPER && p1 == RPS.ROCK || p2 == RPS.ROCK && p1 == RPS.SCISSORS || p2 == RPS.SCISSORS && p1 == RPS.PAPER) {
            System.out.println("-> Победил " + player2 + "!");
            return 2;
        } else {
            System.out.println("Ничья! Играем еще!");
            return setTheGame(player1, player2);
        }
    }
}
