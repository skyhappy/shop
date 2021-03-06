<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8"> 
	<title>Bootstrap 实例 - 水平表单</title>
	<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">  
	<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<form class="form-horizontal" role="form" action="${pageContext.request.contextPath}/customer/add.do">

	<div class="form-group">
		<label for="pwd" class="col-sm-2 control-label">客户编号</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="custoemrId" name="customerId"
				   placeholder="请输入昵称">
		</div>
	</div>
	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">名字</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="firstname" name="trueName"
				   placeholder="请输入名字">
		</div>
	</div>
	<div class="form-group">
		<label for="lastname" class="col-sm-2 control-label">昵称</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="lastname" name="showName"
				   placeholder="请输入昵称">
		</div>
	</div>
	
	<div class="form-group">
		<label for="pwd" class="col-sm-2 control-label">密码</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="pwd" name="pwd"
				   placeholder="请输入密码">
		</div>
	</div>
	<div class="form-group">
		<label for="tel" class="col-sm-2 control-label">电话</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="tel" name="tel"
				   placeholder="请输入电话">
		</div>
	</div>
	<div class="form-group">
		<label for="email" class="col-sm-2 control-label">邮箱</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="emati" name="email"
				   placeholder="请输入邮箱">
		</div>
	</div>
	
	<div class="form-group">
		<label for="card" class="col-sm-2 control-label">证件号码</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="lastname" name="card"
				   placeholder="请输入证件号码">
		</div>
	</div>

	<div class="form-group">
		<div class="col-sm-offset-2 col-sm-10">
			<button type="submit" class="btn btn-default">注册</button>
		</div>
	</div>
</form>

</body>
</html>
</html>