package vaalikone;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse;

import DAO.Ehdokkaatdao;
import persist.Ehdokkaat;

/**
 * Servlet implementation class editehdokkaat
 */ 
@WebServlet("/editehdokkaat")
public class editehdokkaat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editehdokkaat() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		int id = Integer.parseInt(request.getParameter("id1"));
		String Sukunimi = request.getParameter("sukunimi");
		String Etunimi = request.getParameter("etunimi");
		String Puolue = request.getParameter("puolue");
		String kotipaikkakunta = request.getParameter("kotipa");
		int Ika =Integer.parseInt( request.getParameter("ika"));
		String Mieduskunta = request.getParameter("mieduskunta");
		String Mitaasioita = request.getParameter("mitaas");
		String Ammatti = request.getParameter("ammatti");
		 
	
		 
		Ehdokkaat a =new Ehdokkaat(id,Sukunimi,Etunimi,Puolue,kotipaikkakunta,Ika,Mieduskunta,Mitaasioita,Ammatti);
		Ehdokkaatdao dao = new Ehdokkaatdao();  
		dao.Edit(a);
		
		List<Ehdokkaat> allEhdokkaat = dao.findall();
		request.setAttribute("kaikkiEhdokkaat", allEhdokkaat);

		
		  RequestDispatcher rd=request.getRequestDispatcher("NaytaPoistettavat.jsp");
	        rd.forward(request, response);
	}



}
