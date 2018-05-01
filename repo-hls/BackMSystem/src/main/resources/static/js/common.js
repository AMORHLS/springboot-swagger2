// JavaScript Document

	/*
	//布局
	*/
	 var sidebarHeight;//侧边高度
     var sidebarWidth;//侧边宽度
	 var lurubaWrapperHeight = $(document.body).height()-50+'px';//获取body的高度-顶部导航的高度
     var bodyWidth = $(document.body).width();
	 $('.lurubaWrapper').height(lurubaWrapperHeight);//赋值给中间内容高度
	 $('.lurubaWrapper').width(bodyWidth-230+'px');
	 $('.main-sidebar').resize(function(){//监听侧边导航高度发生改变
		sidebarHeight = $('.main-sidebar').height();//获取侧边高度
		sidebarWidth = $('.main-sidebar').width();//获取侧边宽度
		$('.lurubaWrapper').height(sidebarHeight);//赋值给中间内容高度
		$('.lurubaWrapper').css({
			marginLeft:sidebarWidth+'px',
		});
		$('.lurubaWrapper').width(bodyWidth-sidebarWidth+'px');//赋值给中间内容宽度
		
	});
    
    $(window).resize(function(){
		$('.lurubaWrapper').width(bodyWidth-sidebarWidth+'px');//赋值给中间内容宽度
	});
    
	
	



	$('.sidebar-menu li').click(function(){
//		$(this).css('border-left-color','#3c8dbc 5px ');
		$(this).addClass('active').siblings().removeClass('active');
		$(this).siblings().children('.treeview-menu').hide();
		if($(this).children('.treeview-menu').is(':hidden')){
		   $(this).children('.treeview-menu').show();
		}else{
		   $(this).children('.treeview-menu').hide();
		}
		
	})

	 //阻止冒泡事件方法
	function stopPropagation(e) { 
		  e = e || window.event; 
		  if(e.stopPropagation) { //W3C阻止冒泡方法 
			  e.stopPropagation(); 
		  } else { 
			  e.cancelBubble = true; //IE阻止冒泡方法 
		  } 
	  }

	$(".treeview-menu").click(function(e){//点击登录框阻止冒泡
		 stopPropagation(e); 

	});
   
	$(".layui-layer").scroll(function() {
	   stopPropagation(e); 
	});


   /*
   //点击显示隐藏按钮事件
   */
   var navshow =true;
   $('.sidebar-toggle').click(function(){
	   if(navshow){
		 /*顶部栏显示隐藏*/
		 $('.logo').css('width','50px');
		 $('.navbar').css({marginLeft:'50px',});
		 $('.logo-lg').hide();
		 $('.logo-mini').show();
		   
		 /*侧边栏显示隐藏*/
		 $('.main-sidebar').css('width','50px');
		 $('.main-sidebar span').hide();
		 $('.sidebar-form').hide();
		 navshow =false;
	   }else{
		 /*顶部栏显示隐藏*/
		 $('.logo').css('width','230px');
		 $('.navbar').css({marginLeft:'230px',});
		 $('.logo-lg').show();
		 $('.logo-mini').hide();
		   
		 /*侧边栏显示隐藏*/
		 $('.main-sidebar').css('width','230px');
		 $('.main-sidebar span').show();
		 $('.sidebar-form').show();

		 navshow =true;
	   }
	   
	   
	    /*
		//收缩后导航点击事件
		*/
	   
//	   
//		$('.sidebar-menu li').click(function(){
//			$(this).addClass('active').siblings().removeClass('active');
//			$(this).siblings().children('.treeview-menu').hide();
//			$(this).find('a').css('width','230px');
//			$(this).find('span').show();
//			$(this).find('span').css({
//				marginLeft:'29px',
//			});
//			$(this).children('.treeview-menu').first().css({
//				position:'absolute',
//				top:'44px',
//				left:'49px',
//				width:'180px'
//			});
//			$(this).find('.treeview').find('a').css({width:'180px'});
//
//				
//			});

	   
      });

		 








