package com.spring.cfk.service;

import java.util.List;

import com.spring.cfk.vo.BoardVO;

public interface RankService {
	public List<BoardVO> getAllRank();
	public List<BoardVO> getMaleRank();
	public List<BoardVO> getFemaleRank();
	public List<BoardVO> getSeokyounRank();
	public List<BoardVO> getKangwonRank();
	public List<BoardVO> getChungcheongRank();
	public List<BoardVO> getHonamjejuRank();
	public List<BoardVO> getYoungnamRank();
}
