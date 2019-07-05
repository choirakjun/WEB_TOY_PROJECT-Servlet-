package Rakjun_intro_;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class self_intro
 */
@WebServlet("/self_intro")
public class self_intro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public self_intro() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stubx`
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
				"		}\r\n" + 
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
				"		div\r\n" + 
				"		{\r\n" + 
				"\r\n" + 
				"			text-align: left;\r\n" + 
				"			margin-left: 40px;\r\n" + 
				"			margin-right: 40px;\r\n" + 
				"			margin-top: 10px;\r\n" + 
				"			margin-bottom: 10px;\r\n" + 
				"\r\n" + 
				"		}\r\n" + 
				"\r\n" + 
				"\r\n" + 
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
				"		<div>\r\n" + 
				"			<span><h1>이런 것을 잘해요? 어떤 사람이 되고 싶어요?</h1></span>\r\n" + 
				"\r\n" + 
				"			끈기가 매우 강합니다.\r\n" + 
				"				협업을 매우 잘하며,\r\n" + 
				"				책임감도 강합니다.\r\n" + 
				"				최고의 개발자가 되고 싶습니다.\r\n" + 
				"				여기서 말하는 최고는 동료들에게 가장 함께 일하고 싶은 사람이 되고 싶습니다.\r\n" + 
				"				모두들 화이팅.	\r\n" + 
				"\r\n" + 
				"		</div>\r\n" + 
				"\r\n" + 
				"		<div>\r\n" + 
				"			<h1>나의 포트폴리오</h1>\r\n" + 
				"\r\n" + 
				"			<a href=\"https://meeta.io/@rakjun\">www.my.com</a>\r\n" + 
				"			<br>\r\n" + 
				"			제 홈페이지 입니다. 이 곳에서 많은 개발코드를 볼 수 있습니다.\r\n" + 
				"			<br>\r\n" + 
				"			<a href=\"www.github.com/choirakjun\">github.com/crong</a>\r\n" + 
				"			<br>\r\n" + 
				"			제가 주로 개발하는 소스코드입니다.이곳에서 많은 부분을 확인할 수 있습니다.\r\n" + 
				"		</div>\r\n" + 
				"\r\n" + 
				"		<div>\r\n" + 
				"			<span><h1>나의 최근 프로젝트 설명</h1></span>\r\n" + 
				"			최근 만든 프로젝트는 MOODY입니다.라즈베리파이와 google vision api,아두이노, 파이썬, 크롤러 사용했습니다.. ... \r\n" + 
				"			2018년 11월에 교내 전시회에 출품하였습니다.\r\n" + 
				"		</div>\r\n" + 
				"\r\n" + 
				"	</section>\r\n" + 
				"	\r\n" + 
				"\r\n" + 
				"	<footer style=\"text-align: center\">\r\n" + 
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
