<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!doctype html>
<html class="no-js">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Cookies</title>
<meta name="description" content="这是一个 index 页面">
<meta name="keywords" content="index">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<meta name="renderer" content="webkit">
<meta http-equiv="Cache-Control" content="no-siteapp" />



<link rel="stylesheet" href="<%=basePath %>style/css/amazeui.min.css"/>
<link rel="stylesheet" href="<%=basePath %>style/css/admin.css">
            

<script src="<%=basePath %>style/js/jquery.min.js"></script>
<script src="<%=basePath %>style/js/app.js"></script>
</head>
<body>
</head>

<body>
	
    	
  
<header class="am-topbar admin-header">
  

<div class="am-topbar-brand"><img src="assets/img/logo.png"></div>

  <div class="am-collapse am-topbar-collapse" id="topbar-collapse">
  	
  	<li class="am-dropdown tognzhi" data-am-dropdown>
  <button class="am-btn am-btn-primary am-dropdown-toggle am-btn-xs am-radius am-icon-bell-o" data-am-dropdown-toggle> 消息管理<span class="am-badge am-badge-danger am-round">6</span></button>
  <ul class="am-dropdown-content">
  	
  	
  	
    <li class="am-dropdown-header"></li>

    

    <li><a href="#">新订单<span class="am-badge am-badge-danger am-round">15</span></a></li>
    <li><a href="#">未发货订单<span class="am-badge am-badge-danger am-round">6</span></a></a></li>
    <li><a href="#">已确认订单</a></li>
    <li><a href="#">取消订单处理</a></li>
    <li><a href="#">新评论</a></li>
    
    
    
  </ul>
</li>
  	
    <ul class="am-nav am-nav-pills am-topbar-nav admin-header-list">

   <li class="am-dropdown tognzhi" data-am-dropdown>
  
  
  
</li>

 <li class="kuanjie">	
 </li>

 <li class="soso">	
<p>   
	<select data-am-selected="{btnWidth: 70, btnSize: 'sm', btnStyle: 'default'}">
          <option value="b">全部</option>
          <option value="o">产品</option>
          <option value="o">会员</option>         
       </select>
</p>
<p class="ycfg">
	<input type="text" class="am-form-field am-input-sm" placeholder="搜索..." />
</p>
<p>
	<button class="am-btn am-btn-xs am-btn-default am-xiao">
		<i class="am-icon-search"></i>
	</button>
</p>
 </li>




      <li class="am-hide-sm-only" style="float: right;"><a href="javascript:;" id="admin-fullscreen"><span class="am-icon-arrows-alt"></span> <span class="admin-fullText">开启全屏</span></a></li>
    </ul>
  </div>
</header>

<div class="am-cf admin-main"> 

<div class="nav-navicon admin-main admin-sidebar">
    
    
    <div class="sideMenu am-icon-dashboard" style="color:#aeb2b7; margin: 10px 0 0 0;"> 欢迎系统管理员：小饼干</div>
    <div class="sideMenu">
      <a href="#" id="goodsmanagement"><h3 class="am-icon-flag"><em></em>商品管理</h3>
    <ul></ul></a>
    
      <a href="#" id="order"><h3 class="am-icon-cart-plus"><em></em> 订单处理 </h3>
   	<ul></ul></a>
   	
   	<a href="#" id="comments">
       <h3 class="am-icon-cart-plus"><em></em>评论管理 </h3>
    <ul></ul>
    </a>
      <h3 class="am-icon-users"><em></em>会员管理</h3>
      <ul>
        <a href="#"  id="menberlist"><li>用户会员管理</li></a> 
        <a href="#"  id="shoplist"><li>商家管理</li></a>
      </ul>
      <a href="#" id="red"><h3 class="am-icon-volume-up"><em></em> 发布红包</h3></a>
     
      
     
    </div>
    <!-- sideMenu End --> 
    
    <script type="text/javascript">
			jQuery(".sideMenu").slide({
				titCell:"h3", //鼠标触发对象
				targetCell:"ul", //与titCell一一对应，第n个titCell控制第n个targetCell的显示隐藏
				effect:"slideDown", //targetCell下拉效果
				delayTime:300 , //效果时间
				triggerTime:150, //鼠标延迟触发时间（默认150）
				defaultPlay:true,//默认是否执行效果（默认true）
				returnDefault:true //鼠标从.sideMen移走后返回默认状态（默认false）
				});
		</script> 

</div>

<div class=" admin-content"  >
	<!--小导航-->
		<div class="daohang">
			<ul>
				
			</ul>
			
	
		</div>

<!--商品管理begin-->
<div id="goodsmanagementdiv" class="admin" style="display: block;">
	

<div class="admin-biaogelist">
     
     <div class="listbiaoti am-cf">
        <ul class="am-icon-flag on">
          商品管理
        </ul>
        <dl class="am-icon-home" style="float: right;">
         首页> <a href="#">商品管理</a>
        </dl>
      </div>
     
     
     <form class="am-form am-g">
        <table width="100%" class="am-table am-table-bordered am-table-radius am-table-striped am-table-hover">
          <thead>
            <tr class="am-success">
              <th class="table-id am-text-center">ID</th>
              <th class="table-title">商品名称</th>
              <th class="table-type">商品介绍</th>
              
              <th class="table-author am-hide-sm-only">商品价格</th>
              <th>商家名称</th>
              <th width="125px" class="table-set">操作</th>
            </tr>
          </thead>
          <tbody>
          <c:forEach items="${foodOfShopList}" var="shop">
            <tr>
              <c:forEach items="${shop.foodlist}" var="food">
              <td class="am-text-center">${food.foodid}</td>
              <td><a href="#">${food.foodname}</a></td>
              <td>${food.foodcontent}</td>
              <td>${food.foodprice}</td>

              <td class="am-hide-sm-only">${shop.shopname}</td>
              
              <td><div class="am-btn-toolbar">
	                  <div class="am-btn-group am-btn-group-xs">
	                  	<a class="am-btn am-btn-default am-btn-xs am-text-success am-round am-icon-file" data-am-modal="{target: '#my-popups'}" title="修改"></a>
	                    <!-- 用按钮的时候 弹层 后缀需要加 问好 ？#的 时候才有效 真恶心 .html?# -->
	                    <button class="am-btn am-btn-default am-btn-xs am-text-danger am-round"  title="删除"><span class="am-icon-trash-o"></span></button>
	                  </div>
                </div>
               </td>
            </tr>
            </c:forEach>
	</c:forEach>
	
          </tbody>
        </table>
        <div class="am-btn-group am-btn-group-xs">
          <button type="button" class="am-btn am-btn-default"><span class="am-icon-plus"></span> 删除</button>
          <button type="button" class="am-btn am-btn-default"><span class="am-icon-plus"></span> 新增</button>
          <button type="button" class="am-btn am-btn-default"><span class="am-icon-save"></span> 保存</button>
          <button type="button" class="am-btn am-btn-default"><span class="am-icon-trash-o"></span> 删除</button>
        </div>
        <ul class="am-pagination am-fr">
          <li class="am-disabled"><a href="#">«</a></li>
          <li class="am-active"><a href="#">1</a></li>
          <li><a href="#">2</a></li>
          <li><a href="#">3</a></li>
          <li><a href="#">4</a></li>
          <li><a href="#">5</a></li>
          <li><a href="#">»</a></li>
        </ul>
        <hr />
       
      </form>

      <div class="foods">
        <ul>
          <a href="#" target="_blank" title="小饼干">你算哪个小饼干</a>
        </ul>
        
      </div>
    </div>




</div>
<!--商品管理end-->
<!--订单处理begin-->
 <div id="orderdiv" class="admin"  style="display: none;">
	
<div class="admin-biaogelist">
     
     <div class="listbiaoti am-cf">
        <ul class="am-icon-flag on">
          订单处理
        </ul>
        <dl class="am-icon-home" style="float: right;">
       首页>
       <a href="#">订单处理</a>
        </dl>
         
        
      </div>
     
     
     <form class="am-form am-g">
        <table width="100%" class="am-table am-table-bordered am-table-radius am-table-striped am-table-hover">
          <thead>
            <tr class="am-success">
              <th class="table-check" width="5%"><input type="checkbox" /></th>
              <th class="table-id" width="7%">会员</th>
              <th class="table-id am-text-center" width="10%">ID</th>
              <th class="table-title" width="8%">客户</th>
              <th class="table-type" width="30%">订单内容</th>
              <th class="table-type" width="30%">备注</th>
              <th class="table-author am-hide-sm-only" width="10%">总价格</th>
             
              <th width="150px" class="table-set">操作</th>
            </tr>
          </thead>
          <tbody>
					


<tr>
	              <td><input type="checkbox" /></td>
	              <td class="am-text-center">是</td>
	              <td class="am-text-center">1</td>
	              <td>卫弘道</td>
	              <td>回锅肉、肉末茄子、米饭、</td>
	              <td>加饭、不要香菜、</td>
	              <td class="am-hide-sm-only">23￥</td>
	              
	              <td><div class="am-btn-toolbar">
	                  <div class="am-btn-group am-btn-group-xs">
	                  <a class="am-btn am-btn-default am-btn-xs am-text-success am-round am-icon-file" data-am-modal="{target: '#my-popups'}" title="接单"></a>
	                  
	                  
	                    <button class="am-btn am-btn-default am-btn-xs am-text-secondary am-round" data-am-modal="{target: '#my-popups'}" title="修改订单"><span class="am-icon-pencil-square-o" ></span></button>
	                    <!-- 用按钮的时候 弹层 后缀需要加 问好 ？#的 时候才有效 真恶心 .html?# -->
	                    <button class="am-btn am-btn-default am-btn-xs am-text-danger am-round"  title="取消订单"><span class="am-icon-trash-o"></span></button>
	                  </div>
	                </div></td>
	            </tr>
	            
	            
	
	            
	                <tr>
	              <td><input type="checkbox" /></td>
	              <td class="am-text-center">是</td>
	              <td class="am-text-center">1</td>
	              <td>卫弘道</td>
	              <td>回锅肉、肉末茄子、米饭、</td>
	              <td>加饭、不要香菜、</td>
	              <td class="am-hide-sm-only">23￥</td>
	              
	              <td><div class="am-btn-toolbar">
	                  <div class="am-btn-group am-btn-group-xs">
	                  <a class="am-btn am-btn-default am-btn-xs am-text-success am-round am-icon-file" data-am-modal="{target: '#my-popups'}" title="接单"></a>
	                  
	                  
	                    <button class="am-btn am-btn-default am-btn-xs am-text-secondary am-round" data-am-modal="{target: '#my-popups'}" title="修改订单"><span class="am-icon-pencil-square-o" ></span></button>
	                    <!-- 用按钮的时候 弹层 后缀需要加 问好 ？#的 时候才有效 真恶心 .html?# -->
	                    <button class="am-btn am-btn-default am-btn-xs am-text-danger am-round"  title="取消订单"><span class="am-icon-trash-o"></span></button>
	                  </div>
	                </div></td>
	            </tr>
	    
	            
	            
	                <tr>
	              <td><input type="checkbox" /></td>
	              <td class="am-text-center">是</td>
	              <td class="am-text-center">1</td>
	              <td>卫弘道</td>
	              <td>回锅肉、肉末茄子、米饭、</td>
	              <td>加饭、不要香菜、</td>
	              <td class="am-hide-sm-only">23￥</td>
	              
	              <td><div class="am-btn-toolbar">
	                  <div class="am-btn-group am-btn-group-xs">
	                  <a class="am-btn am-btn-default am-btn-xs am-text-success am-round am-icon-file" data-am-modal="{target: '#my-popups'}" title="接单"></a>
	                  
	                  
	                    <button class="am-btn am-btn-default am-btn-xs am-text-secondary am-round" data-am-modal="{target: '#my-popups'}" title="修改订单"><span class="am-icon-pencil-square-o" ></span></button>
	                    <!-- 用按钮的时候 弹层 后缀需要加 问好 ？#的 时候才有效 真恶心 .html?# -->
	                    <button class="am-btn am-btn-default am-btn-xs am-text-danger am-round"  title="取消订单"><span class="am-icon-trash-o"></span></button>
	                  </div>
	                </div></td>
	            </tr>
	 			    <tr>
	              <td><input type="checkbox" /></td>
	              <td class="am-text-center">是</td>
	              <td class="am-text-center">1</td>
	              <td>卫弘道</td>
	              <td>回锅肉、肉末茄子、米饭、</td>
	              <td>加饭、不要香菜、</td>
	              <td class="am-hide-sm-only">23￥</td>
	              
	              <td><div class="am-btn-toolbar">
	                  <div class="am-btn-group am-btn-group-xs">
	                  <a class="am-btn am-btn-default am-btn-xs am-text-success am-round am-icon-file" data-am-modal="{target: '#my-popups'}" title="接单"></a>
	                  
	                  
	                    <button class="am-btn am-btn-default am-btn-xs am-text-secondary am-round" data-am-modal="{target: '#my-popups'}" title="修改订单"><span class="am-icon-pencil-square-o" ></span></button>
	                    <!-- 用按钮的时候 弹层 后缀需要加 问好 ？#的 时候才有效 真恶心 .html?# -->
	                    <button class="am-btn am-btn-default am-btn-xs am-text-danger am-round"  title="取消订单"><span class="am-icon-trash-o"></span></button>
	                  </div>
	                </div></td>
	            </tr>
	    
	                <tr>
	              <td><input type="checkbox" /></td>
	              <td class="am-text-center">是</td>
	              <td class="am-text-center">1</td>
	              <td>卫弘道</td>
	              <td>回锅肉、肉末茄子、米饭、</td>
	              <td>加饭、不要香菜、</td>
	              <td class="am-hide-sm-only">23￥</td>
	              
	              <td><div class="am-btn-toolbar">
	                  <div class="am-btn-group am-btn-group-xs">
	                  <a class="am-btn am-btn-default am-btn-xs am-text-success am-round am-icon-file" data-am-modal="{target: '#my-popups'}" title="接单"></a>
	                  
	                  
	                    <button class="am-btn am-btn-default am-btn-xs am-text-secondary am-round" data-am-modal="{target: '#my-popups'}" title="修改订单"><span class="am-icon-pencil-square-o" ></span></button>
	                    <!-- 用按钮的时候 弹层 后缀需要加 问好 ？#的 时候才有效 真恶心 .html?# -->
	                    <button class="am-btn am-btn-default am-btn-xs am-text-danger am-round"  title="取消订单"><span class="am-icon-trash-o"></span></button>
	                  </div>
	                </div></td>
	            </tr>
	    
	            
	            
	                <tr>
	              <td><input type="checkbox" /></td>
	              <td class="am-text-center">是</td>
	              <td class="am-text-center">1</td>
	              <td>卫弘道</td>
	              <td>回锅肉、肉末茄子、米饭、</td>
	              <td>加饭、不要香菜、</td>
	              <td class="am-hide-sm-only">23￥</td>
	              
	              <td><div class="am-btn-toolbar">
	                  <div class="am-btn-group am-btn-group-xs">
	                  <a class="am-btn am-btn-default am-btn-xs am-text-success am-round am-icon-file" data-am-modal="{target: '#my-popups'}" title="接单"></a>
	                  
	                  
	                    <button class="am-btn am-btn-default am-btn-xs am-text-secondary am-round" data-am-modal="{target: '#my-popups'}" title="修改订单"><span class="am-icon-pencil-square-o" ></span></button>
	                    <!-- 用按钮的时候 弹层 后缀需要加 问好 ？#的 时候才有效 真恶心 .html?# -->
	                    <button class="am-btn am-btn-default am-btn-xs am-text-danger am-round"  title="取消订单"><span class="am-icon-trash-o"></span></button>
	                  </div>
	                </div></td>
	            </tr>
	    
	            
	                <tr>
	              <td><input type="checkbox" /></td>
	              <td class="am-text-center">是</td>
	              <td class="am-text-center">1</td>
	              <td>卫弘道</td>
	              <td>回锅肉、肉末茄子、米饭、</td>
	              <td>加饭、不要香菜、</td>
	              <td class="am-hide-sm-only">23￥</td>
	              
	              <td><div class="am-btn-toolbar">
	                  <div class="am-btn-group am-btn-group-xs">
	                  <a class="am-btn am-btn-default am-btn-xs am-text-success am-round am-icon-file" data-am-modal="{target: '#my-popups'}" title="接单"></a>
	                  
	                  
	                    <button class="am-btn am-btn-default am-btn-xs am-text-secondary am-round" data-am-modal="{target: '#my-popups'}" title="修改订单"><span class="am-icon-pencil-square-o" ></span></button>
	                    <!-- 用按钮的时候 弹层 后缀需要加 问好 ？#的 时候才有效 真恶心 .html?# -->
	                    <button class="am-btn am-btn-default am-btn-xs am-text-danger am-round"  title="取消订单"><span class="am-icon-trash-o"></span></button>
	                  </div>
	                </div></td>
	            </tr>
	    
	            
	            
	                <tr>
              <td><input type="checkbox" /></td>
              <td class="am-text-center">是</td>
              <td class="am-text-center">1</td>
              <td>卫弘道</td>
              <td>回锅肉、肉末茄子、米饭、</td>
              <td>加饭、不要香菜、</td>
              <td class="am-hide-sm-only">23￥</td>
              
              <td><div class="am-btn-toolbar">
                  <div class="am-btn-group am-btn-group-xs">
                  <a class="am-btn am-btn-default am-btn-xs am-text-success am-round am-icon-file" data-am-modal="{target: '#my-popups'}" title="接单"></a>
                  
                  
                    <button class="am-btn am-btn-default am-btn-xs am-text-secondary am-round" data-am-modal="{target: '#my-popups'}" title="修改订单"><span class="am-icon-pencil-square-o" ></span></button>
                    <!-- 用按钮的时候 弹层 后缀需要加 问好 ？#的 时候才有效 真恶心 .html?# -->
                    <button class="am-btn am-btn-default am-btn-xs am-text-danger am-round"  title="取消订单"><span class="am-icon-trash-o"></span></button>
                  </div>
                </div></td>
            </tr>
    
          </tbody>
        </table>
        <div class="am-btn-group am-btn-group-xs">
          <!--<button type="button" class="am-btn am-btn-default"><span class="am-icon-plus"></span> 删除</button>-->
          <!--<button type="button" class="am-btn am-btn-default"><span class="am-icon-save"></span> 上架</button>-->
          <!--<button type="button" class="am-btn am-btn-default"><span class="am-icon-save"></span> 下架</button>-->
          <!--<button type="button" class="am-btn am-btn-default"><span class="am-icon-save"></span> 移动</button>-->
          <button type="button" class="am-btn am-btn-default"><span class="am-icon-plus"></span> 新增</button>
          <button type="button" class="am-btn am-btn-default"><span class="am-icon-save"></span>接单</button>
          <!--<button type="button" class="am-btn am-btn-default"><span class="am-icon-archive"></span></button>-->
          <button type="button" class="am-btn am-btn-default"><span class="am-icon-trash-o"></span>退单</button>
        </div>
        <ul class="am-pagination am-fr">
          <li class="am-disabled"><a href="#">«</a></li>
          <li class="am-active"><a href="#">1</a></li>
          <li><a href="#">2</a></li>
          <li><a href="#">3</a></li>
          <li><a href="#">4</a></li>
          <li><a href="#">5</a></li>
          <li><a href="#">»</a></li>
        </ul>
        <hr />
      </form>

      <div class="foods">
        <ul>
          <a href="#" target="_blank" title="小饼干">你算哪个小饼干</a> <a href="http://guantaow.taobao.com" target="_blank">厚朴网络 淘宝店</a> -  More Templates<a href="http://www.moobnn.com/" title="模板在线" target="_blank">模板在线</a> <a href="http://guantaow.taobao.com" target="_blank">厚朴网络 淘宝店</a>
        </ul>
        <dl>
          <a href="" title="返回头部" class="am-icon-btn am-icon-arrow-up"></a>
        </dl>
      </div>
    </div>	
	
	
	
</div>
<!--订单处理结束-->

<!--评论管理begin-->
<div id="commentsdiv" class="admin" style="display: none;">
	<div class="admin-biaogelist">
     
     <div class="listbiaoti am-cf">
        <ul class="am-icon-flag on">
       评论管理   
        </ul>
        <dl class="am-icon-home" style="float: right;">
       首页>
       <a href="#">评论管理</a>
        </dl>
         
        
      </div>
     
     <form class="am-form am-g">
        <table width="100%" class="am-table am-table-bordered am-table-radius am-table-striped am-table-hover" >
          <thead>
            <tr class="am-success">
              <th class="table-check" width="5%" ><input type="checkbox" /></th>
              <th class="table-id" width="5%">会员</th>
              <th class="table-id am-text-center" width="10%">ID</th>
              <th class="table-title" width="10%">客户</th>
              <th class="table-type" width="30%">订单内容</th>
              <th class="table-type" width="30%">客户评价</th>
              <th class="table-author am-hide-sm-only" width="10%">图片</th>
             
              <th width="125px" class="table-set">操作</th>
            </tr>
          </thead>
          <tbody>
           
<tr>
	              <td height="65px"><input type="checkbox" /></td>
	              <td class="am-text-center">是</td>
	              <td class="am-text-center">1</td>
	              <td>卫弘道</td>
	              <td>回锅肉、肉末茄子、米饭、</td>
	              <td>加饭、不要香菜、</td>
	              <td class="am-hide-sm-only"><div style="width: 120px;height: 60px;"><img src="assets/i/examples/blogPage.png" width="100%" height="100%"></div></td>
	              
	              <td><div class="am-btn-toolbar">
	                  <div class="am-btn-group am-btn-group-xs">
	                  <a class="am-btn am-btn-default am-btn-xs am-text-success am-round am-icon-file" data-am-modal="{target: '#my-popups'}" title="置顶"></a>            
	                    <!-- 用按钮的时候 弹层 后缀需要加 问好 ？#的 时候才有效 真恶心 .html?# -->
	                    <button class="am-btn am-btn-default am-btn-xs am-text-danger am-round"  title="删除"><span class="am-icon-trash-o"></span></button>
	                  </div>
	                </div></td>
	            </tr>
<tr>
	              <td height="65px"><input type="checkbox" /></td>
	              <td class="am-text-center">是</td>
	              <td class="am-text-center">1</td>
	              <td>卫弘道</td>
	              <td>回锅肉、肉末茄子、米饭、</td>
	              <td>加饭、不要香菜、</td>
	              <td class="am-hide-sm-only"><div style="width: 120px;height: 60px;"><img src="assets/i/examples/blogPage.png" width="100%" height="100%"></div></td>
	              
	              <td><div class="am-btn-toolbar">
	                  <div class="am-btn-group am-btn-group-xs">
	                  <a class="am-btn am-btn-default am-btn-xs am-text-success am-round am-icon-file" data-am-modal="{target: '#my-popups'}" title="置顶"></a>            
	                    <!-- 用按钮的时候 弹层 后缀需要加 问好 ？#的 时候才有效 真恶心 .html?# -->
	                    <button class="am-btn am-btn-default am-btn-xs am-text-danger am-round"  title="删除"><span class="am-icon-trash-o"></span></button>
	                  </div>
	                </div></td>
	            </tr>
<tr>
	              <td height="65px"><input type="checkbox" /></td>
	              <td class="am-text-center">是</td>
	              <td class="am-text-center">1</td>
	              <td>卫弘道</td>
	              <td>回锅肉、肉末茄子、米饭、</td>
	              <td>加饭、不要香菜、</td>
	              <td class="am-hide-sm-only"><div style="width: 120px;height: 60px;"><img src="assets/i/examples/blogPage.png" width="100%" height="100%"></div></td>
	              
	              <td><div class="am-btn-toolbar">
	                  <div class="am-btn-group am-btn-group-xs">
	                  <a class="am-btn am-btn-default am-btn-xs am-text-success am-round am-icon-file" data-am-modal="{target: '#my-popups'}" title="置顶"></a>            
	                    <!-- 用按钮的时候 弹层 后缀需要加 问好 ？#的 时候才有效 真恶心 .html?# -->
	                    <button class="am-btn am-btn-default am-btn-xs am-text-danger am-round"  title="删除"><span class="am-icon-trash-o"></span></button>
	                  </div>
	                </div></td>
	            </tr>

<tr>
	              <td height="65px"><input type="checkbox" /></td>
	              <td class="am-text-center">是</td>
	              <td class="am-text-center">1</td>
	              <td>卫弘道</td>
	              <td>回锅肉、肉末茄子、米饭、</td>
	              <td>加饭、不要香菜、</td>
	              <td class="am-hide-sm-only"><div style="width: 120px;height: 60px;"><img src="assets/i/examples/blogPage.png" width="100%" height="100%"></div></td>
	              
	              <td><div class="am-btn-toolbar">
	                  <div class="am-btn-group am-btn-group-xs">
	                  <a class="am-btn am-btn-default am-btn-xs am-text-success am-round am-icon-file" data-am-modal="{target: '#my-popups'}" title="置顶"></a>            
	                    <!-- 用按钮的时候 弹层 后缀需要加 问好 ？#的 时候才有效 真恶心 .html?# -->
	                    <button class="am-btn am-btn-default am-btn-xs am-text-danger am-round"  title="删除"><span class="am-icon-trash-o"></span></button>
	                  </div>
	                </div></td>
	            </tr>	 			    
<tr>
	              <td height="65px"><input type="checkbox" /></td>
	              <td class="am-text-center">是</td>
	              <td class="am-text-center">1</td>
	              <td>卫弘道</td>
	              <td>回锅肉、肉末茄子、米饭、</td>
	              <td>加饭、不要香菜、</td>
	              <td class="am-hide-sm-only"><div style="width: 120px;height: 60px;"><img src="assets/i/examples/blogPage.png" width="100%" height="100%"></div></td>
	              
	              <td><div class="am-btn-toolbar">
	                  <div class="am-btn-group am-btn-group-xs">
	                  <a class="am-btn am-btn-default am-btn-xs am-text-success am-round am-icon-file" data-am-modal="{target: '#my-popups'}" title="置顶"></a>            
	                    <!-- 用按钮的时候 弹层 后缀需要加 问好 ？#的 时候才有效 真恶心 .html?# -->
	                    <button class="am-btn am-btn-default am-btn-xs am-text-danger am-round"  title="删除"><span class="am-icon-trash-o"></span></button>
	                  </div>
	                </div></td>
	           </tr>	    	       	            
<tr>
	              <td height="65px"><input type="checkbox" /></td>
	              <td class="am-text-center">是</td>
	              <td class="am-text-center">1</td>
	              <td>卫弘道</td>
	              <td>回锅肉、肉末茄子、米饭、</td>
	              <td>加饭、不要香菜、</td>
	              <td class="am-hide-sm-only"><div style="width: 120px;height: 60px;"><img src="assets/i/examples/blogPage.png" width="100%" height="100%"></div></td>
	              
	              <td><div class="am-btn-toolbar">
	                  <div class="am-btn-group am-btn-group-xs">
	                  <a class="am-btn am-btn-default am-btn-xs am-text-success am-round am-icon-file" data-am-modal="{target: '#my-popups'}" title="置顶"></a>            
	                    <!-- 用按钮的时候 弹层 后缀需要加 问好 ？#的 时候才有效 真恶心 .html?# -->
	                    <button class="am-btn am-btn-default am-btn-xs am-text-danger am-round"  title="删除"><span class="am-icon-trash-o"></span></button>
	                  </div>
	                </div></td>
	            </tr>
          </tbody>
        </table>
        <div class="am-btn-group am-btn-group-xs">
          <!--<button type="button" class="am-btn am-btn-default"><span class="am-icon-plus"></span> 删除</button>-->
          <!--<button type="button" class="am-btn am-btn-default"><span class="am-icon-save"></span> 上架</button>-->
          <!--<button type="button" class="am-btn am-btn-default"><span class="am-icon-save"></span> 下架</button>-->
          <!--<button type="button" class="am-btn am-btn-default"><span class="am-icon-save"></span> 移动</button>-->
          <button type="button" class="am-btn am-btn-default"><span class="am-icon-plus"></span> 置顶</button>

          <button type="button" class="am-btn am-btn-default"><span class="am-icon-trash-o"></span>删除</button>
        </div>
        <ul class="am-pagination am-fr">
          <li class="am-disabled"><a href="#">«</a></li>
          <li class="am-active"><a href="#">1</a></li>
          <li><a href="#">2</a></li>
          <li><a href="#">3</a></li>
          <li><a href="#">4</a></li>
          <li><a href="#">5</a></li>
          <li><a href="#">»</a></li>
        </ul>
        <hr />
      </form>

      <div class="foods">
        <ul>
          <a href="#" target="_blank" title="小饼干">你算哪个小饼干</a> <a href="http://guantaow.taobao.com" target="_blank">厚朴网络 淘宝店</a> -  More Templates<a href="http://www.moobnn.com/" title="模板在线" target="_blank">模板在线</a> <a href="http://guantaow.taobao.com" target="_blank">厚朴网络 淘宝店</a>
        </ul>
        <dl>
          <a href="" title="返回头部" class="am-icon-btn am-icon-arrow-up"></a>
        </dl>
      </div>
    </div>	
	
	
</div>
<!--评论管理end-->

<!--发布红包begin-->

<div id="reddiv" class="admin" style="display: none;">

<div class="admin-biaogelist">
    <div class="listbiaoti am-cf">
      <ul class="am-icon-flag on"> 会员管理</ul>
      
      <dl class="am-icon-home" style="float: right;"> 当前位置： 首页 > <a href="#">发布红包</a></dl>
	</div>
	
    <div class="fbneirong">
      <form class="am-form">
      	
        <div class="am-form-group am-cf">
          <div class="zuo">红包名称：</div>
          <div class="you">
            <input type="text" class="am-input-sm" id="doc-ipt-email-1" placeholder="请输入红包名称"style="width: 300px;">
          </div>
        </div>
        
        <div class="am-form-group am-cf">
          <div class="zuo">红包数量：</div>
          <div class="you">
            <input type="text" class="am-input-sm" id="doc-ipt-pwd-1" placeholder="请输入红包数量" style="width: 300px;">
          </div>
        </div>
        
        <div class="am-form-group am-cf">
          <div class="zuo">红包介绍：</div>
          <div class="you">
            <input type="text" class="am-input-sm" id="doc-ipt-pwd-1" placeholder="" style="width: 300px;">
          </div>
        </div>
        <div class="am-btn-toolbars am-btn-toolbar am-kg am-cf">
        	<div class="zuo">使用时间：</div>
        	<div class="you" style="margin-right: 0; width: 130px;padding: 6px; ">
				
     			<input type="text" class="am-form-field am-input-sm am-input-zm  am-icon-calendar" placeholder="请选择开始日期" data-am-datepicker="{theme: 'success',}"  readonly>	
     				
     			</input>          
        	</div>
        	<div class="you" style="margin-left: -4px;width: 130px;padding: 6px;">
				<!--<span class="tubiao am-icon-calendar"></span>-->
     			 <input type="text" class="am-form-field am-input-sm am-input-zm  am-icon-calendar" placeholder="请选择截止日期" data-am-datepicker="{theme: 'success',}"  readonly/>         
        	</div>
        </div>
        <div class="am-form-group am-cf">
          <div class="zuo">使用条件：</div>
          <div class="you">
           <input type="password" class="am-input-sm" id="doc-ipt-pwd-1"  style="width: 300px;display: inline-block;" placeholder="请输入使用条件">
           <button type="submit" class="am-pagination am-fr" style="margin-right: 390px;margin-top: 3px;">+&nbsp;&nbsp;新增</button>
          </div>
        </div>
        
         <div class="am-form-group am-cf">
          <div class="zuo">不可用商家：</div>
          <div class="you">
           <input type="password" class="am-input-sm" id="doc-ipt-pwd-1"  style="width: 300px;display: inline-block;" placeholder="无">
           <button type="submit" class="am-pagination am-fr" style="margin-right: 390px;margin-top: 3px;">+&nbsp;&nbsp;选择</button>
          </div>
        </div>
        
        <!--<div class="am-form-group am-cf">
        <div class="zuo">推荐：</div>
        <div class="you" style="margin-top: 5px;">
          <label class="am-checkbox-inline">
            <input type="checkbox" value="option1">
            选我 </label>
          <label class="am-checkbox-inline">
            <input type="checkbox" value="option2">
            同时可以选我 </label>
          <label class="am-checkbox-inline">
            <input type="checkbox" value="option3">
            还可以选我 </label>
            </div>
        </div>-->
        <div class="am-form-group am-cf">
          <div class="you" style="margin-left: 11%;">
              <button type="submit" class="am-btn am-btn-success am-radius">发布并关闭窗口</button>&nbsp; &nbsp; &nbsp;<button type="submit" class="am-btn am-btn-secondary am-radius">取消发布</button>

          </div>
        </div>
      </form>
    </div>

</div>

	</div>


<!--发布红包end-->

<!--会员管理begin-->

<div id="menberlistdiv" class="admin" style="display: none;">




<div class="admin-biaogelist">
    <div class="listbiaoti am-cf">
      <ul class="am-icon-flag on"> 会员管理</ul>
      
      <dl class="am-icon-home" style="float: right;"> 当前位置： 首页 >会员管理> <a href="#">用户管理</a></dl>
       <dl>
        <button type="button" class="am-btn am-btn-danger am-round am-btn-xs am-icon-plus" >添加用户</button>
      </dl>
      
	</div>
   
    <form class="am-form am-g">
          <table width="100%" class="am-table am-table-bordered am-table-radius am-table-striped">
            <thead>
              <tr class="am-success">
                <th class="table-check"><input type="checkbox" /></th>

                <th class="table-id" style="width: 70px;">用户ID</th>
                <th class="table-title"style="width: 80px;">用户名称</th>
                <th class="table-type"  style="width: 40px;">VIP</th>
                <th class="table-author am-hide-sm-only"style="width: 80px;">用户余额</th>
                <th class="table-author am-hide-sm-only" style="width: 50px;">红包</th>
                <th class="table-author am-hide-sm-only"style="width: 140px;">注册日期</th>
                <th class="table-date am-hide-sm-only"style="width: 140px;">最近消费</th>
                <th class="table-date am-hide-sm-only"style="width: 160px;">默认地址</th>
                <th width="130px" class="table-set"style="width: 110px;">操作</th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <td><input type="checkbox" /></td>
                
                <td>14</td>
                <td><a href="#">张三</a></td>
                <td>V3</td>
                <td class="am-hide-sm-only">0.00</td>
                <td class="am-hide-sm-only">2</td>
                <td class="am-hide-sm-only">2014年9月4日 7:28:47</td>
                <td class="am-hide-sm-only">2018年9月4日 7:28:47</td>
                 <td class="am-hide-sm-only">福建省厦门市集美区杏林街道集美软件园3期</td>
                <td>
                    <div class="am-btn-group am-btn-group-xs">
                      <button class="am-btn am-btn-default am-btn-xs am-text-success am-round"><span class="am-icon-search" title="查看详情"></span> </button>
                      <button class="am-btn am-btn-default am-btn-xs am-text-secondary am-round" data-am-modal="{target: '#my-popups'}" title="编辑"><span class="am-icon-pencil-square-o"></span></button>
                      <button class="am-btn am-btn-default am-btn-xs am-text-danger am-round" title="删除"><span class="am-icon-trash-o" ></span></button>
                    </div>
                 
                </td>
              </tr>
              
              <tr>
                <td><input type="checkbox" /></td>
                
                <td>15</td>
                <td><a href="#">李四</a></td>
                <td>无</td>
                <td class="am-hide-sm-only">15.23</td>
                <td class="am-hide-sm-only">5</td>
                <td class="am-hide-sm-only">2014年9月4日 7:28:47</td>
                <td class="am-hide-sm-only">2018年9月4日 7:28:47</td>
                <td class="am-hide-sm-only">福建省厦门市集美区杏林街道集美软件园3期</td>
                <td>
                    <div class="am-btn-group am-btn-group-xs">
                      <button class="am-btn am-btn-default am-btn-xs am-text-success am-round"><span class="am-icon-search" title="查看详情"></span> </button>
                      <button class="am-btn am-btn-default am-btn-xs am-text-secondary am-round" data-am-modal="{target: '#my-popups'}" title="编辑"><span class="am-icon-pencil-square-o"></span></button>
                      <button class="am-btn am-btn-default am-btn-xs am-text-danger am-round" title="删除"><span class="am-icon-trash-o" ></span></button>
                    </div>
                </td>
              </tr>
              
               <tr>
                <td><input type="checkbox" /></td>
                
                <td>15</td>
                <td><a href="#">李四</a></td>
                <td>无</td>
                <td class="am-hide-sm-only">15.23</td>
                <td class="am-hide-sm-only">5</td>
                <td class="am-hide-sm-only">2014年9月4日 7:28:47</td>
                <td class="am-hide-sm-only">2018年9月4日 7:28:47</td>
                <td class="am-hide-sm-only">福建省厦门市集美区杏林街道集美软件园3期</td>
                <td>
                    <div class="am-btn-group am-btn-group-xs">
                      <button class="am-btn am-btn-default am-btn-xs am-text-success am-round"><span class="am-icon-search" title="查看详情"></span> </button>
                      <button class="am-btn am-btn-default am-btn-xs am-text-secondary am-round" data-am-modal="{target: '#my-popups'}" title="编辑"><span class="am-icon-pencil-square-o"></span></button>
                      <button class="am-btn am-btn-default am-btn-xs am-text-danger am-round" title="删除"><span class="am-icon-trash-o" ></span></button>
                    </div>
               
                </td>
              </tr>
              
              
               <tr>
                <td><input type="checkbox" /></td>
                
                <td>15</td>
                <td><a href="#">李四</a></td>
                <td>无</td>
                <td class="am-hide-sm-only">15.23</td>
                <td class="am-hide-sm-only">5</td>
                <td class="am-hide-sm-only">2014年9月4日 7:28:47</td>
                <td class="am-hide-sm-only">2018年9月4日 7:28:47</td>
                <td class="am-hide-sm-only">福建省厦门市集美区杏林街道集美软件园3期</td>
                <td>
                    <div class="am-btn-group am-btn-group-xs">
                      <button class="am-btn am-btn-default am-btn-xs am-text-success am-round"><span class="am-icon-search" title="查看详情"></span> </button>
                      <button class="am-btn am-btn-default am-btn-xs am-text-secondary am-round" data-am-modal="{target: '#my-popups'}" title="编辑"><span class="am-icon-pencil-square-o"></span></button>
                      <button class="am-btn am-btn-default am-btn-xs am-text-danger am-round" title="删除"><span class="am-icon-trash-o" ></span></button>
                    </div>
                </td>
              </tr>
             
               <tr>
                <td><input type="checkbox" /></td>
                
                <td>15</td>
                <td><a href="#">李四</a></td>
                <td>无</td>
                <td class="am-hide-sm-only">15.23</td>
                <td class="am-hide-sm-only">5</td>
                <td class="am-hide-sm-only">2014年9月4日 7:28:47</td>
                <td class="am-hide-sm-only">2018年9月4日 7:28:47</td>
                <td class="am-hide-sm-only">福建省厦门市集美区杏林街道集美软件园3期</td>
                <td>
                    <div class="am-btn-group am-btn-group-xs">
                      <button class="am-btn am-btn-default am-btn-xs am-text-success am-round"><span class="am-icon-search" title="查看详情"></span> </button>
                      <button class="am-btn am-btn-default am-btn-xs am-text-secondary am-round" data-am-modal="{target: '#my-popups'}" title="编辑"><span class="am-icon-pencil-square-o"></span></button>
                      <button class="am-btn am-btn-default am-btn-xs am-text-danger am-round" title="删除"><span class="am-icon-trash-o" ></span></button>
                    </div>
                </td>
              </tr>

               <tr>
                <td><input type="checkbox" /></td>
                
                <td>15</td>
                <td><a href="#">李四</a></td>
                <td>无</td>
                <td class="am-hide-sm-only">15.23</td>
                <td class="am-hide-sm-only">5</td>
                <td class="am-hide-sm-only">2014年9月4日 7:28:47</td>
                <td class="am-hide-sm-only">2018年9月4日 7:28:47</td>
                <td class="am-hide-sm-only">福建省厦门市集美区杏林街道集美软件园3期</td>
                <td>
                    <div class="am-btn-group am-btn-group-xs">
                      <button class="am-btn am-btn-default am-btn-xs am-text-success am-round"><span class="am-icon-search" title="查看详情"></span> </button>
                      <button class="am-btn am-btn-default am-btn-xs am-text-secondary am-round" data-am-modal="{target: '#my-popups'}" title="编辑"><span class="am-icon-pencil-square-o"></span></button>
                      <button class="am-btn am-btn-default am-btn-xs am-text-danger am-round" title="删除"><span class="am-icon-trash-o" ></span></button>
                    </div>
                  
                </td>
              </tr>
              
            </tbody>
          </table>
          
              <div class="am-btn-group am-btn-group-xs">
              <button type="button" class="am-btn am-btn-default"><span class="am-icon-plus"></span> 新增</button>
              <button type="button" class="am-btn am-btn-default"><span class="am-icon-archive"></span> 编辑</button>
              <button type="button" class="am-btn am-btn-default"><span class="am-icon-trash-o"></span> 删除</button>
               <button type="button" class="am-btn am-btn-default"><span class="am-icon-save"></span> 保存</button>
            </div>
          
          <ul class="am-pagination am-fr">
                <li class="am-disabled"><a href="#">«</a></li>
                <li class="am-active"><a href="#">1</a></li>
                <li><a href="#">2</a></li>
                <li><a href="#">3</a></li>
                <li><a href="#">4</a></li>
                <li><a href="#">5</a></li>
                <li><a href="#">»</a></li>
              </ul>
          <hr />
        </form>

 <div class="foods">
  <dl>
    <a href="" title="返回头部" class="am-icon-btn am-icon-arrow-up" ></a>
  </dl>
</div>

</div>

</div>

<!--会员管理end-->

<!--begin-->

<div id="shoplistdiv" class="admin" style="border: 1px red solid;display: none">




<div class="admin-biaogelist">
    <div class="listbiaoti am-cf">
      <ul class="am-icon-flag on"> 会员管理</ul>
      
      <dl class="am-icon-home" style="float: right;"> 当前位置： 首页 > 会员管理  ><a href="#">商品管理</a></dl>
       <dl>
        <button type="button" class="am-btn am-btn-danger am-round am-btn-xs am-icon-plus" >添加商家</button>
      </dl>
      
	</div>
	
    
    <form class="am-form am-g">
          <table width="100%" class="am-table am-table-bordered am-table-radius am-table-striped">
            <thead>
              <tr class="am-success">
                <th class="table-check"><input type="checkbox" /></th>

                <th class="table-id" style="width: 70px;">商家ID</th>
                <th class="table-title">商家名称</th>
                <th class="table-type">商家地址</th>
                <th class="table-author am-hide-sm-only">起送费</th>
                <th class="table-author am-hide-sm-only">评分星星</th>
                <th class="table-author am-hide-sm-only">月销量</th>
                <th class="table-date am-hide-sm-only">店铺红包个数</th>
                <th class="table-date am-hide-sm-only">商家类别</th>
                <th width="130px" class="table-set">操作</th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <td><input type="checkbox" /></td>
                
                <td>1</td>
                <td><a href="#">秘觉</a></td>
                <td>厦门软件园三期</td>
                <td class="am-hide-sm-only">20</td>
                <td class="am-hide-sm-only">4</td>
                <td class="am-hide-sm-only">158</td>
                <td class="am-hide-sm-only">无</td>
                <td class="am-hide-sm-only">快餐</td>
                <td>
                    <div class="am-btn-group am-btn-group-xs">
                      <button class="am-btn am-btn-default am-btn-xs am-text-success am-round"><span class="am-icon-search" title="查看详情"></span> </button>
                      <button class="am-btn am-btn-default am-btn-xs am-text-secondary am-round" data-am-modal="{target: '#my-popups'}" title="编辑"><span class="am-icon-pencil-square-o"></span></button>
                      <button class="am-btn am-btn-default am-btn-xs am-text-danger am-round" title="删除"><span class="am-icon-trash-o" ></span></button>
                    </div>
                 
                </td>
              </tr>
              
              <tr>
                <td><input type="checkbox" /></td>
                
                <td>1</td>
                <td><a href="#">KFC</a></td>
                <td>厦门鼓浪屿</td>
                <td class="am-hide-sm-only">50</td>
                <td class="am-hide-sm-only">4</td>
                <td class="am-hide-sm-only">500</td>
                <td class="am-hide-sm-only">6</td>
                <td class="am-hide-sm-only">汉堡</td>
                <td>
                    <div class="am-btn-group am-btn-group-xs">
                      <button class="am-btn am-btn-default am-btn-xs am-text-success am-round"><span class="am-icon-search" title="查看详情"></span> </button>
                      <button class="am-btn am-btn-default am-btn-xs am-text-secondary am-round" data-am-modal="{target: '#my-popups'}" title="编辑"><span class="am-icon-pencil-square-o"></span></button>
                      <button class="am-btn am-btn-default am-btn-xs am-text-danger am-round" title="删除"><span class="am-icon-trash-o" ></span></button>
                    </div>
                
                </td>
              </tr>
               <tr>
                <td><input type="checkbox" /></td>
                
                <td>1</td>
                <td><a href="#">阿布到家</a></td>
                <td>厦门杏林街道软件园</td>
                <td class="am-hide-sm-only">15</td>
                <td class="am-hide-sm-only">5</td>
                <td class="am-hide-sm-only">256</td>
                <td class="am-hide-sm-only">1</td>
                <td class="am-hide-sm-only">小吃</td>
                <td>
                    <div class="am-btn-group am-btn-group-xs">
                      <button class="am-btn am-btn-default am-btn-xs am-text-success am-round"><span class="am-icon-search" title="查看详情"></span> </button>
                      <button class="am-btn am-btn-default am-btn-xs am-text-secondary am-round" data-am-modal="{target: '#my-popups'}" title="编辑"><span class="am-icon-pencil-square-o"></span></button>
                      <button class="am-btn am-btn-default am-btn-xs am-text-danger am-round" title="删除"><span class="am-icon-trash-o" ></span></button>
                    </div>
                 
                </td>
              </tr>
              <tr>
                <td><input type="checkbox" /></td>
                
                <td>1</td>
                <td><a href="#">秘诀</a></td>
                <td>厦门软件园三期</td>
                <td class="am-hide-sm-only">20</td>
                <td class="am-hide-sm-only">4</td>
                <td class="am-hide-sm-only">158</td>
                <td class="am-hide-sm-only">无</td>
                <td class="am-hide-sm-only">快餐</td>
                <td>
                    <div class="am-btn-group am-btn-group-xs">
                      <button class="am-btn am-btn-default am-btn-xs am-text-success am-round"><span class="am-icon-search" title="查看详情"></span> </button>
                      <button class="am-btn am-btn-default am-btn-xs am-text-secondary am-round" data-am-modal="{target: '#my-popups'}" title="编辑"><span class="am-icon-pencil-square-o"></span></button>
                      <button class="am-btn am-btn-default am-btn-xs am-text-danger am-round" title="删除"><span class="am-icon-trash-o" ></span></button>
                    </div>
                  
                </td>
              </tr>
              <tr>
                <td><input type="checkbox" /></td>
                
                <td>1</td>
                <td><a href="#">秘诀</a></td>
                <td>厦门软件园三期</td>
                <td class="am-hide-sm-only">20</td>
                <td class="am-hide-sm-only">4</td>
                <td class="am-hide-sm-only">158</td>
                <td class="am-hide-sm-only">无</td>
                <td class="am-hide-sm-only">快餐</td>
                <td>
                    <div class="am-btn-group am-btn-group-xs">
                      <button class="am-btn am-btn-default am-btn-xs am-text-success am-round"><span class="am-icon-search" title="查看详情"></span> </button>
                      <button class="am-btn am-btn-default am-btn-xs am-text-secondary am-round" data-am-modal="{target: '#my-popups'}" title="编辑"><span class="am-icon-pencil-square-o"></span></button>
                      <button class="am-btn am-btn-default am-btn-xs am-text-danger am-round" title="删除"><span class="am-icon-trash-o" ></span></button>
                    </div>
            
                </td>
              </tr>
              
              <tr>
                <td><input type="checkbox" /></td>
                
                <td>1</td>
                <td><a href="#">秘诀</a></td>
                <td>厦门软件园三期</td>
                <td class="am-hide-sm-only">20</td>
                <td class="am-hide-sm-only">4</td>
                <td class="am-hide-sm-only">158</td>
                <td class="am-hide-sm-only">无</td>
                <td class="am-hide-sm-only">快餐</td>
                <td>
                    <div class="am-btn-group am-btn-group-xs">
                      <button class="am-btn am-btn-default am-btn-xs am-text-success am-round"><span class="am-icon-search" title="查看详情"></span> </button>
                      <button class="am-btn am-btn-default am-btn-xs am-text-secondary am-round" data-am-modal="{target: '#my-popups'}" title="编辑"><span class="am-icon-pencil-square-o"></span></button>
                      <button class="am-btn am-btn-default am-btn-xs am-text-danger am-round" title="删除"><span class="am-icon-trash-o" ></span></button>
                    </div>
                 
                </td>
              </tr>
              
              <tr>
                <td><input type="checkbox" /></td>
                
                <td>1</td>
                <td><a href="#">秘诀</a></td>
                <td>厦门软件园三期</td>
                <td class="am-hide-sm-only">20</td>
                <td class="am-hide-sm-only">4</td>
                <td class="am-hide-sm-only">158</td>
                <td class="am-hide-sm-only">无</td>
                <td class="am-hide-sm-only">快餐</td>
                <td>
                    <div class="am-btn-group am-btn-group-xs">
                      <button class="am-btn am-btn-default am-btn-xs am-text-success am-round"><span class="am-icon-search" title="查看详情"></span> </button>
                      <button class="am-btn am-btn-default am-btn-xs am-text-secondary am-round" data-am-modal="{target: '#my-popups'}" title="编辑"><span class="am-icon-pencil-square-o"></span></button>
                      <button class="am-btn am-btn-default am-btn-xs am-text-danger am-round" title="删除"><span class="am-icon-trash-o" ></span></button>
                    </div>
                
                </td>
              </tr>
              
            </tbody>
          </table>
          
                 <div class="am-btn-group am-btn-group-xs">
              <button type="button" class="am-btn am-btn-default"><span class="am-icon-plus"></span> 新增</button>
              <button type="button" class="am-btn am-btn-default"><span class="am-icon-archive"></span> 编辑</button>
              <button type="button" class="am-btn am-btn-default"><span class="am-icon-trash-o"></span> 删除</button>
               <button type="button" class="am-btn am-btn-default"><span class="am-icon-save"></span> 保存</button>
            </div>
          
          <ul class="am-pagination am-fr">
                <li class="am-disabled"><a href="#">«</a></li>
                <li class="am-active"><a href="#">1</a></li>
                <li><a href="#">2</a></li>
                <li><a href="#">3</a></li>
                <li><a href="#">4</a></li>
                <li><a href="#">5</a></li>
                <li><a href="#">»</a></li>
              </ul>
          <hr />
        </form>
 
 
 
 
 <div class="foods">
  <dl>
    <a href="" title="返回头部" class="am-icon-btn am-icon-arrow-up" ></a>
  </dl>
</div>

</div>

</div>



<!--end-->





</div>
<script src="<%=basePath %>style/js/amazeui.min.js"></script>
<script type="text/javascript">
	$(document).ready(
					function(){
						$("#goodsmanagement").click(
							function(){
								$("#goodsmanagementdiv").show();
								$("#orderdiv,#commentsdiv,#reddiv,#menberlistdiv,#shoplistdiv").hide();
							}
						)
						
						$("#order").click(
							function(){
								$("#orderdiv").show();
								$("#goodsmanagementdiv,#commentsdiv,#reddiv,#menberlistdiv,#shoplistdiv").hide();
							}
						)
						
						$("#comments").click(
							function(){
								$("#commentsdiv").show();
								$("#goodsmanagementdiv,#orderdiv,#reddiv,#menberlistdiv,#shoplistdiv").hide();
							}
						)
						$("#red").click(
							function(){
								$("#reddiv").show();
								$("#goodsmanagementdiv,#orderdiv,#commentsdiv,#menberlistdiv,#shoplistdiv").hide();
							}
						)
						$("#menberlist").click(
							function(){
								$("#menberlistdiv").show();
								$("#goodsmanagementdiv,#orderdiv,#commentsdiv,#reddiv,#shoplistdiv").hide();
							}
						)
						$("#shoplist").click(
							function(){
								$("#shoplistdiv").show();
								$("#goodsmanagementdiv,#orderdiv,#commentsdiv,#reddiv,#menberlistdiv").hide();
							}
						)
						
					}
		
		
	)
	
	
</script>


</body>
</html>