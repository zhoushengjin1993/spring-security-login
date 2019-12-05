package com.sabchow.study.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.sabchow.security.entity.UserInfo;
import com.sabchow.study.entity.SysRole;
import com.sabchow.study.entity.SysUser;
import com.sabchow.study.service.SysUserService;

@Configuration
public class StudySecurityUserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private SysUserService sysUserService;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		System.out.println("用户输入的用户名：" + userName);
		SysUser user = this.sysUserService.fingSysUserByUserName(userName);
		if (user == null) {
			return null;
		}
		UserInfo userDetails = new UserInfo(userName, user.getPassword(), true, true, true, true, getAuthorityList());
		userDetails.setUserId(user.getUserId());
		List<SysRole> roleList = new ArrayList<SysRole>();
		SysRole role1 = new SysRole(1L, "中单", 1);
		SysRole role2 = new SysRole(2L, "上单", 1);
		roleList.add(role1);
		roleList.add(role2);
		userDetails.setRoleList(roleList);
		userDetails.setRoleId(1L);
		return userDetails;
	}

	private Collection<GrantedAuthority> getAuthorityList() {
		List<GrantedAuthority> authorityList = new ArrayList<GrantedAuthority>();
		authorityList.add(new SimpleGrantedAuthority("STUDY_ADD"));
		authorityList.add(new SimpleGrantedAuthority("STUDY_UPDATE"));
		return authorityList;
	}
}
