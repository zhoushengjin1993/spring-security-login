package com.sabchow.utils;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import com.sabchow.security.entity.UserInfo;

public class SecurityUtils {

	public SecurityUtils() {
	}

	public static Long getCurrentUserId() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		Long currentUserId = null;
		UserInfo user = (UserInfo) auth.getPrincipal();
		if (auth == null || "anonymousUser".equalsIgnoreCase(auth.getName())) {
			if (currentUserId == null) {
				currentUserId = 0L;
			}
		} else {
			currentUserId = user.getUserId();
		}
		return currentUserId;
	}
}
