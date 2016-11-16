package com.vinhsangvn.ModelLocal;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tb_product database table.
 * 
 */
@Entity
@Table(name="tb_product")
@NamedQuery(name="TbProduct.findAll", query="SELECT t FROM TbProduct t")
public class TbProduct implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String description;

	private String img;

	private String name;

	private float price;

	@Column(name="tbcatgory_id")
	private String tbcatgoryId;

	public TbProduct() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Object getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImg() {
		return this.img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getTbcatgoryId() {
		return this.tbcatgoryId;
	}

	public void setTbcatgoryId(String tbcatgoryId) {
		this.tbcatgoryId = tbcatgoryId;
	}

	@Override
	public String toString() {
		return "TbProduct [id=" + id + ", description=" + description
				+ ", img=" + img + ", name=" + name + ", price=" + price
				+ ", tbcatgoryId=" + tbcatgoryId + "]";
	}
	
	

}