package fr.epsi.dao;

import fr.epsi.entite.Client;

import java.util.List;

public interface ClientDao {
    void create(Client c);

    List<Client> getClients();
}
