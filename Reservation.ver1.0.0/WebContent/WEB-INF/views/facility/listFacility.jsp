<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- form>table>(tr>th+td)*10 -->

<form action="${contentPath}main" method="get">
	<table>
		<tr>
			<th colspan="2"> 건물 정보 보기</th>
			<th>강의장 위치</th>
			<th>강의장 타입</th>
			<th>허용 인원</th>
			<th>호실</th>
		</tr>
		<c:forEach var="facility" items="${requestScope.facilitys}">
			<tr>
				<td>${facility.buildingCd}</td>
				<td>${facility.facType}</td>
				<td>${facility.peopleLmCd}</td>
				<td>${faciiity.facNm }</td>
				<td><button type="button" id="delete" onclick="location.href='chooesFacility'">선택</button></td>
			</tr>
		</c:forEach>	
	</table>
</form>

</body>
</html>