package com.example.assigment3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletLogin", value = "/ServletLogin")
public class ServletLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username == null) {
            writer.println("<br><div class='info'>Please log yourself</div><br>");
            request.getRequestDispatcher("login.html").include(request, response);
        } else {
            if (username.equals("admin") && password.equals("nimda")) {
                writer.print("Login ok\n");
                HttpSession session = request.getSession();
                session.setAttribute("username", username);
                session.setAttribute("password", password);
                response.sendRedirect("ServletAdmin");
            } else {
                writer.print("<br><div class='info'>Wrong username or password! Try again</div><br>");
                request.getRequestDispatcher("login.html").include(request, response);
            }
        }
        writer.close();
    }
}
