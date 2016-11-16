package com.vinhsangvn.DAO;

import java.util.List;

import com.vinhsangvn.ModelLocal.TbCatgory;

public interface TbCatgoryDAO {
		
	public List<TbCatgory> getALLCatgory();
	public TbCatgory getCatgorybyID(String id);
	public String sayhelo();
	public List<TbCatgory> getListCatgoryshowClient();
	long getCountCatgorybyID(String id);
		
}
