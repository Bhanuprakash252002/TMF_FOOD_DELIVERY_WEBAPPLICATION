package com.bhanu.foodpro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class RestaurantDAO {
	public static ArrayList<RestaurantDto> getlist() {
		ArrayList<RestaurantDto> res = new ArrayList<>();
		try {
			Connection con = Jdbc.getCon();
			String query = "select * from restaurantdetails";
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				RestaurantDto bean = new RestaurantDto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getFloat(13),rs.getString(14),rs.getString(15));
				res.add(bean);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return res;
	}


}
