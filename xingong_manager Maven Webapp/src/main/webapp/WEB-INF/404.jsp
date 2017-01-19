<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>该页面可能去了火星</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" href="css/main.css" type="text/css" media="screen, projection" /> <!-- main stylesheet -->
	<link rel="stylesheet" type="text/css" media="all" href="css/tipsy.css" /> <!-- Tipsy implementation -->
	
	
	<script type="text/javascript" src="scripts/jquery-1.7.2.min.js"></script> <!-- uiToTop implementation -->
	<script type="text/javascript" src="scripts/custom-scripts.js"></script>
	<script type="text/javascript" src="scripts/jquery.tipsy.js"></script> <!-- Tipsy -->
	
	<script type="text/javascript">
	
	$(document).ready(function(){
				
		universalPreloader();
							   
	});
	
	$(window).load(function(){
	
		//remove Universal Preloader
		universalPreloaderRemove();
		
		rotate();
	    dogRun();
		dogTalk();
		
		//Tipsy implementation
		$('.with-tooltip').tipsy({gravity: $.fn.tipsy.autoNS});
							   
	});
	
	</script>
  </head>
  
  <body>
    <!-- Universal preloader -->
<div id="universal-preloader">
    <div class="preloader">
        <img src="images/universal-preloader.gif" alt="universal-preloader" class="universal-preloader-preloader" />
    </div>
</div>
<!-- Universal preloader -->

<div id="wrapper">
<!-- 404 graphic -->
	<div class="graphic"></div>
<!-- 404 graphic -->
<!-- Not found text -->
	<div class="not-found-text">
    	<h1 class="not-found-text">页面去了火星休假</h1>
    </div>
<!-- Not found text -->

<!-- search form -->
<div class="search">
	<form name="search" method="get" action="#" />
        <input type="text" name="search" value="暂未开发全文搜索" />
        <input class="with-tooltip" title="Search!" type="submit" name="submit" value="" />
    </form>
</div>
<!-- search form -->


<!-- top menu -->
<div class="top-menu">
	<br/>
	<a href="index" class="with-tooltip" title="返回首页">首页</a> 	
</div>
<!-- top menu -->

<div class="dog-wrapper">
<!-- dog running -->
	<div class="dog"></div>
<!-- dog running -->
	
<!-- dog bubble talking -->
	<div class="dog-bubble">
    	
    </div>
    
    <!-- The dog bubble rotates these -->
    <div class="bubble-options">
    	<p class="dog-bubble">
        	你走丢了,但不是不用怕,有我在呢!
        </p>
    	<p class="dog-bubble">
	        <br />
        	啊哈! 啊哈!
        </p>
        <p class="dog-bubble">
        	<br />
        	不用担心,我会带你回去正确的地方的！
        </p>
        <p class="dog-bubble">
        	我想会家,但是希望有你作伴<br /><img style="margin-top:8px" src="images/cookie.png" alt="cookie" />
        </p>
        <p class="dog-bubble">
        	<br />
        	很好！快到家了！！
        </p>
        <p class="dog-bubble">
        	<br />
        	呃！我走失了？
        </p>
        <p class="dog-bubble">
        	或者我只是在兜圈子？ 好吧...
        </p>
        <p class="dog-bubble">
        	<br />
            	好吧, 我也是路盲...
        </p>
        <p class="dog-bubble">
        	等等,我觉得快到了！ <br /><img style="margin-top:8px" src="images/cat.png" alt="cat" />
        </p>
        <p class="dog-bubble">
        	感谢有你陪我,点击右上首页就行啦！期待下次再见！
        </p>
    </div>
    <!-- The dog bubble rotates these -->
	<!-- dog bubble talking -->
	</div>
	
	<!-- planet at the bottom -->
		<div class="planet"></div>
	<!-- planet at the bottom -->
	</div>
  </body>
</html>
