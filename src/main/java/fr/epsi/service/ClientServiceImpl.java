package fr.epsi.service;

import fr.epsi.dao.ClientDao;
import fr.epsi.dao.ClientDaoImpl;
import fr.epsi.dto.ClientDTO;
import fr.epsi.entite.Client;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class ClientServiceImpl implements ClientService{

    @PersistenceContext
    EntityManager em;

    @Resource
    UserTransaction utx;

    public void create(ClientDTO c){
        Client client = new Client();
        client.setNom(c.getNom());
        client.setAdresse(c.getAdresse());
        ClientDao dao = new ClientDaoImpl(em, utx);

        dao.create(client);
    }
}
