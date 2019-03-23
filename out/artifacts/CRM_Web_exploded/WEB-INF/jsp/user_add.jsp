<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="yang" uri="http://yang.com/common/"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>CRM客户关系管理系统</title>
<link href="<%=basePath%>css/bootstrap.min.css" rel="stylesheet">
<link href="<%=basePath%>css/metisMenu.min.css" rel="stylesheet">
<link href="<%=basePath%>css/dataTables.bootstrap.css" rel="stylesheet">
<link href="<%=basePath%>css/sb-admin-2.css" rel="stylesheet">
<link href="<%=basePath%>css/font-awesome.min.css" rel="stylesheet" type="text/css">
<link href="<%=basePath%>css/boot-crm.css" rel="stylesheet" type="text/css">
<style type="text/css">
	table{
		border-collapse: collapse;
			}		
</style>
</head>
<body>
	<div id="wrapper">
	<jsp:include page="public.jsp"></jsp:include>	
		<div id="page-wrapper">
			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header">新用户添加</h1>
				</div>
				
				<div id="addbody">
				<form class="form-horizontal" action="<%=basePath%>user/user_add.action" method="post">
					<div class="form-group">
							<label for="username" class="col-sm-2 control-label">用户名称:</label>
							<div class="col-sm-10">
								<input type="text" style="width:600px;" class="form-control" id="username" placeholder="用户名称" name="username"/>
							</div>
					</div>
					<div class="form-group">
							<label for="usercode" class="col-sm-2 control-label">账号:</label>
							<div class="col-sm-10">
								<input type="text" style="width:600px;" class="form-control" id="usercode" placeholder="账号" name="usercode"/>
							</div>
					</div>	
					<div class="form-group">
							<label for="password" class="col-sm-2 control-label">密码:</label>
							<div class="col-sm-10">
								<input type="password" style="width:600px;" class="form-control" id="password" placeholder="密码" name="password"/>
							</div>
					</div>				
					<div class="form-group">
							<label for="usermail" class="col-sm-2 control-label">邮箱:</label>
							<div class="col-sm-10">
								<input type="text" style="width:600px;" class="form-control" id="usermail" placeholder="邮箱" name="usermail"/>
							</div>
					</div>
					<div class="form-group">
							<label for="userphone" class="col-sm-2 control-label">手机号:</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" style="width:600px;" id="userphone" placeholder="手机号" name="userphone"/>
							</div>
					</div>												
					<div class="form-group">
						<button type="submit" style="margin-left:280px;" class="btn btn-primary">提交</button>
						<a href="<%=basePath%>user/show.action" style="margin-left:300px;"><input  class="btn btn-primary" type="button"  value="返回"/></a>				
					</div>
						
				</form>		
				
			</div>			
			</div>
		</div>	
	</div>
	
	
</body>
<script type="text/javascript">
	

</script>
<script src="<%=basePath%>js/jquery.min.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="<%=basePath%>js/bootstrap.min.js"></script>

	<!-- Metis Menu Plugin JavaScript -->
	<script src="<%=basePath%>js/metisMenu.min.js"></script>

	<!-- DataTables JavaScript -->
	<script src="<%=basePath%>js/jquery.dataTables.min.js"></script>
	<script src="<%=basePath%>js/dataTables.bootstrap.min.js"></script>

	<!-- Custom Theme JavaScript -->
	<script src="<%=basePath%>js/sb-admin-2.js"></script>
</html>
