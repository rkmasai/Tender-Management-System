package com.project.usecases;

import java.util.ArrayList;
import java.util.List;

import com.project.dao.TanderDao;
import com.project.dao.TanderDaoImpl;
import com.project.exception.TanderException;
import com.project.model.Tander;

	public class DetailsOfAllTender {
	
	public static void main(String[] args) {
		
		List<Tander> td = new ArrayList<>();
		
		TanderDao dao = new TanderDaoImpl();
		
	try {
		td = dao.getAllTendor();
		if(td.size() >0 ) {
			td.forEach(s -> System.out.println(s.toString()));
		}
		else
		{
			System.out.println("Not Tender Details Found");
		}		
	} catch (TanderException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		
	}

}
