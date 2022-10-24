package com.example.test.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "CreateCookieServlet", value = "/CreateCookie")
public class CreateCookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String bg = request.getParameter("bg");
        String fg = request.getParameter("fg");
        Cookie a = new Cookie("background-color", bg==null? "yellow" : bg);
        Cookie b = new Cookie("foreground-color", fg==null? "darkblue" : fg);
        a.setMaxAge(7*60*60*24);
        b.setMaxAge(7*60*60*24);
        response.addCookie(a);
        response.addCookie(b);
        response.getWriter().println("<html><body>Cookie has been created!</body></html>");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
