package src.innerfuncs;

import src.objects.Item;
import src.objects.Person;

public class InventoryChanger {
    public static void changeInventory(Person p, int i, Item i1){
        p.getInventory().set(i, i1);
    }
}
