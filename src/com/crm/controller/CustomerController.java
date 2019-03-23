package com.crm.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;


import com.crm.common.utils.PageBean;
import com.crm.pojo.BaseDict;
import com.crm.pojo.Customer;
import com.crm.pojo.QueryVo;
import com.crm.pojo.User;
import com.crm.service.CustomerService;
import com.crm.service.SystemService;
import com.crm.service.UserService;

@Controller
@RequestMapping("customer")
public class CustomerController {

	// 依赖注入
	@Autowired
	private CustomerService customerService;
	@Autowired
	private SystemService systemService;
	@Autowired
	private UserService userService;
	@Value("${customer.from.type}")
	private String FROM_TYPE;
	@Value("${customer.industry.type}")
	private String INDUSTRY_TYPE;
	@Value("${customer.level.type}")
	private String LEVEL_TYPE;

	@RequestMapping(value = "/show")
	public String showCumtomer() {
		return "redirect:/customer/list.action";
	}

	 // 客户列表
	 @RequestMapping(value = "/list")
	 public String list(HttpServletRequest request,
	 String custName, String custSource, String custIndustry, String
	 custLevel, String userId,Model model) {	
	 int pageCode = getPageCode(request);
	 //设定每页显示条数
	 int pageSize=5;
	 QueryVo queryVo = new QueryVo(custName,custSource,custIndustry,custLevel);
	 PageBean<Customer> customers = customerService.queryCustomerByQueryVo(queryVo,pageCode, pageSize);
	 model.addAttribute("page", customers);
	 // 客户来源
	 List<BaseDict> fromType = systemService.findBaseDictListByType(FROM_TYPE);
	 // 客户所属行业
	 List<BaseDict> industryType =
	 systemService.findBaseDictListByType(INDUSTRY_TYPE);
	 // 客户级别
	 List<BaseDict> levelType =
	 systemService.findBaseDictListByType(LEVEL_TYPE);
	 
	 List<User> users = userService.findAllUsers();
	 model.addAttribute("users", users);
	 model.addAttribute("fromType", fromType);
	 model.addAttribute("industryType", industryType);
	 model.addAttribute("levelType", levelType);
	 // 参数回显
	 model.addAttribute("custName", custName);
	 model.addAttribute("custSource", custSource);
	 model.addAttribute("custIndustry", custIndustry);
	 model.addAttribute("custLevel", custLevel);
	
	 return "customer";
	 }	

	@RequestMapping("/edit")
	@ResponseBody
	public Customer getCustomerById(Long id) {
		Customer customer = customerService.getCustomerById(id);
		return customer;
	}

	@RequestMapping("/update")
	//@ResponseBody
	public String customerUpdate(Customer customer) {
		customerService.updateCustomer(customer);
		return "customer";
	}

	@RequestMapping("/delete")
	@ResponseBody
	public String customerDelete(Long id) {
		customerService.deleteCustomer(id);
		return "OK";
	}
	public int getPageCode(HttpServletRequest request){
		//得到当前页
		String pageCode = request.getParameter("pageCode");
		if(pageCode==null||pageCode.trim().isEmpty()){
			return 1;
		}
		return Integer.parseInt(pageCode);
	}
	
	@RequestMapping("/add")
	public String customerAdd(HttpServletRequest request){
		String cust_name = request.getParameter("cust_name");
		String cust_source = request.getParameter("cust_source");
		String cust_industry = request.getParameter("cust_industry");
		String cust_level = request.getParameter("cust_level");
		String cust_linkman = request.getParameter("cust_linkman");
		String cust_phone = request.getParameter("cust_phone");
		String cust_mobile = request.getParameter("cust_mobile");
		String cust_zipcode = request.getParameter("cust_zipcode");
		String cust_address = request.getParameter("cust_address");
		Customer customer = new Customer();
		customer.setCust_name(cust_name);
		customer.setCust_source(cust_source);
		customer.setCust_industry(cust_industry);
		customer.setCust_level(cust_level);
		customer.setCust_linkman(cust_linkman);
		customer.setCust_phone(cust_phone);
		customer.setCust_mobile(cust_mobile);
		customer.setCust_zipcode(cust_zipcode);
		customer.setCust_address(cust_address);
		customer.setCust_createtime(new Date());
		customer.setCust_create_id(22);
		customerService.insertCustomer(customer);
		return "redirect:/customer/list.action";
		
	}
}
