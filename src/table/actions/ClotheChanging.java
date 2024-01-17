package src.table.actions;

import src.innerfuncs.InventoryChanger;
import src.interfaces.Describing;
import src.interfaces.ItemManager;
import src.objects.Action;
import src.objects.Item;
import src.objects.Person;


public class ClotheChanging extends Action implements Describing, ItemManager {
    public void changeClothes(Person changer, Person whosClothes, Item i1){
        describe(changer + " поменял " + whosClothes.getInventory().get(0) +" "+ whosClothes);
        delItem(changer, i1, false);
        InventoryChanger.changeInventory(whosClothes,0, i1);
    }
}
