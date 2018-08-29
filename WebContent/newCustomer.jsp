<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	<body>
	
		<form action="newCustomer" method="post">
			Customer Name: <input type="text" name="customer_name"><br>
			Delivery Number: <input type="text" name="delivery_number"><br>
			Product: <input type="text" name="product"><br>
			Price: <input type="text" name="price"><br>
			<input type="submit" value="Add a new order">
		</form>
	
	</body>
</html>