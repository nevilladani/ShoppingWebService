<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<% 
String userName = (String) session.getAttribute("theName");
if (null == userName) {
   request.setAttribute("Error", "Session has ended.  Please login.");
   RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
   rd.forward(request, response);
}
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>ePayment </title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">  
	
	<link rel="stylesheet" href="../css/base.css">
	<link href="../css/purchase.2012.css?v=201212081831" rel="stylesheet" type="text/css">  
   <style>
   .d1{
	  		position:relative;
	   	    margin:0 auto;     
	        margin-top:30px;
	        width:600px
      }
      .t tr td{
          text-align:center
      }
  </style>
  </head>
  
  <body>
  <div id="shortcut-2013">
		<div class="w">
			<ul class="fl lh">
				<li class="fore1 ld"><b></b><a
					href="javascript:addToFavorite()" rel="nofollow">Add to
						favourite</a></li>
			</ul>
			<ul class="fr lh">
				<li>Welcome to WebCoders£¡<span> </span></li>
			</ul>
			<span class="clr"></span>
		</div>
	</div>

	<div class="w w1 header clearfix">
		<div id="logo">
			<a href="http://localhost:8080/ECommerceSystem"><img
				clstag="clickcart|keycount|xincart|logo" src="../image/logo.png">
			</a>
		</div>

		<div class="progress clearfix">
			<ul class="progress-3">
				<li class="step-1"><b></b>1.My Shopping Cart</li>

				<li class="step-3"  style = "background-color:#39508B; color:#ffffff ">2.Receipt Generated</li>
			</ul>
		</div>
	</div>
	<div class="d1">
	    <form action="${pageContext.request.contextPath}/service/PaymentRequest?orderid=${orderid}&amount=${amount }" method="post" name="paymentform">
	       <table class="t" width="100%" border="0" >
	       		
	       		<tr>
	              <td height="30" colspan="3" align="center"><span class="STYLE3">Thank you for the payment.</span> </td>
	           </tr>
	           
	           <tr>
	               <td align="center"  colspan="4" border="0"  bgcolor="#ABBADF">
                       <h3>  </h3></td>
	           </tr>
	           
	            <tr>
	               <td align="center"  colspan="4" border="0"  bgcolor="#ABBADF" style="padding-top: 50px">
                       <h3>RECEIPT: Order Number£º${fn:substringBefore(amount/15, '.') } and Amount: ${amount }</h3></td>
	           </tr>
	          
	          <tr>
	               <td align="center"  colspan="4" border="0"  bgcolor="#ABBADF">
                       <h3>  _______________________________ </h3></td>
	           </tr>
	          
	           
	           <tr>
	               <td align="center"  colspan="4" border="0"  bgcolor="#ABBADF">
                       <h3> Payment in the name of: ${usrName}</h3></td>
	           </tr>
	           
	            <tr>
	               <td align="center"  colspan="4" border="0"  bgcolor="#ABBADF">
                       <h3> _______________________________ </h3></td>
	           </tr>
	          
	           
	           <tr>
	               <td align="center"  colspan="4" border="0"  bgcolor="#ABBADF">
                       <h3> Address: ${userAddress}   </h3></td>
	           </tr>
	           
	            <tr>
	               <td align="center"  colspan="4" border="0"  bgcolor="#ABBADF">
                       <h3> _______________________________  </h3></td>
	           </tr>
	          
	           
	           <tr>
	               <td align="center"  colspan="4" border="0"  bgcolor="#ABBADF" style="padding-bottom: 50px">
                       <h3>Bank Information: ${userBank}   </h3></td>
	           </tr>
	           
	           <tr>
	               <td align="center"  colspan="4" border="0"  bgcolor="#ABBADF">
                       <h3> </h3></td>
	           </tr>

          </table>
	    </form>
	 <div class="cart-button clearfix">
				<a class="btn continue"
					href="${pageContext.request.contextPath }/web.controller/ListProductServlet"><span class="btn-text" style ="background-color: #39508B; color: #ffffff; padding-right: 20px" ><h3>Back to Cart</h3>h3></span> </a> 
			    
	</div>
  </div>
  </body>
</html>