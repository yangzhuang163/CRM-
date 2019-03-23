package com.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("notice")
public class NoticeController {
	
	@RequestMapping(value = "/show")
	public String showNotice() {
		
		return "notice";
	}
	
}
