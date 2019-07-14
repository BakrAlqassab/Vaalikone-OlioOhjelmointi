package vaalikone;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import DAO.Ehdokkaatdao;
import persist.Ehdokkaat;
  
/**
 * Servlet implementation class GetEhdokkaat
 */
@WebServlet("/GetEhdokkaat")

public class GetEhdokkaat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetEhdokkaat() {
        super();
        // TODO Auto-generated constructor stub
    } 

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		int id = Integer.parseInt(request.getParameter("poistettavaId"));
		Ehdokkaatdao dao = new Ehdokkaatdao();
		
		Ehdokkaat a = dao.findEhdokkaatbyid(id);
		request.setAttribute("Ehdokkaat", a);
		request.getRequestDispatcher("/editEhdokkaat.jsp").forward(request , response);
	}

	 

}
