package src.interfaces;

import src.objects.Person;
import src.table.Groups;

import java.util.LinkedList;

public interface GroupManager {
    default void addTo(Person person, LinkedList<Person> group){
        if (!(Groups.getAllGroup().contains(person))){
            Groups.getAllGroup().add(person);
            group.add(person);
        } else {group.add(person);}
    }

    default void printInfo(LinkedList<Person> group){
        String loc = "";
        if (group.equals(Groups.getOutGroup())){
            loc = "на улице";
        } else if (group.equals(Groups.getHomeGroup())){
            loc = "дома";
        }
        group.stream().map(x -> x + " ").forEach(System.out::print);
        System.out.println(" сейчас находятcя " + loc);
    }
}
