package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.FormDAO;
import Model.Agenda;

/**
 * Servlet implementation class ServletForm
 */
@WebServlet("/ServletForm")
public class ServletForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served atqq: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		Agenda agenda = new Agenda();
		FormDAO form = new FormDAO();
		
		int menj = 0;
		boolean registro = false;
		
		if(request.getParameter("registrar") != null) {
			int idMascota = Integer.parseInt(request.getParameter("txtidMascota"));
			int dueno = Integer.parseInt(request.getParameter("txtrutDueno"));
			String mascota = request.getParameter("txtnombreMascota");
			String hora = request.getParameter("txthora");
			String fecha = request.getParameter("txtfecha");
			
			try {
				registro = form.Guardar(idMascota, dueno, mascota, hora, fecha);
				request.getRequestDispatcher("list-agenda.jsp").forward(request, response);
			} catch (Exception ex) {
				System.out.println(ex);
			}
			
			
		}
	}
}
