<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>


<body>

<form name="form1" method="get" action=test>
<br><br>
<table align="center"><tr><td><h2>Login Authentication</h2></td></tr></table>
<table width="400px" align="center" style="border:1px solid #000000;background-color:#efefef;">
<tr><td colspan=2></td></tr>
<tr><td colspan=2>&nbsp;</td></tr>
	<tr>
		<td><b>User Id</b></td>
		<td><input type="text" id="us" name="userName" value="${user_name}"><label><b style="color:red">${user_name}</b></label></td>
	</tr>
	<tr>
		<td><b>Password</b></td>
		<td><input type="password" id="ps" name="password" value=""><label><b style="color:red">${pass_word}</b></label></td>
	</tr>
	
	<tr>
		<td><b>Source IP</b></td>
		<td><input type="sourceIp" id="sip" name="sourceIp" value="${source_Ip}"><label><b style="color:red">${source_Ip}</b></label></td>
	</tr>
	
	<tr>
		<td></td>
		<td><input type="submit" name="Submit" value="Submit"></td>
	</tr>
	<tr><td colspan=2>&nbsp;</td></tr>
</table>
</form>
<br/>
<br/>
<table align="center" border="0" cellpadding="10" >
<tr>
<th  bgcolor="lightblue"><a href="indexPost.jsp"> Login Authentication Post Method </a></th>
</tr>
</table>
</body>
</html>