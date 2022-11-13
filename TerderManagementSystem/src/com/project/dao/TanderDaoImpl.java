package com.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.project.exception.TanderException;
import com.project.exception.VendorException;
import com.project.model.Tander;
import com.project.utility.DBUtility;

public class TanderDaoImpl implements TanderDao {

	@Override
	public String addTenderDetails(Tander tendor) throws TanderException {
		
		String message = "Not Registered";
		
		try (Connection conn = DBUtility.provideConnection()) {
			
		PreparedStatement ps = conn.prepareStatement("insert into Tander (tname, price, place, duration)  values(?,?,?,?)");
			
		ps.setString(1, tendor.getTnmae());
		ps.setInt(2, tendor.getPrice());
		ps.setString(3, tendor.getPlace());
		ps.setString(4, tendor.getDuration());
		
		int x = ps.executeUpdate();
		if(x > 0)
		{
			message = "Register sucessfully";
		}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new TanderException(e.getMessage());
		}
		return message;
	}

	@Override
	public String DeleteTByN(String name) throws TanderException {
		String message ="Not found";
		
		try(Connection conn = DBUtility.provideConnection()) {
			
	PreparedStatement ps = conn.prepareStatement("DELETE FROM Tander where tname = ? ");
	
	ps.setString(1, name);
	
	int x = ps.executeUpdate();
	
	if(x >0) {
		message = " Delete On Record  ";
	}		
		} catch (SQLException e) {	
			e.printStackTrace();
			
			throw new TanderException(e.getMessage());
		}
		
		return message;
	}

	@Override
	public List<Tander> getAllTendor() throws TanderException {
		List<Tander> td = new ArrayList<>();
		
		try (Connection conn = DBUtility.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from Tander");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int i = rs.getInt("tid");
				String n = rs.getString("tname");
				int p = rs.getInt("price");
				String pl = rs.getString("place");
				String d = rs.getString("duration");
				Tander ten = new Tander(i, n, p, pl, d);
				td.add(ten);
			}	
		}
		catch(SQLException e) {
			e.printStackTrace();
			throw new TanderException("No Details Found");
		}
		return td;
	}

	@Override
	public String erollVendorToTander(int id, int tid) throws TanderException, VendorException {
		String message = "Not Enrolled";
		
		try(Connection conn = DBUtility.provideConnection()) {
			PreparedStatement ps1 = conn.prepareStatement(" select * from vendor where id = ? ");
		
		ps1.setInt(1, id);		
		ResultSet rs = ps1.executeQuery();		
		if(rs.next()) {			
			PreparedStatement ps2 = conn.prepareStatement("select * from tander where tid = ? ");
			ps2.setInt(1, tid);
		ResultSet rs2 =	ps2.executeQuery();
		
		
		if(rs2.next()) {		
	PreparedStatement ps3 =	conn.prepareStatement("insert into contract values(?, ?)");		
	ps3.setInt(1, id);
	ps3.setInt(2, tid);
	
	int x = ps3.executeUpdate();
	
	if(x> 0)
	{
		message = "vendor Enrolled Sucessfully";
	}	
		}else
		{
			throw new TanderException("invalid tander  tid =  "+ tid);
		}	
	}
		else
			throw new VendorException("vendor does not with id "+ id);	
		} catch (Exception e) {
			e.printStackTrace();
			throw new TanderException(e.getMessage());
		}
		return message;
	}

}
