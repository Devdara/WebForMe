package com.forme.myweb.vo;

import java.util.Date;

import javax.validation.constraints.NotNull;

public class UserVO{

	private Integer uIdx;         // 사용자 인덱스
	@NotNull
	private String userEmail;    // 사용자 이메일
	@NotNull
	private String userPw;       // 사용자 비밀번호
	@NotNull
	private String userNm;       // 사용자 이름
	private Date cdate;         // 가입일
	@NotNull
	private String useYn;         // 사용자 사용여부
	
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append( getClass().getSimpleName() );
		sb.append( " [" );
		sb.append( "Hash = " ).append( hashCode() );
		sb.append( ", uIdx=" ).append( uIdx );
		sb.append( ", userEmail=" ).append( userEmail );
		sb.append( ", userPw=" ).append( userPw );
		sb.append( ", userNm=" ).append( userNm );
		sb.append( ", cdate=" ).append( cdate );
		sb.append( ", useYn=" ).append( useYn );
		sb.append( "]" );
		return sb.toString();
	}
	
}
