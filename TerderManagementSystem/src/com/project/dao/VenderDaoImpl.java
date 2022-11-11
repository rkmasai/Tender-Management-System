package com.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.project.exception.VendorException;
import com.project.model.Vandor;
import com.project.utility.DBUtility;

public class VenderDaoImpl implements VenderDao{

	

	@Override
	public Vandor signInVender(String username, String password) throws VendorException {
		Vandor  ven = null;
		
		
		try(Connection conn = DBUtility.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select * from vender where email = ? AND password = ? ");
			
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				int i = rs.getInt("vid");
				String n = rs.getString("name");
				String a = rs.getString("address");
				String e = rs.getString("email");
				String p = rs.getString("password");
				ven = new Vandor(n, a, e, p );			
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		
		
		return ven;
	}

	@Override
	public String registerVender(Vandor vandor) throws VendorException {
		String message = "Not Registered";
		
		try (Connection conn = DBUtility.provideConnection()) {
			
		PreparedStatement ps = conn.prepareStatement("insert into vendor (name, address, email, password)  values(?,?,?,?)");
			
		ps.setString(1, vandor.getName());
		ps.setString(2, vandor.getAddress());
		ps.setString(3, vandor.getEmail());
		ps.setString(4, vandor.getPassword());
		
		int x = ps.executeUpdate();
		if(x > 0)
		{
			message = "Register sucessfully";
		}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new VendorException(e.getMessage());
		}
		return message;
	}

}
