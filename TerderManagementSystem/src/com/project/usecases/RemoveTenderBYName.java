package com.project.usecases;

import java.util.Scanner;

import com.project.dao.TanderDao;
import com.project.dao.TanderDaoImpl;
import com.project.exception.TanderException;

public class RemoveTenderBYName {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Tender name you Want to remove");
		String st = sc.next();
		
		TanderDao td = new TanderDaoImpl();
		
		try {
		String result = 	td.DeleteTByN(st);
			System.out.println(result);
		} catch (TanderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
