package ru.geekbrains.javaee.study.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public abstract class NavigableServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        PrintWriter writer = resp.getWriter();
        writer.printf("" +
                        "<div>" +
                        "   <span>" +
                        "       <a href='%1$s/main'>Main</a>" +
                        "   </span>" +
                        "   <span>" +
                        "       <a href='%1$s/catalog'>Catalog</a>" +
                        "   </span>" +
                        "   <span>" +
                        "       <a href='%1$s/product'>Product</a>" +
                        "   </span>" +
                        "   <span>" +
                        "       <a href='%1$s/cart'>Cart</a>" +
                        "   </span>" +
                        "   <span>" +
                        "       <a href='%1$s/order'>Order</a>" +
                        "   </span>" +
                        "   <span>" +
                        "       <a href='%1$s/about'>About</a>" +
                        "   </span>" +
                        "</div>",
                req.getContextPath());
    }
}
