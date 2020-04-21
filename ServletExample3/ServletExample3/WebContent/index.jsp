<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="UserController" method="post">
		<table align="center">
			<tr>
			<td>UserID</td>
			<td><input type="text" name="t1"></td>
			</tr>
			<tr>
			<td>UserName</td>
			<td><input type="text" name="t2"></td>
			</tr>
			<tr>
			<td>Password</td>
			<td><input type="password" name="t3"></td>
			</tr>
			<tr>
			<td>UserType</td>
			<td>
				<select name="t4">
					<option value="A">Admin
					<option value="C">Customer
					<option value="H">Hr
				</select>
			</td>
			</tr>
		<tr><td><input type="submit" value="Submit"></td></tr>
		<tr><td>${data}</td></tr>
		</table>
	</form>
</body>
</html>





