package org.example;

public class Utils {
    public static boolean isAllPositiveNumbers(String... str){
        for (String string: str){
            if (!new StringUtils().isPositiveNumber(string)){
                return false;
            }
        }return true;
    }
}