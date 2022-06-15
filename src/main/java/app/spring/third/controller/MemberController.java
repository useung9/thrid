package app.spring.third.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
					//http://localhost:8081/third/member/main
@Controller	
@RequestMapping("member")

public class MemberController {
	
	@GetMapping("main")
	public String main(Model model) {
	    return "index";
	}
}
