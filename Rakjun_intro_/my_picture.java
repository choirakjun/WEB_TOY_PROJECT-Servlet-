package Rakjun_intro_;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class my_picture
 */
@WebServlet("/my_picture")
public class my_picture extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public my_picture() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		
		//출력시 사용한다.
		PrintWriter out = response.getWriter();
		
		out.println("<!--\r\n" + 
				"\r\n" + 
				"모든 콘텐츠 가운데 정렬\r\n" + 
				"\r\n" + 
				"같은 list\r\n" + 
				"-->\r\n" + 
				"<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"	<title>자기소개 Page</title>\r\n" + 
				"	<style type=\"text/css\">\r\n" + 
				"		div	\r\n" + 
				"		{\r\n" + 
				"\r\n" + 
				"			padding:8px;\r\n" + 
				"		}\r\n" + 
				"		header, section\r\n" + 
				"		{\r\n" + 
				"			border-top:3px solid green;\r\n" + 
				"			border-bottom:3px solid green;\r\n" + 
				"			border-left:6px solid green;\r\n" + 
				"			border-right:6px solid green;\r\n" + 
				"		\r\n" + 
				"\r\n" + 
				"		}\r\n" + 
				"		footer\r\n" + 
				"		{\r\n" + 
				"			border-top:3px solid green;\r\n" + 
				"			border-bottom:9px solid green;\r\n" + 
				"			border-left:6px solid green;\r\n" + 
				"			border-right:6px solid green;\r\n" + 
				"			padding-top: 5px;\r\n" + 
				"			padding-bottom: 5px;\r\n" + 
				"	\r\n" + 
				"		}\r\n" + 
				"	\r\n" + 
				"		.menu\r\n" + 
				"		{\r\n" + 
				"			margin:10px;\r\n" + 
				"		}\r\n" + 
				"		.menu_text\r\n" + 
				"		{\r\n" + 
				"			font-size:15px;\r\n" + 
				"			color:blue;\r\n" + 
				"			width:80px;\r\n" + 
				"			height:20px;\r\n" + 
				"			background-color: skyblue;	\r\n" + 
				"			display:inline-block;\r\n" + 
				"			text-align:center;\r\n" + 
				"			padding:2px;\r\n" + 
				"			margin:1px;\r\n" + 
				"			box-shadow:3px 3px 3px gray;\r\n" + 
				"		}\r\n" + 
				"		.menu_text > a\r\n" + 
				"		{\r\n" + 
				"			text-decoration:none;\r\n" + 
				"		}\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"		\r\n" + 
				"		.second\r\n" + 
				"		 {\r\n" + 
				"			\r\n" + 
				"			display: inline-block;		\r\n" + 
				"			padding: 30px;\r\n" + 
				"			margin: 30px;\r\n" + 
				"			position:relative;\r\n" + 
				"		 }\r\n" + 
				"\r\n" + 
				"		.first\r\n" + 
				"		{\r\n" + 
				"			\r\n" + 
				"			display: inline-block;	\r\n" + 
				"			padding: 30px;\r\n" + 
				"			margin: 30px;\r\n" + 
				"			position:relative;\r\n" + 
				"		\r\n" + 
				"		}\r\n" + 
				"\r\n" + 
				"		img\r\n" + 
				"		{\r\n" + 
				"\r\n" + 
				"			border:5px solid grey;\r\n" + 
				"		}\r\n" + 
				"\r\n" + 
				"		.explan\r\n" + 
				"		{\r\n" + 
				"			position:relative;\r\n" + 
				"			left:20%;\r\n" + 
				"			width:800px;\r\n" + 
				"			height:200px;\r\n" + 
				"		}\r\n" + 
				"\r\n" + 
				"	</style>\r\n" + 
				"</head>\r\n" + 
				"\r\n" + 
				"<body>\r\n" + 
				"	<header>\r\n" + 
				"		<nav>\r\n" + 
				"			<div class=\"menu\" style=\"text-align: right;\">\r\n" + 
				"			<!--홈 자기소개 내사진 몇시에요 -->	\r\n" + 
				"				<div class=\"menu_text\">\r\n" + 
				"					<a href=\"http://localhost:8090/Rakjun_intro_/home\">홈</a>\r\n" + 
				"				</div>\r\n" + 
				"				<div class=\"menu_text\">\r\n" + 
				"					<a href=\"http://localhost:8090/Rakjun_intro_/self_intro\">자기소개</a>\r\n" + 
				"				</div>\r\n" + 
				"				<div class=\"menu_text\">	\r\n" + 
				"					<a href=\"http://localhost:8090/Rakjun_intro_/my_picture\">내사진</a>\r\n" + 
				"				</div>\r\n" + 
				"				<div class=\"menu_text\">\r\n" + 
				"					<a href=\"http://localhost:8090/Rakjun_intro_/w_time\">몇시에요</a>\r\n" + 
				"				</div>\r\n" + 
				"				\r\n" + 
				"			</div>\r\n" + 
				"		</nav>\r\n" + 
				"	</header>\r\n" + 
				"	\r\n" + 
				"	<section>\r\n" + 
				"		\r\n" + 
				"		<div class=\"first\">\r\n" + 
				"			<img src=\"file:/C:/Users/RAK_JUN/eclipse-workspace/Rakjun_intro_/src/Rakjun_intro_/사진1.jpg\" style=\"width: 200px; height:200px;\" align=\"left\">\r\n" + 
				"				\r\n" + 
				"			<div class=\"explan\">	\r\n" + 
				"				2018.03.11\r\n" + 
				"				<br>\r\n" + 
				"				제가 코딩에 지쳐 피곤할때 찍은 사진입니다.\r\n" + 
				"				<br>\r\n" + 
				"				이때는 엘레베이터에서 찍었습니다..\r\n" + 
				"			</div>\r\n" + 
				"\r\n" + 
				"		</div>\r\n" + 
				"\r\n" + 
				"		<hr>\r\n" + 
				"\r\n" + 
				"		<div class=\"second\">	\r\n" + 
				"			<img src=\"file:///C:/Users/RAK_JUN/eclipse-workspace/Rakjun_intro_/src/Rakjun_intro_/사진2.jpg\" style=\"width: 200px; height:200px;\"  align=\"left\">\r\n" + 
				"\r\n" + 
				"			<div class=\"explan\">	\r\n" + 
				"			\r\n" + 
				"				2019.02.11\r\n" + 
				"				<br>\r\n" + 
				"				피곤할때 여행을 가던 모습입니다.@.@\r\n" + 
				"				<br>\r\n" + 
				"				건강한 모습을 유지하고 있습니다.\r\n" + 
				"				<br>\r\n" + 
				"				Lorem ipsum dolor sit amet, consectetur adi\r\n" + 
				"				\r\n" + 
				"				i ut aliquip ex ea commodoconsequat. Duis aute \r\n" + 
				"				<br>\r\n" + 
				"				irure dolor in reprehenderit in voluptate velit esseest laborum.\r\n" + 
				"			</div>\r\n" + 
				"\r\n" + 
				"		</div>\r\n" + 
				"		\r\n" + 
				"	</section>\r\n" + 
				"	\r\n" + 
				"\r\n" + 
				"	<footer style=\"text-align: center;\">\r\n" + 
				"			<span>meeta.io@rakjun</span>\r\n" + 
				"			<br>\r\n" + 
				"			<span>http://github.com/choirakjun</span>\r\n" + 
				"\r\n" + 
				"	</footer>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"</body>\r\n" + 
				"</html>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
