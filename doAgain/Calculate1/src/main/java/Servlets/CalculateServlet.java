package Servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import models.calmodel;

import java.io.IOException;

@WebServlet(name = "CalculateServlet", value = "/Calculate")
public class CalculateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");
        int num1s = Integer.parseInt(num1);
        int num2s = Integer.parseInt(num2);
        calmodel sumNums = new calmodel(num1s,num2s);
        HttpSession session = request.getSession();
        session.setAttribute("result",sumNums.sumNum());
        request.getRequestDispatcher("./cal.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
