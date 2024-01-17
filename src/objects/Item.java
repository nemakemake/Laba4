package src.objects;

import src.enums.Condition;
import src.exceptions.DriverLicenseException;

import java.util.LinkedList;

public class Item extends UObject{
    private int quality;

    public Item(String name, Condition condition){
        super(name, condition);
        this.quality = 5;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public class Car extends Item {
        public Car(String name, Condition condition) {
            super(name, condition);
        }
        public void drive(LinkedList<Person> passengers, Person person, String target){
            try{
                if (!person.driverLicense){
                    throw new DriverLicenseException(person + " не имеет водительских прав!");
                }
                passengers.remove(person);
                System.out.print(person + " ехал на " + this + " с ");
                passengers.stream().map(UObject::getName).map(x -> x + " ").forEach(System.out::print);
                System.out.println("на борту в " + target);
            }
            catch(DriverLicenseException error) {
                    System.out.println(error.getMessage());
                }
            }
        }
    }

