<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>listFacility</title>
</head>
<body>
<!-- form>table>(tr>th+td)*10 -->

<form action="${contentPath}main" method="get">
   <table>
      <tr>
         <td>건물 위치</td>
         <td>강의장 타입</td>
         <td>허용 인원</td>
         <td>예약 하기</td>
      </tr>
      <c:forEach var="facility" items="${requestScope.facilitys}">
      <tr>
         <td>${facility.codeVal}</td>
         <td>${facility.facNm}</td>
         <td>${facility.codeDesc}</td>
         <td><button type="button" id="delete" onclick="location.href='chooesFacility'">선택</button></td>
      </tr>
      </c:forEach>   
   </table>
</form>
</body>
</html>