<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<link rel="stylesheet" type="text/css" href="Css/login.css"/>
<title>ĐĂNG NHẬP</title>
<link rel="Shortcut icon" type="image/x-icon" href="./Resources/Images/logoSCB.png">
</head>
<body>
<s:actionerror/>
<s:div cssClass="loginScr">
	<s:div cssClass="center">
		<a href="https://scb.com.vn/">
			<img src="./Resources/Images/logoVsBg.png">
		</a>
		<s:div>
			<s:form action="login.action" method="post">
			    <s:textfield placeholder="Tên đăng nhập" name="username" size="25" />
			    <s:password placeholder="Mật khẩu" name="password" size="25" />
			    <s:submit method="execute" key="label.login" align="center" />
			</s:form>
		</s:div>
	</s:div>
</s:div>
<s:div cssClass="footer_login">
	<s:div cssClass="textP">
		<p>@ PHÒNG PHÁT TRIỂN ỨNG DỤNG</p>
		<p>NGÂN HÀNG TMCP SCB</p>
	</s:div>
</s:div>
</body>
<script src="Js/jquery-2.2.4.min.js" type="text/javascript"></script>
<script type="text/javascript">	
	$(document).ready(function(){
		$("#login_username").text("");
	});
</script>
</html>