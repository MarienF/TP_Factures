package fr.epsi.dto;

import fr.epsi.entite.LigneFacture;

import java.util.Date;
import java.util.List;

public class FactureDTO {

    private Double id;
    private Date Date;
    private String numero;
    private Double prix;
    private List<LigneFacture> listeLigneFact;


    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public List<LigneFacture> getListeLigneFact() {
        return listeLigneFact;
    }

    public void setListeLigneFact(List<LigneFacture> listeLigneFact) {
        this.listeLigneFact = listeLigneFact;
    }

    public void AddListeLigneFact(LigneFacture ligneFacture){
        this.listeLigneFact.add(ligneFacture);
    }

    public Double getId() {
        return id;
    }
}
