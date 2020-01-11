/*************************************************************************************************
 * purpose : To take  User Input and Replace String Template “Hello <<UserName>>, How are you?” 
 * 
 * @author SHAFAT BASHIR
 * @version 1.0
 * @since 11/01/2020
 * ***********************************************************************************************
 */

package com.bridgelabz.basicprogram;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.bridgelabz.util.Utility;

public class UserInput {

	public static void main(String[] args) {
		String result;
	  Logger logger = Logger.getLogger(UserInput.class.getName());
	  System.out.println("Enter the input : ");
	  if((result = Utility.validatingInputforUserInput()) != null) {
		  logger.log(Level.INFO,"Hello <<"+result+">>, How are you?");
	  }else {
		  logger.log(Level.WARNING,"! Invalid Input");
	  }
	}

}