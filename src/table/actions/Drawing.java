package src.table.actions;

import src.enums.Condition;
import src.innerfuncs.QualityChange;
import src.innerfuncs.InventoryChanger;
import src.interfaces.ItemManager;
import src.objects.Item;
import src.objects.Person;
import src.interfaces.Describing;

public class Drawing implements Describing, ItemManager {
    public void draw(Person painter, Item canvas, Item tool){
        describe(painter + " рисовал в " + canvas +" с помощью "+ tool);
        calculateDamage(painter, canvas, 3);
        QualityChange.changeQuality(Condition.DIRTY, painter, canvas, true);
        InventoryChanger.changeInventory(painter,2, canvas);
    }
}
