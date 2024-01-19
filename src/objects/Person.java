package src.objects;

import src.enums.Condition;
import src.enums.Location;
import src.exceptions.UnrealStatException;
import src.groups.AllGroup;
import src.interfaces.GroupManager;

import java.util.LinkedList;

public class Person extends UObject implements GroupManager {
    protected LinkedList<Item> inventory = new LinkedList<>();
    protected LinkedList<Person> ignoreList = new LinkedList<>();
    protected int HP;
    protected int power;
    protected boolean driverLicense;
    public Person(String name, Location location, Condition condition, int HP, int power, boolean driverLicense) throws UnrealStatException {
        super(name, condition);
        this.driverLicense = driverLicense;
        try {
            final int ZERO = 0;
            if (HP <= ZERO){throw UnrealStatException.getException(1);}
            if (power < ZERO){throw UnrealStatException.getException(2);}
            this.HP = HP;
            this.power = power;
            addTo(this, location);
            AllGroup.addToCast(this);
        } catch (UnrealStatException e){
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }


    public LinkedList<Person> getIgnoreList() {
        return ignoreList;
    }

    public void setIgnoreList(LinkedList<Person> ignoreList) {
        this.ignoreList = ignoreList;
    }

    public LinkedList<Item> getInventory() {
        return inventory;
    }

    public void setInventory(LinkedList<Item> inventory) {
        this.inventory = inventory;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getHp() {
        return HP;
    }

    public void setHp(int HP) {
        this.HP = HP;
    }

    public String call(Person person){
        return (person.toString());
    }
}
