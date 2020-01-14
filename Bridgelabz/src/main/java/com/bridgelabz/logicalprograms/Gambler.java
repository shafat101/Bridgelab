package com.bridgelabz.logicalprograms;

import com.bridgelabz.util.Utility;

public class Gambler {

	public static void main(String[] args) {
          
	int[] x =	Utility.scannerArray(3);
	double[] result = Utility.roundN(x[0], x[1], x[2]);
	double n = result[0];double temp = result[1];
	double num = result[2];double stake = result[3];
	if(Utility.checkZero(n) && Utility.checkZero(temp - num)) {
		 Utility.output("Rounds Win : "+n+" Win Ratio : "+ 1 +" % "+ "Stake : "+stake);
	}else {
	double perwin = Utility.powerof(n, temp - num);
	Utility.output("Rounds Win : "+n+" Win Ratio : "+ temp +"  "+perwin+" "+num +" %"+ "Stake : "+stake);
	}
	
       
	}

}
