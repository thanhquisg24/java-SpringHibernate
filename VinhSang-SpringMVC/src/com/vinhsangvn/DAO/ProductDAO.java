package com.vinhsangvn.DAO;

import java.util.List;

import com.vinhsangvn.ModelLocal.TbCatgory;
import com.vinhsangvn.ModelLocal.TbProduct;



public interface ProductDAO {
	public List<TbProduct> getallProduct();
	
	public List<TbProduct> getListProductByCatgory(TbCatgory catgory);
	
	public TbProduct getProductById(String id);
	public String sayhelo();

	public TbProduct do_add(TbProduct product);
}
