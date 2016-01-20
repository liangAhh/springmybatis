<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
	+ request.getServerName() + ":" + request.getServerPort()
	+ path + "/";
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>图片处理测试</title>
</head>
<body>
<h1>上传图片</h1>
<form action="<%=basePath %>test/loadFile" method="post" enctype="multipart/form-data">
	<input type="file" name="file">
	<input type="submit" value="上传">
</form>
</body>
</html>