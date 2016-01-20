<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>spring mvc Mybatis</title>
</head>
<body>
	<h1><spring:message code="test"/></h1>
	<c:forEach items="${userinfos }" var="userinfo">
		用户名:${userinfo.username }     -------------------     电话：${userinfo.phone }
	</c:forEach>
	<br>
	<img alt="" src="../static/img/p1036847177.jpg">
</body>
</html>