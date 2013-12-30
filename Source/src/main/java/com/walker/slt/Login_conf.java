package com.walker.slt;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.walker.vo.*;
import com.walker.dao.*;
public class Login_conf extends HttpServlet{
	
	public Login_conf() {
		super();
	}

	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req,resp);
	}

	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException, IOException{
		
		response.setContentType("text/html");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		
		try {
			if(password.equals("admin") && name.equals("admin")){
				response.sendRedirect("../back/navigation-list.jsp");
			}
			else{
		        response.setHeader("refresh","2;URL=login_back.jsp") ;
//			    out.print("<font size=5 color=red>锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷碌锟铰�.....</font>");
			}
		}
		catch (Exception e) {
			response.setHeader("refresh","2;URL=login_back.jsp") ;
			out.print("<font size=5 color=red>锟矫伙拷"); 
//			out.print("锟斤拷锟斤拷锟节ｏ拷锟斤拷锟斤拷锟铰碉拷录......</font>");
		}
		out.flush();
		out.close();
	}
}
