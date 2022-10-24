package sit.int202.exam.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "TestRequestParameterServlet", value = "/TestReqParam")
public class TestRequestParameterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Enumeration<String> paramNames = request.getParameterNames();
        while(paramNames.hasMoreElements()) {
            String name = paramNames.nextElement();
            String value = request.getParameter(name);
            System.out.println(name + ": " + value);
        }
        System.out.println("---------------------------");
        String favSubject[] = request.getParameterValues("fav_subjects");
        System.out.println("Favorite Subject");
        for (String subject: favSubject) {
            System.out.println("\t" + subject);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
