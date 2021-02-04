package fr.epsi.dto;

import fr.epsi.entite.Article;

public class LigneFactureDTO {

    private Integer quantite;
    private Double prix;
    private Article article;

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}
