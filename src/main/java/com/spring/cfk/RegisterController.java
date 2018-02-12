package com.spring.cfk;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.cfk.vo.UserVO;

@Controller
public class RegisterController {
	
	@RequestMapping(path="/regist",method=RequestMethod.POST)
	public String registPost(@Valid @ModelAttribute("userInfo") UserVO userInfo,BindingResult result) {
		
		if(result.hasErrors())
			return "view/regist";
		return "/cfk";
	}
}
