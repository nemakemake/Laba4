package src.enums;

import java.util.Random;

public enum RPS {
    ROCK("камень"),
    PAPER("бумага"),
    SCISSORS("ножницы"),
    DRAW("НИЧЬЯ");

    public final String name;

    RPS(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
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
