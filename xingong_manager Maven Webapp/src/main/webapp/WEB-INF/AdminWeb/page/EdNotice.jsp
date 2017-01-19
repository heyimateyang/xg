<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    
    <title>My JSP 'EdNotice.jsp' starting page</title>
    
    <style type="text/css">
		.edui-default .edui-editor-iframeholder {  
	     height: 200px;  
	     background-color:#F8F8FF;  
 		}  
	</style>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
	<!-- 百度文本编辑器 -->
	<script type="text/javascript" charset="utf-8" src="Editor/ueditor.config.js"></script>
  	<script type="text/javascript" charset="utf-8" src="Editor/ueditor.all.min.js"></script>
  	<script type="text/javascript" src="Editor/lang/zh-cn/zh-cn.js"></script>
  	<script type="text/javascript" src="js/jquery-1.6.2.min.js"></script>
  	<link rel="stylesheet" href="Editor/themes/default/css/ueditor.css"/>
	
	<!-- 实例化百度文本编辑 -->
	<script type="text/javascript"> 
		var editor = new UE.ui.Editor(); 
		editor.render("myEditor");  
	</script> 
  </head>
  <body>
		<textarea name="notice_message"  id="myEditor" style="height: 45%"></textarea>   
  </body>
</html>
