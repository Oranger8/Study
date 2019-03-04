package ru.geekbrains.javaee.study.servlet;

import ru.geekbrains.javaee.study.repository.ProductRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/catalog")
public class CatalogServlet extends NavigableServlet {

    private ProductRepository productRepository;

    public CatalogServlet() {
        productRepository = new ProductRepository();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.setAttribute("products", productRepository.findAll());
        getServletContext().getRequestDispatcher("/WEB-INF/view/catalog.jsp").forward(req, resp);
    }
}
