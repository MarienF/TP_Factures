package fr.epsi.controller;

import fr.epsi.entite.Facture;
import fr.epsi.entite.LigneFacture;
import fr.epsi.service.FactureService;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FactureDetailServlet extends HttpServlet {

    @EJB
    private FactureService factureService;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        Facture facture = factureService.getById(Long.parseLong(request.getParameter("id"))); // passe l'id de la facture pour affichage detail
        System.out.println(facture.getNumero());
        System.out.println(facture.getListeLigneFact().size());
        for (LigneFacture ligne : facture.getListeLigneFact()) {
            System.out.println(ligne.getQuantite());
        }
        request.setAttribute("facture", facture);

        this.getServletContext().getRequestDispatcher("/WEB-INF/detailFacture.jsp").forward(request, response);
    }
}
