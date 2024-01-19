package src.innerfuncs;

import src.groups.Home;
import src.groups.Out;
import src.objects.Person;
import src.objects.UObject;

public class InteractCheck {
    public static boolean checkOfSameLocation(UObject object1, UObject object2){
        return (Home.getGroup().contains(object1) && Home.getGroup().contains(object2) || Out.getGroup().contains(object1) && Out.getGroup().contains(object2));
    }

    public static boolean checkForIgnoring(Person person1, Person person2){
        return person2.getIgnoreList().contains(person1);
    }
}
