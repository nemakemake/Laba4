package src.table.actions;

import src.enums.Condition;
import src.innerfuncs.QualityChange;
import src.innerfuncs.InventoryChanger;
import src.interfaces.ItemManager;
import src.objects.Item;
import src.objects.Person;
import src.interfaces.Describing;

public class Drawing implements Describing, ItemManager {
    public void draw(Person p1, Item i1, Item i2){
        describe(p1 + " рисовал в " + i1 +" с помощью "+ i2);
        calculateDamage(p1, i1, 3);
        QualityChange.changeQuality(Condition.DIRTY, p1, i1, true);
        InventoryChanger.changeInventory(p1,2, i1);
    }
}
