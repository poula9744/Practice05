package com.javaex.ex09;

public class StringUtil {
    
    public static String concatString(String[] strArray){
       
    	String sum = "";
        //메소드 내용작성
        for(int i = 0; i<strArray.length; i++) {
        	
        	sum += strArray[i];
        }
        return sum;
    }

}
