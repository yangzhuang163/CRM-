<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>欢迎界面</title>
</head>


<body>
	<div id="wrapper">
	<jsp:include page="public.jsp"></jsp:include>	
		<div id="page-wrapper">
			<div class="row">
				<div class="col-lg-12">
					<h1 style="margin-top:200px; margin-left:390px;">${username}欢迎登录!!!</h1>
				</div>			
			</div>
		</div>
	</div>
</body>
</html>