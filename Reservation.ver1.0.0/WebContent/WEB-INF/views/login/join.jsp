<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <!DOCTYPE html>
    <html>
    <head>
    <meta charset="UTF-8">
    <title>Join</title>
    <link rel="stylesheet" type="text/css" href="./css/style.css"/>
    </head>
    <body>
    <table>
    	<tr id="number1">
           <th height="40px" colspan="4" >
          </th>
        </tr>
        <tr>
          	<td height="60px" colspan="4">
            	<img src="./img/printTest04.jpg" align="center" >
              	</img>
          	</td>
    	</tr>
       <tr id="number1">
          <th colspan="4"><h1>JOIN</h1></th>
    <!--    <th>제목2</th>
          <th>제목3</th> -->
    <!--       <th>제목4</th>  -->
       </tr>
       <tr>
          <td>아이디*</td>
          <td><input type="text" name="userID" size="10"/>
             <button type="button" class="id_overlap_button" onclick="id_overlap_check()">중복검사</button></td>
       </tr>
       <tr>
          <td>비밀번호*</td>
          <td><input type="password" name="userpass" size="10"/></td>
       </tr>
       <tr>
          <td>비밀번호 확인*</td>
          <td><input type="password" name="passConfirm" size="10"/></td>
       </tr>
       <tr>
          <td>이름*</td>
          <td><input type="text" name="username" size="10"/></td>
       </tr>
       <tr>
       <td>이메일*</td>
       <td colspan="2">
          <input type="text" name="emailId" size="10"/> @
             <select name="email" >
                <option>==메일주소 선택==</option>
                <option value="naver.com">네이버</option>
                <option value="daum.net">다음</option>
                <option value="gmail.com">구글</option>
                <option value="nate.com">네이트</option>
                <option value="yahoo.co.kr">야후코리아</option>
             </select>
       </td>
       </tr>
       <tr>
          <td>학번/사번*</td>
          <td><input type="number" name="numbers" size="10"/></td>
       </tr>
       <tr>
          <td>전화번호</td>
          <td>
             <select name="phone1" >
               <option>==번호선택==</option>
               <option value="010">010</option>
             </select>
               -
               <input name="phone2" size="4"/>
               -
               <input name="phone3" size="4"/></td>
    <!--    <td>내용11</td> -->
       <!--<td>내용12</td>-->
       </tr>
       <tr>
          <td colspan="2">
             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             <button onclick="GoSubmit()">회원가입</button>
             <!-- onclick="location.href='MainPage.html'" -->
             <button onclick="location.href='MainPage.jsp'">취소</button>
          </td>
       </tr>
    </table>

    </body>
    </html>