package src.table.actions;

import src.interfaces.Describing;
import src.interfaces.ItemManager;
import src.objects.Action;
import src.objects.Item;
import src.objects.Person;

public class Remember extends Action implements Describing, ItemManager {
    public void remember(Person person, Item item){
        describe(person + " вспомнил про " + item);
        person.getInventory().add(item);
        addItem(person, item);
    }
}
