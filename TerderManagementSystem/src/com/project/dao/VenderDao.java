package com.project.dao;

import com.project.exception.VendorException;
import com.project.model.Vandor;

public interface VenderDao {
	
	public String registerVender(Vandor vandor) throws VendorException;
	
	public Vandor signInVender(String username, String password) throws VendorException;
	

}
