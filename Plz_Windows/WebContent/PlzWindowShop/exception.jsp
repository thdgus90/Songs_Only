<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>에러</title>
</head>
<body>
요청을 처리하는 과정에서 문제가 발생했습니다.
${exception.message}
<%
	Throwable exception = (Throwable)request.getAttribute("exception");
	exception.printStackTrace();
%>
</body>
</html>