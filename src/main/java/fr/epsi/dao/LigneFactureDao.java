package fr.epsi.dao;

import fr.epsi.entite.LigneFacture;

import java.util.List;

public interface LigneFactureDao {

    void create(LigneFacture l);

    List<LigneFacture> getLigneFacture();
}
