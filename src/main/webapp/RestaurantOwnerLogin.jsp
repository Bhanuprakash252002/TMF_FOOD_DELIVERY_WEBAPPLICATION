<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>RESTUARANT OWNER LOGIN PAGE</title>
</head>
<body>
	<div id="login" style="text-align:center">
		<h1>Restaurants Owner Login Page</h1>
		<form action="RestaurantOwnerLogin"method="post">
			Restaurants Id :<input type="number" name="resid" required/><br><br>
			Password : <input type="text" name="respass" required/><br><br>
			<input type="submit" value="submit"/>
		</form>
	</div>

</body>
</html>