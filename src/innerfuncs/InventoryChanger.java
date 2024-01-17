package src.innerfuncs;

import src.objects.Item;
import src.objects.Person;

public class InventoryChanger {
    public static void changeInventory(Person person, int id, Item item){
        person.getInventory().set(id, item);
    }
}
