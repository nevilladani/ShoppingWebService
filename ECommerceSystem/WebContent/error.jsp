<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LOGIN</title>
<style type="text/css">
body{
text-align:center;
}
.header
{
	background-color: #3253A6;
	text-align:center;
	left-margin: 20dp;
	color: white;
}

</style>
<script language="javascript">

function validate_details()
{
        
        if (form2.user.value == ""|form2.user.value == " ")
        {
                alert ("Please enter the User ID.");
                form2.user.focus();
                return false;
        }
 
        if (form2.pass.value == ""|form2.pass.value == " ")
        {
                alert ("Please enter the Password.");
                form2.pass.focus();
                return false;
        }
        return true;
}
</script>

</head>
<body background="SignInBackground.jpg">
<div class ="header"><br>
	
	<H1>Welcome to AWSome E-Commerce</H1>
<br>
<hr></hr></div>
<form id="form2" method="post" action="login" onsubmit="return validate_details();">
<H4> Enter your id and password to login</H4>
<div class="form-row">
<table align="center">
<tr>
	<td><span class="label">User ID:</span></td><td><input type="text" name="user" /></td></tr>
<tr>
	<td><span class="label">Password:</span></td><td><input type="password" name="pass" /></td>
	</tr>
<tr>
	<td colspan="2"><input class="submit" type="submit" value="Log in"><br></td>
	</tr>
	
</table>
</div>
	</form>
	
	<H4 style="color:#E41A38"> Something went wrong. Maybe User Id or Password. Please enter em again.</H4>
<br>
	<img src="${pageContext.request.contextPath }/image/logo.png" align="center" >
</body>
</html>