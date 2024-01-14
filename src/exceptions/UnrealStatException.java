package src.exceptions;

import src.enums.Stat;

public class UnrealStatException extends RuntimeException{

    public UnrealStatException(String message, Stat stat){
        super(message);
        int errorCode = stat.getErrorCode();
    }

    public static UnrealStatException getException(int errorCode){
        switch (errorCode){
            case 1:
                return new UnrealStatException("Код ошибки: " + Stat.HP.getErrorCode() + " Здоровье может быть только положительным!", Stat.HP);
            default:
                return new UnrealStatException("Код ошибки: " + Stat.POWER.getErrorCode() + " Атака не может быть отрицательной!", Stat.POWER);
        }
    }
}
