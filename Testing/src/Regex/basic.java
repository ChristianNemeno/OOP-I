package Regex;

public class basic {

    public static boolean containsSad(String input){
        return input != null && input.matches(".*sad.*");
    }
}
