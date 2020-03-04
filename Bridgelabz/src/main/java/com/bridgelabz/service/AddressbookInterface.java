package com.bridgelabz.service;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public interface AddressbookInterface {
  public void inputUser();
  public void addPerson();
  public void editPerson(JSONObject jsonObject, JSONArray addressBookArray,int i);
  public void delete(JSONArray addressBookArray,int i);
  public void search(JSONObject jsonObject);
  public void updateaddressBook(JSONObject jsonObject);
  public void match(int choice);
  public void printWriter(JSONArray addressBookArray);
}
