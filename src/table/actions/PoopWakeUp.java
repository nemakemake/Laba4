package src.table.actions;

import src.enums.Condition;
import src.innerfuncs.QualityChange;
import src.interfaces.Describing;
import src.objects.Action;
import src.objects.Item;
import src.objects.Person;
import src.innerfuncs.*;

public class PoopWakeUp extends Action implements Describing {
    public void poopWakeUp(Person p1, Item i1){
        describe(p1 + " проснулся обкакавшись");
        QualityChange.changeQuality(Condition.NORMAL, p1, true);
        QualityChange.changeQuality(Condition.DIRTY, p1, i1, true);
        InventoryChanger.changeInventory(p1,0, i1);
        ItemDamage.calculateDamage(i1, 5);
    }
}
