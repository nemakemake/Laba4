package src.enums;

public enum Stat {
    HP(1),
    POWER(2);

    private final int ERRORCODE;
    Stat(int errorCode){
        this.ERRORCODE = errorCode;
    }
    public int getERRORCODE(){
        return this.ERRORCODE;
    }
}
