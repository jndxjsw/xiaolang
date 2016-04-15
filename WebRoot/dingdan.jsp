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
        
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">    
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page"> 
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<title>dingdan</title>
  </head>
 <script src="<%=request.getContextPath()%>/js/dingdan.js"  
    type="text/javascript"></script>  
 <script src="<%=request.getContextPath()%>/js/jquery-1.4.4.min.js"  
    type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/js/formValidator-4.1.3.js"  
    type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/js/formValidatorRegex.js"  
    type="text/javascript"></script>
  <body>
   <s:form  id="form2" name="form2" method="post" namespace="/">  
       <table id="tb"> 
       <tr>
        	<td align="center" width="30%">证件类型</td>  
  		 	<select  id="select" name="select" onblur="jbPhone()">   
      		<option value="0" >身份证</option>
      		<option value="1">护照</option>
  			</select>
		</tr> 
  		 <tr>  
            <td align="center" width="30%">姓名</td>  
            <td align="center" width="40%">  
             <s:textfield name="nickname" id="nickname" cssStyle="width:160px;height:24px;" onblur="checknickname()"/>  
            </td>  
            <td align="left" width="30%">  
                <span id="nicknameTip">  
                    <s:fielderror cssStyle="color:red;padding-left:10px;">  
                          <s:param>nickname</s:param>  
                     </s:fielderror>  
                </span>  
            </td>  
          </tr>  
			<tr>
        	<td align="center" width="30%">国籍</td> 
        	<td align="center" width="40%">  
             <s:textfield name="" id="" cssStyle="width:160px;height:24px;" onblur=""/>  
             </td>
			</tr>
  		<tr>
             <td align="center" width="30%">身份证号</td>  
             <td align="center" width="40%">  
                 <s:textfield name="jbCredentialsCode" id="jbCredentialsCode" cssStyle="width:160px;height:24px;" onblur="checkjbCredentialsCode()"/>  
             </td>  
              <td align="left" width="30%">  
                  <span id="jbCredentialsCodeTip">  
                      <s:fielderror cssStyle="color:red;padding-left:10px;">  
                            <s:param>jbCredentialsCode</s:param>  
                     </s:fielderror>  
                  </span>  
               </td>  
        </tr>  
           <tr>
			<td width="70" height="35" align="right">手机号</td>
			<td>
				<s:textfield id="jbPhone" name="jbPhone" cssStyle="width:160px;height:24px;" onblur="checkjbPhone()"/>
			</td>
			<td align="left" width="30%">  
	       		<span id="jbPhoneTip">  
                        <s:fielderror cssStyle="color:red;padding-left:10px;">  
                            <s:param>jbPhone</s:param>  
                        </s:fielderror>  
            	</span>  
     		 </td>  		
			</tr>
            </table>  
     </s:form>                   
  </body>
</html>
