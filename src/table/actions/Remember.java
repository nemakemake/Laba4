package src.table.actions;

import src.interfaces.Describing;
import src.interfaces.ItemManager;
import src.objects.Action;
import src.objects.Item;
import src.objects.Person;

public class Remember extends Action implements Describing, ItemManager {
    public void remember(Person p1, Item i1){
        describe(p1 + " вспомнил про " + i1);
        p1.getInventory().add(i1);
        addItem(p1, i1);
    }
}
