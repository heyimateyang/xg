<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    
    <title>欢迎使用管理系统</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<!-- stylesheets css -->
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="css/animate.min.css">
  	<link rel="stylesheet" href="css/et-line-font.css">
	<link rel="stylesheet" href="css/font-awesome.min.css">
  	<link rel="stylesheet" href="css/vegas.min.css">
	<link rel="stylesheet" href="css/style.css">
	<link href="css/font.css" rel='stylesheet' type='text/css'>
	
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
<!-- preloader section -->
<section class="preloader">
	<div class="sk-circle">
       <div class="sk-circle1 sk-child"></div>
       <div class="sk-circle2 sk-child"></div>
       <div class="sk-circle3 sk-child"></div>
       <div class="sk-circle4 sk-child"></div>
       <div class="sk-circle5 sk-child"></div>
       <div class="sk-circle6 sk-child"></div>
       <div class="sk-circle7 sk-child"></div>
       <div class="sk-circle8 sk-child"></div>
       <div class="sk-circle9 sk-child"></div>
       <div class="sk-circle10 sk-child"></div>
       <div class="sk-circle11 sk-child"></div>
       <div class="sk-circle12 sk-child"></div>
    </div>
</section>

<!-- home section -->
<section id="home">
	<div class="container">
		<div class="row">

			<div class="col-md-offset-2 col-md-8 col-sm-12">
				<div class="home-thumb">
					<h1 class="wow fadeInUp" data-wow-delay="0.4s">您好, 欢迎使用管理系统(beta)</h1>
          			<h3 class="wow fadeInUp" data-wow-delay="0.6s">重新开发系统 <strong> 完成新版管理系统</strong> 现在 <strong>稳定性和安全性</strong> 有了全面提高!</h3>
          			<a href="#about" class="btn btn-lg btn-default smoothScroll wow fadeInUp hidden-xs" data-wow-delay="0.8s">现在开始查看新版特性</a>
        			<a href="#" data-toggle="modal" data-target="#modal1" class="btn btn-lg btn-success smoothScroll wow fadeInUp" data-wow-delay="1.0s">学生登录</a>
				</div>
			</div>

		</div>
	</div>		
</section>

<!-- about section -->
<section id="about">
	<div class="container">
		<div class="row">

      <div class="col-md-6 col-sm-12">
        <img src="images/about-img.png" class="img-responsive wow fadeInUp" alt="About">
      </div>

			<div class="col-md-6 col-sm-12">
				<div class="about-thumb">
					<div class="section-title">
						<h1 class="wow fadeIn" data-wow-delay="0.2s">团队开发</h1>
						<h3 class="wow fadeInUp" data-wow-delay="0.4s">来自团队强大的技术支援</h3>
					</div>
					<div class="wow fadeInUp" data-wow-delay="0.6s">
						<p>通过团队不懈努力,解决技术上难题,力求尽最大限度提高系统性能</p>
						<p>
							使用与1.0版本不同的全新技术,
							通过异步服务请求技术,力求全面提高用户的体验效果
						</p>
						
					</div>
					<div class="col-md-6 col-sm-12">
						<img src="images/sanyueyi.jpg" class="img-responsive wow fadeInUp" alt="About">
					</div>
				</div>
				
			</div>
			

		</div>
		
	</div>
	
</section>

<!-- feature section -->
<section id="feature">
  <div class="container">
    <div class="row">
      
      <svg preserveAspectRatio="none" viewBox="0 0 100 102" height="100" width="100%" version="1.1" xmlns="http://www.w3.org/2000/svg" class="svgcolor-light">
        <path d="M0 0 L50 100 L100 0 Z"></path>
      </svg>

      <div class="col-md-4 col-sm-6">
        <div class="media wow fadeInUp" data-wow-delay="0.4s">
          <div class="media-object media-left">
            <i class="icon icon-laptop"></i>
          </div>
          <div class="media-body">
            <h2 class="media-heading">敏捷的服务响应</h2>
            <p>
            	使用全新的开发技术,提高服务器响应速度.
            	极大程度上解决系统并发问题,提高系统的稳定性和安全性.
            </p>
          </div>
        </div>
      </div>

      <div class="col-md-4 col-sm-6">
        <div class="media wow fadeInUp" data-wow-delay="0.8s">
          <div class="media-object media-left">
            <i class="icon icon-refresh"></i>
          </div>
          <div class="media-body">
            <h2 class="media-heading">Bootstrap</h2>
            <p>
				页面使用Bootstrap前端框架,响应式的页面更好第支持移动端的应用
				页面反应更快,更流畅,
				当然还有更漂亮.           
			</p>
          </div>
        </div>
      </div>

      <div class="col-md-4 col-sm-8">
        <div class="media wow fadeInUp" data-wow-delay="1.2s">
          <div class="media-object media-left">
            <i class="icon icon-chat"></i>
          </div>
          <div class="media-body">
            <h2 class="media-heading">系统支持</h2>
            <p>
            	系统支持二次开发
            </p>
          </div>
        </div>
      </div>

      <div class="clearfix text-center col-md-12 col-sm-12">
        <a href="#contact" class="btn btn-default smoothScroll">提出意见</a>
      </div>

    </div>
  </div>
</section>

<!-- contact section -->
<section id="contact">
	<div class="container">
		<div class="row">

			<div class="col-md-offset-2 col-md-8 col-sm-12">
				<div class="section-title">
					<h1 class="wow fadeInUp" data-wow-delay="0.3s">聆听您的声音</h1>
					<p class="wow fadeInUp" data-wow-delay="0.6s">
						虽然系统得到了全面的提升,但由于技术上的限制,我们相信还有很多地方需要改进,所以我们设立了意见反馈系统。
						我们会认真查看每一个反馈的意见,不断提升系统的稳定和性能
					</p>
				</div>
                <script>
                
		                	$(function() {
							$("#submit").click(function() {
							 
								$.ajax( {
									type : "GET",
									url : "SendEmail",
									data : $("#contact-form").serialize(),
									dataType: "text",
									success : function(msg) {
									
								    alert("发送成功");
									}
								});
							});
						});
					
                </script>
				<div class="contact-form wow fadeInUp" data-wow-delay="1.0s">
					<form id="contact-form" method="GET" >
                        <div class="col-md-6 col-sm-6">
                          	<input  name="SendName" type="text" class="form-control" placeholder="您的名字" />
                        </div>
                        <div class="col-md-6 col-sm-6">
                          	<input name="SendEmail"  type="email" class="form-control" placeholder="联系电子邮件" />
                        </div>
           			  	<div class="col-md-12 col-sm-12">
							<textarea name="emailMessage"  id="myEditor"></textarea>  
           			  	</div>
						<div class="col-md-offset-3 col-md-6 col-sm-offset-2 col-sm-8">
							<input name="submit" type="submit" class="form-control submit" id="submit" value="发送">
						</div>
					</form>
				</div>
			</div>
	
		</div>
	</div>
</section>

<!-- footer section -->
<footer>
	<div class="container">
		<div class="row">

      <svg class="svgcolor-light" preserveAspectRatio="none" viewBox="0 0 100 102" height="100" width="100%" version="1.1" xmlns="http://www.w3.org/2000/svg">
        <path d="M0 0 L50 100 L100 0 Z"></path>
      </svg>

      <div class="col-md-4 col-sm-6">
        <h2>管理员用户登录</h2>
          <div class="wow fadeInUp" data-wow-delay="0.3s">
             <p><a href="AdminLogin">管理员登录</a></p>
             
          </div>
      </div>

      <div class="col-md-1 col-sm-1"></div>

      <div class="col-md-4 col-sm-5">
        <h2>联系方式</h2>
        <p class="wow fadeInUp" data-wow-delay="0.6s">
          	Q Q:604248618<br>
          	 电子邮箱：m18028806475@163.com<br>
          	 微信：keaituzixi
        </p>
        
      </div>

		</div>
	</div>
</footer>

<!-- modal -->
<div class="modal fade" id="modal1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
      <div class="modal-content modal-popup">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
          <h2 class="modal-title">学生登录</h2>
        </div>
        <form action="#" method="post">
          <input name="fullname" type="text" class="form-control" id="fullname" placeholder="登录帐号">
          <input name="email" type="password" class="form-control" id="email" placeholder="登录密码">
          <input name="submit" type="submit" class="form-control" id="submit" value="马上登入">
        </form>
        <p>欢迎使用</p>
      </div>
  </div>
</div>


<!-- Back top -->
<a href="#back-top" class="go-top"><i class="fa fa-angle-up"></i></a>
  
  
  	<!-- link javascript -->
    <script src="js/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/vegas.min.js"></script>
	<script src="js/wow.min.js"></script>
	<script src="js/smoothscroll.js"></script>
	<script src="js/custom.js"></script>  
	
</body>
</html>
