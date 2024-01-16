package src.table.actions;

import src.innerfuncs.InventoryChanger;
import src.interfaces.Describing;
import src.interfaces.ItemManager;
import src.objects.Action;
import src.objects.Item;
import src.objects.Person;


public class ClotheChanging extends Action implements Describing, ItemManager {
    public void changeClothes(Person p1, Person p2, Item i1){
        describe(p1 + " поменял " + p2.getInventory().get(0) +" "+ p2);
        delItem(p1, i1, false);
        InventoryChanger.changeInventory(p2,0, i1);
    }
}
