package src.interfaces;

import src.objects.Item;
import src.objects.Person;
import src.table.Groups;

public interface ItemManager {
    default void delItem(Person person, Item item, boolean describe){
        if (describe) System.out.println("-> " + person + " потратил " + item);
        int ii = Groups.getAllGroup().indexOf(person);
        Groups.getAllGroup().get(ii).getInventory().remove(item);
    }

    default void addItem(Person person, Item item) {
        int ii = Groups.getAllGroup().indexOf(person);
        Groups.getAllGroup().get(ii).getInventory().add(item);
        System.out.println("-> " + person + " получил "+ item);
    }

    default void calculateDamage(Person person, Item item, int damage){
        item.setQuality(item.getQuality() - damage);
        System.out.println("-> Состояние " + item + " стало на " + damage + " меньше");
        if (item.getQuality() <= 0) {
            System.out.println("-> Состояние " + item + " меньше нуля. " + item+ " уничтожен");
        }
    }
}
