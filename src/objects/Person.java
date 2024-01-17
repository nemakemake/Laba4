package src.objects;

import src.enums.Condition;
import src.exceptions.UnrealStatException;

import java.util.LinkedList;

public class Person extends UObject{
    protected LinkedList<Item> inventory = new LinkedList<>();
    protected int HP;
    protected int power;
    protected boolean driverLicense;
    public Person(String name, Condition condition, int HP, int power, boolean driverLicense) throws UnrealStatException {
        super(name, condition);
        this.driverLicense = driverLicense;
        try {
            final int ZERO = 0;
            if (HP <= ZERO){throw UnrealStatException.getException(1);}
            if (power < ZERO){throw UnrealStatException.getException(2);}
            this.HP = HP;
            this.power = power;
        } catch (UnrealStatException e){
            System.out.println(e.getMessage());
            System.exit(1);
        }
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
}
