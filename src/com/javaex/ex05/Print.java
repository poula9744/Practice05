package com.javaex.ex05;

public class Print {
    
    public void printer(int val){
        System.out.println(val);
    }

    //메소드  3개 를 작성하세요
    public void printer(boolean on) {
    	if(on == true) {
    		System.out.println(true);
    	} else {
    		System.out.println(false);
    	}
    }
    
    public void printer(double val) {
    	System.out.println(val);
    }
    
    public void printer(String name) {
    	System.out.println(name);
    }
}
