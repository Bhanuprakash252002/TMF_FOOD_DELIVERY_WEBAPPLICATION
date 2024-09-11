package com.bhanu.foodpro;

public class RestaurantDto {
	int resid;
	String resName;
	String res_address;
	String res_loc;
	String res_openTime;
	String res_closeTime;
	String res_gstnum;
	String cusins;
	String contactnumber;
	String res_bankacc;
	String res_email;
	String pass;
	float avgrating;
	String res_order_status;
	String img;
	public int getResid() {
		return resid;
	}
	public void setResid(int resid) {
		this.resid = resid;
	}
	public String getResName() {
		return resName;
	}
	public void setResName(String resName) {
		this.resName = resName;
	}
	public String getRes_address() {
		return res_address;
	}
	public void setRes_address(String res_address) {
		this.res_address = res_address;
	}
	public String getRes_loc() {
		return res_loc;
	}
	public void setRes_loc(String res_loc) {
		this.res_loc = res_loc;
	}
	public String getRes_openTime() {
		return res_openTime;
	}
	public void setRes_openTime(String res_openTime) {
		this.res_openTime = res_openTime;
	}
	public String getRes_closeTime() {
		return res_closeTime;
	}
	public void setRes_closeTime(String res_closeTime) {
		this.res_closeTime = res_closeTime;
	}
	public String getRes_gstnum() {
		return res_gstnum;
	}
	public void setRes_gstnum(String res_gstnum) {
		this.res_gstnum = res_gstnum;
	}
	public String getCusins() {
		return cusins;
	}
	public void setCusins(String cusins) {
		this.cusins = cusins;
	}
	public String getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}
	public String getRes_bankacc() {
		return res_bankacc;
	}
	public void setRes_bankacc(String res_bankacc) {
		this.res_bankacc = res_bankacc;
	}
	public String getRes_email() {
		return res_email;
	}
	public void setRes_email(String res_email) {
		this.res_email = res_email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public float getAvgrating() {
		return avgrating;
	}
	public void setAvgrating(float avgrating) {
		this.avgrating = avgrating;
	}
	public String getRes_order_status() {
		return res_order_status;
	}
	public void setRes_order_status(String res_order_status) {
		this.res_order_status = res_order_status;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}

	public RestaurantDto(int resid, String resName, String res_address, String res_loc, String res_openTime,
			String res_closeTime, String res_gstnum, String cusins, String contactnumber, String res_bankacc,
			String res_email, String pass, float avgrating, String res_order_status, String img) {
		super();
		this.resid = resid;
		this.resName = resName;
		this.res_address = res_address;
		this.res_loc = res_loc;
		this.res_openTime = res_openTime;
		this.res_closeTime = res_closeTime;
		this.res_gstnum = res_gstnum;
		this.cusins = cusins;
		this.contactnumber = contactnumber;
		this.res_bankacc = res_bankacc;
		this.res_email = res_email;
		this.pass = pass;
		this.avgrating = avgrating;
		this.res_order_status = res_order_status;
		this.img = img;
	}
	@Override
	public String toString() {
		return "RestaurantDto [resid=" + resid + ", resName=" + resName + ", res_address=" + res_address + ", res_loc="
				+ res_loc + ", res_openTime=" + res_openTime + ", res_closeTime=" + res_closeTime + ", res_gstnum="
				+ res_gstnum + ", cusins=" + cusins + ", contactnumber=" + contactnumber + ", res_bankacc="
				+ res_bankacc + ", res_email=" + res_email + ", pass=" + pass + ", avgrating=" + avgrating
				+ ", res_order_status=" + res_order_status + ", img=" + img + "]";
	}
	

}
