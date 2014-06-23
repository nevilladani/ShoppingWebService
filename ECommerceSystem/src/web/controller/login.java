package web.controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbService.DBServiceProxy;
import DB.DBService;
import DB.UserInformation;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserInformation proxy = new UserInformation();
      //Service proxy = new Service(); 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
    	
        super();
        System.out.println("asadcsc");
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//	PrintWriter out = response.getWriter();
		System.out.println("asadcsc");
		
		String qdone;
		PrintWriter out = response.getWriter();
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		System.out.println(request.getParameter("user"));
		System.out.println(request.getParameter("pass"));
		
		try{
			
			System.out.println("asadcsc1");
			//proxy.setEndpoint("http://localhost:8080/ECommerceSystem/services/Service");
			System.out.println("asadcsc2");
			qdone = proxy.login(user,pass);
			
			if(qdone.equals("true"))
			{
				request.setAttribute("message",user);
				RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
				if(rd!= null) rd.forward(request, response);
				
			}
			else 
			{
				RequestDispatcher rd = request.getRequestDispatcher("/error.jsp");
				if(rd!= null) rd.forward(request, response);
				
			}
			
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
