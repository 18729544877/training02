package wall.training02.controller;

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
	
	
}