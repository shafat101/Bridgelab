package com.bridgelabz.serviceimplementation;



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.json.simple.JSONArray;


import com.bridgelabz.model.CompanyShares;
import com.bridgelabz.oop.utility.Queue;
import com.bridgelabz.oop.utility.StackOperations;
import com.bridgelabz.oop.utility.Utility;
import com.bridgelabz.oop.utility.Utiltiy;
import com.bridgelabz.service.FuncInterface;






public class StockAccount implements FuncInterface{
	
	CompanyShares[] companyShares;	//	company shares class array
	StackOperations<String> transactionsStack;	//	stack
	Queue<String> transactionsQueue;	//	queue
	JSONArray arr = new JSONArray();
	    public String name;     
	    public int cash;           
	    public int n;   
	    int totalValue;
	    int count = 0;
	    
	    int dbCount = 0;
	    public  StockAccount(String filename) {
	    	transactionsStack = new StackOperations<String>();
			transactionsQueue = new Queue<String>();
			 getFiledata();
	    }
	
	   public void addOrRemoveStock() {
			System.out.print("Type 'buy' to buy stock or type 'sell' to sell stock: 'save' to save P to print");
			String action = Utility.scannerString();
			if(action.equals("buy")) {
				System.out.print("Enter amount, symbol, price of the stock: ");
				int amount = Utility.retint();
				String symbol =Utility.scannerString();
				int price = Utility.scannerInt();
				System.out.println(amount+" "+symbol+" "+price);
				buy(amount, symbol, price);
				addOrRemoveStock();
			} else if(action.equals("sell")) {
				System.out.print("Enter amount, symbol, price of the stock: ");
				int amount = Utility.scannerInt();
				String symbol = Utility.scannerString();
				int price = Utility.scannerInt();
				System.out.println(amount+" "+symbol+" "+price);
				sell(amount, symbol, price);
				addOrRemoveStock();
			}
			else if(action.equals("save")){
			
				writeToFile();
				addOrRemoveStock();
			}else if(action.equals("P")) {
				printReport();
				System.out.println("\nTotal stock value: " + valueOf());
				printTransactionStack();
				printTransactionQueue();
			}
			
		}
	    
	    private int getFiledata() {
			FileReader reader = null;
			
			try {
				reader = new FileReader("/home/mobicom/Desktop/Bridgelabzsolutions/gitin/Bridgelabz/src/main/java/com/bridgelabz/repository/stockaccount.txt");
				//	buffered reader to read the file
				BufferedReader bufferedReader = new BufferedReader(reader);
//				name = bufferedReader.readLine();
//				cash = Integer.parseInt(bufferedReader.readLine());
//				n = Integer.parseInt(bufferedReader.readLine());
//				//System.out.println("getfiledate value of n"+ n);
//				String date = bufferedReader.readLine();
				companyShares = new CompanyShares[10];
				for (int i = 0; i < 1000; i++) {
					String line = bufferedReader.readLine();
					if(line.equals(null)) {
						break;
					}
				//	System.out.println(line+" Line here");
					String[] lines = line.split(" ");
					String symbol = lines[0];
					int numberOfShares = Integer.parseInt(lines[1]);				
					int price = Integer.parseInt(lines[2]);
					String dateTime = lines[3];
					companyShares[i] = new CompanyShares(symbol, numberOfShares, dateTime, price);
					dbCount++;
				}
				bufferedReader.close();
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}catch(NullPointerException e) {
				addOrRemoveStock();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			return dbCount;
		}
	    
	@Override
	public double valueOf() {
		// TODO Auto-generated method stub
		
		
		for (int i = 0; i < n; i++) {
			totalValue = companyShares[i].getValue();
		}
		return totalValue;
	}

	@Override
	public void buy(int amount, String symbol,int price) {
		// TODO Auto-generated method stub
		
		String dateTime = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
		CompanyShares companyShareObject = new CompanyShares(symbol, amount / price, dateTime, price);
		companyShares[count] = companyShareObject;
		count++;
		transactionsStack.push("Purchased");
		transactionsQueue.enqueue(dateTime);
		
	}

	@Override
	public void sell(int amount, String symbol,int price) {
		// TODO Auto-generated method stub
		int numberOfShares = amount / price;
		String dateTime = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
		transactionsStack.push("Sold");
		transactionsQueue.enqueue(dateTime);
		for (int i = 0; i < n; i++) {
			if (companyShares[i].getStockSymbol().equals(symbol)) {
				companyShares[i].setNumberOfShares(companyShares[i].getNumberOfShares() - numberOfShares);
				companyShares[i].setDateTime(dateTime);
				break;
			}
		}
	}
    
	@Override
	public void save(String filename) {
		// TODO Auto-generated method stub
		System.out.println("Enter Your Name :");
		String name = Utiltiy.scannerString();
		System.out.println("Enter the amount of Cash :");
		double cash = Utiltiy.scannerDouble();
		
	//	Utiltiy.createFile(name);
	}

	@Override
	public int printReport() {
		System.out.println("\n" + name + "\n");
		System.out.println("Symbol\tNo. of Shares\tPrice\tValue\tDate");
		
		
		for (int i = 0; i < dbCount; i++) {
			CompanyShares shares = companyShares[i];
			System.out.println(shares.getStockSymbol() + "\t" + shares.getNumberOfShares() + "\t\t" + shares.getSharePrice()
					+ "\t" + shares.getValue() + "\t" + shares.getDateTime());
		}
		return 1;	
	}
	
	 // prints queue
	 
	public void printTransactionQueue() {
		System.out.println("\nTransactions Queue:");
		while (!transactionsQueue.isEmpty()) {
			System.out.println(transactionsQueue.dequeue());
		}
	}
	
	
	// prints stack
	
	public void printTransactionStack() {
		System.out.println("\nTransactions Stack:");
		while (!transactionsStack.isEmpty()) {
			System.out.println(transactionsStack.pop());
		}
	}
	
	 // updates file
	
	public void writeToFile() {
		try {
			//
			PrintWriter writer = new PrintWriter("/home/mobicom/Desktop/Bridgelabzsolutions/gitin/Bridgelabz/src/main/java/com/bridgelabz/repository/stockaccount.txt");
		//	writer.write(name + "\n" + cash + "\n" + n + "\n");
			
			for (int i = 0; i < 5; i++) {
				System.out.println("value of n :"+n);
				//System.out.println("LEngth of companyShares "+companyShares.length);
				CompanyShares share = companyShares[i];
				writer.write(share.getStockSymbol() + " " + share.getNumberOfShares()
						+ " " + share.getSharePrice() + " " + share.getDateTime() + "\n");
				
				
			} 
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
