package com.bridgelabz.datastructure;


import com.bridgelabz.util.Qnode;
import com.bridgelabz.util.Queue;

import com.bridgelabz.util.Utility;

public class BankingCashCounter {
    double bankInitialBalance;
    double minBalanceRemaing;
	
	
    public BankingCashCounter() {
    	this.bankInitialBalance = 5000;
    	this.minBalanceRemaing = 100;
    }
	public static void main(String[] args) {
		System.out.println("Total people allowed for day : ");
		String len = Utility.scannerString();
		int num = Utility.numberOrNotReturn(len);
		double[] amount = new double[num];int[] creaditOrDebit = new int[num];
		String[] name = new String[num];
		for(int i = 0;i < num;i++) {
			
			System.out.println("Enter the amount : ");
		   amount[i] = Utility.numberOrNotReturn(Utility.scannerString());
			System.out.println("Enter Debit/Credit '1' debit '0' for credit : ");
			creaditOrDebit[i] = Utility.numberOrNotReturn(Utility.scannerString());
			System.out.println("Enter the name : ");
			name[i] = Utility.scannerString();
			System.out.println("#######################");
		}
	      Queue q =	qInitilizezer(name,amount,creaditOrDebit,num);
		
	      bankDequeue(q);
	}
	public static Queue<String> qInitilizezer(String[] name,double[] amount,int[] creaditOrDebit,int len) {
		BankingCashCounter bankingCashCounter = new BankingCashCounter();
		Queue<String> q = new Queue<String>();
	     for(int i = 0;i < len;i++) {
	    	 
		if (creaditOrDebit[i] == 0 && amount[i] > bankingCashCounter.bankInitialBalance ) {
			//System.out.println("Not Enough cash Avilable : ");
			//return -1;
			q.enqueue(name[i] + " : Not Enough cash Avilable");
		}else if(creaditOrDebit[i] == 0 && amount[i] + bankingCashCounter.minBalanceRemaing <= bankingCashCounter.bankInitialBalance) {
			q.enqueue(name[i] + " Debited");
			bankingCashCounter.bankInitialBalance =	bankingCashCounter.bankInitialBalance - amount[i];
		}else if(creaditOrDebit[i] == 1 && amount[i] < Integer.MAX_VALUE ) {
			q.enqueue(name[i] + " Creadited");
			bankingCashCounter.bankInitialBalance =	bankingCashCounter.bankInitialBalance + amount[i];
		}else {
			System.out.println("SomeThing went wrong ! ");
		}
		
	}
	   //  bankDequeue(q);
		return q;
	}
	
	public static void bankDequeue(Queue q) {
		Qnode s = q.dequeue();
		q.display(s);
	}

	
	
	
	
	

}
