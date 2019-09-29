<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>시설예약 페이지</title>
<link rel="stylesheet" type="text/css" href="${contextPath}/css/style.css"/>
</head>
<body>
<form action="login_screen">

	<table>
	    <tr>
	         <td height="60px" colspan="4">
	            <div id="cloud" align="center">
	            	<p>予約システム</p>
	            </div>
	         </td>
	   </tr>
	      <tr>
	         <td></td>
	      <td></td>
	      <td align="center">
	            <img width="200" height="200" src="${contextPath}/img/main.PNG"/>
	      </td>
	      <td>
	         <ul>
	            <li>건물 정보</li>
	            <li>수용 인원</li>
	            <li>시설장비 유무 </li>
	         </ul>
	      </td>
	   </tr>
	</table>
	<table class="table table-hover">
	
	   <thead>
	      <tr>
	         <td>선택</td>
	         <td>시간</td>
	         <td>내용</td>
	         <td>확인</td>
	      </tr>
	   </thead>
	   <tbody>
	      <tr>
	         <td><input type="checkbox" name="06시~07시" value=""></td>
	         <td>06시~07시</td>
	         <td>-</td>
	         <td>신청가능</td>
	<!--          <td>예약불가</td> -->
	      </tr>
	      <tr>
	         <td><input type="checkbox" name="07시~08시" value=""></td>
	         <td>07시~08시</td>
	         <td>-</td>
	         <td>신청가능</td>
	<!--          <td>예약불가</td> -->
	      </tr>
	      <tr>
	         <td><input type="checkbox" name="08시~09시" value=""></td>
	         <td>08시~09시</td>
	         <td>-</td>
	         <td>신청가능</td>
	<!--          <td>예약불가</td> -->
	      </tr>
	      <tr>
	         <td><input type="checkbox" name="09시~10시" value=""></td>
	         <td>09시~10시</td>
	         <td>-</td>
	         <td>신청가능</td>
	<!--          <td>예약불가</td> -->
	      </tr>
	      <tr>
	         <td><input type="checkbox" name="10시~11시" value=""></td>
	         <td>10시~11시</td>
	         <td>-</td>
	         <td>신청가능</td>
	<!--          <td>예약불가</td> -->
	      </tr>
	      <tr>
	         <td><input type="checkbox" name="11시~12시" value=""></td>
	         <td>11시~12시</td>
	         <td>-</td>
	         <td>신청가능</td>
	<!--          <td>예약불가</td> -->
	      </tr>
	      <tr>
	         <td><input type="checkbox" name="12시~13시" value=""></td>
	         <td>12시~13시</td>
	         <td>-</td>
	         <td>신청가능</td>
	<!--          <td>예약불가</td> -->
	      </tr>
	      <tr>
	         <td><input type="checkbox" name="13시~14시" value=""></td>
	         <td>13시~14시</td>
	         <td>-</td>
	         <td>신청가능</td>
	<!--          <td>예약불가</td> -->
	      </tr>
	      <tr>
	         <td><input type="checkbox" name="14시~15시" value=""></td>
	         <td>14시~15시</td>
	         <td>-</td>
	         <td>신청가능</td>
	<!--          <td>예약불가</td> -->
	      </tr>
	      <tr>
	         <td><input type="checkbox" name="15시~16시" value=""></td>
	         <td>15시~16시</td>
	         <td>-</td>
	         <td>신청가능</td>
	<!--          <td>예약불가</td> -->
	      </tr>
	      <tr>
	         <td><input type="checkbox" name="16시~17시" value=""></td>
	         <td>16시~17시</td>
	         <td>-</td>
	         <td>신청가능</td>
	<!--          <td>예약불가</td> -->
	      </tr>
	      <tr>
	         <td><input type="checkbox" name="17시~18시" value=""></td>
	         <td>17시~18시</td>
	         <td>-</td>
	         <td>신청가능</td>
	<!--          <td>예약불가</td> -->
	      </tr>
	      <tr>
	         <td><input type="checkbox" name="18시~19시" value=""></td>
	         <td>18시~19시</td>
	         <td>-</td>
	         <td>신청가능</td>
	<!--          <td>예약불가</td> -->
	      </tr>
	      <tr>
	         <td><input type="checkbox" name="19시~20시" value=""></td>
	         <td>19시~20시</td>
	         <td>-</td>
	         <td>신청가능</td>
	<!--          <td>예약불가</td> -->
	      </tr>
	      <tr>
	         <td colspan="4" align="center">
	               <button id="join" onclick="GoSubmit()">신청</button>
	               <!-- onclick="location.href='MainPage.html'" -->
	         </td>
	      </tr>
	
	     <tr>
	         <td id="trash "height="66px" colspan="4"><br />
	            <div style="float: left;">
	               <img src="../img/logo.jpg" width="20">
	               <font face="글꼴" color="gray" size="2">copyright &copy; 청해진 시설예약 시스템 2019 by 청해진</font>
	            <hr />
	            </div>
	          </td>
	     </tr>
	
	</table>
</form>
<script>
var myIndex = 0;
carousel();

function carousel() {
  var i;
  var x = document.getElementsByClassName("mySlides");
  for (i = 0; i < x.length; i++) {
    x[i].style.display = "none";
  }
  myIndex++;
  if (myIndex > x.length) {myIndex = 1}
  x[myIndex-1].style.display = "block";
  setTimeout(carousel, 3500);
}
</script>
</body>
</html>