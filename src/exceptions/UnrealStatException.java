package src.exceptions;

import src.enums.Stat;

public class UnrealStatException extends RuntimeException{

    public UnrealStatException(String message, Stat stat){
        super(message);
        int errorCode = stat.getERRORCODE();
    }

    public static UnrealStatException getException(int errorCode){
        switch (errorCode){
            case 1:
                return new UnrealStatException("Код ошибки: " + Stat.HP.getERRORCODE() + " Здоровье может быть только положительным!", Stat.HP);
            default:
                return new UnrealStatException("Код ошибки: " + Stat.POWER.getERRORCODE() + " Атака не может быть отрицательной!", Stat.POWER);
        }
    }
}
