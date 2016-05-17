package com.huchao.common.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

import org.apache.commons.lang.time.DateUtils;

@SuppressWarnings("serial")
@MappedSuperclass
public class BaseEntity extends AbstractEntity {
	
	public static final String CREATE_DATE_PROPERTY_NAME = "createDate";
	public static final String MODIFY_DATE_PROPERTY_NAME = "modifyDate";
	
	private Date createDate = new Date();
	private Date modifyDate;
	
	@Column(nullable = false, updatable = true)
	public Date getCreateDate() {
		return createDate;
	}
	

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifyDate() {
		return modifyDate;
	}
	

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	
}
