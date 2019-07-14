package vaalikone;
import model.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import org.eclipse.persistence.sessions.Login;

/**
 * Servlet implementation class logincheck
 */
@WebServlet("/logincheck")
public class logincheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public logincheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
//		PrintWriter out = response.getWriter();
//		String nimi = request.getParameter("username");
//		String pass = request.getParameter("pass");
//		
//		if(nimi=="Tomato"&&pass=="Tometo")
//		{
//			  RequestDispatcher rd=request.getRequestDispatcher("NaytaPoistettavat.jsp");
//		        rd.forward(request, response);
//		}else {
//			out.println("wrong Username || Password");
//		}
		
		
//		PrintWriter out = response.getWriter();
//		String nimi = request.getParameter("username");
//		String pass = request.getParameter("pass");
//		try {
//			
//			EntityManagerFactory emf = Persistence.createEntityManagerFactory(
//					"vaalikones");
//			EntityManager em = emf.createEntityManager();
//			CriteriaBuilder cb = em.getCriteriaBuilder();
//			CriteriaQuery<Login> cq = cb.createQuery(Login.class);
//			Root<Login> root = cq.from(Login.class);
//			cq.where(
//					cb.equal(root.get(Login.userrname), nimi),
//					cb.equal(root.get(Login.password), pass)   
//			); 
//			TypedQuery<Login> q = em.createQuery(cq);
//			Login login = q.getSingleResult();
//			login.getUserName();
//			out.print( "Login succeed");
//	}	catch(Exception e) {
//		out.print( "Login failed");}
//		response.sendRedirect("login.html");
//	}
		
		String username = request.getParameter("username");
		String pass = request.getParameter("pass");
		
		if(username.equals("Admin")&& pass.equals("Admin"))
		{
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			response.sendRedirect("LuePoistettavat"); 
		} else {
			response.sendRedirect("login.html");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
