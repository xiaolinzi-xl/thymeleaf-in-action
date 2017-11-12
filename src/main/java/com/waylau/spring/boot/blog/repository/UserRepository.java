package com.waylau.spring.boot.blog.repository;

import java.util.List;

import com.waylau.spring.boot.blog.domain.User;

/**
 * User Repository接口 类似于dao层
 * @author xiaolinzi
 *
 */
public interface UserRepository {
	
	/**
	 * 创建或者更新用户
	 * @param user
	 * @return
	 */
	User saveOrUpdateUser(User user);
	
	/**
	 * 删除用户
	 * @param id
	 */
	void deleteUser(Long id);
	
	/**
	 * 根据id查询用户
	 * @param id
	 * @return
	 */
	User getUserById(Long id);
	
	/**
	 * 获取用户列表
	 * @return
	 */
	List<User> listUsers();
}
