package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.LoginDAO;
import Model.Usuario;

/**
 * Servlet implementation class ServletAuth
 */
public class ServletAuth extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAuth() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		Usuario user = new Usuario();
		LoginDAO log = new LoginDAO();
		
		int menj = 0;
		String rut = "";
		
		if(request.getParameter("btn-login") != null) {
			String usuario = request.getParameter("txtusuario");
			String contrasena = request.getParameter("txtclave");
			
			try {
				rut = log.validar(usuario, contrasena);
			} catch (Exception ex) {
				System.out.println(ex);
			}
			
			if(rut == "" || rut == null) {
				response.sendRedirect("login.jsp?menj=" + menj);
			}else{

				
				response.sendRedirect("agendar.jsp");
			}
		}
	}
}