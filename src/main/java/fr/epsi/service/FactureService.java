package fr.epsi.service;

import fr.epsi.dto.FactureDTO;
import fr.epsi.entite.Facture;

import java.util.List;

public interface FactureService {

    void create(FactureDTO f);

    List<Facture> getFactures();

    Facture getById(long id);

}
