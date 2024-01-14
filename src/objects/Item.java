package src.objects;

import src.enums.Condition;
import src.exceptions.DriverLicenseException;

import java.util.LinkedList;

public class Item extends UObject{
    private int qua;

    public Item(String name, Condition condition){
        super(name, condition);
        this.qua = 5;
    }

    public int getQua() {
        return qua;
    }

    public void setQua(int qua) {
        this.qua = qua;
    }

    public class Car extends Item {
        public Car(String name, Condition condition) {
            super(name, condition);
        }
        public void drive(LinkedList<Person> passengers, Person p1, String target){
            try{
                if (!p1.driverLicense){
                    throw new DriverLicenseException(p1 + " не имеет водительских прав!");
                }
                passengers.remove(p1);
                System.out.print(p1 + " ехал на " + this + " с ");
                passengers.stream().map(UObject::getName).map(x -> x + " ").forEach(System.out::print);
                System.out.println("на борту в " + target);
            }
            catch(DriverLicenseException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

