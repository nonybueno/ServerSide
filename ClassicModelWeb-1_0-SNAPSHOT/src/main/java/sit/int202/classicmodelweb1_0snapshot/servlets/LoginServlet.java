package sit.int202.classicmodelweb1_0snapshot.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/Login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if(username == null || username.isEmpty()) {
            response.sendError(401);
        } else if ("admin".equals(username) && "1234".equals(password)) {
            request.setAttribute("user", "admin");
        } else if ("user".equals(username) && "123456".equals(password)) {
            request.setAttribute("user", "admin");
        }
    }
}
