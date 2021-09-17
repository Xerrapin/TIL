<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<c:set var="path" value="${pageContext.request.contextPath}/resources"/>
<html>
<head>
	<meta charset="UTF-8">
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  업데이트 
</h1>

<P>  The time on the server is ${st}. </P>  

<%-- <c:url  value="경로/파일명.확장자"/> --%>

<img alt="우리 쿠키" src="<c:url value='resources/dog.png'/>" /> <hr>
<img alt="김연아" src="images/kim.png"> <hr>

<h3>EL 이용한 경로 지정</h3>  <!--  경로, 존재하는 파일인지, 오타 확인 요망 -->
<img alt="강아지" src="${path}/dog.png" width="300" height="500" /> <hr>
<img alt="이쁜연아" src="${path}/yuna.jpg" /> <hr>
</body>
</html>







