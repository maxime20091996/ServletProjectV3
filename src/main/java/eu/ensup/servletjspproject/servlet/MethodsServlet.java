package eu.ensup.servletjspproject.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MethodsServlet
 */

@WebServlet("/Accueil")
public class MethodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MethodsServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		List<String> listeMethodes = new ArrayList<String>();
		
		listeMethodes.add(request.getLocalName());
		listeMethodes.add(request.getContextPath());
		listeMethodes.add(request.getServerName());
		listeMethodes.add(request.getLocalAddr());
		listeMethodes.add(request.getRemoteAddr());
		listeMethodes.add(request.getContentType());
		listeMethodes.add(request.getProtocol());
		listeMethodes.add(request.getRemoteUser());
		listeMethodes.add(request.getRequestURI());
		listeMethodes.add(request.getRemoteHost());
		
		request.setAttribute("methodes", listeMethodes);
		
		this.getServletContext().getRequestDispatcher("index.jsp").forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
