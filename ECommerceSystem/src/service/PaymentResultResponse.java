package service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utils.ConfigInfo;
import utils.EPaymentUtils;

@WebServlet("/PaymentResultResponse")
public class PaymentResultResponse extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("GBK");
		String merchantID = request.getParameter("p1_MerId"); 
		String keyValue = ConfigInfo.getValue("keyValue"); 
		
		String sCmd = request.getParameter("r0_Cmd"); 
		String sResultCode = request.getParameter("r1_Code"); 
		String sTrxId = request.getParameter("r2_TrxId"); 
		String amount = request.getParameter("r3_Amt");
		String currency = request.getParameter("r4_Cur");
		String productId = request.getParameter("r5_Pid");
		String orderId = request.getParameter("r6_Order");
		String userId = request.getParameter("r7_Uid");
		String mp  = request.getParameter("r8_MP");
		String bType = request.getParameter("r9_BType");
		String rb_BankId  = request.getParameter("rb_BankId");
		String rp_PayDate = request.getParameter("rp_PayDate");
		String hmac = request.getParameter("hmac");
		
		boolean result = EPaymentUtils.verifyCallback(hmac, merchantID, sCmd, sResultCode, sTrxId, amount,
				currency, productId, orderId, userId, mp, bType, keyValue);
		if(result){
			if("1".equals(sResultCode)){
				
				String message = "Order ID:  "+ orderId+ "<br/>This order has been paid SUCCESSFULLY!<br/><br/>";
				message += "Customer paid "+ amount +" Yuan <br/><br/>";
				
				message += "Order ID in Yeepay's system is :"+ sTrxId;
				request.setAttribute("message", message);
			}else{
				request.setAttribute("message", "Payment Failed");
			}
		}else{
			request.setAttribute("message", "Data received is illegal !");
		}
		request.getRequestDispatcher("/WEB-INF/jsp/paymentResult.jsp").forward(request, response);
	
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
