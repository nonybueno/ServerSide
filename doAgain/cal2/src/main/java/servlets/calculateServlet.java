package servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.calNum;

import java.io.IOException;


@WebServlet(name = "calculateServlet", value = "/calculate")
public class calculateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        calNum n1n2 = new calNum(n1,n2);
        HttpSession session = request.getSession();
        session.setAttribute("result",n1n2.sum());
        request.getRequestDispatcher("/Cal.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
