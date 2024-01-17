package src.interfaces;

public interface Describing {

    default void describe(String text){
        System.out.println(text);
    }

    default String toQuote(String text) {
        return " подумал: '" + text + "'";
    }

    default String toSay (String text){
        return " сказал: " + text;
    }
}
