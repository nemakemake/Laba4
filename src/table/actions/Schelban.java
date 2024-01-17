package src.table.actions;

import src.objects.Person;
import src.table.Groups;

import java.util.Random;

public class Schelban {
    public static void schelban(Person hitman, Person victim){
        final int MODIFICATOR = 10;
        int victimId = Groups.getAllGroup().indexOf(victim);
        Random random = new Random();
        System.out.println(hitman + " дает щелбан " + victim);
        int dmg = hitman.getPower() + (int)(random.nextDouble()*MODIFICATOR);
        Groups.getAllGroup().get(victimId).setHp(victim.getHp() - dmg);
        System.out.println("-> " + victim + " получает " + dmg + " урона");
    }
}
