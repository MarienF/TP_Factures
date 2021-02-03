package fr.epsi.dao;

import fr.epsi.entite.Client;

import javax.persistence.EntityManager;
import javax.transaction.*;
import java.util.List;

public class ClientDaoImpl implements ClientDao {

    EntityManager em;
    UserTransaction utx;

    public ClientDaoImpl(EntityManager em, UserTransaction utx){
        this.em = em;
        this.utx = utx;
    }

    public void create(Client c) {
        try{
            utx.begin();
            em.persist(c);
            utx.commit();
        } catch (NotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SystemException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalStateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (RollbackException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (HeuristicMixedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (HeuristicRollbackException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public List<Client> getClients() {
        return em.createQuery("select c from Client c", Client.class).getResultList();
    }

}
