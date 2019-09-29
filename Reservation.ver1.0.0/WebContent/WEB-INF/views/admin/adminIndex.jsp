<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
    <html>
    <head>
    <meta charset="UTF-8">
    <title>강의장 예약 시스템 관리자 메인 페이지</title>
    <link rel="stylesheet" type="text/css" href="../css/style.css"/>
    </head>
    <body>

    <table>
    	<tr id="number1">
    		<th height="40px" colspan="6">
    		<div style="float: right;">
    			<jsp:include page="/adminHeader"/>
    		</div>
    		</th>
    	</tr>

    	<tr>
          	<td height="60px" colspan="6">
            	<div id="cloud" style="width:650;" align="center">
             		  <img class="mySlides" src="../img/강의장3.jpg" height="300" width="1000">
      				  <img class="mySlides" src="../img/강의장.jpg" height="300" width="1000" >
      				  <img class="mySlides" src="../img/강의장2.jpg" height="300" width="1000">
      				  <img class="mySlides" src="../img/강의장1.jpg" height="300" width="1000">
      				  	<p align="center">チョンヘジン予約システム</p>
             	</div>
          	</td>
    	</tr>
    		<tr class="sisul" align="center">
    			<td><a href="url">본관</a></td>
    			<td><a href="url">자연관</a></td>
    			<td><a href="url">인문관</a></td>
    			<td><a href="url">공학관</a></td>
    			<td><a href="url">원화관</a></td>
    			<td><a href="url">야외시설</a></td>
    		</tr>
    </table>
    <table>
    		<tr>
    			<jsp:include page="/adminList"/>
    		</tr>
    </table>
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
