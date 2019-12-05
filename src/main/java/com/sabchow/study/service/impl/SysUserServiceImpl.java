package com.sabchow.study.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sabchow.study.dao.SysUserMapper;
import com.sabchow.study.entity.SysUser;
import com.sabchow.study.param.SysUserParam;
import com.sabchow.study.service.SysUserService;

@Service
public class SysUserServiceImpl implements SysUserService {

	@Autowired
	private SysUserMapper sysUserMapper;

	@Override
	public List<SysUser> querySysUserList(SysUserParam param) {
		return sysUserMapper.querySysUserList(param);
	}

	@Override
	public SysUser fingSysUserByUserName(String userName) {
		return sysUserMapper.fingSysUserByUserName(userName);
	}

}
