package src.innerfuncs;

import src.enums.Condition;
import src.objects.Nature;
import src.objects.Person;
import src.table.Groups;

import java.util.GregorianCalendar;

public class ConditionCheck {
    public static void checkCondition(){
        for (Person p: Groups.getAllGroup()){
            if (p.getCondition().lenght != 0){
                GregorianCalendar prop = p.getEffTime();
                prop.add(GregorianCalendar.DAY_OF_YEAR, p.getCondition().lenght);
                if (Nature.getGlobTime().after(prop)){
                    int i;
                    switch (p.getCondition()){
                        case SORROW:
                            i = Groups.getAllGroup().indexOf(p);
                            QualityChange.changeQuality(Condition.LIGHT_SORROW,Groups.getAllGroup().get(i), prop, true);
                            break;
                        case LIGHT_SORROW:
                            i = Groups.getAllGroup().indexOf(p);
                            QualityChange.changeQuality(Condition.SAD,Groups.getAllGroup().get(i), prop,true);
                            break;
                        case SAD:
                            i = Groups.getAllGroup().indexOf(p);
                            QualityChange.changeQuality(Condition.NORMAL,Groups.getAllGroup().get(i), prop,true);
                            break;

                    }
                    }
                }
            }
        }
}

