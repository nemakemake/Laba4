package src.table;

import src.objects.Person;

import java.util.LinkedList;

public class Groups {
    private static LinkedList<Person> homeGroup = new LinkedList<>();
    private static LinkedList<Person> outGroup = new LinkedList<>();
    private static LinkedList<Person> allGroup = new LinkedList<>();

    public static void changeGroup(Person person){
        if (outGroup.contains(person)) {
            outGroup.remove(person);
            homeGroup.add(person);
        } else {
            homeGroup.remove(person);
            outGroup.add(person);
        }
    }

    public static LinkedList<Person> getHomeGroup() {
        return homeGroup;
    }

    public static LinkedList<Person> getOutGroup() {
        return outGroup;
    }

    public static LinkedList<Person> getAllGroup() {
        return allGroup;
    }
}

