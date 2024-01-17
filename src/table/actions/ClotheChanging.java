package src.table.actions;

import src.enums.ItemType;
import src.exceptions.WrongWayOfUsingException;
import src.innerfuncs.InventoryChanger;
import src.interfaces.Describing;
import src.interfaces.ItemManager;
import src.objects.Action;
import src.objects.Item;
import src.objects.Person;


public class ClotheChanging extends Action implements Describing, ItemManager {
    public void changeClothes(Person changer, Person whosClothes, Item item) throws WrongWayOfUsingException{
        try {
            if (item.getType() != ItemType.CLOTHE){
                throw new WrongWayOfUsingException(item + " не предназначен для выполнения данной задачи");
            }
            describe(changer + " поменял " + whosClothes.getInventory().get(0) + " " + whosClothes);
            delItem(changer, item, false);
            InventoryChanger.changeInventory(whosClothes, 0, item);
        } catch (WrongWayOfUsingException exception){
            System.out.println(exception.getMessage());
        }
    }
}
