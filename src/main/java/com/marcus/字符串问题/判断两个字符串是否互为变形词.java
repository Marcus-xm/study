package com.marcus.字符串问题;

/**
 * Created by marcus on 2022/6/29.
 */
public class 判断两个字符串是否互为变形词 {
    public static void main(String[] args) {
        System.out.println(str("abc","adc"));
        String str = "aAzZ";

        char[] a = str.toCharArray();
        for(char aa:a){
            System.out.println((int)aa);
        }
        System.out.println(a);
        System.out.println((char)97);
    }

    public static boolean str(String str1,String str2){
        return true;
    }
}
