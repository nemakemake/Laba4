package src.interfaces;

public interface Describing {

    default void describe(String t){
        System.out.println(t);
    }

    default String toQuote(String t) {
        return " подумал: '" + t + "'";
    }

    default String toSay (String t){
        return " сказал: " + t;
    }
}
