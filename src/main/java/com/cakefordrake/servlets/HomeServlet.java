package com.cakefordrake.servlets;

import com.cakefordrake.db.DBManager;
import com.cakefordrake.db.entity.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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
        /*DBManager dbManager = DBManager.getInstance();
        dbManager.insertUser(new User("Dimasik", "dimasikpivasik321","sidrpidr"));*/
        String path = "/resources/home.jsp";
        ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
        requestDispatcher.forward(request, response);

        /*RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/html/myfile.html");
        rd.include(request, response);*/
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*String path = req.getContextPath() + req.getParameter("href");
        resp.sendRedirect(path);*/
        doGet(req, resp);

    }
}
