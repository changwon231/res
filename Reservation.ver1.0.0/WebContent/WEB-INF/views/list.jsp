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
<table>
	<tr>
    	<td height="100px" colspan="4">
    		<c:choose>
				<c:when test="${empty requestScope.content}">
					초기 화면입니다....
	      		<div ID="first">
					<%-- <a href="${pageContext.request.contextPath}/main?action=selectFacility"><input id="a" type="image" src="./img/본관.jpg" height="150" width="150" /></a> --%>
					<a href="${pageContext.request.contextPath}/res?action=selectFacility">
					<input type="image" src="./img/main.PNG" height="250" width="380" value="1001"/>
					<input type="image" src="./img/computer.PNG" height="250" width="380" value="1002"/>
					<input type="image" src="./img/engineering.PNG" height="250" width="380" value="1003"/>			
					</a>
				</div>                                
				<div ID="second">                     
					<input type="image" src="./img/humanity.PNG" height="220" width="260"/>
					<input type="image" src="./img/nature.PNG" height="220" width="260"/>
					<input type="image" src="./img/outFac.PNG" height="220" width="260"/>
					<input type="image" src="./img/facInfo.PNG" height="220" width="260"/>
	         	</div>
				</c:when>
				<c:otherwise>
					<jsp:include page="${content}"/>
				</c:otherwise>
			</c:choose>
		</td>
	</tr>
</table>
</body>
</html>