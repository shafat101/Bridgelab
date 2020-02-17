package com.bridgelabz.service;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public interface Interface1 {
    public boolean createFile();
    public void insertIntoFile();
    public void UpdateFile();
    public void deleteinInvantary();
    public JSONArray readFile();
    public void displayInventory(JSONObject emp);
    public double calculateInventory();
    public double totalWeight();
    public double totalPrice();
    public void showinventory();
    
}
