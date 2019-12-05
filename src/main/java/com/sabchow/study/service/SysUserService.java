package com.sabchow.study.service;

import java.util.List;

import com.sabchow.study.entity.SysUser;
import com.sabchow.study.param.SysUserParam;

public interface SysUserService {

	List<SysUser> querySysUserList(SysUserParam param);

	SysUser fingSysUserByUserName(String userName);
}
