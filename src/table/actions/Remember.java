package src.table.actions;

import src.innerfuncs.InteractCheck;
import src.interfaces.Describing;
import src.interfaces.ItemManager;
import src.objects.Action;
import src.objects.Item;
import src.objects.Person;

public class Remember extends Action implements Describing, ItemManager {
    public void remember(Person person, Item item){
        describe(person + " вспомнил про " + item);
        if (InteractCheck.checkOfSameLocation(person, item)){
            addItem(person, item);
        } else {
            System.out.println("Увы, но это предмета нет под рукой");
        }

    }
}
