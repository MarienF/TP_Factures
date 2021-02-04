package fr.epsi.dao;

import fr.epsi.entite.Facture;

import java.util.List;

public interface FactureDao {
    void create(Facture f);

    List<Facture> getFactures();

    Facture getById(long id);
}
