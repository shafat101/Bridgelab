package com.bridgelabz.serviceimplementation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


import com.bridgelabz.model.Person;
import com.bridgelabz.oop.utility.Utility;
import com.bridgelabz.service.AddressbookInterface;

public class AddressBookInterfaceImplementation implements AddressbookInterface  {
     
	@Override
	public void addPerson() {
		// TODO Auto-generated method stub
		System.out.print("Enter first and last name: ");
		String firstName = Utility.scannerString();
		String lastName = Utility.scannerString();
		
		System.out.print("Enter complete address: ");
		Utility.nextLine();
		String address = Utility.scannerString();
		
		System.out.print("Enter city, state and zip: ");
		String city = Utility.scannerString();
		String state = Utility.scannerString();
		String zip = Utility.scannerString();
		
		System.out.println("Enter phone number: ");
		String phoneNumber = Utility.scannerString();
		
		Person person = new Person(firstName, lastName, address, city, state, zip, phoneNumber);
		JSONObject jsonObject = person.toJsonObject();
		
		updateaddressBook(jsonObject);
	}

	@Override
	public void editPerson(JSONObject jsonObject, JSONArray addressBookArray, int i) {
		// TODO Auto-generated method stub
		System.out.println("Edit?");
		System.out.println("1. Address");
		System.out.println("2. Phone Number");
		int choice=0;
		String s = Utility.scannerString();
		if(Utility.numberOrNot(s)) {
			choice = Utility.numberOrNotReturn(s);
		}else {
			System.out.println("! Invalid Input ");
		}
		switch (choice) {
	case 1:
		System.out.print("Enter address: ");
		Utility.nextLine();
		
		String address = Utility.scannerString();
		System.out.print("Enter city, state and zip: ");
		String city = Utility.scannerString();
		String state = Utility.scannerString();
		String zip = Utility.scannerString();
		
		jsonObject.put("Address", address);
		jsonObject.put("City", city);
		jsonObject.put("State", state);
		jsonObject.put("Zip", zip);
		break;

	case 2:
		System.out.println("Enter phone number: ");
		String phoneNumber = Utility.scannerString();
		jsonObject.put("Phone Number", phoneNumber);
		break;
	}
	
	addressBookArray.remove(i);
	addressBookArray.add(i, jsonObject);
	
	printWriter(addressBookArray);
	System.out.println("Contact updated successfully");
	}

	@Override
	public void delete(JSONArray addressBookArray, int i) {
		// TODO Auto-generated method stub
		addressBookArray.remove(i);
		
		printWriter(addressBookArray);
		System.out.println("Contact deleted successfully");
	}

	@Override
	public void search(JSONObject jsonObject) {
		// TODO Auto-generated method stub
		System.out.println("Name:\n" + jsonObject.get("First Name") + " " + jsonObject.get("Last Name"));
		System.out.println("Address:\n" + jsonObject.get("Address"));
		System.out.print(jsonObject.get("City") + ", ");
		System.out.print(jsonObject.get("State") + " - ");
		System.out.println(jsonObject.get("Zip"));
		System.out.println("Phone Number:\n" + jsonObject.get("Phone Number"));
	}

	@Override
	public void updateaddressBook(JSONObject jsonObject) {
		// TODO Auto-generated method stub
		JSONParser parser = new JSONParser();
		JSONArray bookArray = null;

		File file = new File("/Users/SHAFAT BASHIR/Documents/oopsbridgelabz/addressbook.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			bookArray = new JSONArray();
		} else {
			try {
				bookArray = (JSONArray) parser.parse(new FileReader("/Users/SHAFAT BASHIR/Documents/oopsbridgelabz/addressbook.txt"));
			} catch (ParseException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		bookArray.add(jsonObject);
		printWriter(bookArray);
		System.out.println("Contact added successfully");
	}

	@Override
	public void match(int choice) {
		// TODO Auto-generated method stub
		JSONParser parser = new JSONParser();
		String firstName = Utility.scannerString();
		String lastName = Utility.scannerString();
		JSONArray bookArray = null;

		try {
			bookArray = (JSONArray) parser.parse(new FileReader("/Users/SHAFAT BASHIR/Documents/oopsbridgelabz/addressbook.txt"));
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}

		Iterator iterator = bookArray.iterator();
		int i = 0;
		boolean b = false;
		outer:
		while (iterator.hasNext()) {
			JSONObject jsonObject = (JSONObject) iterator.next();
			if (jsonObject.get("First Name").equals(firstName) && jsonObject.get("Last Name").equals(lastName)) {
				b = true;
				switch (choice) {
				case 2:
					editPerson(jsonObject, bookArray, i);
					break outer;
				case 3:
					delete(bookArray, i);
					break outer;
				case 4:
					search(jsonObject);
					break outer;
				}
			}
			i++;
		}
		if(!b) {
			System.out.println("\nSorry!!! Person not found...");
		}
	}

	@Override
	public void printWriter(JSONArray addressBookArray) {
		// TODO Auto-generated method stub
		try {
			PrintWriter printWriter = new PrintWriter("/Users/SHAFAT BASHIR/Documents/oopsbridgelabz/addressbook.txt");
			printWriter.write(addressBookArray.toJSONString());
			printWriter.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void inputUser() {
		// TODO Auto-generated method stub
		System.out.println("Select an action to continue..");
		System.out.println("1. Add a person");
		System.out.println("2. Edit a Person");
		System.out.println("3. Delete a person");
		System.out.println("4. Search a person");
		System.out.println("5. Quit App");
		int choice=0;
		String s = Utility.scannerString();
		if(Utility.numberOrNot(s)) {
			choice = Utility.numberOrNotReturn(s);
		}else {
			System.out.println("! Invalid Input ");
		}
		switch(choice) {
		case 1:
			addPerson();
			System.out.println("\n");
			inputUser();
			break;
		case 2:
			System.out.print("Enter first and last name of the person to edit the contact: ");
			match(choice);
			System.out.println("\n");
			inputUser();
			break;
		case 3:
			System.out.print("Enter first and last name of the person to delete the contact: ");
			match(choice);
			System.out.println("\n");
			inputUser();
			break;
		case 4:
			System.out.print("Enter first and last name of the person to search: ");
			match(choice);
			System.out.println("\n");
			inputUser();
			break;
		default:
			break;
		}
		
		
		
		
	}

}
