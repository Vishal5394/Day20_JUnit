package com.BridgeLabz.Junit;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserValidater {
	
	public void validateName(String name){
        Pattern pattern=Pattern.compile("^[A-Z][a-zA-Z]{2,}");
        boolean matches = pattern.matcher(name).matches();
        if (matches){
            System.out.println(name+" is valid");
        }else
            System.out.println(name+" is not valid");
	  }
	  public void validateEmail(String email){
	        Pattern pattern=Pattern.compile("^[a-zA-Z0-9]+([._-[+]][a-zA-Z0-9]+)*@([a-z1-9]+)([.][a-z]*)?(\\.[a-z]{2,})$");
	        boolean isValid = pattern.matcher(email).matches();
	        if (isValid){
	            System.out.println("email is valid => "+email);
	        }
	        else
	            System.out.println("email is not valid => "+email);
	    }
	public static void main(String[] args) {
		UserValidater regex=new UserValidater();
	    Scanner scanner=new Scanner(System.in);
	    System.out.println("Enter first name :");
	    String firstName=scanner.next();
	    regex.validateName(firstName);
	    

        System.out.println("\n Enter last name: ");
        String lastName=scanner.next();
        regex.validateName(lastName);
        
        System.out.println("Enter email: ");
        String email=scanner.next();
        regex.validateEmail(email);
 }
	}


