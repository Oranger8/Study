package ru.geekbrains.javaee.study.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/forbidden")
public class ForbiddenServlet extends NavigableServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        super.doGet(req, resp);
        PrintWriter writer = resp.getWriter();
        writer.println("<h2>FORBIDDEN!</h2>");
    }
}
