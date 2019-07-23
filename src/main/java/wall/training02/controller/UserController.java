package wall.training02.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import wall.training02.entity.User;
import wall.training02.service.UserService;

@RestController
@RequestMapping("/testBoot")
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping("getUser/{id}")
    public String GetUser(@PathVariable int id){
        return userService.Sel(id).toString();
    }
	
	@RequestMapping("showUser")
    public List<User> GetUser(){
        return userService.CheckUser();
    }
	
	@RequestMapping("updateUser/{id}/{userName}")
    public int UpdateUser(@PathVariable int id, @PathVariable String userName){
        User user = new User();
        user.setId(id);
        user.setUserName(userName);
		return userService.UpdateUser(user);
    }
	
	@RequestMapping("delUser/{id}")
	public int delUser(@PathVariable int id){
		return userService.delUser(id);
	}
	
	@RequestMapping("insertUser/{id}/{name}")
	public int delUser(@PathVariable int id,@PathVariable String name){
		User user = new User();
        user.setId(id);
        user.setUserName(name);
		return userService.insertUser(user);
	}
	
	@RequestMapping("insertUserBatch/{id}/{name}")
	public int insertUsers(@PathVariable int id,@PathVariable String name){
		List<User> list = new ArrayList();
		for(int i=0; i<1000; i++){
			User user = new User();
	        user.setId(id+i);
	        user.setUserName(name + i);
	        list.add(user);
		}
		
		return userService.insertUserBatch(list);
	}
	
	
}