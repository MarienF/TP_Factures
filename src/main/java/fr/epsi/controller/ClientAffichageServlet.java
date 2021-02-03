package fr.epsi.controller;

import fr.epsi.entite.Client;
import fr.epsi.service.ClientService;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ClientAffichageServlet", value = "/client")
public class ClientAffichageServlet extends HttpServlet {

    @EJB
    private ClientService service;

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
        req.setAttribute("clients", service.getClients());
        this.getServletContext().getRequestDispatcher("/WEB-INF/client.jsp").forward(req, resp);
    }

}
