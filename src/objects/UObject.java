package src.objects;

import src.enums.*;

import java.util.GregorianCalendar;
import java.util.Objects;

public abstract class UObject {
    protected String name;
    protected Condition condition;
    protected GregorianCalendar effTime;

    public UObject(String name, Condition condition){
        this.name = name;
        this.condition = condition;
        this.effTime = (GregorianCalendar) Nature.getGlobTime().clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GregorianCalendar getEffTime() {
        return effTime;
    }

    public void setEffTime(GregorianCalendar effTime) {
        this.effTime = effTime;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UObject uObject) || this.hashCode() != o.hashCode()) return false;
        return Objects.equals(getName(), uObject.getName()) && getCondition() == uObject.getCondition();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCondition());
    }

    @Override
    public String toString() {
        return condition + name;
    }
}
