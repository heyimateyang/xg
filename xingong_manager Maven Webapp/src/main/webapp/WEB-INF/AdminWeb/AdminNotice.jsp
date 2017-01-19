<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>发布公告</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
    <style type="text/css">
		.edui-default .edui-editor-iframeholder {  
	     height: 200px;  
	     background-color:#F8F8FF;  
 		}  
	</style>
	 
	
	
     
     
     
    <!-- 百度文本编辑器 -->
	<script type="text/javascript" charset="utf-8" src="Editor/ueditor.configAdmin.js"></script>
  	<script type="text/javascript" charset="utf-8" src="Editor/ueditor.all.min.js"></script>
  	
  	<script type="text/javascript" src="Editor/lang/zh-cn/zh-cn.js"></script>
  	<script type="text/javascript" src="js/jquery-1.6.2.min.js"></script>
  	<link rel="stylesheet" href="Editor/themes/default/css/ueditorAdmin.css"/>
	
	<!-- 实例化百度文本编辑 -->
	<script type="text/javascript"> 
		var editor = new UE.ui.Editor(); 
		editor.render("myEditor");  
	</script> 
     
   
	 
	<script src="js/jquery.js"></script>
	<script type="text/javascript" src="http://ajax.useso.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
	 
	
	 
	
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
			        <li><a href="#">正在编辑公告...</a></li>
			        <li><a href="#">公告列表</a></li>
	        	</ol>
	        <h4 class="page-title">发布系统公告</h4>
              <!-- Text Editor -->
                <div class="block-area" id="text-editor">
                    <h3 class="block-title">发布系统公告</h3>
                    <br/>
                    <h2>编辑全局系统公告: </h2>
                    <textarea name="emailMessage"  id="myEditor" style="height: 100%; color:#666666;"></textarea>  
                    
                </div>
               
	            
	        
	  	 </section>
        
  	 </section>
  	 
  	 
  	 
  </body>
</html>
