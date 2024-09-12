<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AddingFoodItems</title>
</head>
<body>
	<div id="Menu" style="text-align:center">
		<h1>Add Food Items</h1>
		<form action="AddingFoodItems"method="post">
			Enter Food Id:<input type="number" name="foodid" required/><br><br>
			Enter Food name:<input type="text" name="foodname" required/><br><br>
			Enter Price Per Quantity :<input type="number" name="price" required/><br><br>
			Enter Food Image Url:<input type="text" name="imgurl" required/><br><br>
			Enter Food Description:<input type="text" name="fooddescription" required/><br><br>
			Enter Food Veg or Non Veg: veg<input type="radio" name="foodtype"value="Veg" required/>
			 Non-veg<input type="radio" name="foodtype" value="Non-veg" required/><br><br>
			Enter cusins Id:<input type="number" name="cusinsid" required/><br><br>
			<input type="submit" value="submit"/>
		</form>
	</div>

</body>
</html>