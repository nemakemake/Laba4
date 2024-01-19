package src.groups;

import src.objects.UObject;

import java.util.LinkedList;

public class Out{
    private static LinkedList<UObject> group = new LinkedList<>();
    public static LinkedList<UObject> getGroup() {
        return group;
    }

    public static void setGroup(LinkedList<UObject> newGroup) {
        group = newGroup;
    }

}
