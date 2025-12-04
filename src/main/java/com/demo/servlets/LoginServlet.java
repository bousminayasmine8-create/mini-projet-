package com.demo.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if("admin".equals(username) && "admin".equals(password)) {
            response.sendRedirect("cars.html");
        } else {
            response.sendRedirect("login.html?error=1");
        }
    }
}
