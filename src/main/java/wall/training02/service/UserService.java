package wall.training02.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wall.training02.entity.User;
import wall.training02.mapper.UserMapper;

@Service
public class UserService {
	@Autowired
	UserMapper userMapper;

	public User Sel(int id) {
		return userMapper.Sel(id);
	}

	public List<User> CheckUser() {
		return userMapper.checkUser();
	}

	public int UpdateUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.updateNameById(user);
	}

	public int delUser(int id) {
		// TODO Auto-generated method stub
		return userMapper.delNameById(id);
	}

	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.insertUser(user);
	}

	public int insertUserBatch(List<User> list) {
		// TODO Auto-generated method stub
		return userMapper.insertUserBatch(list);
	}

}
