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
	public static void main(String[] args) {
		UserValidater regex=new UserValidater();
	    Scanner scanner=new Scanner(System.in);
	    System.out.println("Enter first name :");
	    String firstName=scanner.next();
	    regex.validateName(firstName);
	    

        System.out.println("\n Enter last name: ");
        String lastName=scanner.next();
        regex.validateName(lastName);
 }
	}


