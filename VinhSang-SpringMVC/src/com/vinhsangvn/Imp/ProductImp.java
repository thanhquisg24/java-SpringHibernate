package com.vinhsangvn.Imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;




import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vinhsangvn.DAO.ProductDAO;
import com.vinhsangvn.ModelLocal.SnowflakeUUID;
import com.vinhsangvn.ModelLocal.TbCatgory;
import com.vinhsangvn.ModelLocal.TbProduct;


@Repository(value="ProductImp_component")
public class ProductImp implements ProductDAO {
	  @PersistenceContext(unitName = "persistense-local-1")
	    private EntityManager em;
	@Override
	public List<TbProduct> getallProduct() {
		  String q = "SELECT p from " + TbProduct.class.getName() + " p";
	        Query query = em.createQuery(q);
	        List<TbProduct> products = query.getResultList();
	        return products;
	}

	@Override 
	public List<TbProduct> getListProductByCatgory(TbCatgory catgory) {
		  String q = "SELECT p from " + TbProduct.class.getName() + " p"
		  		+ " WHERE p.tbcatgoryId = '"+catgory.getId()+"'";
	        Query query = em.createQuery(q,TbProduct.class);
	        List<TbProduct> products = query.getResultList();
	        return products;
	}

	@Override
	public TbProduct getProductById(String id) {
	
		return em.find(TbProduct.class, id);
	}

	@Override
	public String sayhelo() {
		// TODO Auto-generated method stub
		return "hello product DAO";
	}

	@Override
	@Transactional
	public TbProduct do_add(TbProduct product) {
		long uuid=SnowflakeUUID.generate_uuid();
		product.setId(String.valueOf(uuid));
		System.out.println(product.toString());
			em.persist(product);
			return product;
	}

	
	
}
