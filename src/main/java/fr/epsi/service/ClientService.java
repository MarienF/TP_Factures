package fr.epsi.service;

import fr.epsi.dto.ClientDTO;
import fr.epsi.entite.Client;

import java.util.List;

public interface ClientService {

    void create(ClientDTO c);

    List<Client> getClients();

}
