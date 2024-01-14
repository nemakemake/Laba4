package src.innerfuncs;

import src.objects.Item;

public class ItemDamage {
    public static void calculateDamage(Item i1, int damage){
        i1.setQua(i1.getQua() - damage);
        System.out.println("-> Состояние " + i1 + " стало на " + damage + " меньше");
        if (i1.getQua() <= 0) System.out.println("-> Состояние " + i1 + " меньше нуля. " + i1+ " уничтожен");
    }
}
