package src.objects;

import src.enums.Condition;
import src.enums.ItemType;
import src.enums.Location;
import src.interfaces.GroupManager;


public class Item extends UObject implements GroupManager {
    private int quality;
    private final ItemType type;
    public Item(String name, Location location,ItemType type, Condition condition){
        super(name, condition);
        this.quality = 5;
        this.type = type;
        addTo(this, location);
    }

    public ItemType getType() {
        return type;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

}

