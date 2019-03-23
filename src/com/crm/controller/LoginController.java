package com.crm.controller;
import cn.itcast.vcode.utils.VerifyCode;
import com.crm.pojo.User;
import com.crm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;

@Controller
@RequestMapping("index")
public class LoginController {
	
	@Autowired
	private UserService userService;
	//日期控件
	//<script type="text/javascript" src="${pageContext.request.contextPath }/js/ShowCalendar.js"></script>
	//<input type="text" name="birthday" id="birthday" title="点击选择" onclick="showCalendar(this.id)">
	@RequestMapping("/validate")
	public void validate(HttpServletRequest request, HttpServletResponse response) throws IOException{
		VerifyCode vc = new VerifyCode();
		BufferedImage image = vc.getImage();
		String text = vc.getText();
		request.getSession().setAttribute("session_vcode", text);
		VerifyCode.output(image, response.getOutputStream());
	}
	
	
	@RequestMapping("/login")
	
	public String login(Model model, HttpServletRequest request,HttpServletResponse response,HttpSession session) throws Exception, IOException{
		String usercode = request.getParameter("usercode");
		String password = request.getParameter("password");
		User user = userService.findUserByCode(usercode);
		if(user==null){
			model.addAttribute("msg1", "用户不存在");
			model.addAttribute("usercode",usercode);
			model.addAttribute("password",password);
			return "forward:/index.jsp";
		}
		if(!user.getUser_password().equals(password)){
			model.addAttribute("msg2", "密码错误");
			model.addAttribute("usercode",usercode);
			model.addAttribute("password",password);
			return "forward:/index.jsp";
		}
		String vCode = session.getAttribute("session_vcode").toString();
		String validateCode = request.getParameter("validateCode");
		if(!(validateCode.toUpperCase()).equals(vCode.toUpperCase())){
			model.addAttribute("msg3", "验证码错误");
			model.addAttribute("usercode",usercode);
			model.addAttribute("password",password);
			return "forward:/index.jsp";
		}	
		
		model.addAttribute("username", user.getUser_name());
		return "welcome" ; 
	}
}
