<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <!DOCTYPE html>
    <html>
    <head>
    <meta charset="UTF-8">
    <title>마이페이지</title>
    <link rel="stylesheet" type="text/css" href="../css/formstyle.css"/>
    </head>
    <body>

    <!-- table>(tr>td{$}*2)*5 -->

    <table>
    	<tr id="number1">
           <th height="40px" colspan="4" >
          </th>
        </tr>
        <tr>
          	<td height="60px" colspan="4">
            	<img src="../img/printTest04.jpg" align="center">
              	</img>
          	</td>
    	</tr>
       <tr>
          <th colspan="2">
            	MY PAGE
          </th>
       </tr>
       <tr>
          <td>ID</td>
          <td>
          </td>
       </tr>
       <tr>
          <td>NAME</td>
          <td>
          </td>
       </tr>
       <tr>
          <td>メール</td>
          <td>
          </td>
       </tr>
       <tr>
          <td>学番/社番</td>
          <td></td>
       </tr>
       <tr>
          <td>電話番号</td>
          <td></td>
       </tr>
       <tr>
          	 <td colspan="2" align="center">
    <!--          input[type="button" value="기본 정보 수정" onclick="src/view/myPage/myPageUpdate.html"] -->
    		 <button type="button" value="기본정보 수정" onclick="location.href='custUpdate'">기본정보 수정</button>
             <button type="button" value="비밀번호 수정" onclick="location.href='Confirm_PW.jsp'">비밀번호 수정</button>
             </td>
       </tr>
    </table>

    </body>
    </html>