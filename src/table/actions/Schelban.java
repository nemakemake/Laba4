package src.table.actions;

import src.exceptions.UnrealInteractionException;
import src.innerfuncs.InteractCheck;
import src.objects.Person;

import java.util.Random;
import  src.groups.AllGroup;
public class Schelban {
    public static void schelban(Person hitman, Person victim){
        try {
            if(InteractCheck.checkOfSameLocation(hitman, victim)){throw new UnrealInteractionException(hitman + " и " + victim + " находятся в разных локациях!");}
        } catch (UnrealInteractionException exception){
            System.out.println(exception.getMessage());
        }
        final int MODIFICATOR = 10;
        int victimId = AllGroup.getGroup().indexOf(victim);
        Random random = new Random();
        System.out.println(hitman + " дает щелбан " + victim);
        int dmg = hitman.getPower() + (int)(random.nextDouble()*MODIFICATOR);
        AllGroup.getGroup().get(victimId).setHp(victim.getHp() - dmg);
        System.out.println("-> " + victim + " получает " + dmg + " урона");
    }
}
