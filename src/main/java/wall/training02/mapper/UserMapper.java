package wall.training02.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import wall.training02.entity.User;

@Repository
public interface UserMapper {
 
    User Sel(int id);
    List<User> checkUser();
    
}
