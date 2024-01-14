package src.table;

import src.objects.Person;

import java.util.LinkedList;

public class Groups {
    private static LinkedList<Person> homeGroup = new LinkedList<>();
    private static LinkedList<Person> outGroup = new LinkedList<>();
    private static LinkedList<Person> allGroup = new LinkedList<>();

    public static void changeGroup(Person p1){
        if (outGroup.contains(p1)) {
            outGroup.remove(p1);
            homeGroup.add(p1);
        } else {
            homeGroup.remove(p1);
            outGroup.add(p1);
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

