<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <table>
    	<tr>
    		<th>
    		<div>
    		안녕하세요! ${custId}
    		<button id="jjoin" type="button" value="LOGOUT" onclick="location.href='MainPage.jsp'"> LOGOUT</button>
    		<button id="jjoin" type="button" value="MYPAGE" onclick="location.href='adminStatus'">MYPAGE</button>
    		<button id="jjoin" type="button" value="講義場管理" onclick="location.href='adminFacUpdate'">講義場管理</button>
    		</div>
    		</th>
    	</tr>
    	</table>
</body>
</html>