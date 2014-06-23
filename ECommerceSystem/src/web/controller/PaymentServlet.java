package web.controller;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Cart;
import DB.UserInformation;
import service.BusinessService;
import utils.OrderIdUtil;

@WebServlet("/PaymentServlet")
public class PaymentServlet extends HttpServlet {

	public PaymentServlet() {
    	
        super();
        System.out.println("asadcsc");
        // TODO Auto-generated constructor stub
    }
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String userName = (String) request.getSession().getAttribute("theName");
		
		
		String info = UserInformation.userData(userName);
		//String userName = request.getParameter("usrName");
		String strArr[] = info.split("@@");
		String ss=strArr[0]+" "+strArr[1];
		request.setAttribute("usrName", ss);
		ss="";
		ss=strArr[2];
		request.setAttribute("userAddress", ss);
		ss="";
		ss=strArr[3];
		request.setAttribute("userBank", ss);
		
		String amount  = request.getParameter("amount");
		request.setAttribute("amount",amount);
		
		String orderId = OrderIdUtil.getValue(); 
		request.setAttribute("orderid",orderId);
		System.out.println(orderId);
		Cart cart = (Cart) request.getSession().getAttribute("cart");
		BusinessService bb= new BusinessService();
		bb.clearCart(cart);
		request.getRequestDispatcher("/WEB-INF/jsp/payment.jsp").forward(request, response);
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("ooooooooooooooooooooooooo");
		doGet(request, response);
	}
}
