<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<html>
  <head>
    
    
    <title>管理员登录</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	
	
    <!--   Bootstrap -->
    <link href="assets/css/vendor/bootstrap/bootstrap.min.css" rel="stylesheet">
    <link href="assets/css/font-awesome.css" rel="stylesheet">
    <link href="assets/css/vendor/bootstrap-checkbox.css" rel="stylesheet" >
    <link href="assets/css/minimal.css" rel="stylesheet">
    <link href="css/bootstrap-select.js" rel="stylesheet">  
	<script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
	
  </head>
  
 <body class="bg-1">
 

    <!-- Wrap all page content here -->
    <div id="wrap">
      <!-- Make page fluid -->
      <div class="row">
        <!-- Page content -->
        <div id="content" class="col-md-12 full-page login">


          <div class="inside-block">
            <img src="assets/images/logo-big.png" alt class="logo">
            <h1><strong>欢迎</strong> 使用管理系统后台登录</h1>
            <h5>管理系统Ver2.0</h5>

            <form:form modelAttribute="adminLogin" id="form-signin" class="form-signin" method="post" action="Login">
             
              <section>
              	<form:errors path="admin_user"></form:errors>
                <div class="input-group">
                  <form:input  class="form-control" path="admin_user" placeholder="登录帐号"/>
                  <div class="input-group-addon"><i class="fa fa-user"></i></div>
                </div>
                <form:errors path="admin_password"></form:errors>
                <div class="input-group">
                  <form:input type="password" class="form-control" path="admin_password" placeholder="登录密码"/>
                  <div class="input-group-addon"><i class="fa fa-key"></i></div>
                </div>
                <label style=" color:#F00">${error }</label>
                <div class="input-group">
                  <input type="text" class="form-control" id="captcha" name="captcha" placeholder="验证码"/>
                  <img id="captchaImage" src="captcha" class="img-responsive"/>
                </div>
                <div class="input-group">
                	<input type="radio" value="1" id="level_id" name="level_id" checked="checked" />超级管理员
                	<input type="radio" value="2" id="level_id" name="level_id"/>管理员
                	<input type="radio" value="3" id="level_id" name="level_id"/>辅导员
                	<input type="radio" value="4" id="level_id" name="level_id"/>辅导员助理
                </div> 

              </section>

              <section class="controls">
                <div class="checkbox check-transparent">
                  <input type="checkbox" value="1" id="remember" checked>
                  <label for="remember">记住密码</label>
                </div>
                <a href="#">忘记密码?</a>
              </section>
              <section class="log-in">
                <button type="submit" class="btn btn-greensea">登录</button>
              </section>
              </form:form>
          </div>
        </div>
        <!-- /Page content -->  
      </div>
    </div>
    <!-- Wrap all page content end -->
    <script type="text/javascript">
    	
    	$(function(){
			$('#captchaImage').click(function(){
				$('#captchaImage').attr("src", "captcha?timestamp=" + (new Date()).valueOf());
				});
		});
    </script>
  </body>
</html>
