package com.sabchow.study.entity;

import java.io.Serializable;

public class SysRolePermission implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5806809466622550499L;

	private Long roleId;

	private Long perId;

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getPerId() {
		return perId;
	}

	public void setPerId(Long perId) {
		this.perId = perId;
	}

}
