package com.email;

import java.util.regex.*;    
import java.util.*;  
public class EmailValidation1 {
	
	    public static void main(String args[]){  
	        ArrayList<String> emails = new ArrayList<String>();  
	        emails.add("saud@gmail.co.in");  
	        emails.add("jenny@gmail.com");  
	        emails.add("sk.saud@gmail.com");  
	        emails.add("jenny123@gmail.co.in");  
	        emails.add("loren#@gmail.com");   
	         
	        emails.add("@yahoo.com");  
	        emails.add("xyz#gmail.com");  
	          
	        String regex = "^(.+)@(.+)$";  
	         
	        Pattern pattern = Pattern.compile(regex);  
	        
	        for(String email : emails){  
	           
	            Matcher matcher = pattern.matcher(email);  
	            System.out.println(email +" : "+ matcher.matches()+"\n");  
	        }  
	    }  
	}  

