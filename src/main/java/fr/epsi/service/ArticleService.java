package fr.epsi.service;

import fr.epsi.dto.ArticleDTO;
import fr.epsi.entite.Article;

import java.util.List;

public interface ArticleService {

    void create(ArticleDTO a);

    List<Article> getArticles();
}
