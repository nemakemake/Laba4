package src.innerFuncs;

import src.objects.Item;
import src.objects.Person;
import src.table.Groups;

public class ItemAdditor {
    public static void addItem(Person p, Item i) {
        int ii = Groups.getAllGroup().indexOf(p);
        Groups.getAllGroup().get(ii).getInventory().add(i);
        System.out.println("-> " + p + " получил "+ i);
    }
}
