package com.spring.cfk.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.cfk.vo.BoardVO;

@Repository
public class RankDAO {
	
	//세션 기능
	@Autowired
	private SqlSession session;
	
	private static final String namespace="mappers.boardMapper";
	
	//랭크 기능
	public List<BoardVO> getAllRank(){
		return session.selectList(namespace+".allRankBoard");
	}
	public List<BoardVO> getMaleRank(){
		return session.selectList(namespace+".maleRankBoard");
	}
	public List<BoardVO> getFemaleRank(){
		return session.selectList(namespace+".femaleRankBoard");
	}
	public List<BoardVO> getSeokyounRank(){
		return session.selectList(namespace+".seokyoungRankBoard");
	}
	public List<BoardVO> getKangwonRank(){
		return session.selectList(namespace+".kangwonRankBoard");
	}
	public List<BoardVO> getChungcheongRank(){
		return session.selectList(namespace+".chungcheongRankBoard");
	}
	public List<BoardVO> getHonamjejuRank(){
		return session.selectList(namespace+".honamjejuRankBoard");
	}
	public List<BoardVO> getYoungnamRank(){
		return session.selectList(namespace+".youngnamRankBoard");
	}
}
