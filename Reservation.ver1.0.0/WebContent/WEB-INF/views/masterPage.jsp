<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>강의장 예약 시스템 메인 페이지</title>
<style type="text/css">
@import url('https://fonts.googleapis.com/css?family=Kosugi+Maru&display=swap');
@import url('https://fonts.googleapis.com/css?family=Jua|Kosugi+Maru&display=swap');

   
    table {
    width: 100%;
    border-top: 1px solid #b3e0ff;
    border-collapse: collapse;
    }
   
 
    th, tr, td {
    border-bottom: 4px solid #b3e0ff;
    padding: 10px;  
    }
    
    th {
    padding: 20px;
    }
    
    tr#number1 {
    background-color: #b3e0ff;
    }
    
	div#cloud {
    background-size: cover;
    align-content: center;
 
    }
    
	img#mySlides {
    display:none;
    size: cover;
    }
      
	button {
	    border-radius: 6px;
        background-color: white;
        color: black;
        border: 2px solid #d2a679;
    }
    
    
    input {
    	border-radius: 6px;
        background-color: white;
        color: black;
        border: 2px solid gray;
    }
    
    select {
     width:200px;
     height:25px;
  
     }
     
    div#first {
    margin: 20px;
    text-align: center;
 	}
 
    div#second {    
	margin: 20px;
    text-align: center;
 	}
 	
 	img {
 	border-radius: 4px;
	
 	}
 	
 	P {
 	font-size: 60px;
 	font-family: 'Kosugi Maru','Jua', sans-serif;
 	color:white;
	padding: 30px;
	width: 940px;
	font-weight: bold;
	text-align: center;
    background-color: #b3e0ff;
	border-radius:8px; 

 	}
 	
</style>
</head>
<body>

<table>
	<tr id="number1">
		<th height="40px" colspan="6">
			<div style="float: right;">
			안녕하세요! ${sessionScope.userId} 
				<button id="other" type="button" value= "onclick=location.href='main'"> LOGOUT&nbsp;</button>
				<button id="up" type="button" value=" onclick=location.href='masterPage'"> 마이페이지&nbsp;</button>
				<button id="up" type="button" value="예약관리"> 예약관리&nbsp;</button>
				<button id="up" type="button" value="강의실관리"> 강의실관리&nbsp;</button>
			</div>  
		</th>
	</tr>	
    <tr>
      	<td height="60px" colspan="4">
        	<div id="cloud" style="width:1650;" align="center">
         		  <img class="mySlides" src="../img/강의장3.jpg" height="600" width="1600">
  				  <img class="mySlides" src="../img/강의장.jpg" height="600" width="1600" >
  				  <img class="mySlides" src="../img/강의장2.jpg" height="600" width="1600">
  				  <img class="mySlides" src="../img/강의장1.jpg" height="600" width="1600">
  				  	<p>チョンヘジン予約システム</p>
         	</div>
      	</td>        
	</tr>   
<tr>
			<td><a href="url">본관</a></td>
			<td><a href="url">자연관</a></td>
			<td><a href="url">인문관</a></td>
			<td><a href="url">공학관</a></td>
			<td><a href="url">원화관</a></td>
			<td><a href="url">야외시설</a></td>
		</tr>
</table>
<table class="table table-hover">
	<thead>		
		<tr>
			<th>호실</th>
			<th>수용인원</th>
			<th>시설 정보</th>
			<th></th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>101</td>
			<td>20</td>
			<td>빔프로젝트, 음향장비</td>
			<td>
				<div style="float: right;">
				<button type="button" id="blue" onclick="reset()">수정하기</button>
				<button type="button" id="delete" onclick="Cancle()">삭제하기</button>
				</div>			
			</td>
		</tr>
		<tr>
			<td>102</td>
			<td>20</td>
			<td>빔프로젝트, 음향장비</td>
			<td>
				<div style="float: right;">
				<button type="button" id="blue" onclick="reset()">수정하기</button>
				<button type="button" id="delete" onclick="Cancle()">삭제하기</button>
				</div>			
			</td>
		</tr>
		<tr>
			<td>103</td>
			<td>30</td>
			<td>캡스톤 디자인 강의실</td>
			<td>
				<div style="float: right;">
				<button type="button" id="blue" onclick="reset()">수정하기</button>
				<button type="button" id="delete" onclick="Cancle()">삭제하기</button>
				</div>			
			</td>
		</tr>
		<tr>
			<td>104</td>
			<td>30</td>
			<td>빔프로젝트, 음향장비, 컴퓨터</td>
			<td>
				<div style="float: right;">
				<button type="button" id="blue" onclick="reset()">수정하기</button>
				<button type="button" id="delete" onclick="Cancle()">삭제하기</button>
				</div>			
			</td>
		</tr>
	</tbody>
	
		<tr>
			<th height="66px" colspan="6">
			<br /><div style="float: left;">
			<img src="./img/로고.jpg" width="20">
			<font face="글꼴" color="gray" size="2">copyright &copy; 청해진 시설예약 시스템 2019 by 청해진</font>
			<hr />
			</div>
		</th>

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