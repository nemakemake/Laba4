package src.innerfuncs;

import src.enums.RPS;
import src.objects.Person;

public class RPSGame {
    public static int setTheGame(Person per1, Person per2){
        RPS p1 = RPS.randomRPS();
        RPS p2 = RPS.randomRPS();
        System.out.println(per1 + " поставил "+ p1 + ", "+ per2 + " поставил "+ p2);
        if (p1 == RPS.PAPER && p2 == RPS.ROCK || p1 == RPS.ROCK && p2 == RPS.SCISSORS || p1 == RPS.SCISSORS && p2 == RPS.PAPER) {
            System.out.println("-> Победил "+ per1 + "!");
            return 1;
        } else if (p2 == RPS.PAPER && p1 == RPS.ROCK || p2 == RPS.ROCK && p1 == RPS.SCISSORS || p2 == RPS.SCISSORS && p1 == RPS.PAPER) {
            System.out.println("-> Победил " + per2 + "!");
            return 2;
        } else {
            System.out.println("Ничья! Играем еще!");
            return setTheGame(per1, per2);
        }
    }
}
