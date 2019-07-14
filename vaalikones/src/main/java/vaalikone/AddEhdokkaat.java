package vaalikone;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.Ehdokkaatdao;
import persist.Ehdokkaat;




/** 
 * Servlet implementation class AddEhdokkaat
 */
@WebServlet("/AddEhdokkaat")
public class AddEhdokkaat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEhdokkaat() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		
		String ehetunimi =request.getParameter("etunimi");
		String ehsukunimi =request.getParameter("sukunimi");
		String ehpuolue =request.getParameter("puolue");
		String ehkotipaikkakonta =request.getParameter("kotipaikkakunta");
		int ehika = Integer.parseInt(request.getParameter("ika")); 
		String ehmiksiEduskuntaan =request.getParameter("miksiEduskuntaan");
		String ehmitaEdistaa =request.getParameter("mitaEdistaa");
		String ehammatti =request.getParameter("ammatti");
		
		
		
		
		
		Ehdokkaat ehd = new Ehdokkaat();
		ehd.setEtunimi(ehetunimi);
		ehd.setSukunimi(ehsukunimi);
		ehd.setPuolue(ehpuolue);
		ehd.setKotipaikkakunta(ehkotipaikkakonta);
		ehd.setIka(ehika);		
		ehd.setMiksiEduskuntaan(ehmiksiEduskuntaan);
		ehd.setMiksiEduskuntaan(ehmiksiEduskuntaan);
		ehd.setMitaAsioitaHaluatEdistaa(ehmitaEdistaa);
		ehd.setAmmatti(ehammatti);
		
		
		Ehdokkaatdao dao = new Ehdokkaatdao(); 
		dao.Add(ehd);
		System.out.println("Added new Ehdokkaat");
		
		/////////////////////////////////////
		   
		List<Ehdokkaat> allEhdokkaat = dao.findall();
		
		// 
		request.setAttribute("kaikkiEhdokkaat", allEhdokkaat); 
		System.out.println("Added new Ehdokkaat22");
		//

		request.getRequestDispatcher("/NaytaPoistettavat.jsp").forward(request, response); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
