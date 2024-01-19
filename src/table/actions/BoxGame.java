package src.table.actions;

import src.enums.Condition;
import src.enums.ItemType;
import src.enums.Location;
import src.objects.Action;
import src.objects.Item;
import src.objects.Person;

import java.util.LinkedList;
import java.util.Random;

public class BoxGame extends Action{
    public static void setTheGame(Person player1, Person player2){
        class CreateMysteryBox {
            LinkedList<Item> createMysteryBox(){
                Random random = new Random();
                LinkedList<Item> box = new LinkedList<>();
                Item ball1 = new Item("myach"+ random.nextInt(1), Location.HOME,ItemType.TOY, Condition.NORMAL);
                Item ball2 = new Item("myach"+random.nextInt(1), Location.HOME,ItemType.TOY,Condition.NORMAL);
                box.add(ball1);
                box.add(ball2);
                return box;
            }
            final LinkedList<Item> BOX = createMysteryBox();
        }
        CreateMysteryBox createMysteryBox = new CreateMysteryBox();
        Random random = new Random();
        boolean decision = random.nextBoolean();
        player2.getIgnoreList().remove(player1);
        System.out.println(player1 + ": у меня в мешке есть два мячика двух возможных цветов\n"+player2+ ", что ты выберешь? Они там одинаковые или нет?" );
        if (decision){
            System.out.println(player2 + ": Одинаковые!");
        } else System.out.println(player2 + ": Разные!");
        if (createMysteryBox.BOX.getFirst().equals(createMysteryBox.BOX.getLast())){
            if (decision) {System.out.println(player1 + ": ты угадал!");
            } else {System.out.println(player1 + ": ты не угадал!");}
        } else {
            if (decision) {System.out.println(player1 + ": ты не угадал!");
            } else {System.out.println(player1 + ": ты угадал!");}
        }
    }
}
