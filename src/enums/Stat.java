package src.enums;

public enum Stat {
    HP(1),
    POWER(2);

    private final int errorCode;
    Stat(int errorCode){
        this.errorCode = errorCode;
    }
    public int getErrorCode(){
        return this.errorCode;
    }
}
