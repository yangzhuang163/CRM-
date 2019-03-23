<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

<style type="text/css">
	
	
		
</style>
</head>
<body>
	<div id="wrapper">
	<jsp:include page="public.jsp"></jsp:include>	
		<div id="page-wrapper">
			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header">用户管理</h1>
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-default">
						<div class="panel-heading">用户信息列表   
							<button id="user_find_but" onclick="location.href='<%=basePath%>user/list.action'"   class="btn btn-primary" style="float:right; margin-right:-4px; margin-top:-7px;">查询</button> 
							<button id="user_add_but" onclick="location.href='<%=basePath%>user/user_add_but.action'"  class="btn btn-primary glyphicon glyphicon-plus" style="float:right; margin-top:-8px;margin-right:5px;">新建</button>
						</div>
						<!-- /.panel-heading -->
						<table class="table table-bordered table-striped">
							<thead>
								<tr>
									<th>ID</th>
									<th>账号</th>
									<th>用户名称</th>
									<th>手机号</th>
									<th>邮箱</th>
									<th>状态</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${page.beanList}" var="row">
									<tr>
										<td>${row.user_id}</td>
										<td>${row.user_code}</td>
										<td>${row.user_name}</td>
										<td>${row.user_phone}</td>
										<td>${row.user_mail}</td>
										<td>${row.user_state}</td>
										<td style="width:145px">
											<button id="user_edit_but" data-toggle="modal" data-target="#userEditDialog" onclick="editUser(${row.user_id})"   class="btn btn-primary"  style="float:right; margin-right:5px;">修改</button> 
											<button id="user_delete_but" onclick="deleteUser(${row.user_id})"  class="btn btn-danger "  style="float:right; margin-right:5px;">删除</button> 
										</td> 
									</tr>
								</c:forEach>
							</tbody>							
						</table>						
						<center>
						<a>第${page.pageCode}页/共${page.totalPage}页</a>
						<button id="firstPage" onclick="location.href='<%=basePath%>user/list.action?pageCode=1'"  class="pagination" >首页</button> 
						<c:if test="${page.pageCode >1 }">
						<button id="subPage" onclick="location.href='<%=basePath%>user/list.action?pageCode=${page.pageCode-1}'"  class="pagination">上一页</button> 
						</c:if>
						<c:if test="${page.pageCode <page.totalPage }">
						<button id="addPage" onclick="location.href='<%=basePath%>user/list.action?pageCode=${page.pageCode+1}'"    class="pagination">下一页</button> 
						</c:if>
						<button id="lastPage" onclick="location.href='<%=basePath%>user/list.action?pageCode=${page.totalPage}'"    class="pagination">尾页</button> 
						</center>
						<!-- /.panel-body -->
					</div>
					<!-- /.panel -->
				</div>
				<!-- /.col-lg-12 -->
			</div>
		</div>
		<!-- /#page-wrapper -->		
	</div>
	<div class="modal fade" id="userEditDialog" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">修改用户信息</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal" id="edit_user_form" method="post">
						<div class="form-group">
							<label for="edit_user_id" class="col-sm-2 control-label">ID:</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_user_id" placeholder="ID" name="user_id" readonly="readonly" >
							</div>
						</div>
						<div class="form-group">
							<label for="edit_user_name" class="col-sm-2 control-label">用户名称:</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_user_name" placeholder="用户名称" name="user_name" >
							</div>
						</div>
						<div class="form-group">
							<label for="edit_user_code" class="col-sm-2 control-label">账号:</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_user_code" placeholder="账号" name="user_code" readonly="readonly" >
							</div>
						</div>
						<div class="form-group">
							<label for="edit_user_phone" class="col-sm-2 control-label">手机号:</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_user_phone" placeholder="手机号" name="user_phone" >
							</div>
						</div>
						<div class="form-group">
							<label for="edit_user_mail" class="col-sm-2 control-label">邮箱:</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_user_mail" placeholder="邮箱" name="user_mail" >
							</div>
						</div>
						<div class="form-group"  data-toggle="buttons" >
					       <label class="col-sm-2 control-label">状态: </label> 
					       <div class="col-sm-10" id="edit_user_state">
					         <input type="radio" value="1" name="user_state" />启用 &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
					         <input type="radio" value="0" name="user_state" />禁用	
					        </div>				      
						</div>			
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary" onclick="updateUser()">保存修改</button>
				</div>
			</div>
		</div>
	</div>
	
</body>
<script type="text/javascript">
function deleteUser(id) {
	if(confirm('确实要删除该客户吗?')) {
		$.post("<%=basePath%>user/delete.action",{"id":id},function(data){
			alert("客户删除更新成功！");
			window.location.reload();
		});
	}
}
function editUser(id){
	
	$.ajax({
		async:false,
	    cache:false,
		type:"post",
		url:"<%=basePath%>user/edit.action",
		data:{"id":id},
		success:function(data) {
			$("#edit_user_id").val(data.user_id);
			$("#edit_user_code").val(data.user_code);
			$("#edit_user_name").val(data.user_name);
			$("#edit_user_phone").val(data.user_phone);
			$("#edit_user_mail").val(data.user_mail);
			$("#edit_user_state").val(data.user_state);	
			if(data.user_state==1){
			 $("input:radio[value='1']").attr('checked','true');
			}else if(data.user_state==0){
			 $("input:radio[value='0']").attr('checked','true');
			}
		}
	});
}
function updateUser() {
	$.post("<%=basePath%>user/update.action",$("#edit_user_form").serialize(),function(data){
		window.location.reload(true);
		alert("客户信息更新成功！");
	});
}

</script>
</html>

<%-- <a href="#" class="btn btn-primary btn-xs" data-toggle="modal" data-target="#customerEditDialog" onclick="editCustomer(${row.cust_id})">修改</a>
											<a href="#" class="btn btn-danger btn-xs" onclick="deleteCustomer(${row.cust_id})">删除</a>
 --%>