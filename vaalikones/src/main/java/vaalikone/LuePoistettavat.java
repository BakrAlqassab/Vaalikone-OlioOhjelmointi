package vaalikone;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persist.Ehdokkaat;

/**
 * Servlet implementation class LuePoistettavat
 */
@WebServlet("/LuePoistettavat")
public class LuePoistettavat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LuePoistettavat() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vaalikones");
		EntityManager em=emf.createEntityManager();
		
        Query q = em.createQuery("SELECT e FROM Ehdokkaat e");
        List<Ehdokkaat> kaikkiEhdokkaat = q.getResultList();
        
        //Hakee kaikki ehdokkaat ja ohjaa NaytaPoistettavat.jsp
        request.setAttribute("kaikkiEhdokkaat", kaikkiEhdokkaat);
        RequestDispatcher rd=request.getRequestDispatcher("NaytaPoistettavat.jsp");
        rd.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
