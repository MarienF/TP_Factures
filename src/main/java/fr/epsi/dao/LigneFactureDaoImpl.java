package fr.epsi.dao;

import fr.epsi.entite.LigneFacture;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.transaction.*;
import java.util.List;

public class LigneFactureDaoImpl implements LigneFactureDao{

    EntityManager em;
    UserTransaction utx;

    public LigneFactureDaoImpl(EntityManager em, UserTransaction utx){
        this.em = em;
        this.utx = utx;
    }

    public void create(LigneFacture l){
        try {
            utx.begin();
            em.persist(l);
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

    public List<LigneFacture> getLigneFacture(){
        return em.createQuery("select l from LigneFacture l", LigneFacture.class).getResultList();
    }

}
