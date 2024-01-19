package src.innerfuncs;

import src.enums.Condition;
import src.objects.Nature;
import src.objects.Person;
import src.groups.AllGroup;

import java.util.GregorianCalendar;

public class ConditionCheck {
    public static void checkCondition(){
        for (Person p: AllGroup.getGroup()){
            if (p.getCondition().LENGHT != 0){
                GregorianCalendar prop = p.getEffectTime();
                prop.add(GregorianCalendar.DAY_OF_YEAR, p.getCondition().LENGHT);
                if (Nature.getGlobalTime().after(prop)){
                    int i;
                    switch (p.getCondition()){
                        case SORROW:
                            i = AllGroup.getGroup().indexOf(p);
                            QualityChange.changeQuality(Condition.LIGHT_SORROW,AllGroup.getGroup().get(i), prop, true);
                            break;
                        case LIGHT_SORROW:
                            i = AllGroup.getGroup().indexOf(p);
                            QualityChange.changeQuality(Condition.SAD,AllGroup.getGroup().get(i), prop,true);
                            break;
                        case SAD:
                            i = AllGroup.getGroup().indexOf(p);
                            QualityChange.changeQuality(Condition.NORMAL,AllGroup.getGroup().get(i), prop,true);
                            break;

                    }
                    }
                }
            }
        }
}

