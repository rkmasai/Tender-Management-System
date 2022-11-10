package com.project.dao;

import com.project.exception.TanderException;
import com.project.model.Tander;

public interface TanderDao {
	
	public String addTenderDetails(Tander tendor) throws TanderException; 

	
		
}
