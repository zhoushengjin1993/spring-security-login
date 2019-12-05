package com.sabchow.study.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration // 交给spring管理
@EnableWebSecurity // 打开拦截
public class StudySeurityConfig extends WebSecurityConfigurerAdapter {

	/**
	 * 自定义拦截资源
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/login").permitAll().antMatchers("/study/add")
				.hasAnyAuthority("STUDY_ADD").antMatchers("/study/update").hasAnyAuthority("STUDY_UPDATE")
				.antMatchers("/study/delete").hasAnyAuthority("STUDY_DELETE").antMatchers("/study/list")
				.hasAnyAuthority("STUDY_LIST").antMatchers("/**").fullyAuthenticated().and().formLogin()
				.loginPage("/login").and() // formLogin()页面显示正常的默认登录表单，如果是httpBasic()则是浏览器提供的表单（弹框）
				.csrf().disable(); // 跨站刚问
	}

}
