package src.table.actions;

import src.enums.Condition;
import src.innerfuncs.QualityChange;
import src.interfaces.Describing;
import src.interfaces.ItemManager;
import src.objects.Action;
import src.objects.Item;
import src.objects.Person;
import src.innerfuncs.*;

public class PoopWakeUp extends Action implements Describing, ItemManager {
    public void poopWakeUp(Person pooper, Item item){
        describe(pooper + " проснулся обкакавшись");
        QualityChange.changeQuality(Condition.NORMAL, pooper, true);
        QualityChange.changeQuality(Condition.DIRTY, pooper, item, true);
        InventoryChanger.changeInventory(pooper,0, item);
        calculateDamage(pooper, item, 5);
    }
}
