<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>用户权限不足</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	 <!-- CSS -->
     <link href="Admin/css/bootstrap.min.css" rel="stylesheet">
     <link href="Admin/css/animate.min.css" rel="stylesheet">
     <link href="Admin/css/font-awesome.min.css" rel="stylesheet">
     <link href="Admin/css/form.css" rel="stylesheet">
     <link href="Admin/css/calendar.css" rel="stylesheet">
     <link href="Admin/css/style.css" rel="stylesheet">
     <link href="Admin/css/icons.css" rel="stylesheet">
     <link href="Admin/css/generics.css" rel="stylesheet"> 

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
                    <li>首页</li>
                    <li><a href="#">Library</a></li>
                    <li><a href="#">Data</a></li>
                </ol>
                <h4 class="page-title">权限错误</h4>
        	<h2>用户权限不足</h2>
        </section>
  	 </section>
    
  </body>
</html>
