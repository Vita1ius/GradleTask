package org.example;

public class StringUtils extends org.apache.commons.lang3.StringUtils{
    public static void main(String[] args) {
        System.out.println(new StringUtils().isPositiveNumber("-15"));
    }

    public boolean isPositiveNumber(String str){
        if(StringUtils.isEmpty(str)) {return false;}
        double num = Double.parseDouble(str);
        return num >= 0;
    }
}