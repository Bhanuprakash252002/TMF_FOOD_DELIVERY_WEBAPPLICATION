<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page
	import="com.bhanu.foodpro.RestaurantDAO,java.util.ArrayList,com.bhanu.foodpro.RestaurantDto"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BODY PAGE</title>
<link href="body.css" rel="stylesheet" type="text/css">
</head>
<body>
	<%
	ArrayList<RestaurantDto> resdetails = RestaurantDAO.getlist();
	%>
	<body>
    <div id="body">
        <%  
            // Iterate over the list of RestaurantDto objects
            for(RestaurantDto res:resdetails) {
                String imageUrl = "https://media-assets.swiggy.com/swiggy/image/upload/fl_lossy,f_auto,q_auto,w_660/" + res.getImg();
        %>
            <div class="restaurant-card">
                <img src="<%= imageUrl %>" alt="Restaurant Image"/>
                <h2><%= res.getResName() %></h2>
                <h2>Rating: <%= res.getAvgrating() %></h2>
                <p>Cuisine: <%= res.getCusins() %></p>
            </div>
        <% 
            }
        %>
    </div>
</body>
</html>


</body>
</html>