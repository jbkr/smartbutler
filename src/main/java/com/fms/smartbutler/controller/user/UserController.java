package com.fms.smartbutler.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping("/user/join")
	public String join() {
		return "user/join/join";
	}
	
	@GetMapping("/admin/user/list")
	public String userList() {
		return "admin/user/user-list";
	}
	
	@GetMapping("/admin/user/info")
	public String userInfo() {
		return "admin/user/user-info";
	}
	
	@GetMapping("/user/mypage")
	public String mypage() {
		return "user/mypage/mypage";
	}
}
