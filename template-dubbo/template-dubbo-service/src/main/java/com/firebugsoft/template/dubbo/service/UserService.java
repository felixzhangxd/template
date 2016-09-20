package com.firebugsoft.template.dubbo.service;

import org.springframework.stereotype.Service;

import com.firebugsoft.template.dubbo.api.IUserService;
import com.firebugsoft.template.dubbo.api.vo.User;

/**
 * 主键生成服务
 */
@Service
public class UserService implements IUserService {
	@Override
	public User findById(Long id) {
		return new User(id, "felix");
	}
}
