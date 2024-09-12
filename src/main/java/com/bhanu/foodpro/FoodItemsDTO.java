package com.bhanu.foodpro;

public class FoodItemsDTO {
	int foodid;
	int resid;
	String foodname;
	int price;
	String imgurl;
	String fooddescription;
	String nonveg;
	String veg;
	int cusinsid;
	public FoodItemsDTO(int foodid, int resid, String foodname, int price, String imgurl, String fooddescription,
			String nonveg, String veg, int cusinsid) {
		super();
		this.foodid = foodid;
		this.resid = resid;
		this.foodname = foodname;
		this.price = price;
		this.imgurl = imgurl;
		this.fooddescription = fooddescription;
		this.nonveg = nonveg;
		this.veg = veg;
		this.cusinsid = cusinsid;
	}
	public int getFoodid() {
		return foodid;
	}
	public void setFoodid(int foodid) {
		this.foodid = foodid;
	}
	public int getResid() {
		return resid;
	}
	public void setResid(int resid) {
		this.resid = resid;
	}
	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public String getFooddescription() {
		return fooddescription;
	}
	public void setFooddescription(String fooddescription) {
		this.fooddescription = fooddescription;
	}
	public String getNonveg() {
		return nonveg;
	}
	public void setNonveg(String nonveg) {
		this.nonveg = nonveg;
	}
	public String getVeg() {
		return veg;
	}
	public void setVeg(String veg) {
		this.veg = veg;
	}
	public int getCusinsid() {
		return cusinsid;
	}
	public void setCusinsid(int cusinsid) {
		this.cusinsid = cusinsid;
	}

	
	
}
