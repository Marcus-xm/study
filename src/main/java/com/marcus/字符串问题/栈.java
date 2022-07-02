package com.marcus.字符串问题;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author marcus
 * @date 2022/7/1
 */
public class 栈 {

    static ArrayList list = new ArrayList();
    public static void main(String[] args) {
        Scanner ins = new Scanner(System.in);
        int i = ins.nextInt();
        for(;i>=0;i--){
            String str = ins.nextLine();
            String[] s= str.split(" ");
            switch(s[0]){
                case "push":
                    push(Integer.valueOf(s[1]));
                    break;
                case "pop":
                    pop();
                    break;
                case "top":
                    top();
                    break;
            }
        }
    }

    public static void push(int a){
        list.add(a);
    }

    public static void pop(){
        if(list==null||list.size()<=0){
            System.out.println("error");
        }else{
            System.out.println(list.get(list.size()-1));
            list.remove(list.size()-1);
        }
    }

    public static void top(){
        if(list==null||list.size()<=0){
            System.out.println("error");
        }else{
            System.out.println(list.get(list.size()-1));
        }
    }
}
