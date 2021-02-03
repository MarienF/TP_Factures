package fr.epsi.controller;

import fr.epsi.service.ArticleService;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ArticleAffichageServlet extends HttpServlet {

    @EJB
    private ArticleService service;

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
        req.setAttribute("articles", service.getArticles());
        this.getServletContext().getRequestDispatcher("/WEB-INF/article.jsp").forward(req, resp);
    }

}
