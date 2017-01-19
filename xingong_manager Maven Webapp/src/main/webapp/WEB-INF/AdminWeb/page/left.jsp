<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>left</title>
    
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
        <link href="Admin/css/lightbox.css" rel="stylesheet">
        <link href="Admin/css/media-player.css" rel="stylesheet">
        <link href="Admin/css/generics.css" rel="stylesheet"> 
	 

  </head>
  
  <body>
     <!-- Sidebar -->
            
                
                <!-- Sidbar Widgets -->
                <div class="side-widgets overflow">
                    <!-- Profile Menu -->
                    <div class="text-center s-widget m-b-25 dropdown" id="profile-menu">
                        <a href="" data-toggle="dropdown">
                            <img class="profile-pic animated" src="Admin/img/profile-pic.jpg" alt="">
                        </a>
                        <ul class="dropdown-menu profile-menu">
                            <li><a href="updateAdminMessage">我的资料</a> <i class="icon left">&#61903;</i><i class="icon right">&#61815;</i></li>
                            <li><a href="sendNotice">发布公告</a> <i class="icon left">&#61903;</i><i class="icon right">&#61815;</i></li>
                            <li><a href="">系统设置</a> <i class="icon left">&#61903;</i><i class="icon right">&#61815;</i></li>
                            <li><a href="RemoveAdmin">退出登录</a> <i class="icon left">&#61903;</i><i class="icon right">&#61815;</i></li>
                        </ul>
                        <h4 class="m-0">管理员${adminMessage.admin_user }</h4>
                        @${adminMessage.adminMessage.admin_name}
                    </div>
                    
                    <!-- Calendar -->
                    <div class="s-widget m-b-25">
                        <div id="sidebar-calendar"></div>
                    </div>
                    
                    <!-- Feeds -->
                    <div class="s-widget m-b-25">
                        <h2 class="tile-title">
                           	系统公告
                        </h2>
                        
                        <div class="s-widget-body">
                            <div id="news-feed"></div>
                        </div>
                    </div>
                    
                    <!-- Projects -->
                    <div class="s-widget m-b-25">
                        <h2 class="tile-title">
                            	个人资料
                        </h2>
                        
                        <div class="s-widget-body">
                            <div class="side-border">
                                <small>登录帐号:</small>
                                
                                ${adminMessage.admin_user }
                            </div>
                            <br/>
                            <div class="side-border">
                                <small>管理员名字:</small>
                                ${adminMessage.adminMessage.admin_name}
                            </div>
                            <br/>
                            <div class="side-border">
                                <small>QQ:</small>
                                ${adminMessage.adminMessage.admin_qq}
                            </div>
                            <br/>
                            <div class="side-border">
                                <small>微信:</small>
                                ${adminMessage.adminMessage.admin_wechat}
                            </div>
                            <br/>
                            <div class="side-border">
                                <small>头像:</small>
                                <div class="block-area">
	                                <a href="adminImage/${adminMessage.adminMessage.admin_portrait}" data-rel="gallery"  class="pirobox_gall img-popup" title="我的头像">
				                        <img src="adminImage/${adminMessage.adminMessage.admin_portrait}" alt="" width="150">  
				                    </a>
			                    </div>
                            </div>
                            <br/>
                            <div class="side-border">
                                <small>注册日期:</small>
                                ${adminMessage.adminMessage.create_date}
                            </div>
                        </div>
                    </div>
                </div>
                
                <!-- Side Menu -->
                <ul class="list-unstyled side-menu">
                    <li class="dropdown">
                        <a class="sa-side-form" href="">
                            <span class="menu-item">主页</span>
                        </a>
                        <ul class="list-unstyled menu-item">
                            <li><a href="AdminLoginIndex">首页</a></li>
                            
                        </ul>
                    </li>
                    <li>
                        <a class="sa-side-typography" href="typography.html">
                            <span class="menu-item">Typography</span>
                        </a>
                    </li>
                    <li>
                        <a class="sa-side-widget" href="content-widgets.html">
                            <span class="menu-item">Widgets</span>
                        </a>
                    </li>
                    <li>
                        <a class="sa-side-table" href="tables.html">
                            <span class="menu-item">Tables</span>
                        </a>
                    </li>
                    <li class="dropdown">
                        <a class="sa-side-form" href="">
                            <span class="menu-item">Form</span>
                        </a>
                        <ul class="list-unstyled menu-item">
                            <li><a href="form-elements.html">Basic Form Elements</a></li>
                            <li><a href="form-components.html">Form Components</a></li>
                            <li><a href="form-examples.html">Form Examples</a></li>
                            <li><a href="form-validation.html">Form Validation</a></li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a class="sa-side-ui" href="">
                            <span class="menu-item">User Interface</span>
                        </a>
                        <ul class="list-unstyled menu-item">
                            <li><a href="buttons.html">Buttons</a></li>
                            <li><a href="labels.html">Labels</a></li>
                            <li><a href="images-icons.html">Images &amp; Icons</a></li>
                            <li><a href="alerts.html">Alerts</a></li>
                            <li><a href="media.html">Media</a></li>
                            <li><a href="components.html">Components</a></li>
                            <li><a href="other-components.html">Others</a></li>
                        </ul>
                    </li>
                    <li>
                        <a class="sa-side-chart" href="charts.html">
                            <span class="menu-item">Charts</span>
                        </a>
                    </li>
                    <li>
                        <a class="sa-side-folder" href="file-manager.html">
                            <span class="menu-item">File Manager</span>
                        </a>
                    </li>
                    <li>
                        <a class="sa-side-calendar" href="calendar.html">
                            <span class="menu-item">Calendar</span>
                        </a>
                    </li>
                    <li class="dropdown">
                        <a class="sa-side-page" href="">
                            <span class="menu-item">Pages</span>
                        </a>
                        <ul class="list-unstyled menu-item">
                            <li><a href="list-view.html">List View</a></li>
                            <li><a href="profile-page.html">Profile Page</a></li>
                            <li><a href="messages.html">Messages</a></li>
                            <li><a href="login.html">Login</a></li>
                            <li><a href="404.html">404 Error</a></li>
                        </ul>
                    </li>
                </ul>

  
  
  		<!-- Javascript Libraries -->
        <!-- jQuery -->
        <script src="Admin/js/jquery.min.js"></script> <!-- jQuery Library -->
        <script src="Admin/js/jquery-ui.min.js"></script> <!-- jQuery UI -->
        <script src="js/jquery.easing.1.3.js"></script> <!-- jQuery Easing - Requirred for Lightbox + Pie Charts-->

        <!-- Bootstrap -->
        <script src="Admin/js/bootstrap.min.js"></script>

        <!-- Charts -->
        <script src="Admin/js/charts/jquery.flot.js"></script> <!-- Flot Main -->
        <script src="Admin/js/charts/jquery.flot.time.js"></script> <!-- Flot sub -->
        <script src="Admin/js/charts/jquery.flot.animator.min.js"></script> <!-- Flot sub -->
        <script src="Admin/js/charts/jquery.flot.resize.min.js"></script> <!-- Flot sub - for repaint when resizing the screen -->

        <script src="Admin/js/sparkline.min.js"></script> <!-- Sparkline - Tiny charts -->
        <script src="Admin/js/easypiechart.js"></script> <!-- EasyPieChart - Animated Pie Charts -->
        <script src="Admin/js/charts.js"></script> <!-- All the above chart related functions -->

        <!--  Form Related -->
        <script src="Admin/js/icheck.js"></script> <!-- Custom Checkbox + Radio -->

        <!-- UX -->
        <script src="Admin/js/scroll.min.js"></script> <!-- Custom Scrollbar -->

        <!-- Other -->
        <script src="Admin/js/calendar.min.js"></script> <!-- Calendar -->
        <script src="Admin/js/feeds.min.js"></script> <!-- News Feeds -->
        
        
        <!-- Media -->
        <script src="Admin/js/media-player.min.js"></script> <!-- Video Player -->
        <script src="Admin/js/pirobox.min.js"></script> <!-- Lightbox -->

        <!-- All JS functions -->
        <script src="Admin/js/functions.js"></script>
  
   
  </body>
</html>
