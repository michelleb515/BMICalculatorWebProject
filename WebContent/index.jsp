<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to the BMI Calculator</title>
</head>
<body>
	<h1>BMI Calculator</h1>
	<p>Please select an option:</p>
	<form action="getBMIServlet" method="post">
		    <input type="radio" name="calcType" value="bmi" checked> Calculate BMI given a weight and height<br>
			<input type="radio" name="calcType" value="weight"> Calculate ideal weight given a height and BMI<br><br>
			<input type="submit" value="Submit">
	</form>
</body>
</html>