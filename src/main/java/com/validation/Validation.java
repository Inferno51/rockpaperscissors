package com.validation;

public class Validation {
	
	 public static boolean oppNumber(String numChosen) {

	       try {

	           int isValid = Integer.parseInt(numChosen);
	           if ((isValid < 0) || (isValid > 3)) {
	               System.out.println("You did not enter a number between 1 and 3. Please try again!");
	        	   return true;
	           }
	           
	           return false;
	       }

	       catch (NumberFormatException e) {
	    	   return true;
	       }

	   }

	   
	   public static boolean userThrow(int throwChoice) {

	       try {

	           if ((throwChoice < 0) || (throwChoice > 6)) {
	               return true;
	           }
	           return false;
	       }

	       catch (NumberFormatException e) {
	           return true;
	       }

	   }
	}