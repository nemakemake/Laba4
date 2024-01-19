package src.innerfuncs;

import src.enums.Condition;
import src.objects.Nature;
import src.objects.Person;
import src.objects.Item;

import java.util.GregorianCalendar;
import src.groups.AllGroup;

public class QualityChange {
    public static void changeQuality(Condition condition, Person person, boolean describe) {
        String old = person.toString();
        int i = AllGroup.getGroup().indexOf(person);
        AllGroup.getGroup().get(i).setEffectTime((GregorianCalendar) Nature.getGlobalTime().clone());
        AllGroup.getGroup().get(i).setCondition(condition);
        if (describe) System.out.println("-> " + old + " стал " + person);

    }

    public static void changeQuality(Condition condition, Person person, Item item, boolean describe){
        String old = item.toString();
        int i = person.getInventory().indexOf(item);
        person.getInventory().get(i).setEffectTime((GregorianCalendar) Nature.getGlobalTime().clone());
        person.getInventory().get(i).setCondition(condition);
        if (describe) {
            System.out.println("-> " + old + " стал " + person.getInventory().get(i));
        }
    }


    public static void changeQuality(Condition condition, Person person, GregorianCalendar calendar, boolean describe){
        String old = person.toString();
        int i = AllGroup.getGroup().indexOf(person);
        AllGroup.getGroup().get(i).setEffectTime(calendar);
        AllGroup.getGroup().get(i).setCondition(condition);
        if (describe){
            System.out.println("-> " + old + " стал " + person);
        }
    }
}

