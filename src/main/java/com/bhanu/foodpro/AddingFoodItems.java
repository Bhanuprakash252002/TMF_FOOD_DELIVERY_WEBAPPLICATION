package com.bhanu.foodpro;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class AddingFoodItems
 */
public class AddingFoodItems extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddingFoodItems() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int foodid=Integer.parseInt(request.getParameter("foodid"));
		String foodname=request.getParameter("foodname");
		int price=Integer.parseInt(request.getParameter("price"));
		String imgurl=request.getParameter("imgurl");
		String fooddescription=request.getParameter("fooddescription");
		String foodtype=request.getParameter("foodtype");
		int cusinsid=Integer.parseInt(request.getParameter("cusinsid"));
		HttpSession hs=request.getSession();
		int res_id=(int)hs.getAttribute("resid");
		String veg="";
		String Nonveg="";
		if(foodtype.equals("Veg"))
		{
			veg="yes";
			Nonveg="no";
		}
		else
		{
			veg="no";
			Nonveg="yes";
		}
		PrintWriter pw=response.getWriter();
		int success=FoodItemsDAO.setFoodItems(foodid, res_id, foodname, price, imgurl, fooddescription, Nonveg,veg, cusinsid);
		if(success>0)
		{
			response.setContentType("text/html");
			pw.println("<h1 style='text-align:center'>Succesfully Inserted</h1>");
			RequestDispatcher rd=request.getRequestDispatcher("AddingFoodItems.jsp");
			rd.include(request, response);
		}
		else
		{
			response.setContentType("text/html");
			pw.println("<h1 style='text-align:center'> Failed To Insert</h1>");
			RequestDispatcher rd=request.getRequestDispatcher("AddingFoodItems.jsp");
			rd.include(request, response);
		}
		
	}

}
