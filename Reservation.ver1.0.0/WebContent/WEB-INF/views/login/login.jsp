<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${contextPath}main?action=login" method="post">
	
       
       <div style="float: right;"> 
       ID : 
       			<input type="text" name="userId" size="10" required="required"/>
      
       Password : 
       			<input type="password" name="password" size="10" required="required"/> &nbsp;
				<input type="submit" value="LOGIN" />
				
   		   <button type="button"  value="JOIN" onclick="location.href='join'">JOIN</button>

       <a rel=""><button type="button"  value="ID/PW 찾기"> ID/PW 찾기&nbsp;</button></a>
<!--    <input type="submit" value="LOGOUT" /> &nbsp; -->
<!--    <input type="button" value="마이페이지"> &nbsp; -->
      </div>  
      

</form>
</body>
</html>