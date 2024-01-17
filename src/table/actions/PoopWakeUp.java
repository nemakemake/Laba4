package src.table.actions;

import src.enums.Condition;
import src.enums.ItemType;
import src.exceptions.WrongWayOfUsingException;
import src.innerfuncs.QualityChange;
import src.interfaces.Describing;
import src.interfaces.ItemManager;
import src.objects.Action;
import src.objects.Item;
import src.objects.Person;
import src.innerfuncs.*;

public class PoopWakeUp extends Action implements Describing, ItemManager {
    public void poopWakeUp(Person pooper, Item item){
        try {
            if (item.getType() != ItemType.CLOTHE) {
                throw new WrongWayOfUsingException(item + " не предназначен для выполнения данной задачи");
            }
            describe(pooper + " проснулся обкакавшись");
            QualityChange.changeQuality(Condition.NORMAL, pooper, true);
            QualityChange.changeQuality(Condition.DIRTY, pooper, item, true);
            InventoryChanger.changeInventory(pooper, 0, item);
            calculateDamage(pooper, item, 5);
        } catch (WrongWayOfUsingException exception){
            System.out.println(exception.getMessage());
            System.exit(1);
        }
    }
}
