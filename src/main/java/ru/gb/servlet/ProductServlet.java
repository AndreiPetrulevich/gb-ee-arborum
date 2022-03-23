package ru.gb.servlet;

import ru.gb.model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;

@WebServlet (name = "ProductServlet", urlPatterns = "/products")
public class ProductServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("products", createProductList());
        getServletContext().getRequestDispatcher("/products.jsp").forward(req, resp);
    }

    private ArrayList<Product> createProductList() {
        var products = new ArrayList<Product>();
        for (int i = 1; i <= 10 ; i++) {
            products.add(new Product(i, "Product" + i, costGenerator(i)));
        }
        return products;
    }

    private String costGenerator(int number){
        return String.format("%.2f", Math.random() * 1000 * number);
    }
}
