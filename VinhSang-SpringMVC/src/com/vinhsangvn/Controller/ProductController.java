package com.vinhsangvn.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.vinhsangvn.DAO.ProductDAO;
import com.vinhsangvn.DAO.TbCatgoryDAO;
import com.vinhsangvn.ModelLocal.TbCatgory;
import com.vinhsangvn.ModelLocal.TbProduct;



@Controller
public class ProductController {
	 @Autowired
	 @Qualifier("TbCatgoryImp_component")
	 private TbCatgoryDAO catdao;
	
	 @Autowired
	 @Qualifier("ProductImp_component")
	 private ProductDAO productdao;
	
	List<TbCatgory> listcatgory_tiles3;
	
	private String url_href_view_productlistby_catgory="xem-danh-muc";
	
	@RequestMapping(value="/xem-danh-muc/{catgoryid}", method=RequestMethod.GET)
	public ModelAndView viewProductbyCatgory( @PathVariable("catgoryid") String catgoryid,Model model) {
		
		listcatgory_tiles3=catdao.getALLCatgory();
		List<TbProduct> listproduct=new 	ArrayList<TbProduct> ();
		TbCatgory catgory=new TbCatgory();
		if(catdao.getCountCatgorybyID(catgoryid)>0){
			catgory =catdao.getCatgorybyID(catgoryid);
			listproduct=productdao.getListProductByCatgory(catgory);
		}
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home.productlistbycatgory");
		mav.addObject("PathVariablecatgoryid", catgoryid);
		mav.addObject("Pagetitle","catgory  page...");
		mav.addObject("listcatgory",listcatgory_tiles3);
		mav.addObject("listproduct",listproduct);
		mav.addObject("catgoryoject",catgory);
		mav.addObject("url_href_view_productlistby_catgory",url_href_view_productlistby_catgory);
		return mav;
	}
	@RequestMapping(value="/add-product", method=RequestMethod.GET)
	public ModelAndView view_addproduct (){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("product.add");
		mav.addObject("Pagetitle","Add product page...");
		return mav;
		
	}
	@RequestMapping(value="/do_add-product", method=RequestMethod.POST)
	@ResponseBody
	public TbProduct do_addproduct (@ModelAttribute("product") TbProduct product){
		productdao.do_add(product);
		return product;	
	}
}
