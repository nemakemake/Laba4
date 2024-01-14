package src.innerFuncs;

import src.objects.Item;
import src.objects.Person;
import src.table.Groups;

public class ItemDeleter {
    public static void delItem(Person p, Item i, boolean describe){
        if (describe) System.out.println("-> " + p + " потратил " + i);

        int ii = Groups.getAllGroup().indexOf(p);
        Groups.getAllGroup().get(ii).getInventory().remove(i);
    }
}
