<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>商品列表页面</title>
	<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">  
	<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/static/js/laypage-v1.3/laypage/laypage.js"></script>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/static/js/laypage-v1.3/laypage/skin/laypage.css">  
	<script type="text/javascript">
	$(function(){
		laypage({
			  cont: $("#page11"),
			  pages: '${page.totalPage}', //可以叫服务端把总页数放在某一个隐藏域，再获取。假设我们获取到的是18
			  curr: function(){ //通过url获取当前页，也可以同上（pages）方式获取
			    var page = location.search.match(/nowPage=(\d+)/);
			    return page ? page[1] : 1;
			  }(), 
			  jump: function(e, first){ //触发分页后的回调
			    if(!first){ //一定要加此判断，否则初始时会无限刷新
			      location.href = '?nowPage='+e.curr;
			    }
			  }
			});

		
	})
	
	
	
	</script>
	
</head>
<body>

<div class="table-responsive">
	<table class="table">
		<caption>响应式表格布局</caption>
		<thead>
			<tr>
				<th>姓名</th>
				<th>昵称</th>
				<th>电话</th>
				<th>email</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="m" items="${page.result}" >
			<tr>
				<td>${m.trueName}</td>
				<td>${m.showName}</td>
				<td>${m.tel}</td>
				<td>${m.email}</td>
				<td><a href="${pageContext.request.contextPath}/customer/toUpdate/${m.uuid}.do" >修改</a>|<a href="${pageContext.request.contextPath}/customer/toDelete/${m.uuid}.do">删除</a></td>
			</tr>
			</c:forEach>
		</tbody>
		
</table>
<a href="${pageContext.request.contextPath}/customer/toadd.do" >增加</a>
</div>
<div id="page11"></div>  	

</body>
</html>