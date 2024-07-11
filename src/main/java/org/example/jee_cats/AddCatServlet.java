package org.example.jee_cats;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet ("/addcat")
public class AddCatServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("Serveur lancé");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/addcat.jsp").forward(req, resp);
    }
}
