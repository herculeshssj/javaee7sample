package br.ufrj.tic.servletjsp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ExemploServlet")
public class ExemploServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1023906424988011544L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8"); // forçar o uso de UTF-8
		
		resp.getWriter().print("Submissão feita via GET");		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8"); // forçar o uso de UTF-8
		
		resp.getWriter().print("Submissão feita via POST");
	}

}
