package com.huchao.common.entity;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(name = "hc_test")
@SequenceGenerator(name = "sequenceGenerator", sequenceName = "hc_test_sequence")
public class TestVO extends BaseEntity{
	
	private String name;
	
	private String type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
