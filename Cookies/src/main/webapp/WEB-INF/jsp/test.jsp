<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html >
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'test.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body >
    This is my JSP page. <br>
    <form action="register/getPwData" method="get">
	    <input type="text" name="account">
	    <br>
	    <input type="text" name="password">
	    <br>
	    <input type="text" name="userphonenum">
	    <br>
	    <input type="text" name="username">
	    <br>
	    <input type="text" name="usersex">
	    <br>
	    <input type="submit" value="提交">
    </form>
    <input type="button" value="ajax" onclick="postURL()">
    <br>
  </body>
</html>
<script type="text/javascript" src="<%=basePath %>style/js/jquery-1.8.3.min.js" ></script>
<script type="text/javascript">
	
	$(document).ready(postURL());
	
function postURL(){
		var test = window.location.pathname;
		var returnURL = test.substring(9);
		 $.post("public/getURL", {  
                returnURL : returnURL,  
            }); 
}

</script>
