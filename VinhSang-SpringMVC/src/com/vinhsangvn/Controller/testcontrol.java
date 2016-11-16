package com.vinhsangvn.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.vinhsangvn.DAO.ProductDAO;
import com.vinhsangvn.DAO.TbCatgoryDAO;
import com.vinhsangvn.ModelLocal.TbCatgory;
import com.vinhsangvn.ModelLocal.TbProduct;



@Controller
@RequestMapping(value="/test")
public class testcontrol {
	// private TbCatgoryDAO catgorydao;
	 @Autowired
	 @Qualifier("TbCatgoryImp_component")
	 private TbCatgoryDAO catdao;
	 
	 @Autowired
	 @Qualifier("ProductImp_component")
	 private ProductDAO prodao;
	
	 
	 
	 
	 
	 
	
	@RequestMapping(value="/ffff",method=RequestMethod.GET)
	@ResponseBody
	public String get1(HttpServletRequest request,HttpServletResponse response) {
		return "FFFFFFFFFFFFFFFFFFF";
	
	}
	
	@RequestMapping(value="/wild",method=RequestMethod.GET)
	@ResponseBody
	public String test_jossclient(HttpServletRequest request,HttpServletResponse response) {
		//TbCatgory cat=CatgoryDAO_remote_bll.get_catgory_byid("CA1");
		//return cat.getName();
		//return CatgoryDAO_remote_bll.get_catgory_byid("CA1");
		/*TbCatgory cat =new TbCatgory();
		cat.setName("name1111");
		return cat.getName();*/
		return "123213";
	}
	
	@RequestMapping(value="/cat",method=RequestMethod.GET)
	@ResponseBody
	public String getcat(HttpServletRequest request,HttpServletResponse response) {
		TbCatgory cat11=catdao.getCatgorybyID("CA1");
		return cat11.getName();
		//TbCatgoryImp nn=new TbCatgoryImp();
		//return catdao.sayhelo();
	}
	
	@RequestMapping(value="/jaxb",method=RequestMethod.GET,produces="application/json;charset=UTF-8")
	@ResponseBody
	public String getjaxb(HttpServletRequest request,HttpServletResponse response) {
		TbCatgory c=new TbCatgory();
		c.setId("CA1");
		//TbCatgory cat11=catdao.getCatgorybyID("CA1");
		//return cat11;
		//TbCatgoryImp nn=new TbCatgoryImp();
		List<TbProduct> list=prodao.getListProductByCatgory(c);
		//return new Gson().toJson(list);
		//Gson s=new Gson();
		//return catdao.sayhelo();
		//return list.get(0).getTbCatgory().getId();
		return null;
		
		
	}
	
	@RequestMapping(value="mvc1",method=RequestMethod.GET)
	public String get1(ModelMap model) {
		model.addAttribute("message", "Hello Spring MVC Framework!");
	     return "test";
	
	}
}
