package com.spring.cfk;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.cfk.validator.RegistValidator;
import com.spring.cfk.vo.UserVO;

@Controller
public class RegisterController {
	
	@InitBinder  //커맨드객체랑 검증객체랑 연결
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(new RegistValidator());
	}
	
	@RequestMapping(path="/regist",method=RequestMethod.POST)
	public String registPost(@Valid @ModelAttribute("userInfo") UserVO userInfo,BindingResult result) {
		
		if(result.hasErrors())
			return "view/regist";
		return "/cfk";
	}
}
