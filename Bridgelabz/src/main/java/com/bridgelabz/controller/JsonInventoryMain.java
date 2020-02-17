package com.bridgelabz.controller;

import com.bridgelabz.serviceimplementation.InterfaceImplementationJSONinventory;
import com.bridgelabz.util.Utility;

public class JsonInventoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    InterfaceImplementationJSONinventory iim = new InterfaceImplementationJSONinventory();
    iim.createFile();
    int flag = 1;
    while(flag != 0) {
    	{
			System.out.println("1.Add inventory 2.show inventory 3.calculate inventory\n"
					+ "4.remove inventory 5.total weight 6.total price  7.edit inventory 8.exit");
			System.out.println("enter choice");
			int choice=Utility.scannerInt();
			switch(choice)
			{
			case 1:iim.insertIntoFile();
					break;
			case 2:iim.showinventory();
					break;
			case 3:double d=iim.calculateInventory();
					System.out.println("inventory cost is:"+d);
					break;
			case 4:iim.deleteinInvantary();
					break;
			case 5:double totalweight=iim.totalWeight();
					System.out.println("total weight of all inventories in kg:"+totalweight);
					break;
			case 6:double totalprice=iim.totalPrice();
					System.out.println("total price of all inventories in Rs:"+totalprice);
			case 7:iim.UpdateFile();;
					break;
			case 8:	flag = 0;
					System.out.println("Flag === 0");
					break;
			default:System.out.println("enter correct choice");
					break;
			}
		}
    }
		
		
		
	}

}
