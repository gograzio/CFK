package com.spring.cfk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.cfk.dao.RankDAO;
import com.spring.cfk.vo.BoardVO;

@Service("rank")
public class RankServiceImpl implements RankService {
	
	@Autowired
	private RankDAO dao;
	
	@Override
	public List<BoardVO> getAllRank() {
		return dao.getAllRank();
	}

	@Override
	public List<BoardVO> getMaleRank() {
		return dao.getMaleRank();
	}

	@Override
	public List<BoardVO> getFemaleRank() {
		return dao.getFemaleRank();
	}

	@Override
	public List<BoardVO> getSeokyounRank() {
		return dao.getSeokyounRank();
	}

	@Override
	public List<BoardVO> getKangwonRank() {
		return dao.getKangwonRank();
	}

	@Override
	public List<BoardVO> getChungcheongRank() {
		return dao.getChungcheongRank();
	}

	@Override
	public List<BoardVO> getHonamjejuRank() {
		return dao.getHonamjejuRank();
	}

	@Override
	public List<BoardVO> getYoungnamRank() {
		return dao.getYoungnamRank();
	}
}
