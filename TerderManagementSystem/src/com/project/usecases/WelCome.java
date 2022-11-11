package com.project.usecases;

import java.util.Scanner;

import com.project.dao.VenderDao;
import com.project.dao.VenderDaoImpl;
import com.project.exception.VendorException;
import com.project.model.Tander;
import com.project.model.Vandor;

public class WelCome {
	
	public static void main(String[] args) {
		
		System.out.println("====================================");
		System.out.println("||  	Tender Manager System     ||");
		System.out.println("||                                ||");
		System.out.println("=====================================");
		
		
		
		while(true) {
			
			Scanner sc = new Scanner(System.in);
			Display ds = new Display();
			ds.displayInterface();
			System.out.println("Enter number From Above");
			String dat = sc.next();
			int data = Integer.parseInt(dat);
		
		if(data == 1) {
			SignInVender s = new SignInVender();
				try {
					s.main(args);
				} catch (VendorException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		else if (data == 2) {	
			
			System.out.println("-------------------------------------------------");
			System.out.println(" Enter Admin UserName");
			String user = sc.next();
			System.out.println("Enter Admin Password");
			String pass = sc.next();
			
			while (user.equals("admin") &&  pass.equals("password")) {
				
				System.out.println("====================================");
				System.out.println("|| 1 Add Tender                   ||");
				System.out.println("|| 2 Remove Tender                ||");
				System.out.println("|| 3 See All Tender               ||");
				System.out.println("|| 4 Back                         ||");
				System.out.println("|| 5 exit                         ||");
				System.out.println("=====================================");
				
				System.out.println("Enter Number from Above");
				String st  = sc.next();
				
				int t = Integer.parseInt(st);
				
				if(t == 1) {
					AddTander td = new AddTander();
					td.main(args);
				}
				else if(t == 2) {
					
					RemoveTenderBYName td = new RemoveTenderBYName();
					td.main(args);
				}
				else if(t == 3) {
					
					DetailsOfAllTender da = new DetailsOfAllTender();
					da.main(args);
				}
				else if (t == 4) {
					continue;
				}
				else if(t == 5)
				{
					break;
				}
				else
				{
					System.out.println("Enter Valid Details");
				}
			}	
		}
		else if (data == 3) {
			
			System.out.println("Register of Vender");
			
			AddVendor av = new AddVendor();
			av.main(args);
		}
		else if (data == 4) {
			break;
		}
		else
		{
			System.out.println("Check Above and Enter Correct Number");
		}
	}
		System.out.println("Thank You  To Visting ");
		
	}
	

}
