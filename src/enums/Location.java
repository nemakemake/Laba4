package src.enums;

public enum Location {
    OUT("дома"),
    HOME("на улице");

    Location(String name){
        this.name = name;
    }
    final String name;

    @Override
    public String toString() {
        return name;
    }
}
