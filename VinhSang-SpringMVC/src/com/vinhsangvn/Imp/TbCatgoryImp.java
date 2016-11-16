package com.vinhsangvn.Imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;


import com.vinhsangvn.DAO.TbCatgoryDAO;
import com.vinhsangvn.ModelLocal.TbCatgory;

@Component(value="TbCatgoryImp_component")
public class TbCatgoryImp implements TbCatgoryDAO  {
	  @PersistenceContext(unitName = "persistense-local-1")
	    private EntityManager em;
	   @Override
	   public TbCatgory getCatgorybyID(String id){
		   
		   return em.find(TbCatgory.class, id);
	   }
	   
	   @Override
	   public long getCountCatgorybyID(String id){
		   
		   String q = "SELECT COUNT(p) from " + TbCatgory.class.getName() + " p WHERE p.id='"+id+"'";
	        Query query = em.createQuery(q);
	    	
	        long count=(long)query.getSingleResult();
	        return count;

	   }
	   
	   
	   @Override
	   public List<TbCatgory> getALLCatgory() {
	         
	        String q = "SELECT p from " + TbCatgory.class.getName() + " p";
	        Query query = em.createQuery(q);
	        List<TbCatgory> categorys = query.getResultList();
	        return categorys;
	    }
	   @Override
	   public List<TbCatgory> getListCatgoryshowClient(){
		   /*String q = "SELECT p.id,p.name,p.img from " + TbCatgory.class.getName() + " p";
	        Query query = em.createQuery(q);
	        List<TbCatgory> categorys = query.getResultList();
	        return categorys;*/
		   return null;
	   }
	   @Override
	   public String sayhelo(){
		   return "hello9";
	   }

}
