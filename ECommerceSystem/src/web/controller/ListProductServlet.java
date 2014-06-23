package web.controller;

import java.io.IOException;

import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BusinessService;

@WebServlet("/ListProductServlet")

public class ListProductServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BusinessService service = new BusinessService();
		String brand = (String) request.getParameter("brand");
		String searchSom = (String) request.getParameter("seachSomething");
		
		Map map =null;
		if(brand==null ){
			map = service.getAllComputer();
		}else{
			map = service.getBrandComputer(brand);
		}

		request.setAttribute("map",map);
		
		request.getRequestDispatcher("/WEB-INF/jsp/listProduct.jsp").forward(request,response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}
	
	
	
}
