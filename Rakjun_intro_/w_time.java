package Rakjun_intro_;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
/**
 * Servlet implementation class w_time
 */
@WebServlet("/w_time")
public class w_time extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public w_time() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		
		//출력시 사용한다.
		PrintWriter out = response.getWriter();
		LocalDate date = LocalDate.now();	
		LocalTime time = LocalTime.now();
	


		out.println("<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"	<title>몇 시에요</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"	<h1><a href=\"http://localhost:8090/Rakjun_intro_/home\">메인화면</a></h1>");
		
		out.println(date);
		out.println(time);
		out.println("</body>\r\n" + 
				"</html>");
		
		
		out.close();
	
	
	
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
