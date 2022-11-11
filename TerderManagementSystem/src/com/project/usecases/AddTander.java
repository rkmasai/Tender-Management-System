package com.project.usecases;

import java.util.Scanner;

import com.project.dao.TanderDao;
import com.project.dao.TanderDaoImpl;
import com.project.exception.TanderException;
import com.project.model.Tander;

public class AddTander {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Tander name");
		String name = sc.next();
		
		System.out.println("Enter Tander Price");
		int fee= sc.nextInt();
		
		
		System.out.println("Enter Tander Place");
		String place = sc.next();
		
		System.out.println("Enter Course duration");
		String duration = sc.next();
		
		TanderDao dao = new TanderDaoImpl();
		
		Tander co = new Tander(name, fee, place, duration);
		
		try {
			
			String result = dao.addTenderDetails(co);
			
			System.out.println(result);
		} catch (TanderException e) {
			e.printStackTrace();
		}
		sc.close();
	}
	
	

}
