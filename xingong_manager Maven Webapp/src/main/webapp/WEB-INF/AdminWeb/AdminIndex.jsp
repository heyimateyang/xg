<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>后台管理首页</title>
    
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
	 
	 <script src="js/jquery.js"></script>
	 <script type="text/javascript" src="http://ajax.useso.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
	 <script type="text/javascript">
	 	
	 	
	 	
	 	function resquestByKV() {
			var system_email =$("#system_email").val();
	 		var system_emailPwd =$("#system_emailPwd").val();
	 		var email_server =$("#email_server").val();
 			var systemEmail = {system_email:$("#system_email").val(),
 			system_emailPwd:$("#system_emailPwd").val(),email_server:$("#email_server").val()};
         $.ajax({
				
                   type : 'GET',

                   url : '${pageContext.request.contextPath}/kvsource',

                   data : systemEmail,

                   success : function(data) {
                            alert("修改成功");
                            
							$("#system_email").val(data.system_email);
							$("#system_emailPwd").val(data.system_emailPwd);
							$("#email_server").val(data.email_server); 
                   }

         });

}
	 </script>

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
                <h4 class="page-title">系统信息</h4>
                
                 <!-- Paragraph -->
                <article id="paragraph" class="block-area">
                    <h3 class="block-title">2.0版本更新内容(Beta)</h3>
                    <p>
                    	重写系统所有源码,提高系统的稳定性能和安全性
                    </p>
                    <p>
                    	系统特色：
                    </p>
                    <p>
                    	拦截字符,URL地址.系统安全要求提高
                    </p>
                    <p>
                    	重写处理算法,处理业务速度提高,安全验证得到提高
                    </p>
                    <p>
                    	适应移动端,更加美观.提高用户体验度
                    </p>
                    <br/>
                </article>
               
               <hr class="whiter" />
                <div class="block-area" id="basic">
                    <h3 class="block-title">系统默认邮箱(如开启邮箱验证功能,需输入邮箱验证码.可参考各邮箱服务提供商)</h3>
                    <form role="form"  id="contact-form" method="get">
                        <div class="form-group">
                            <label for="exampleInputEmail1">邮箱地址</label>
                            
                            <input type="email" class="form-control input-sm" name="system_email" id="system_email" placeholder="邮箱地址" value="${Email.system_email}"/>
                        </div>
                        
                        <div class="form-group">
                             <label for="exampleInputPassword1">邮箱密码或验证码</label>
                             <input type="text" class="form-control input-sm" name="system_emailPwd" id="system_emailPwd" placeholder="邮箱密码或验证码" value="${EmailPwd}">
                        </div>
                        
                        <div class="form-group">
                             <label for="exampleInputPassword1">邮箱服务器地址(POP3/SMTP/IMAP)</label>
                             <input type="text" class="form-control input-sm" name="email_server" id="email_server" placeholder="邮箱服务器地址" value="${Email.email_server }">
                        </div>

                        <input type="button" class="btn btn-sm m-t-10" id="submit" name="submit" onclick="resquestByKV()" value="修改"/>
                    </form>
                </div>
                
                <hr class="whiter" />
                <!-- Addresses -->
                <article class="block-area" id="addresses">
                    <h3 class="block-title">系统环境配置</h3>
                    <address>
                        <strong>Tomcat 7以上版本</strong><br>
                        	为防止内存溢出等异常,Tomcat内存分配至少2G以上<br>
                       
                    </address>
                    
                    <address>
                        <strong>开发语言</strong><br>
                        <a href="#">
                        	使用java springMVC开发
                        	spring-security提高系统安全度
                        </a>
                    </address>
                </article>
                
            </section>
            
            
            
  		 </section>
  		 
  		 
  		 
  		 
  		
  </body>
</html>
