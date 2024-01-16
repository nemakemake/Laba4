package src.table.actions;

import src.enums.Condition;
import src.objects.Action;
import src.objects.Item;
import src.objects.Person;

import java.util.LinkedList;
import java.util.Random;

public class BoxGame extends Action{
    public static void setTheGame(Person p1, Person p2){
        class CreateMysteryBox {
            LinkedList<Item> createMysteryBox(){
                Random random = new Random();
                LinkedList<Item> box = new LinkedList<>();
                Item ball1 = new Item("myach"+ random.nextInt(1), Condition.NORMAL);
                Item ball2 = new Item("myach"+random.nextInt(1), Condition.NORMAL);
                box.add(ball1);
                box.add(ball2);
                return box;
            }
            final LinkedList<Item> box = createMysteryBox();
        }
        CreateMysteryBox cMB = new CreateMysteryBox();
        Random random = new Random();
        boolean decision = random.nextBoolean();
        System.out.println(p1 + ": у меня в мешке есть два мячика двух возможных цветов\n"+p2+ ", что ты выберешь? Они там одинаковые или нет?" );
        if (decision){
            System.out.println(p2 + ": Одинаковые!");
        } else System.out.println(p2 + ": Разные!");
        if (cMB.box.getFirst().equals(cMB.box.getLast())){
            if (decision) {System.out.println(p1 + ": ты угадал!");
            } else {System.out.println(p1 + ": ты не угадал!");}
        } else {
            if (decision) {System.out.println(p1 + ": ты не угадал!");
            } else {System.out.println(p1 + ": ты угадал!");}
        }
    }
}
