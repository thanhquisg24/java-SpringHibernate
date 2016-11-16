package com.vinhsangvn.ModelLocal;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tb_catgory database table.
 * 
 */
@Entity
@Table(name="tb_catgory")
@NamedQuery(name="TbCatgory.findAll", query="SELECT t FROM TbCatgory t")
public class TbCatgory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String img;

	private String name;

	public TbCatgory() {
		this.name="";
		this.img="";
		this.id="";
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
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

}