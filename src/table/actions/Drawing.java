package src.table.actions;

import src.enums.Condition;
import src.innerFuncs.QualityChange;
import src.innerFuncs.InventoryChanger;
import src.innerFuncs.ItemDamage;
import src.objects.Item;
import src.objects.Person;
import src.interfaces.Describing;

public class Drawing implements Describing {
    public void draw(Person p1, Item i1, Item i2){
        describe(p1 + " рисовал в " + i1 +" с помощью "+ i2);
        ItemDamage.calculateDamage(i1, 3);
        QualityChange.changeQuality(Condition.DIRTY, p1, i1, true);
        InventoryChanger.changeInventory(p1,2, i1);
    }
}
