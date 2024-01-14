package src.innerFuncs;

import src.enums.Condition;
import src.objects.Nature;
import src.objects.Person;
import src.objects.Item;
import src.table.Groups;

import java.util.GregorianCalendar;

public class QualityChange {
    public static void changeQuality(Condition condition, Person p, boolean describe) {
        String old = p.toString();
        int i = Groups.getAllGroup().indexOf(p);
        Groups.getAllGroup().get(i).setEffTime((GregorianCalendar) Nature.getGlobTime().clone());
        Groups.getAllGroup().get(i).setCondition(condition);
        if (describe) System.out.println("-> " + old + " стал " + p);

    }

    public static void changeQuality(Condition condition, Person p, Item item, boolean describe){
        String old = item.toString();
        int i = p.getInventory().indexOf(item);
        p.getInventory().get(i).setEffTime((GregorianCalendar) Nature.getGlobTime().clone());
        p.getInventory().get(i).setCondition(condition);
        if (describe) {
            System.out.println("-> " + old + " стал " + p.getInventory().get(i));
        }
    }


    public static void changeQuality(Condition condition, Person o, GregorianCalendar calendar, boolean describe){
        String old = o.toString();
        int i = Groups.getAllGroup().indexOf(o);
        Groups.getAllGroup().get(i).setEffTime(calendar);
        Groups.getAllGroup().get(i).setCondition(condition);
        if (describe){
            System.out.println("-> " + old + " стал " + o);
        }
    }
}

