package src.interfaces;

import src.groups.AllGroup;
import src.objects.Item;
import src.objects.Person;

public interface ItemManager {
    default void delItem(Person person, Item item, boolean describe){
        if (describe) System.out.println("-> " + person + " потратил " + item);
        int ii = AllGroup.getGroup().indexOf(person);
        AllGroup.getGroup().get(ii).getInventory().remove(item);
    }

    default void addItem(Person person, Item item) {
        int ii = AllGroup.getGroup().indexOf(person);
        AllGroup.getGroup().get(ii).getInventory().add(item);
        System.out.println("-> " + person + " получил "+ item);
    }

    default void calculateDamage(Item item, int damage){
        item.setQuality(item.getQuality() - damage);
        System.out.println("-> Состояние " + item + " стало на " + damage + " меньше");
        if (item.getQuality() <= 0) {
            System.out.println("-> Состояние " + item + " меньше нуля. " + item+ " уничтожен");
        }
    }
}
