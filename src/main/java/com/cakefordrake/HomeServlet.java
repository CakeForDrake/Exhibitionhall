package com.cakefordrake;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/home")
public class HomeServlet extends HttpServlet{

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException
    {
        /*response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        printWriter.write("Hello!");
        printWriter.close();*/

        String path = "/resources/home.jsp";
        ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
        requestDispatcher.forward(request, response);

        /*RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/html/myfile.html");
        rd.include(request, response);*/
    }
}
