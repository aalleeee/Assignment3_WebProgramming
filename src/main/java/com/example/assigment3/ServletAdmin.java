package com.example.assigment3;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletAdmin", value = "/ServletAdmin")
public class ServletAdmin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        HttpSession session = request.getSession(false);
        ServletContext context = request.getServletContext();
        if (session != null) {

            request.getRequestDispatcher("header.jsp").include(request, response);

            String username = (String) session.getAttribute("username");
            writer.println("<div class = 'info'>Hello " + username + ", you can edit mote of the day here</div>");

            request.getRequestDispatcher("quote.html").include(request, response);

            if (context.getAttribute("beanMote") == null) {
                context.setAttribute("beanMote", new BeanMotOfTheDay());
            }

            String mote = request.getParameter("mote");

            BeanMotOfTheDay aBean = (BeanMotOfTheDay) (context.getAttribute("beanMote"));
            if (mote != null && mote != "") aBean.setMote_of_the_day(mote);
            //writer.println(aBean.getMote_of_the_day());


        } else {
            writer.println("<br><div class='info'>Please log yourself</div><br>");
            request.getRequestDispatcher("login.html").include(request, response);
        }
        writer.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
