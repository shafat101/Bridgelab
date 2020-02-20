package com.bridgelabz.creationaldesignpatterns;

public class BillPughSingletonImplementation {
private BillPughSingletonImplementation(){}
    
    private static class SingletonHelper{
        private static final BillPughSingletonImplementation INSTANCE = new BillPughSingletonImplementation();
    }
    
    public static BillPughSingletonImplementation getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
