
package ru.javawebinar.topjava.web;

import ru.javawebinar.topjava.LoggerWrapper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServlet extends javax.servlet.http.HttpServlet {

    private static final LoggerWrapper LOG = LoggerWrapper.get(UserServlet.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOG.debug("redirect to userList");

//        request.getRequestDispatcher("userList.jsp").forward(request, response);
        response.sendRedirect("/userList.jsp");
    }


}
