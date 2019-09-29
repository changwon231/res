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
<form action="${contentPath}res" method="get">
	
	<table>
		<tr>
			<th colspan="2"> 건물 정보 보기</th>
			<td>강의장 위치</td>
			<td>강의장 타입</td>
			<td>허용 인원</td>
			<td>${faciiity.facNm}</td>
		</tr>
		<c:forEach var="facility" items="${requestScope.facilitys}">
		<tr>
			<td></td>
			<td>${facility.codeVal}</td>
			<td>${facility.codeNm}</td>
			<td>${facility.codeDesc}</td>
			<td>${faciiity.facNm}</td>
			<td>&nbsp;</td>
		</tr>
		</c:forEach>	
	</table>
</form>
</body>
</html>