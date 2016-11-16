package com.vinhsangvn.Imp;

import java.util.List;





import org.springframework.stereotype.Repository;

import com.vinhsangvn.DAO.TbCatgoryDAO;
import com.vinhsangvn.ModelLocal.TbCatgory;

@Repository(value="cat2Imp_component")
public class cat2Imp implements TbCatgoryDAO {

	@Override
	public List<TbCatgory> getALLCatgory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TbCatgory getCatgorybyID(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String sayhelo() {
		// TODO Auto-generated method stub
		return "CXat2";
	}

	@Override
	public List<TbCatgory> getListCatgoryshowClient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getCountCatgorybyID(String id) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
