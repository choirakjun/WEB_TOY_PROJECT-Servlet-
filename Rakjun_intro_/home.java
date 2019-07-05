package Rakjun_intro_;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/home")
public class home extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public home() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Browser에게 어떤 내용을 보낼 것인지 알려준다.
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
				"\r\n" + 
				"\r\n" + 
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
				"		.link-mid\r\n" + 
				"		{\r\n" + 
				"			text-align: center;				\r\n" + 
				"		}\r\n" + 
				"\r\n" + 
				"		.link-mid  div\r\n" + 
				"		{\r\n" + 
				"			display:inline-block;\r\n" + 
				"			background-color: skyblue;\r\n" + 
				"			box-shadow:3px 3px 3px gray;	\r\n" + 
				"			width:150px;\r\n" + 
				"			height:150px;\r\n" + 
				"			font-size:20px;\r\n" + 
				"			1이 부분이 하늘색 블락안에서 글씨 위치인데 center인데 수직정렬이 안됌.\r\n" + 
				"			text-align: center;\r\n" + 
				"\r\n" + 
				"	\r\n" + 
				"		}\r\n" + 
				"		\r\n" + 
				"		.link-mid  a\r\n" + 
				"		{\r\n" + 
				"\r\n" + 
				"			text-decoration:none;\r\n" + 
				"			color:white;\r\n" + 
				"\r\n" + 
				"		}\r\n" + 
				"		.map\r\n" + 
				"		{\r\n" + 
				"			text-align: center;	\r\n" + 
				"		}\r\n" + 
				"		\r\n" + 
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
				"		<span style=\"text-align: center;\"><h1>훌륭한 웹 개발자가 되기 위해서.. Choi Rak Jun</h1>\r\n" + 
				"		</span>\r\n" + 
				"\r\n" + 
				"		<div style=\"text-align: center;\">함께 개발하고 같이성장하고 싶어요<br>서울시 강남구 일원동에 살고 있습니다.!</div>\r\n" + 
				"	\r\n" + 
				"		<div class=\"link-mid\">\r\n" + 
				"		\r\n" + 
				"			<div class=\"self-intro\">	\r\n" + 
				"				<a href=\"http://localhost:8090/Rakjun_intro_/self_intro\">자기소개</a>\r\n" + 
				"			</div>\r\n" + 
				"\r\n" + 
				"			<div class=\"my-picture\">\r\n" + 
				"				<a href=\"http://localhost:8090/Rakjun_intro_/my_picture\">내사진</a>\r\n" + 
				"			</div>\r\n" + 
				"		</div>\r\n" + 
				"\r\n" + 
				"		<div class=\"map\">\r\n" + 
				"			<img src=\"file:///C:/Users/RAK_JUN/eclipse-workspace/Rakjun_intro_/src/Rakjun_intro_/지도.PNG\">\r\n" + 
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
