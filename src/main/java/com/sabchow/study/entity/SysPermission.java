package com.sabchow.study.entity;

import java.io.Serializable;

public class SysPermission implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8333258114633807685L;

	private Long id;
	private String name;
	private String permmit;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPermmit() {
		return permmit;
	}

	public void setPermmit(String permmit) {
		this.permmit = permmit;
	}

}
