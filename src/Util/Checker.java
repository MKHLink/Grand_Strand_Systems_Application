package Util;

import java.util.Date;

public class Checker {
	 public static void dataChecker(String data){
	        if(data.length()>10 || data.equals(null)){
	            throw new IllegalArgumentException("Invalid Data");
	        }
	    }

	    public static void addressChecker(String data){
	        if(data.length()>30 || data.equals(null)){
	            throw new IllegalArgumentException("Invalid Data");
	        }
	    }

	    public static void phoneChecker(String data){
	        if(data.length()!=10 || data.equals(null)){
	            throw new IllegalArgumentException("Invalid Data");
	        }
	    }
	    
	    public static void objectChecker(String data){
	        if(data.length()>20 || data.equals(null)){
	            throw new IllegalArgumentException("Invalid Data");
	        }
	    }
	    
	    public static void descriptionChecker(String data){
	        if(data.length()>50 || data.equals(null)){
	            throw new IllegalArgumentException("Invalid Data");
	        }
	    }
	    
	    public static void dateChecker(Date date) {
	    	if(date.before(new Date()) || date.equals(null)){
	    		throw new IllegalArgumentException("Invalid Date");
	    	}
	    }
}
