<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to the Java EE World</title>
</head>
<body>
	<h1>Calcuate Weight</h1>
	<form action="CalcWeightServlet" method="post">
		Enter target BMI: 
		<input type="text" name="bmi" size="10"> <br>
		Enter height in inches: 
		<input type="text" name="height" size="10"> <br><br>
		<input type="submit" value="Calculate" />
	</form>
</body>
</html>