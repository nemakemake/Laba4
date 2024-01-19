package src.objects;

import src.enums.Condition;
import src.enums.ItemType;
import src.enums.Location;
import src.exceptions.DriverLicenseException;

import java.util.LinkedList;

public class Car extends Item {
    public Car(String name, Location location, Condition condition) {
        super(name, location, ItemType.TRANSPORT, condition);
    }

    public void drive(LinkedList<UObject> passengers, Person person, String target) {
        try {
            if (!person.driverLicense) {
                throw new DriverLicenseException(person + " не имеет водительских прав!");
            }
            passengers.remove(person);
            System.out.print(person + " ехал на " + this + " с ");
            passengers.stream().filter(s -> s instanceof Person).map(UObject::getName).map(x -> x + " ").forEach(System.out::print);
            System.out.println("на борту в " + target);
        } catch (DriverLicenseException error) {
            System.out.println(error.getMessage());
            System.exit(1);
        }
    }
}
