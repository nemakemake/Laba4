package src.innerFuncs;

import src.objects.Person;
import src.table.*;

import java.util.LinkedList;

public class GroupInfo {
    public static void printInfo(LinkedList<Person> g){
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

