package com.mini.projet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if("sophie@example.fr".equals(email) && "1234".equals(password)) {
            out.println("<h1>Bienvenue, " + email + "!</h1>");
            out.println("<a href='index.html'>Accueil</a>");
        } else {
            out.println("<h1>Email ou mot de passe incorrect</h1>");
            out.println("<a href='login.html'>Réessayer</a>");
        }
    }
}
