package fr.epsi.service;

import fr.epsi.dao.ArticleDao;
import fr.epsi.dao.ArticleDaoImpl;
import fr.epsi.dao.ClientDao;
import fr.epsi.dao.ClientDaoImpl;
import fr.epsi.dto.ArticleDTO;
import fr.epsi.entite.Article;
import fr.epsi.entite.Client;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;
import java.util.List;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class ArticleServiceImpl implements ArticleService{

    @PersistenceContext
    EntityManager em;

    @Resource
    UserTransaction utx;

    public void create(ArticleDTO a){
        Article article = new Article();
        article.setNom(a.getNom());
        article.setPrix(a.getPrix());
        ArticleDao dao = new ArticleDaoImpl(em, utx);

        dao.create(article);
    }

    public List<Article> getArticles() {
        ArticleDao articleDao = new ArticleDaoImpl(em, utx);
        return articleDao.getArticles();
    }

}
