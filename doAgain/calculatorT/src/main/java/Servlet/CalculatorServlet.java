package Servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "CalculatorServlet", value = "/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.getRequestDispatcher("./calculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Number1 = request.getParameter("number1");
        String Number2 = request.getParameter("number2");
        String operator = request.getParameter("operator");
        int Num1 = Integer.parseInt(Number1);
        int Num2 = Integer.parseInt(Number2);
        int sumNum = Num1+Num2;
        int minusNum = Num1-Num2;
        int multiNum = Num1*Num2;
        int divineNum = Num1/Num2;

        HttpSession session = request.getSession();
        session.setAttribute("sumNum", sumNum);
        session.setAttribute("minusNum", minusNum);
        session.setAttribute("mutiNum", multiNum);
        session.setAttribute("divineNum", divineNum);
        request.getRequestDispatcher("./calculator.jsp").forward(request, response);
        System.out.println(sumNum);
        System.out.println(minusNum);
        System.out.println(multiNum);
        System.out.println(divineNum);
    }
}
