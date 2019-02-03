<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results</title>
</head>
<body>
	<p> Your results are below: <br />
	<br />  
		Weight:  ${calcResults.getWeight()} <br /> 
		Height:  ${calcResults.getHeight()} <br />
		BMI:     ${calcResults.getBmi()} <br />
	</p>
	<a href="index.jsp">Calculate again</a>
</body>
</html>