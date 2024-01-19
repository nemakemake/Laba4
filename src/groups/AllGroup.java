package src.groups;

import src.interfaces.GroupManager;
import src.objects.Person;

import java.util.LinkedList;

public class AllGroup implements GroupManager {
    private static LinkedList<Person> group = new LinkedList<>();

    public static LinkedList<Person> getGroup() {
        return group;
    }

    public static void setGroup(LinkedList<Person> newGroup) {
        group = newGroup;
    }
    public static void addToCast(Person person){
        getGroup().add(person);
    }
}
