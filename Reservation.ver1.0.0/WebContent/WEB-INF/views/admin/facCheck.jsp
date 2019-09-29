<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<!DOCTYPE html>
<%	request.setCharacterEncoding("utf-8");  %>
<% 
/* 	String id = request.getParameter("id");
	String subject = request.getParameter("subject"); */
	String fileName1 = request.getParameter("fileName1");
	String fileName2 = request.getParameter("fileName2");
	String orgfileName1 = request.getParameter("orgfileName1");
	String orgfileName2 = request.getParameter("orgfileName2");
	
	//=======================================================
	ServletContext context = getServletContext();
 	String downloadPath = context.getRealPath("upload");
 	String fileDownPath = downloadPath + "\\" + fileName1;
 	request.setAttribute("fileDownPath", fileDownPath);
	
	// ======================================================
	String fileImagePath = context.getContextPath() + "/upload/" + fileName1;
	request.setAttribute("fileImagePath", fileImagePath);
	
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	이미지 업로드 경로(물리) : ${fileDownPath} <br />
	이미지 업로드 경로(서버) : ${fileImagePath} <br />
	
	<img src="${fileImagePath}"  /><br />

<%-- 	아이디 : <%=id %><br>
	제목 : <%=subject %><br> --%>
	첨부파일(클릭시 다운로드)<br>

	- 파일1 : <a href="download.jsp?fileName=<%=fileName1%>"><%=orgfileName1 %></a><br>
	- 파일2 : <a href="download.jsp?fileName=<%=fileName2%>"><%=orgfileName2 %></a><br>
	
</body>
</html>