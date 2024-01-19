package src.innerfuncs;
import src.enums.Condition;
import src.enums.Location;
import src.objects.Person;

import java.util.Scanner;


public class PersonCreator {
    public static Person createPerson(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Последовательно введите имя, здоровье и уровень силы");
        return new Person(sc.nextLine(), Location.HOME,Condition.NORMAL, sc.nextInt(), sc.nextInt(), true);
    }
}
