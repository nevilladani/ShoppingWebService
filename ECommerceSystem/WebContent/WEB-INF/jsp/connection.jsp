<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>

<html>
  <head>
    <title>launch the request</title>
    
    <meta http-equiv="param" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
  </head>
  
  <body onload="javascript:document.forms[0].submit()">
	<form name="yeepay" action="http://www.yeepay.com/app-merchant-proxy/node" method='post'>	
		
		<input type='hidden' name='p0_Cmd'   value="${messageType}"> 
		<input type='hidden' name='p1_MerId' value="${merchantID}"> 
		<input type="hidden" name="p2_Order" value="${orderId}"> 
		<input type='hidden' name='p3_Amt'   value="${amount}"> 
		<input type='hidden' name='p4_Cur'   value="${currency}"> 
		<input type='hidden' name='p5_Pid'   value="${productId}"> 
		<input type='hidden' name='p6_Pcat'  value="${productCat}"> 
		<input type='hidden' name='p7_Pdesc' value="${productDesc}"> 
		<input type='hidden' name='p8_Url'   value="${merchantCallbackURL}"> 
		<input type='hidden' name='p9_SAF'   value="${addressFlag}"> 
		<input type='hidden' name='pa_MP'    value="${sMctProperties}"> 
		<input type='hidden' name='pd_FrpId' value="${frpId}"> 
		
		<input type="hidden" name="pr_NeedResponse"  value="0">
		
		
		<input type='hidden' name='hmac' value="${hmac}">
		
		<!--  <input type='submit' value='submit'> -->
	</form>
  </body>
</html>
