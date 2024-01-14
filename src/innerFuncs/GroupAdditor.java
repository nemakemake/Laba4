package src.innerFuncs;

import src.objects.Person;
import src.table.Groups;

import java.util.LinkedList;

public class GroupAdditor {
    public static void addTo(Person p, LinkedList<Person> g){
        if (!(Groups.getAllGroup().contains(p))){
            Groups.getAllGroup().add(p);
            g.add(p);
        } else {g.add(p);}
    }
}
