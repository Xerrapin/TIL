<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginOK.jsp 받아서 처리한 결과 화면</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
	String id = request.getParameter("id");
	out.print("당신의" + id + " 입니다.");
%>
<br><%= "my id " + id + "!!!" %> <hr>
<h3> Request 객체가 가지고 있는 함수</h3>

클라이언트 IP 정보 가져오기 : <%= request.getRemoteAddr() %> <br>
요청 방식(인코딩) : <%= request.getCharacterEncoding() %> <br>
전송 방식 : <%= request.getMethod() %> <br>
서버 이름 : <%= request.getServerName() %> <br>
컨텍스트 정보 : <%= request.getContextPath() %> <br>
전송된 데이터 : <%= request.getParameter("id") %> <br>

</body>
</html>