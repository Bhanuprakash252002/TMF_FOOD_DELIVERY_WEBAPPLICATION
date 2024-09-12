package com.bhanu.foodpro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class FoodItemsDAO {
	
	public static int setFoodItems(int foodid, int resid, String foodname, int price, String imgurl, String fooddescription,String Nonveg,String veg, int cusinsid )
	{
		int success=0;
		try
		{
			Connection con =Jdbc.getCon();
			PreparedStatement ps=con.prepareStatement("insert into restuarant_menu values(?,?,?,?,?,?,?,?,?)");
			ps.setInt(1, foodid);
			ps.setInt(2, resid);
			ps.setString(3, foodname);
			ps.setInt(4,price);
			ps.setString(5, imgurl);
			ps.setString(6, fooddescription);
			ps.setString(7, Nonveg);
			ps.setString(8, veg);
			ps.setInt(9, cusinsid);
			success=ps.executeUpdate();
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return success;
	}

	public static ArrayList<FoodItemsDTO> getlist() {
		ArrayList<FoodItemsDTO> menu = new ArrayList<>();
		try {
			Connection con = Jdbc.getCon();
			String query = "select * from restuarant_menu";
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				FoodItemsDTO bean = new FoodItemsDTO(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4),
						rs.getString(5), rs.getString(6), rs.getString(7),rs.getString(8),rs.getInt(9));
				menu.add(bean);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return menu;
	}
}
