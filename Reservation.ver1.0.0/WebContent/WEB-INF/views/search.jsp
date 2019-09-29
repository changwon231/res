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

	<form action="${pageContext.request.contextPath}/res?action=searchFacility" method="post">
		<select name="buildingCd">
			<option value="">==목록==</option>
			<c:forEach var="code" items="${requestScope.facilityCodes}">
				<option value="${code.code }">${code.codeVal}</option>
<!-- 			<option value="2001">본관</option> -->
<!-- 			<option value="2002">공학관</option> -->
<!-- 			<option value="2003">인문관</option> -->
<!-- 			<option value="2004">야외시설</option> -->
			</c:forEach>
		</select>


		<select name="facType">
			<option value="">==목록==</option>
			<c:forEach var="code" items="${requestScope.placeCodes}">
				<option value="${code.code}">${code.codeVal}</option>
			</c:forEach>
<!-- 			<option value="3001">세미나실</option> -->
<!-- 			<option value="3002">강의실</option> -->
<!-- 			<option value="3003">회의실</option> -->
<!-- 			<option value="3004">대강당</option> -->
		</select>


		<select name="peopleLmCd">
			<option value="">==목록==</option>
			<c:forEach var="code" items="${requestScope.limitCodes}">
				<option value="${code.code}">${code.codeVal}</option>
			
			</c:forEach>
<!-- 			<option value="4001">5인</option> -->
<!-- 			<option value="4002">10인</option> -->
<!-- 			<option value="4003">40인</option> -->
<!-- 			<option value="4004">100인</option> -->
		</select>

	<input type="submit" value="검색"/>
	</form>
</body>
</html>