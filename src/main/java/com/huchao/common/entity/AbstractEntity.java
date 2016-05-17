package com.huchao.common.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@SuppressWarnings("serial")
@MappedSuperclass
public class AbstractEntity implements Serializable {
	
	public static final String ID_PROPERTY_NAME = "id";
	
	private Long id;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "sequenceGenerator")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
	public boolean exist() {
		return id != null && id > 0;
	}

}
