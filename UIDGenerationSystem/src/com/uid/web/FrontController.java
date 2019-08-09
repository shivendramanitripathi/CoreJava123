package com.uid.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.uid.exception.ServiceException;
import com.uid.service.UidService;
import com.uid.service.UidServiceImpl;
import com.uid.model.Admin;
import com.uid.model.Enroll;
import com.uid.model.Report;

/**
 * Servlet implementation class FrontController
 */
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String uri = request.getRequestURI();
		String target = "/HomePage.jsp";
		try {
			UidService service = new UidServiceImpl();
		
		if(uri.endsWith("HomePage.action")){
			target = "/HomePage.jsp";
		}
		else if(uri.endsWith("Enroll_.action")){
			target = "/Enroll.jsp";
		}
		else if(uri.endsWith("Admin_.action")){
			List<Report> uids = (List<Report>) populateUid(request, response);
			request.setAttribute("listOfUids", uids);
			target = "/Admin.jsp";
		}
		else if(uri.endsWith("Report_.action")){
			target = "/Report.jsp";
		}
		else if(uri.endsWith("enroll.action")){
			Enroll enroll = (Enroll) populateEnroll(request,response);
			Object generatedID = service.Enrollment(enroll);
			request.setAttribute("Msg", "User "+request.getParameter("name")+" has been enrolled successfully! \n unique ID generated is "+(int)generatedID);
			target = "/HomePage.jsp";
		}
		else if(uri.endsWith("admin.action")){
			Admin admin = new Admin();
			admin.setUid(Integer.parseInt(request.getParameter("uid")));
			String check = request.getParameter("action");
			if(check.equalsIgnoreCase("YES")){
			service.Administration(admin);
			request.setAttribute("Msg", "User successfully deleted");
			}
			target = "/HomePage.jsp";
		}
		else if(uri.endsWith("report.action")){
			List<Report> listOfReports = (List<Report>) service.ViewReport();
			request.setAttribute("listOfReports", listOfReports);
			target = "/Report.jsp";
		}
		
		
		getServletContext().getRequestDispatcher(target).include(request, response);
		
		
		} catch (ServiceException e) {
			e.printStackTrace();
		request.setAttribute("errorMsg", "Service Exception occured");
		}
	}
	
	public Object populateEnroll(HttpServletRequest request, HttpServletResponse response){
		Enroll e = new Enroll();
		e.setName(request.getParameter("name"));
		e.setCONTACT_NO(Long.parseLong(request.getParameter("CONTACT_NO")));
		e.setLook(request.getParameter("look"));
		return e;
		
	}
	
	public Object populateUid(HttpServletRequest request, HttpServletResponse response){
		Report report = new Report();
		report.setEnroll_id(Integer.parseInt(request.getParameter("enroll_id")));
		return report;
		
	}

	
}
