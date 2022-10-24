package sit.int202.simple.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "CalServlet", value = "/Cal")
public class CalServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String num1 = request.getParameter("num1");
        String operator = request.getParameter("operator");
        String num2 = request.getParameter("num1");
        log(operator);
        double num1ToInt = Double.parseDouble(num1);
        double num2ToInt = Double.parseDouble(num2);
        if(operator.equals("+")) {
            request.setAttribute("result", num1ToInt + num2ToInt);
        } else if (operator.equals("-")) {
            request.setAttribute("result", num1ToInt - num2ToInt);
        } else if (operator.equals("*")) {
            request.setAttribute("result", num1ToInt * num2ToInt);
        } else if (operator.equals("/")) {
            request.setAttribute("result", num1ToInt / num2ToInt);
        }
        request.setAttribute("num1", num1);
        request.setAttribute("num2", num2);
        request.setAttribute("operator", operator);
        request.getRequestDispatcher("/Result.jsp").forward(request, response);
    }
}

