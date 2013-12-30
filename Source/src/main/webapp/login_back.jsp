<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>  行者官网后台登录</title>
		<link rel="stylesheet" type="text/css" href="image/style1.css">
		<meta http-equiv="windows-Target">
<SCRIPT Language="JavaScript">
 <!--
 function isValid()
 {	
 	if(formlogin_back.id.value == "")
 	{	
 		window.alert("请输入账号！"); 
		document.formlogin.elements(0).focus();
 		return  false;
 	}
 	if(formlogin_back.password.value == "")
 	{
 		window.alert("请输入密码！");
 		document.formlogin.elements(1).focus();
 		return  false; 
 	}
 	formlogin_back.image();
}
  -->
  </SCRIPT>
	</head>
    
	<body background="">
		<form name="formlogin_back" action="Login_conf" method="post" onSubmit="return isValid(this);">
			<table width="600" height="600" border="0" align="center" >
				<tr>
					<td>
						<table border="0" cellpadding="0" cellspacing="0">
							<tr>
								<th width="800" height="80" colspan="3">
									
								</th>
							</tr>
							<tr>
								<th width="800" height="138" colspan="3">
									
								</th>
							</tr>
							<tr>
								<td width="165" height="187">
									
								</td>
								<td>
									<div align="center">
									</div>
									<h1>行者官网后台管理</h1>
									<table width="450" height="187" border="0" cellpadding="0"
										cellspacing="0">
										
										<tr height="84">
											<td width="130" align="center">
												用户名：
											</td>
											<td width="180">
												<input type="text" name="name"></input>
											</td>
										</tr>
										<tr height="43">
											<td width="130" align="center">
												密&nbsp;&nbsp;码：
											</td>
											<td width="180">
												<input type="password" name="password"></input>
											</td>
											<th width="171" rowspan="3">
												<input type="image" src="image/login.gif" />
											</th>
										</tr>
										
									</table>
								</td>
								
							</tr>
							<tr>
								<th width="800" height="106" colspan="3" align="right">
									
								</th>
							</tr>
							<tr>
								<th width="800" height="79" colspan="3">
									
								</th>
							</tr>
						</table>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>
