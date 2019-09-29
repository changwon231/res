<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>시설예약 페이지</title>
<style type="text/css">
@import url('https://fonts.googleapis.com/css?family=Kosugi+Maru&display=swap');
   
    table {
    width: 100%;
    border-top: 1px solid #444444;
    border-collapse: collapse;
    }
   
 
    th, td {
    border-bottom: 1px solid #444444;
    padding: 10px;  
    }
   
	div#cloud {
    padding: 40px;
    background-image: url( "./img/바다최종.jpg" );
    }
      p {
        padding: 30px;
        font-size: 50px;
        font-weight: bold;
        text-align: center;
        background-color: #ffffff;
        background-color: rgba( 255, 255, 255, 0.5 );
        font-family :'Kosugi Maru', sans-serif;
     	font-weight: bold;
     	padding: 30px;
     	color:white;
     	font-size: 60px;
     	text-align: center;
     	text-shadow: 6px 2px 2px gray;
      }


	button {
       background-color: white;
        color: black;
        border: 2px solid #339cff
    }
    
    input {
        background-color: white;
        color: black;
        border: 2px solid gray;
    }
  
    div#first {

    margin: 50px;
    border-radius : 20%;
 	}
 
 	input#a {
    margin: 50px;
    border-radius : 20%;
 	}
 
  	input#b {
    margin: 50px;
    border-radius : 20%;
 	}
 
  	input#c {
    margin: 50px;
    border-radius : 20%;
 	}
 
  	input#d {
    margin: 50px;
    border-radius : 20%;
 	}
 
 	input#e {
    margin: 50px;
    border-radius : 20%;
 	}
 
 	input#f {
    margin: 50px;
    border-radius : 20%;
 	}
 
 	input#g {
    margin: 50px;
    border-radius : 20%;
 	}
 	
 	

</style>
</head>
<body>
<form action="login_screen" action="http://localhost/upload.php" method="post" enctype="multipart/form-data">
<table>
    <tr>
       <th height="40px" colspan="4" >
		 <div style="float: right;">
      님 환영합니다&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

      <button type="button"  value="LOGOUT" onclick="location.href='MainPage.html'">LOGOUT &nbsp;</button>
      <button type="button"  value="MYPAGE" onclick="location.href='MyPage.html'">Mypage &nbsp;</button>
      <button type="button"  value="예약현황" onclick=>예약현황 &nbsp;</button>
      <button type="button"  value="강의장관리" onclick=>강의장관리 &nbsp;</button>
    
      </div>
      </th>
    </tr>      
    <tr>
      	<td height="60px" colspan="4">
         	<div id="cloud">
         	<p>予約システム</p>
         	</div>
      	</td>         
	</tr>    
	<tr>
    	<td>건물</td>
    	<td>강의실</td>
    	<td>인원</td>
        <td>공간찾기</td>
        
    </tr>  
</table>

<!-- 			생활코딩 파일 업로드 하는 영상 : https://opentutorials.org/course/2039/10966 -->
			<div ID="first">
				<input id="a" type="image" src="" height="70" width="60"/>
				메인사진
				<input type="file" name="profile">
            	<input type="submit">		
			
				<input id="b" type="image" src="" height="70" width="60"/>
				<input type="file" name="profile">
            	<input type="submit">		
			
				<input id="c" type="image" src="" height="70" width="60"/>
				<input type="file" name="profile">
            	<input type="submit">		
			
			</div>
			
<table>
	<tr>
		<th>시설위치</th>
		<td>
			<select class="w3-select"  name="address" id="address"
			        onchange="checkAddress();" >
				<option value="">== 위치를 선택하세요 ==</option>
				<option value="main">본관</option>
				<option value="nature">자연관</option>
				<option value="people">인문관</option>
				<option value="engineer">공학관</option>
				<option value="oneflower">원화관</option>
				<option value="outdoor">야외시설</option>
			</select>
		</td>
		<th>층</th>
		<td>
			<select class="w3-select"  name="address" id="address"
			        onchange="checkAddress();" >
				<option value="">== 층를 선택하세요 ==</option>
				<option value="1">1층</option>
				<option value="2">2층</option>
				<option value="3">3층</option>
				<option value="4">4층</option>
				<option value="5">5층</option>
				<option value="6">6층</option>
				<option value="7">7층</option>
				<option value="8">8층</option>
				<option value="9">9층</option>
				<option value="10">10층</option>
				<option value="11">11층</option>
				<option value="12">12층</option>
			</select>
		</td>
		<th>호실</th>
		<td>
			<select class="w3-select"  name="address" id="address"
			        onchange="checkAddress();" >
				<option value="">== 호실를 선택하세요 ==</option>
				<option value="">101호</option>
				<option value="">102호</option>
				<option value="">103호</option>
				<option value="">104호</option>
				<option value="">105호</option>
				<option value="">106호</option>
				<option value="">107호</option>
			</select>
		</td>
	</tr>
   <tr>
		<th>시설정보</th>
		<td>
			<input class="w3-check" type="checkbox" name="facility" value="beem" id="h1" />
			<label for="h1">빔프로젝트</label>
			<input class="w3-check" type="checkbox" name="facility" value="computer" id="h2" />
			<label for="h2">컴퓨터</label>
			<input class="w3-check" type="checkbox" name="facility" value="board" id="h3" />
			<label for="h3">보드</label>
			<input class="w3-check" type="checkbox" name="facility" value="speaker" id="h4" />
			<label for="h4">스피커</label>
			<input class="w3-check" type="checkbox" name="facility" value="mic" id="h5" />
			<label for="h5">마이크</label>
			<input class="w3-check" type="checkbox" name="facility" value="tv" id="h6" />
			<label for="h6">TV</label>
		</td>
	</tr>
	<tr>
		<td colspan="2" class="w3-center">
			<input type="submit" value="전송" 
			       class="w3-btn w3-white w3-border w3-border-blue w3-round"
			/>&nbsp;
			<input type="button" value="초기화" 
			       onclick="resetMyForm();"
			       class="w3-btn w3-white w3-border w3-border-red w3-round"      
			/>
		</td>
	</tr>
	
</table>			
      
</form>
</body>
</html>