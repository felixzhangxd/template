package com.firebugsoft.template.dubbo.api;

import com.firebugsoft.template.dubbo.api.vo.User;

public interface IUserService {
	User findById(Long id);
}
