package com.project.usecases;

import java.util.Scanner;

import com.project.dao.TanderDao;
import com.project.dao.TanderDaoImpl;
import com.project.exception.TanderException;
import com.project.exception.VendorException;


public class AddVendorToTander {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Vendor id : ");
		int id = sc.nextInt();
		
		System.out.println("Enter Tander tid : ");
		int tid = sc.nextInt();
		
		TanderDao dao = new TanderDaoImpl();
	try {
	String result =	dao.erollVendorToTander(id, tid);
	
	System.out.println(result);
	
	} catch (TanderException e) {
		e.printStackTrace();
	} catch (VendorException e) {
		
		e.printStackTrace();
	}	
	}
}
