package com.spring.cfk;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.cfk.service.RankService;
import com.spring.cfk.vo.BoardVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private RankService service;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	//메인 페이지 커트롤러
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		logger.info("Welcome home!");
		
		List<BoardVO> rank= service.getAllRank();
		List<BoardVO> rank1= service.getMaleRank();
		List<BoardVO> rank2= service.getFemaleRank();
		List<BoardVO> rank3= service.getSeokyounRank();
		List<BoardVO> rank4= service.getKangwonRank();
		List<BoardVO> rank5= service.getChungcheongRank();
		List<BoardVO> rank6= service.getHonamjejuRank();
		List<BoardVO> rank7= service.getYoungnamRank();
		
		model.addAttribute("rank", rank);
		model.addAttribute("rank1", rank1);
		model.addAttribute("rank2", rank2);
		model.addAttribute("rank3", rank3);
		model.addAttribute("rank4", rank4);
		model.addAttribute("rank5", rank5);
		model.addAttribute("rank6", rank6);
		model.addAttribute("rank7", rank7);
		
		return "home";
	
	}
	
	@RequestMapping(value="/regist")
	public String registView() {	
		
		logger.info("회원가입 뷰 요청 ");
		return "/view/regist";	
	}
}
