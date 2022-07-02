package com.marcus.字符串问题;

/**
 * @author marcus
 * @date 2022/6/30
 */
public class 验证IP地址 {
    public static void main(String[] args) {
        System.out.println(solve("2001:0db8:85a3:0:0:8A2E:0370:7334"));
    }
    public static String solve (String IP) {
        String[] strs=IP.split("\\.",-1);
        String[] v8= IP.split(":",-1);
        if(strs.length==4){
            String output = "IPv4";
            for(String str:strs){
                if(str.isEmpty()){
                    output="Neither";
                    break;
                }else if(!"0".equals(str)&&"0".equals(str.substring(0,1))){
                    output="Neither";
                    break;
                }else {
                    try {
                        if(Integer.valueOf(str)>255){
                            output="Neither";
                            break;
                        }
                    }catch (Exception e){
                        output="Neither";
                        break;
                    }
                }
            }
            return output;
        }else if(v8.length==8){
            String output = "IPv6";
            for(String str:v8){
                if(str.isEmpty()){
                    output="Neither";
                    break;
                }else if(!"0".equals(str)&&"0".equals(str.substring(0,1))){
                    output="Neither";
                    break;
                }else if(str.length()>4){
                    output="Neither";
                    break;
                }
            }
            return output;
        }else{
            return "Neither";
        }
    }
}
