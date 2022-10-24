package com.example.test.servlet;

import com.example.test.entitire.Subject;
import com.example.test.entitire.SubjectRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "SubjectListServlet", value = "/SubjectList")
public class SubjectListServlet extends HttpServlet {
    private List<Subject> subjects;
    private int requestCount;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(++requestCount);
        request.setAttribute("a", subjects);

//        request.getRequestDispatcher("/subject_listing.jsp").forward(request, response);
//        ServletContext sc = getServletContext();
        getServletContext().getRequestDispatcher("/subject_listing.jsp").forward(request, response);
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("\n-----------------------");
        System.out.println("\nSubjectListServlet has stopped!");
        System.out.println("\n-----------------------");
    }

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("\n-----------------------");
        System.out.println("\nSubjectListServlet was born!");
        System.out.println("\n-----------------------");
        subjects = new SubjectRepository().findAll();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}