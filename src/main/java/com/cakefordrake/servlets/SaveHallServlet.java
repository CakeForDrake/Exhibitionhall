package com.cakefordrake.servlets;

import com.cakefordrake.db.DBManager;
import com.cakefordrake.db.bean.HallBean;
import com.cakefordrake.db.entity.Exhibition;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/save_hall")
public class SaveHallServlet extends HttpServlet {
//    private HallBean hallBean = new HallBean();
    private final String PATTERN = "([0-9]+-[0-9]+-[0-9]+)T([0-9]+:[0-9]+)";


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String s = req.getParameter("time").replaceAll(PATTERN,"$1 $2");
       /* SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("yyyy-MM-dd HH:mm");
        Date datetime= null;
        try {
            datetime = format.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }*/
        Exhibition hall = new Exhibition(req.getParameter("name"),
                req.getParameter("description"),
                Integer.parseInt(req.getParameter("hall")),
                s,
                Integer.parseInt(req.getParameter("price")));
        DBManager dbManager = DBManager.getInstance();
        dbManager.insertExhibition(hall);
        resp.sendRedirect("/home");


    }
}
