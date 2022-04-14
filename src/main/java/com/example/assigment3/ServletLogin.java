package com.example.assigment3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
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

        if(username == null)
        {
            writer.println("Didn't recognised you..");
            request.getRequestDispatcher("login.html").include(request,response);
        }
        else{
            if(username.equals("admin") && password.equals("nimda")){
                writer.print("Login ok\n");
                HttpSession session = request.getSession();
                session.setAttribute("username",username);
                session.setAttribute("password",password);
                //request.getRequestDispatcher("ServletMain").forward(request,response);
                response.sendRedirect("ServletAdmin");
            }
            else{
                writer.print("Wrong username or password! Try again\n");
                request.getRequestDispatcher("login.html").include(request,response);
            }
        }
        writer.close();
    }
}
