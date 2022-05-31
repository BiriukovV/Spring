package com.biriukov.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = "/product_servlet")
public class ProductServlet extends HttpServlet {

    private static Logger logger = LoggerFactory.getLogger(ProductServlet.class);


    @Override
    public void service(ServletRequest req, ServletResponse res) throws
            ServletException, IOException {
        logger.info("Products are withdraw");
        List<Product> product = List.of(
                new Product(1, "apple", 1),
                new Product(2, "chery", 2),
                new Product(3, "milk", 3),
                new Product(4, "book", 4),
                new Product(5, "phone", 5),
                new Product(6, "pizza", 6),
                new Product(7, "water", 7),
                new Product(8, "candy", 8),
                new Product(9, "banana", 9),
                new Product(10, "orange", 10)
        );
        res.getWriter().printf("<html><body>");
        for (int i = 0; i < 10; i++) {
            res.getWriter().printf("<h1>" + product.get(i) + "</h1>");
        }
        res.getWriter().printf("</html></body>");
    }






}
