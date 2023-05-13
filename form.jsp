<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="Controller">
	
	<label>Dividendo:</label>
	<input type="number" name="dividendo">
	<label>Divisor:</label>
	<input type="number" name="divisor">
	<input type="submit" value="Calcular">
	
	</form>
	
	<p>${errorMessage}</p>
    <p>${resultMessage}</p>

</body>
</html>