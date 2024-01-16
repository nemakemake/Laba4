package src.interfaces;

import src.objects.Item;
import src.objects.Person;
import src.table.Groups;

public interface ItemManager {
    default void delItem(Person p, Item i, boolean describe){
        if (describe) System.out.println("-> " + p + " потратил " + i);
        int ii = Groups.getAllGroup().indexOf(p);
        Groups.getAllGroup().get(ii).getInventory().remove(i);
    }

    default void addItem(Person p, Item i) {
        int ii = Groups.getAllGroup().indexOf(p);
        Groups.getAllGroup().get(ii).getInventory().add(i);
        System.out.println("-> " + p + " получил "+ i);
    }

    default void calculateDamage(Person p1, Item i1, int damage){
        i1.setQua(i1.getQua() - damage);
        System.out.println("-> Состояние " + i1 + " стало на " + damage + " меньше");
        if (i1.getQua() <= 0) {
            System.out.println("-> Состояние " + i1 + " меньше нуля. " + i1+ " уничтожен");
        }
    }
}
