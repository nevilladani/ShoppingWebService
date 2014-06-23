<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<% 
String userName = (String) session.getAttribute("theName");
if (null == userName) {
   request.setAttribute("Error", "Session has ended.  Please login.");
   RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
   rd.forward(request, response);
}

%>

<%@include file="header2.jsp" %>
<body>
	<script type="text/javascript"
		src="http://misc.360buyimg.com/lib/js/2012/base-2011.js"
		charset="gb2312"></script>
	<div id="shortcut-2013">
		<div class="w">
			<ul class="fl lh">
				<li class="fore1 ld"><b></b><a
					href="javascript:addToFavorite()" rel="nofollow">Add to
						favourite</a></li>
			</ul>
			<ul class="fr lh">
				<li> <%= session.getAttribute( "theName" ) %>'s cart！<span> </span></li>
			</ul>
			<span class="clr"></span>
		</div>
	</div>

	<div class="w w1 header clearfix">
		<div id="logo">
			<a href="http://localhost:8080/ECommerceSystem/web.controller/ListProductServlet"><img
				clstag="clickcart|keycount|xincart|logo" src="../image/logo.png">
			</a>
		</div>

		<div class="progress clearfix">
			<ul class="progress-1">
				<li class="step-1" style = "background-color:#39508B; color:#ffffff "><b></b>1.My Shopping Cart</li>

				<li class="step-3">2.Submit your order</li>
			</ul>
		</div>
	</div>
	<div class="w cart">
		<div class="cart-hd group">
			<h2>My Shopping Cart</h2>
			<span id="show2" class="fore"> </span>
		</div>

		<div id="show">
			<c:if test ="${empty(cart.map) }">
                <h4 align="center">You haven't bought anything yet</h4>
            </c:if>
			<div class="cart-frame">
				<div class="tl"></div>
				<div class="tr"></div>
			</div>
			<div class="cart-inner">
				<div class="cart-thead clearfix">
					<div class="column form">Pictures</div>
					<div class="column t-goods">Products</div>
					<div class="column t-price">Price</div>
					<div class="column t-quantity">Quantity</div>
					<div class="column t-quantity">Subtotal</div>
					<div class="column t-action">Operation</div>
				</div>
				<div id="product-list" class="cart-tbody">
					<!-- ************************商品开始********************* -->
					<div data-bind="rowid:1" class="item item_selected ">
						<c:forEach var="entry" items="${cart.map }">
							<div class="item_form clearfix">
								<div class="cell p-goods">
									<div class="p-img">
										<img width="50" height="50" src="../image/${entry.key}.png" />
									</div>
									<div class="p-name">${entry.value.computer.brand }  ${entry.value.computer.name }
							        </div>
								</div>
								<div class="cell p-price">
									<span class="price">${entry.value.computer.price }</span>
								</div>

								<div class="cell p-quantity">
									<div class="quantity-form" data-bind="">
										<input type="text" name="quantity" value="${entry.value.quantity }" style="width:35" onchange="changeQuantity(this,${entry.key },${entry.value.quantity })" />
									</div>
								</div>
								<div class="cell p-remove">
									<span class="price">${entry.value.price }</span>
								</div>
								<div class="cell p-remove">
									<a class="a1" href="javascript:void(0)"
										onclick="deleteitem(${entry.key})">delete</a>
								</div>
							</div>
						</c:forEach>
					</div>
				</div>
				<!-- product-list结束 -->

				<div class="cart-total clearfix">
					<div class="control fl clearfix"></div>
					<div class="total fr">
						<span id="finalPrice" data-bind="4299.00">$${cart.price }</span>Total：
					</div>

				</div>
			</div>
			<!-- cart-inner结束 -->
			<div class="cart-button clearfix">
				<a class="btn continue"
					href="${pageContext.request.contextPath }/web.controller/ListProductServlet"><span class="btn-text"><h3>Go Back</h3></span> </a> 
			    
			    <c:if test ="${!empty(cart.map) }">
               <a class="checkout" href="${pageContext.request.contextPath }/web.controller/PaymentServlet?orderid=${fn:substringBefore(cart.price/15, '.')}&amount=${cart.price}" >Pay Now</a>
            </c:if>
			    
			
			</div>
		</div>
	</div>
  </body>
</html>