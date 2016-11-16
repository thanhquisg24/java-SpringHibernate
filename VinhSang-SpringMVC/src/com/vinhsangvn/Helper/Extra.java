package com.vinhsangvn.Helper;

import java.util.List;

import org.springframework.context.ApplicationContext;

import com.vinhsangvn.Imp.TbCatgoryImp;
import com.vinhsangvn.ModelLocal.TbCatgory;
import com.vinhsangvn.context.ApplicationContextProvider;



public class Extra {
	
	
	public static String h_getstatic_catgory(){
		ApplicationContext context=ApplicationContextProvider.getApplicationContext();
		TbCatgoryImp imp= context.getBean(TbCatgoryImp.class);
		
		
		return imp.getCatgorybyID("CA1").toString();
		
	}
	public static List<TbCatgory> extra_list_catgory(){
		ApplicationContext context=ApplicationContextProvider.getApplicationContext();
		TbCatgoryImp imp= context.getBean(TbCatgoryImp.class);
		return imp.getALLCatgory();
		
	}
}
