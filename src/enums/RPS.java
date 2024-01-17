package src.enums;

import java.util.Random;

public enum RPS {
    ROCK("камень"),
    PAPER("бумага"),
    SCISSORS("ножницы"),
    DRAW("НИЧЬЯ");

    public final String NAME;

    RPS(String NAME) {
        this.NAME = NAME;
    }

    @Override
    public String toString() {
        return this.NAME;
    }

    public static RPS randomRPS(){
        Random random = new Random();
        double r = random.nextDouble();
        if (r > 0.66){
            return RPS.ROCK;
        } else if (r > 0.33){
            return RPS.PAPER;
        } else {return RPS.SCISSORS;}
    }
}
