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
<!-- 						<input type="image" src="./img/main.PNG" height="250" width="380" value="2001" name="main"/> -->
					<a href="${pageContext.request.contextPath}/main?action=selectFacility&buildingCd=2001">
						<img alt="" src="./img/main.PNG" height="250" width="380">
					</a>
					<a href="${contextPath}/main?action=selectFacility&buildingCd=2004">
						<img alt="" src="./img/computer.PNG" height="250" width="380">
					</a>
					<a href="${contextPath}/main?action=selectFacility&buildingCd=2005">
						<img alt="" src="./img/engineering.PNG" height="250" width="380">
					</a>
				</div>                                
				<div ID="second">
					<a href="${contextPath}/main?action=selectFacility&buildingCd=2002">
						<img alt="" src="./img/humanity.PNG" height="250" width="380">                     
					</a>
					<a href="${contextPath}/main?action=selectFacility&buildingCd=2003">	
						<img alt="" src="./img/nature.PNG" height="220" width="260">   
					</a>
					<a href="${contextPath}/main?action=selectFacility&buildingCd=2006">	
						<img alt="" src="./img/outFac.PNG" height="220" width="260">
					</a>
					<img alt="" src="./img/facInfo.PNG" height="220" width="260">
<!-- 						<input type="image" src="./img/facInfo.PNG" height="220" width="260"/> -->
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