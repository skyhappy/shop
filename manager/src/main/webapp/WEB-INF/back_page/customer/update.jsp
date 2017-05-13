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

<form class="form-horizontal" role="form" action="${pageContext.request.contextPath}/customer/update/${customer.uuid}.do">
<input type="hidden" name="uuid" value="${customer.uuid}" />
	<div class="form-group">
		<label for="pwd" class="col-sm-2 control-label">客户编号</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="custoemrId" name="customerId"
				   value="${customer.customerId}" >
		</div>
	</div>
	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">名字</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="firstname" name="trueName"
				   value="${customer.trueName}" >
		</div>
	</div>
	<div class="form-group">
		<label for="lastname" class="col-sm-2 control-label">昵称</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="lastname" name="showName"
				  value="${customer.showName }"  >
		</div>
	</div>
	
	<div class="form-group">
		<label for="pwd" class="col-sm-2 control-label">密码</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="pwd" name="pwd"
				   value="${customer.pwd}" >
		</div>
	</div>
	<div class="form-group">
		<label for="tel" class="col-sm-2 control-label">电话</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="tel" name="tel"
				 value="${customer.tel }"  >
		</div>
	</div>
	<div class="form-group">
		<label for="email" class="col-sm-2 control-label">邮箱</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="emati" name="email"
				  value="${customer.email}"  >
		</div>
	</div>
	
	<div class="form-group">
		<label for="card" class="col-sm-2 control-label">证件号码</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="lastname" name="card"
				  value="${customer.card }" >
		</div>
	</div>

	<div class="form-group">
		<div class="col-sm-offset-2 col-sm-10">
			<button type="submit" class="btn btn-default">修改</button>
		</div>
	</div>
</form>

</body>
</html>
</html>