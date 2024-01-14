package src.table.actions;

import src.innerFuncs.ItemAdditor;
import src.interfaces.Describing;
import src.objects.Action;
import src.objects.Item;
import src.objects.Person;

public class Remember extends Action implements Describing {
    public void remember(Person p1, Item i1){
        describe(p1 + " вспомнил про " + i1);
        p1.getInventory().add(i1);
        ItemAdditor.addItem(p1, i1);
    }
}
