package com.ezencinema.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ezencinema.database.MemberDto;
import com.ezencinema.database.MemberImpl;

@WebServlet("/index.do")
public class Index extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setCharacterEncoding("utf-8");
		req.setCharacterEncoding("utf-8");
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out = res.getWriter();
		MemberImpl mem = new MemberImpl();
		List <MemberDto> list = mem.selectMem();
		for(MemberDto a: list) {
			out.println(a.getId());
		}
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
	}

}
