package com.firebugsoft.template.dubbo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.firebugsoft.template.dubbo.api.IUserService;
import com.firebugsoft.template.dubbo.api.vo.User;

@Service
public class UserService implements IUserService {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Override
	public User findById(Long id) {
		logger.info("start findById(Long "+id+")");
		try {
			Thread.sleep(id);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		logger.info("end findById(Long "+id+")");
		return new User(id, "felix");
	}
}
