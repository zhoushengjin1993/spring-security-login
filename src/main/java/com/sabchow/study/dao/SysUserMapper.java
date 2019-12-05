package com.sabchow.study.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sabchow.study.entity.SysUser;
import com.sabchow.study.param.SysUserParam;

@Mapper
public interface SysUserMapper {

	List<SysUser> querySysUserList(SysUserParam param);

	int addSysuser(SysUserParam param);

	int updateSysUser(SysUserParam param);

	int delete(int id);

	SysUser fingSysUserByUserName(String userName);
}
