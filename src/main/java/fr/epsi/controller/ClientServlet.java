package fr.epsi.controller;

import fr.epsi.dto.ClientDTO;
import fr.epsi.service.ClientService;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ClientServlet extends HttpServlet {

    @EJB
    private ClientService service;

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
        {
            this.getServletContext().getRequestDispatcher("/WEB-INF/createClient.jsp").forward(req, resp);
        }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
        {
            ClientDTO cDTO = new ClientDTO();
            cDTO.setNom(req.getParameter("nomClient"));
            cDTO.setAdresse(req.getParameter("adresseCLient"));
            service.create(cDTO);
        }
}
