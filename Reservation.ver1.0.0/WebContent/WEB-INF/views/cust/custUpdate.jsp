<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지 수정</title>
<style type="text/css">
table {
      border: 1px solid black;
   }

   tr {
      border: 1px solid black;
   }

   th, td {
      border: 1px solid black;
   }
</style>

</head>
<body>
<table>
   <tr>
      <th>
         마이 페이지
      </th>
   </tr>
   <tr>
      <td>아이디</td>
      <td>
         ${CUST_ID}
      </td>
   </tr>
   <tr>
      <td>이름</td>
      <td>
         <input type="text" name="username" size="10"/>
      </td>
   </tr>
   <tr>
      <td>이메일</td>
      <td>
         <input type="text" name="emailId" size="10">@
            <select name="emailDomain">
               <option value="" selected="selected">===이메일 선택===</option>
               <option value="naver.com">네이버</option>
               <option value="daum.net">다음</option>
               <option value="gmail.com">구글</option>
               <option value="nate.com">네이트</option>
               <option value="yahoo,co,kr">야후 코리아</option>
            </select>

      </td>
   </tr>
   <tr>
      <td>학번/사번</td>
      <td>
         <input type="text" name="numbers" size="10"/>
      </td>
   </tr>
   <tr>
      <td>휴대전화</td>
      <td>
         <select name="phone1" >
           <option>==번호선택==</option>
           <option value="010">010</option>
         </select>-
         <input name="phone2" size="4" maxlength="4"/>-
         <input name="phone3" size="4" maxlength="4"/>

      </td>
   </tr>
   <tr>
      <td colspan="2">
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		 <button type="button" value="저장하기" onclick="location.href='.jsp'">저장하기</button>
		 <!-- onclick="location.href='MyPage.html'" -->
         <button type="button" value="취소하기" onclick="location.href='MyPage.jsp'">취소하기</button>

      </td>
   </tr>
</table>




</body>
</html>