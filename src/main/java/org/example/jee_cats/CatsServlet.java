package org.example.jee_cats;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@WebServlet ("/cats")
public class CatsServlet extends HttpServlet {
    List<Cat> cats;

    @Override
    public void init() throws ServletException {
        System.out.println("Serveur lancé");
//
//        Cat Totoro = new Cat("Totoro", "Européen", "Souris", LocalDate.of(2011, 05, 02));
//        Cat Hiro = new Cat("Hiro", "Angora", "Croquettes", LocalDate.of(2012, 06, 22));
        cats = new ArrayList<>();
//        cats.add(Totoro);
//        cats.add(Hiro);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("cats", cats);
        req.getRequestDispatcher("/cats.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String race = req.getParameter("race");
        String meal = req.getParameter("meal");
        String birthdate = req.getParameter("birthdate");

        Cat newCat = new Cat(name,race,meal, LocalDate.parse(birthdate));
        cats.add(newCat);

        resp.sendRedirect("/JEE_cats_war_exploded/cats");
    }
}
