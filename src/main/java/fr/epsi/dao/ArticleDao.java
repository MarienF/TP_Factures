package fr.epsi.dao;

import fr.epsi.entite.Article;

import java.util.List;

public interface ArticleDao {
    void create(Article a);

    List<Article> getArticles();
}
