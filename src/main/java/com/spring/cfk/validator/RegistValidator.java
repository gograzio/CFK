package com.spring.cfk.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.spring.cfk.vo.UserVO;

public class RegistValidator implements Validator {
	
	//이메일 규칙
	private static final String emailRegExp="^[_A-Za-z0-9\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	
	private Pattern pattern;
	public RegistValidator() {
		pattern=Pattern.compile(emailRegExp);
	}
	
	@Override
	public boolean supports(Class<?> clazz) {
		// 검증할 커맨드 객체(VO,DTO) 넣어주기
		return UserVO.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		UserVO req=(UserVO)target;
		
		//검증할 기준 명시
		
		ValidationUtils.rejectIfEmpty(errors, "user_id", "required");
		ValidationUtils.rejectIfEmpty(errors, "user_passwd", "required");
		
		//패스워드와 확인패스워드는 값이 같아야 함
		if(!req.getUser_passwd().isEmpty()) {
			if(!req.isPasswdEqualToChkPassword()) {
				errors.rejectValue("user_chk_passwd", "notmatch");
			}
		}
		
		ValidationUtils.rejectIfEmpty(errors, "user_name", "required");
		ValidationUtils.rejectIfEmpty(errors, "user_addr", "required");
		ValidationUtils.rejectIfEmpty(errors, "user_tel", "required");
		
		//이메일이 null이거나 비어 있으면 안됨
		if(req.getUser_email()==null||req.getUser_email().trim().isEmpty()) {
			errors.rejectValue("user_email", "required");
		}else {
			//이메일 규칙 체크
			Matcher matcher=pattern.matcher(req.getUser_email());
			if(!matcher.matches()) {
				errors.rejectValue("user_email", "bad");
			}
		}
	}
}
