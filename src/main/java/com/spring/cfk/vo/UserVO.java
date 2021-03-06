package com.spring.cfk.vo;

public class UserVO {
	private String user_id;
	private String user_passwd;
	private String user_chk_passwd;
	private String user_addr;
	private String user_area;
	private String user_tel;
	private int user_age;
	private String user_name;
	private String user_email;
	private String user_gender;
	private String user_attend_date;
	private int user_check_vote;
	private int user_check_parti;
	
	//비밀번호 확인
	public boolean isPasswdEqualToChkPassword() {
		return user_passwd.equals(user_chk_passwd);
	}
	
	public String getUser_id() {
		return user_id;
	}
	public String getUser_chk_passwd() {
		return user_chk_passwd;
	}
	public void setUser_chk_passwd(String user_chk_passwd) {
		this.user_chk_passwd = user_chk_passwd;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_passwd() {
		return user_passwd;
	}
	public void setUser_passwd(String user_passwd) {
		this.user_passwd = user_passwd;
	}
	public String getUser_addr() {
		return user_addr;
	}
	public void setUser_addr(String user_addr) {
		this.user_addr = user_addr;
	}
	public String getUser_area() {
		return user_area;
	}
	public void setUser_area(String user_area) {
		this.user_area = user_area;
	}
	public String getUser_tel() {
		return user_tel;
	}
	public void setUser_tel(String user_tel) {
		this.user_tel = user_tel;
	}
	public int getUser_age() {
		return user_age;
	}
	public void setUser_age(int user_age) {
		this.user_age = user_age;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_gender() {
		return user_gender;
	}
	public void setUser_gender(String user_gender) {
		this.user_gender = user_gender;
	}
	public String getUser_attend_date() {
		return user_attend_date;
	}
	public void setUser_attend_date(String user_attend_date) {
		this.user_attend_date = user_attend_date;
	}
	public int getUser_check_vote() {
		return user_check_vote;
	}
	public void setUser_check_vote(int user_check_vote) {
		this.user_check_vote = user_check_vote;
	}
	public int getUser_check_parti() {
		return user_check_parti;
	}
	public void setUser_check_parti(int user_check_parti) {
		this.user_check_parti = user_check_parti;
	}
	
}
