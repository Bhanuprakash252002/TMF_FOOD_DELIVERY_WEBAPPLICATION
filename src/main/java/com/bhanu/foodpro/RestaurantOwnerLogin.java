package com.bhanu.foodpro;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class RestaurantOwnerLogin
 */
public class RestaurantOwnerLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RestaurantOwnerLogin() {
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
		int resId=Integer.parseInt(request.getParameter("resid"));
		String respass=request.getParameter("respass");
		PrintWriter pw=response.getWriter();
		ArrayList<RestaurantDto> resdetails=RestaurantDAO.getlist();
		int success=0;
		for(RestaurantDto res:resdetails)
		{
			if(res.getResid()==resId&&res.getPass().equals(respass))
			{
				success=1;
				HttpSession hs=request.getSession();
				hs.setAttribute("resid", resId);
				RequestDispatcher rd=request.getRequestDispatcher("AddingFoodItems.jsp");
				rd.forward(request, response);
			}
		}
		if(success==0)
		{
			response.setContentType("text/html");
			pw.println("<h1 style='text-align:center'>Your Id And Password are incorrect</h1>");
			RequestDispatcher rd=request.getRequestDispatcher("RestaurantOwnerLogin.jsp");
			rd.include(request, response);
		}
			
	}

}
