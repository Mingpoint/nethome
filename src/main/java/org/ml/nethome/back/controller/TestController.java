package org.ml.nethome.back.controller;

import javax.servlet.http.HttpServletRequest;

import org.ml.nethome.back.domain.MyTest;
import org.ml.nethome.back.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/test")
public class TestController {
	@Autowired
	private TestService testService;
	@RequestMapping(value = "/index")
	public String test(Model model){
//		MyTest test = testService.searchTest();
//		model.addAttribute("test", test);
		System.out.println("djfdk");
		return "test";
	}
	@RequestMapping(value = "/save")
	@ResponseBody
	public String save(HttpServletRequest request){
		String parameter = request.getParameter("name");
		MyTest test = new MyTest();
		test.setTest(parameter);
		testService.saveTest(test);
		return "sucess!";
	}
}
