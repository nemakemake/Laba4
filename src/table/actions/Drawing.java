package src.table.actions;

import src.enums.Condition;
import src.enums.ItemType;
import src.exceptions.WrongWayOfUsingException;
import src.innerfuncs.QualityChange;
import src.innerfuncs.InventoryChanger;
import src.interfaces.ItemManager;
import src.objects.Item;
import src.objects.Person;
import src.interfaces.Describing;

public class Drawing implements Describing, ItemManager {
    Thinking thinking = new Thinking();
    public void draw(Person painter, Person watchman, Item canvas, Item tool){
        try {
            if (canvas.getType() != ItemType.CANVAS || tool.getType() != ItemType.DRAWINGTOOL){
                throw new WrongWayOfUsingException(canvas + " или " + tool + " не предназначены для выполнения данной задачи");
            }
            final int DRAWINGDAMAGE = 3;
            describe(painter + " рисовал в " + canvas + " с помощью " + tool);
            calculateDamage(canvas, DRAWINGDAMAGE);
            QualityChange.changeQuality(Condition.DIRTY, painter, canvas, true);
            InventoryChanger.changeInventory(painter, 2, canvas);
            thinking.think(watchman, "еще один шаг, питающий детскую ревность");

        } catch (WrongWayOfUsingException exception){
            System.out.println(exception.getMessage());
            System.exit(1);
        }
    }
}
