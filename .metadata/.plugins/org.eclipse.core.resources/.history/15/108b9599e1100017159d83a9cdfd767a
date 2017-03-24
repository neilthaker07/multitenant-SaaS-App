package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logicImplementation.LoginPageImpl;
import pojo.LoginPage;

@WebServlet(name="LoginServlet", urlPatterns={"/LoginServlet"})
public class LoginServlet extends HttpServlet
{
	private LoginPage loginPage = new LoginPage();
	private LoginPageImpl loginPageImpl = new LoginPageImpl();
	
	public void init() throws ServletException
	{
		
	}
	
	public void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException,
			IOException
	{
		String userName = request.getParameter("username");
		
		loginPage.setUserName(userName);

		String a = loginPageImpl.verifyUser(loginPage);
		if(a != null)
		{
			response.sendRedirect("LoginPage.html");//("Tenant.jsp");
			return;
		}
	}
	
	public void destroy()
	{
	
	}

}
