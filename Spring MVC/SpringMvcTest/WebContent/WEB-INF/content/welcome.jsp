<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8">
<title>Welcome</title>
</head>
<body>
	<!-- 页面可以访问Controller传递出来的message -->
	${requestScope.message}
</body>
</html>