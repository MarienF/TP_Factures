package fr.epsi.controller;

import fr.epsi.service.FactureService;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FactureServlet extends HttpServlet {

    @EJB
    private FactureService service;

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException
    {
        req.setAttribute("factures", service.getFactures());
        this.getServletContext().getRequestDispatcher("/WEB-INF/facture.jsp").forward(req, resp);
    }
}
