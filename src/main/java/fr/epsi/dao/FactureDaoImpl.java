package fr.epsi.dao;

import fr.epsi.entite.Client;
import fr.epsi.entite.Facture;

import javax.persistence.EntityManager;
import javax.transaction.*;
import java.util.List;

public class FactureDaoImpl implements FactureDao {

    EntityManager em;
    UserTransaction utx;

    public FactureDaoImpl(EntityManager em, UserTransaction utx){
        this.em = em;
        this.utx = utx;
    }

    public void create(Facture f) {
        try{
            utx.begin();
            em.persist(f);
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


    public List<Facture> getFactures() {
        return em.createQuery("select f from Facture f", Facture.class).getResultList();
    }

    public Facture getById(long id){
        return em.find(Facture.class, id);
    }
}
