package com.huchao.common.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * 商品项
 * 
 * @author rainy
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "uo_c_item")
@SequenceGenerator(name = "sequenceGenerator", sequenceName = "uo_c_item_sequence")
public class Item extends BaseEntity {

	public enum Ext1Type {
		// 默认
		common,
		// 未拆封
		fresh,
		// root
		rooted;
	}

	private Double price; // 商品价格
	private Ext1Type ext1Type; // 扩展属性：普通，未拆封，ROOT
	private Boolean hasContract;//是否有合约,有则该合约即为商品组合中的合约
	
	// 冗余字段
	private String code; // 商品代码
	private String name; // 商品名称
	private String unit; // 计量单位
	private String model; // 商品规格
	private String fbarCode; // 商品条形码
	private Boolean FISSN; // 是否串码
	private Integer ISBK; // 商品类型(0:正常商品 1;延保卡 2:意外保卡 3:保障包)
	private Double taxRate; // 商品税率

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	

	public Boolean getHasContract() {
		return hasContract;
	}

	public void setHasContract(Boolean hasContract) {
		this.hasContract = hasContract;
	}

	@Enumerated(EnumType.STRING)
	public Ext1Type getExt1Type() {
		return ext1Type;
	}

	public void setExt1Type(Ext1Type ext1Type) {
		this.ext1Type = ext1Type;
	}


	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getFbarCode() {
		return fbarCode;
	}

	public void setFbarCode(String fbarCode) {
		this.fbarCode = fbarCode;
	}

	public Boolean getFISSN() {
		return FISSN;
	}

	public void setFISSN(Boolean fISSN) {
		FISSN = fISSN;
	}

	public Integer getISBK() {
		return ISBK;
	}

	public void setISBK(Integer iSBK) {
		ISBK = iSBK;
	}

	public Double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
	}

}
