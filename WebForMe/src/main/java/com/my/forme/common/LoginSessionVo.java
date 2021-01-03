package com.my.forme.common;

import java.util.Date;

public class LoginSessionVo {
	
	private Integer uIdx;
	private String userEmail;
	private String userPw;
	private String userNm;
	private Date cdate;
	private String useYn; // 생년월일
	
	public LoginSessionVo() {}

	public Integer getuIdx() {
		return uIdx;
	}

	public void setuIdx(Integer uIdx) {
		this.uIdx = uIdx;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserNm() {
		return userNm;
	}

	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}

	public Date getCdate() {
		return cdate;
	}

	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}

	public String getUseYn() {
		return useYn;
	}

	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}
	
}
