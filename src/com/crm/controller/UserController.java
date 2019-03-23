package com.crm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.common.utils.PageBean;
import com.crm.pojo.Customer;
import com.crm.pojo.User;
import com.crm.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value = "/show")
	public String showUser() {		
		return "redirect:/user/list.action";
	}
	
	@RequestMapping("/list")
	public String selectUser(Model model,HttpServletRequest request){
		//得到当前页码
		int pageCode = getPageCode(request);
		//设定每页显示条数
		int pageSize=5;
		PageBean<User> findAllUsers =userService.findAllUsers(pageCode,pageSize);
		//List<User> findAllUsers = userService.findAllUsers();
		model.addAttribute("page", findAllUsers);	
		return "user";		
	}
	
	@RequestMapping("/user_add_but")
	public String addUserShow(){
		return "user_add";
	}
	@RequestMapping("/user_add")
	public String addUser(HttpServletRequest request){
		String usercode = request.getParameter("usercode");
		String password = request.getParameter("password");
		String username = request.getParameter("username");
		String userphone = request.getParameter("userphone");
		String user_mail = request.getParameter("usermail");
		User user = new User();
		user.setUser_code(usercode);
		user.setUser_name(username);
		user.setUser_password(password);
		user.setUser_phone(userphone);
		user.setUser_mail(user_mail);
		user.setUser_state(1);
		user.setAdminFlag("N");
		userService.insertUser(user);		
		return "redirect:/user/list.action";		
	}
	@RequestMapping("/delete")
	public String deleteUser(HttpServletRequest request){
		String id = request.getParameter("id");
		userService.deleteUser(Integer.parseInt(id));		
		return "user";		
	}
	@RequestMapping("/update")
	public String updateUser(User user){
		System.out.println(user+"修改"+"-------");	
		userService.updateUser(user);
		return "user";
	}
	@RequestMapping("/edit")
	@ResponseBody
	public User findUserByCode(Long id){
		User user = userService.findUserById(id+"");	
		return user;
	}
	public int getPageCode(HttpServletRequest request){
		//得到当前页
		String pageCode = request.getParameter("pageCode");
		if(pageCode==null||pageCode.trim().isEmpty()){
			return 1;
		}
		return Integer.parseInt(pageCode);
	}
	
}
