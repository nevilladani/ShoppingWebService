package service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utils.ConfigInfo;
import utils.EPaymentUtils;

@WebServlet("/PaymentRequest")
public class PaymentRequest extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("GBK");
		
		String orderid = request.getParameter("orderid"); //order id
		String amount = request.getParameter("amount"); //money amount
		
		String pd_FrpId = request.getParameter("pd_FrpId"); //bank
		
		String p1_MerId = ConfigInfo.getValue("p1_MerId"); 
		String keyValue = ConfigInfo.getValue("keyValue");
		
		String merchantCallbackURL = ConfigInfo.getValue("merchantCallbackURL");

		String messageType = "Buy"; 
		String currency = "CNY"; 
		String productDesc = ""; 
		String productCat = ""; 
		String productId = ""; 
		String addressFlag = "0"; 		
		String sMctProperties = ""; 
		String pr_NeedResponse = "0"; 
		
		String md5hmac = EPaymentUtils.buildHmac(messageType, p1_MerId, orderid, amount, currency,
				productId, productCat, productDesc, merchantCallbackURL, addressFlag, sMctProperties, 
				pd_FrpId, pr_NeedResponse, keyValue);
		
		request.setAttribute("messageType", messageType);
		request.setAttribute("merchantID", p1_MerId);
		request.setAttribute("orderId", orderid);
		request.setAttribute("amount", amount);
		request.setAttribute("currency", currency);
		request.setAttribute("productId", productId);
		request.setAttribute("productCat", productCat);
		request.setAttribute("productDesc", productDesc);
		request.setAttribute("merchantCallbackURL", merchantCallbackURL);
		request.setAttribute("addressFlag", addressFlag);
		request.setAttribute("sMctProperties", sMctProperties);
		request.setAttribute("frpId", pd_FrpId);
		request.setAttribute("pr_NeedResponse", pr_NeedResponse);
		request.setAttribute("hmac", md5hmac);
		
		request.getRequestDispatcher("/WEB-INF/jsp/connection.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
