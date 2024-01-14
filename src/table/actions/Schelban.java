package src.table.actions;

import src.objects.Person;
import src.table.Groups;

import java.util.Random;

public class Schelban {
    public static void schelban(Person p1, Person p2){
        int b = Groups.getAllGroup().indexOf(p2);
        Random random = new Random();
        System.out.println(p1 + " дает щелбан " + p2);
        int dmg = p1.getPower() + (int)(random.nextDouble()*10);
        Groups.getAllGroup().get(b).setHP(p2.getHP() - dmg);
        System.out.println("-> " + p2 + " получает " + dmg + " урона");
    }
}
