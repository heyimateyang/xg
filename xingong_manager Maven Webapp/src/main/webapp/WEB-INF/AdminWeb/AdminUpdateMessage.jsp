<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>我的资料</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body id="skin-blur-violate">
  		 <header id="header" class="media">
  		 	<jsp:include page="page/top_message.jsp"/>
  		 </header>
  		 <div class="clearfix"></div>
  		 <section id="main" class="p-relative" role="main">
  		 	<aside id="sidebar">
             <jsp:include page="page/left.jsp"/>	
            </aside>
            
             <!-- Content -->
            <section id="content" class="container">
            	<jsp:include page="page/Adminmessage.jsp"/>
            	<!-- Breadcrumb -->
                <ol class="breadcrumb hidden-xs">
                    <li><a href="AdminLoginIndex">首页</a></li>
                    <li><a href="#">Library</a></li>
                    <li><a href="#">Data</a></li>
                </ol>
                <h4 class="page-title">我的信息</h4>
                
                 <div class="block-area" id="text-input">
                    <h3 class="block-title">我的资料</h3>

                    <div class="row">
                        <div class="col-lg-2">
                        	<p>登录帐号:</p>
                            <input class="form-control" type="text" value="${adminMessage.admin_user }" disabled>
                        </div>
                        <div class="col-lg-2">
                        	<p>帐号状态:</p>
                        	<c:if test="${adminMessage.locked==0}">
                            	<input type="text" class="form-control m-b-10" value="帐号正常" disabled>
                            </c:if>
                            <c:if test="${adminMessage.locked==1}">
                            	<input type="text" class="form-control m-b-10" value="帐号锁定" disabled>
                            </c:if>
                        </div>
                        <div class="col-lg-2">
                        	<p>创建日期:</p>
                            <input type="text" class="form-control m-b-10" value="${adminMessage.adminMessage.create_date }" disabled>
                        </div>
                        <div class="clearfix"></div>
                    </div>
                    <div class="row">
                    	<div class="col-lg-2">
                        	<p>用户名字:</p>
                            <input type="text" class="form-control" value="${adminMessage.adminMessage.admin_name }" disabled>
                        </div>
                        <div class="col-lg-2">
                        	<p>QQ号码:</p>
                            <input type="text" class="form-control" value="${adminMessage.adminMessage.admin_qq }" disabled>
                        </div>
                        <div class="col-lg-2">
                        	<p>微信号:</p>
                            <input type="text" class="form-control" value="${adminMessage.adminMessage.admin_wechat }" disabled>
                        </div>
                    </div>
                    
                    
                    <p></p>
                    
                    <p>头像:</p>
                    	
                    <p></p>
                    <p>Disabled</p>
                    <input class="form-control" type="text" value="This is disabled..." disabled>
                </div>
                
             </section>
           
          </section>  
  </body>
</html>
