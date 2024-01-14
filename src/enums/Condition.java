package src.enums;

public enum Condition {
    SORROW("сильно горюющий ", 21),
    LIGHT_SORROW("горюющий ", 30),
    SAD("опечаленный ", 1095),
    SLEEP("спящий ", 0),
    STUNNED("озадаченный ", 0),
    DIRTY("грязный ", 0),
    NORMAL("", 0),
    OLD("старый ", 0);

    public final String name;
    public final int lenght;

    Condition(String name, int lenght){
        this.name = name;
        this.lenght = lenght;
    }

    @Override
    public String toString() {
        return name;
    }
}
