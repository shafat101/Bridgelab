package com.bridgelabz.creationaldesignpatterns;

public class LazyInitilization {
private static LazyInitilization instance;
    
    private  LazyInitilization(){}
    
    public static LazyInitilization getInstance(){
        if(instance == null){
            instance = new LazyInitilization();
        }
        return instance;
    }
}
