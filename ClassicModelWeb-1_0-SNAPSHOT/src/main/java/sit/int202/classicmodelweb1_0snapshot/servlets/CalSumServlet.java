package sit.int202.classicmodelweb1_0snapshot.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import sit.int202.classicmodelweb1_0snapshot.models.plusNum;

import java.io.IOException;

@WebServlet(name = "CalSumServlet", value = "/sum")
public class CalSumServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/calSum.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");
        int num1ToInt = Integer.parseInt(num1);
        int num2ToInt = Integer.parseInt(num2);
        plusNum p = new plusNum(num1ToInt, num2ToInt);
        HttpSession session = request.getSession();
        request.setAttribute("result", p.sum());
        request.getRequestDispatcher("/calSum.jsp").forward(request, response);
    }
}
