package wall.training02.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import wall.training02.entity.User;

@Repository
public interface UserMapper {
 
    User Sel(int id);
    List<User> checkUser();
	int updateNameById(User user);
	int delNameById(int id);
	int insertUser(User user);
    int insertUserBatch(List<User> params);
}
