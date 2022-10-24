package com.example.test.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "TestScopeServlet", value = "/TestScope")
public class TestScopeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("rc", "this is request scope attribute");

        HttpSession session = request.getSession();
        session.setAttribute("sc", "this is session scope attribute");

        ServletContext servletContext = getServletContext();
        servletContext.setAttribute("ac", "this is request Application attribute");

        servletContext.getRequestDispatcher("/test_scope.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
