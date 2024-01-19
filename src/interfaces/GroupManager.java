package src.interfaces;

import src.enums.Location;
import src.groups.AllGroup;
import src.groups.Home;
import src.groups.Out;
import src.objects.Person;
import src.objects.UObject;

public interface GroupManager {
    default void addTo(UObject uObject, Location location){
        if (location == Location.HOME){
            Home.getGroup().add(uObject);
        } else if (location == Location.OUT){
            Out.getGroup().add(uObject);
        }
    }

    default void changeGroup(UObject uObject){
        if (Out.getGroup().contains(uObject)) {
            Out.getGroup().remove(uObject);
            Home.getGroup().add(uObject);
        } else {
            Home.getGroup().remove(uObject);
            Out.getGroup().add(uObject);
        }
        if (uObject instanceof Person){
            dragItemsWithPerson((Person) uObject);
        }
    }

    default void printInfo(Location location){
        if (location == Location.HOME){
            Home.getGroup().stream().filter(s -> s instanceof Person).map(x -> x + " ").forEach(System.out::print);
        } else if (location == Location.OUT){
            Out.getGroup().stream().filter(s -> s instanceof Person).map(x -> x + " ").forEach(System.out::print);
        }
        System.out.println(" сейчас находятcя " + location);
    }

    default void dragItemsWithPerson(Person person){
        if (Home.getGroup().contains(person)){
            person.getInventory().stream().filter(x -> Out.getGroup().contains(x)).forEach(this::changeGroup);
        } else {
            person.getInventory().stream().filter(x -> Home.getGroup().contains(x)).forEach(this::changeGroup);
        }
    }
}
