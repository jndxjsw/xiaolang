<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<meta name="viewport" content="width=device-width, initial-scale=1" />
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  <script src="<%=request.getContextPath()%>/js/jquery-1.4.4.min.js"  
    type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/js/iscroll.js"  
    type="text/javascript"></script>   
<script src="<%=request.getContextPath()%>/js/select.js"  
    type="text/javascript"></script>  
<script type="text/javascript">
 var myScroll;
  function loaded() { 
 	setTimeout(function () { 
 	myScroll = new iScroll('wrapper',{ snap: true, momentum: false, hScrollbar: false, vScrollbar: false,hScroll:false}); }, 100); 
 } 
 window.addEventListener('load', loaded, false); 
 </script>
 <script type="text/javascript">
 var myScroll;
  function loaded() { 
 	setTimeout(function () { 
 	myScroll = new iScroll('wrapper1',{ snap: true, momentum: false, hScrollbar: false, vScrollbar: false,hScroll:true}); }, 100); 
 } 
 window.addEventListener('load', loaded, false); 
 </script>
 <body>
 <div id="top">
 </div>
<div id="wrapper">
 
</div>
<div>
<select  id="select" name="select" onblur="jbPhone()">   
      <option value="0" >远征</option>
      <option value="1">短途</option>
  </select>
  	<div id="container">
		<form  id="search_box">
			<div >
				<input type="text" id="search" name="search" placeholder="搜索" />
			</div>
		</form>
	</div>
</div>
<div id="wrapper1">
 
</div>
<div id="foot">

</div>
</body>
</html>