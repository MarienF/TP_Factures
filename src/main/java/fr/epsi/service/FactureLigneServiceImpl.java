package fr.epsi.service;

import fr.epsi.dao.LigneFactureDao;
import fr.epsi.dao.LigneFactureDaoImpl;
import fr.epsi.dto.LigneFactureDTO;
import fr.epsi.entite.LigneFacture;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;
import java.util.List;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class FactureLigneServiceImpl implements FactureLigneService{

    @PersistenceContext
    EntityManager em;

    @Resource
    UserTransaction utx;

    public void create(LigneFactureDTO l){
        LigneFacture ligneFacture = new LigneFacture();
        ligneFacture.setQuantite(l.getQuantite());
        ligneFacture.setArticle(l.getArticle());
        ligneFacture.setPrix(l.getPrix());
        LigneFactureDao dao = new LigneFactureDaoImpl(em, utx);
        dao.create(ligneFacture);
    }

    public List<LigneFacture> getLignes(){
        LigneFactureDao ligneFactureDao = new LigneFactureDaoImpl(em, utx);
        return ligneFactureDao.getLigneFacture();
    }
}
