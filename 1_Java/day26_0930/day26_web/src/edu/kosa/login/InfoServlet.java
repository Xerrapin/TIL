package edu.kosa.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/edu")
public class InfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public String uname="이순신";
	public String uage = "30";
	public String ulocal="전국";
       
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		// 코딩 위치~
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String local = request.getParameter("local");	
		
		response.setCharacterEncoding("euc-kr");
		System.out.println(name +", "+ age +", "+local);
		PrintWriter pw = response.getWriter();
		//pw.write("<h1>html 통해서 값들고 왔어요. index page에서 servlet 불렀습니다.33333</h1>");
		pw.write("<html><head><title>myInfo</title></head><body><b><br>");
		
		if( uname.equals(name) && !uage.equals(age) && ulocal.equals(local)) {
			pw.println("password fail.<br>");
			pw.println("<a href='html/info.html'>Login</a>");
			
		} else if( uname.equals(name) && uage.equals(age) && !ulocal.equals(local)) {
			pw.println("password fail. <br>");
			pw.println("<a href='html/info.html'>Login</a>");
			
		} else if( uname.equals(name) && uage.equals(age) && ulocal.equals(local)) {
			pw.println("your name is "+ name + "<br/>");
			pw.println("your age is "+ age + "<br/>");
			pw.println("address is "+ local + "<br/>");
			
		} else {
			pw.println("register fail<br/>");
			pw.println("<a href='html/info.html'>Login</a>");
		}
		
		pw.write("</body></html>");
		
//		pw.write("<h1>입력된 정보</h1>");
//		pw.write("<h3>이름: " + name + "</h3>");
//		pw.write("<h3>나이: " + age + "</h3>");
//		pw.write("<h3>거주지: " + local + "</h3>");
//		pw.write("다시 입력하려면 <b><a href='./index.html'>여기</a></b>를 눌러주세요");

	}

	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}












