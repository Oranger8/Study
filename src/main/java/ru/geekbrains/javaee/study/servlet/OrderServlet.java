package ru.geekbrains.javaee.study.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/order")
public class OrderServlet extends NavigableServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        super.doGet(req, resp);
        PrintWriter writer = resp.getWriter();
        writer.println("<h2>Order servlet</h2>");
    }
}
