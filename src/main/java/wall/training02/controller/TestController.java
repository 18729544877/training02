package wall.training02.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class TestController {
	@RequestMapping("/test")
	public String index() {
		return "hello";
	}
}