package com.project.dao;

import java.util.List;


import com.project.exception.TanderException;
import com.project.exception.VendorException;
import com.project.model.Tander;

public interface TanderDao {
	
	public String addTenderDetails(Tander tendor) throws TanderException; 
	
	public String DeleteTByN(String name ) throws TanderException;
	
	public List<Tander> getAllTendor() throws TanderException;
	
	public String erollVendorToTander(int id, int tid) throws TanderException, VendorException;

	
		
}
