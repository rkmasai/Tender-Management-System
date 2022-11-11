package com.project.usecases;

import java.util.Scanner;

import com.project.dao.VenderDao;
import com.project.dao.VenderDaoImpl;
import com.project.exception.VendorException;
import com.project.model.Vandor;

public class SignInVender  {
	
	public static void main(String[] args) throws VendorException  {
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your UserName Or EmailID");
		String username = sc.next();
		
		System.out.println("Enter your password");
		String password = sc.next();
		
		VenderDao ven = new VenderDaoImpl();
		
		Vandor v = ven.signInVender(username, password);
		
		if(v!=null) {
			System.out.println(v.getName());
		}
		else
		{
			System.out.println("Please Register First");
		}
		
		
	
	}

}
