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
로그인 한 아이디 : ${sessionScope.userId}

<c:if test="${empty sessionScope.userId}">
	<jsp:include page="/login"/>
</c:if> 
<c:if test="${not empty sessionScope.userId}">	
	<jsp:include page="/custpage"/>
</c:if>
		 
</body>
</html>