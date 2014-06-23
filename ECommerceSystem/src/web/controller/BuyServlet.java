package web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DB.DB;
import service.BusinessService;
import domain.Cart;
import domain.Computer;

@WebServlet("/BuyServlet")
public class BuyServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		
		BusinessService service = new BusinessService();
		Computer computer = service.findComputer(id);
		
		//get customer's shopping cart
		Cart cart = (Cart) request.getSession().getAttribute("cart");
		if(cart==null){
			cart = new Cart();
			request.getSession().setAttribute("cart",cart);
		}
		
		//add product to shopping cart 
		System.out.println("mmmmmmmmmmmmmmmmmmmmmmmmm");
		cart.add(computer);
		
		//request.getRequestDispatcher("${pageContext.request.contextPath }/servlet/ListCartUIServlet");
		response.sendRedirect(request.getContextPath()+"/web.controller/ListCartServlet");
		//request.getRequestDispatcher("/WEB-INF/jsp/ListCart.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}
}
