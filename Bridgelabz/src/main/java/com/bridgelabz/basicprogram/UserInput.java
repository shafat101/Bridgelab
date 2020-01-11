/******************************************
 * purpose : To take  User Input and Replace String Template “Hello <<UserName>>, How are you?”  
 * @author SHAFAT BASHIR
 * @version 1.0
 * @since 09/01/2020
 */

package com.bridgelabz.basicprogram;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.bridgelabz.util.Utility;

public class UserInput {

	public static void main(String[] args) {
		
	  Logger logger = Logger.getLogger(UserInput.class.getName());
	  String userName;
	  if(((userName = Utility.scannerString() ) != null) && userName.length() >= 3) {
		  logger.log(Level.INFO, userName);
	  }else {
		  logger.log(Level.WARNING, "! Invalid UserName ");
	  }
	  
	}

}