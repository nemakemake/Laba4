package src.interfaces;

import src.objects.Person;
import src.table.Groups;

import java.util.LinkedList;

public interface GroupManager {
    default void addTo(Person p, LinkedList<Person> g){
        if (!(Groups.getAllGroup().contains(p))){
            Groups.getAllGroup().add(p);
            g.add(p);
        } else {g.add(p);}
    }

    default void printInfo(LinkedList<Person> g){
        String loc = "";
        if (g.equals(Groups.getOutGroup())){
            loc = "на улице";
        } else if (g.equals(Groups.getHomeGroup())){
            loc = "дома";
        }
        g.stream().map(x -> x + " ").forEach(System.out::print);
        System.out.println(" сейчас находятcя " + loc);
    }
}
