package com.project.usecases;

import java.util.Scanner;

import com.project.dao.VenderDao;
import com.project.dao.VenderDaoImpl;
import com.project.exception.VendorException;
import com.project.model.Vandor;

public class AddVendor {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Vendor name");
		String name = sc.next();
		
		System.out.println("Enter Vendor Address");
		String Address = sc.next();
		
		System.out.println("Enter Vendor email");
		String email = sc.next();
		
		System.out.println("Enter Vendor Password");
		String password = sc.next();
		
		Vandor v = new Vandor(name, Address, email, password);
		
		VenderDao dao = new VenderDaoImpl();
		
		try {
		String mess = dao.registerVender(v);
			
		System.out.println(mess);
			
		} catch (VendorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
