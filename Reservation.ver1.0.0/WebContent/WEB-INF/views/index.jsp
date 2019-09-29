<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
    <html>
    <head>
    <meta charset="UTF-8">
    <title>강의장 예약 시스템 메인 페이지</title>

  	  <link rel="stylesheet"type="text/css"href="/style"/>
    </head>
    <body>
<c:set var="contextPath" value="${pageContext.request.contextPath}" scope="request"></c:set>

<table>
	 <tr id="number1">
    	<th height="40px" colspan="4" >
    	<div style="float:right;">
    		<jsp:include page="/header"/>
    	</div>
    	</th>
    </tr>      
     <tr>
          	<td height="60px" colspan="4">
            	<div id="cloud" style="width:650;" align="center">
             		  <img class="mySlides" src="./img/강의장3.jpg" height="300" width="1000">
      				  <img class="mySlides" src="./img/강의장.jpg" height="300" width="1000" >
      				  <img class="mySlides" src="./img/강의장2.jpg" height="300" width="1000">
      				  <img class="mySlides" src="./img/강의장1.jpg" height="300" width="1000">
      				  	<p>チョンヘジン予約システム</p>
              	</div>
          	</td>
    </tr> 
	<tr>
    	<td colspan="4">
    		<jsp:include page="/search"/>
    	</td>
    </tr>  
    <tr>
    	<td height="100px" colspan="4">
    		<jsp:include page="/list"/>
		</td>
	</tr>
    <tr>
        <td colspan="4"><br />
         	<jsp:include page="/footer"/>
         	<hr />
      	 </td>
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