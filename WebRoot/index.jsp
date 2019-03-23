<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>	
<head>
<meta charset="UTF-8">
<title>CRM客户管理系统</title>
<meta name="description" content="particles.js is a lightweight JavaScript library for creating particles.">
<meta name="author" content="Vincent Garreau" />
<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
<link href="<%=basePath%>css/bootstrap.min.css" rel="stylesheet">
<link href="<%=basePath%>css/metisMenu.min.css" rel="stylesheet">
<link href="<%=basePath%>css/dataTables.bootstrap.css" rel="stylesheet">
<link href="<%=basePath%>css/sb-admin-2.css" rel="stylesheet">
<link href="<%=basePath%>css/font-awesome.min.css" rel="stylesheet" type="text/css">
<link href="<%=basePath%>css/boot-crm.css" rel="stylesheet" type="text/css">
<style type="text/css">
		#box{
			width: 370px;
			height: 400px;
			border: 1px solid #E2E3E5;
			position: absolute;
			left: 50%;
			top: 50%;
			margin-left: -185px;
			margin-top: -200px;
		}
		#logo{
			width: 370px;
			height: 95px;
			font-size: 30px;
			color: #676A6C;
			line-height: 95px;
			margin-left: 40px;
		}
		#usercode{
			width: 295px;
			height: 50px;
			margin-left: 40px;
			
		}
		#password{
			width: 295px;
			height: 50px;
			margin-left: 40px;
			margin-top:5px;
		}
		 .input-group{
			margin-left: 40px;
		}
		#vCode {
			width: 95px;
			height: 30px;
			margin-top: 15px;
			border-radius: 2px;
			cursor: pointer;
			position: absolute;
			z-index: 3;
			left: 10px;
			top: 0;
		}
		#validateCode {
			height: 55px;
			padding-left: 120px;
			width: 295px;
			margin-top:5px;
		}
		#verify{
			width: 295px;
			height: 60px;
			margin-left: 40px;
			border: 1px solid #EDEDEE;
		}
		#btn-login{
			width: 295px;
			height: 50px;
			margin-left: 40px;
			margin-top: 20px;
		}
		#remember{
			width: 80px;
			height: 20px;
			margin-left: 50px;
			margin-top: 20px;
			color: #676A6C;
			font-size: 15px;
		}
		#bakimg{
			height: 637px;
            width: auto;
            background-image: url("${pageContext.request.contextPath}/img/login.jpg");
            background-size: 1350px 637px ;
		}
	</style>
</head>
	<body>
	<div id="bakimg">
		<canvas class="particle"></canvas>
		
		<div id="box">
			<div id="logo">欢迎登录!</div>
			<form action="${pageContext.request.contextPath }/index/login.action" method="post">
			<div id="info">
				<span style="color:red; margin-left:250px;">${msg1}</span><input type="text" class="form-control" id="usercode" name="usercode" value="${usercode}" placeholder="账号:">
				<span style="color:red; margin-left:250px;">${msg2}</span><input type="password" class="form-control" id="password" name="password" value="${password}" placeholder="密码:">
				<span style="color:red; margin-left:250px;">${msg3}</span><div class="input-group">	
					<img id="vCode" onclick="_change()" src="<%=basePath%>/index/validate.action">			
					<input type="text"
						   id="validateCode" name="validateCode"
						    placeholder="验证码:">
				</div>
 				<div id="remember"><input type="checkbox">记住密码</div>
				<button class="btn btn-info" id="btn-login" type="submit">登录</button>			
			</div>
			</form>
		</div>
	</div>
<script src="<%=basePath%>js/jquery.min.js"></script>
<script src="<%=basePath%>js/bootstrap.min.js"></script>
<script src="<%=basePath%>js/metisMenu.min.js"></script>
<script src="<%=basePath%>js/jquery.dataTables.min.js"></script>
<script src="<%=basePath%>js/dataTables.bootstrap.min.js"></script>
<script src="<%=basePath%>js/sb-admin-2.js"></script>
<script type="text/javascript">
function _change(){
	var ele=document.getElementById("vCode");
	ele.src="<%=basePath%>/index/validate.action?xxx="+ new Date().getTime();
}
</script>
	</body>
</html>