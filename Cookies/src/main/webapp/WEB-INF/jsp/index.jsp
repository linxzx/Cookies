<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>

	<head>
	<base href="<%=basePath%>">
		<meta charset="UTF-8">
		<title>Welcome to Cookies</title>
		<link rel="stylesheet" href="<%=basePath %>style/css/index.css" />
		<link rel="stylesheet" href="<%=basePath %>style/css/bootstrap.min.css" />

	</head>
	
	
	<body>
		<div class="body">
			<div class="top">
				<div class="top1">
				<!--
                	界面
                -->
				<a href="web/index#" onclick="openModal2()">注册</a>&nbsp;|&nbsp;<a href="web/index#" id="login" >登录</a>&nbsp;|&nbsp;
				<input type="button" class="btn btn-default" value="我要开店"/>
			</div>
				</div>
			<div class="logo">
				<img src="<%=basePath %>style/img/logo.png"/>
			</div>
			<div class="search">
				<input type="text" id="search2" placeholder="正餐·奶茶·夜宵·烧烤" style="width: 40%;float: none;"/>
		&nbsp;&nbsp;&nbsp;&nbsp;
			<input id="search3" type="button" class="btn btn-default" style="width: 100px;vertical-align:top;height: 40px;" value="搜索"/>
			
			</div>
			
		<div id="mask">
			
<!--
	登录
-->
	
		<div id="login01" class="container" style="width: 500px;display: none;">
			<div id="close" class="glyphicon glyphicon-remove" onclick="closeModal()"></div>

		<div class="login">
			<h2>登录</h2>
			<form action="<%=basePath %>login/getAcandPw" method="get" >
				<input id="loginaccount" type="text" Name="account" placeholder="用户名" >
				<input id="loginpassword" type="password" Name="password" placeholder="密码" >
				
				<div class="send-button w3layouts agileits">
				   <input id="loginbutton" type="submit" value="登录"  onclick="return loginClick();">
				</div>
				<script type="text/javascript">
				
				</script>
			</form>
			
			<a href="web/index#">忘记密码？</a>
			<div class="social-icons w3layouts agileits">
				<p>- 其他登录方式 -</p>
				<ul>
					<li class="qq"><a href="web/index#">
					<span class="icons w3layouts agileits"></span>
					<span class="text w3layouts agileits">QQ</span></a></li>
					<li class="weixin w3ls"><a href="web/index#">
					<span class="icons w3layouts"></span>
					<span class="text w3layouts agileits">微信</span></a></li>
					<li class="weibo aits"><a href="web/index#">
					<span class="icons agileits"></span>
					<span class="text w3layouts agileits">微博</span></a></li>					
				</ul>
			</div>
		</div>
		</div>
		
<!--注册¡-->
			<div id="zhuce" class="container" style="width: 500px;display: none;">
			<div id="close" class="glyphicon glyphicon-remove" onclick="closeModal2()"></div>
			<div id="" class="register">
			<h2>注册</h2>
			<form action="<%=basePath %>register/getPwData" method="get">

				<input id="registeraccount" type="text" Name="account" placeholder="账号" required="">
				<input id="registerpassword" type="password" Name="password" placeholder="密码" required="">
				<input  type="radio" Name="usersex" checked="checked" value="男" required=""><font color="white">男</font>
				<input  type="radio" Name="usersex" checked="checked" value="女" required=""><font color="white">女</font>
				<input id="registeruserphonenum" type="text" Name="userphonenum" placeholder="手机号码 " required="">
				<input id="registerusername" type="text" Name="username" placeholder="用户姓名" required="">


		
				<div class="send-button">
					<input type="submit" value="注册" onclick="return registerClick();">
		   		 </div>
				</form>
				
			
		    </div>
			</div>
		</div>
		
		
</div>		


		</body>
</html>
<script type="text/javascript" src="<%=basePath %>style/js/jquery-1.8.3.min.js" ></script>
	<script type="text/javascript" src="<%=basePath %>style/js/login.js" ></script>
	<script type="text/javascript" src="<%=basePath %>style/js/public.js"></script>

