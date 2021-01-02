package com.forme.myweb.vo;

import java.util.Date;

public class BoardVO {

	private Integer bIdx;    // 게시판 IDX
	private String subject; //  글제목
	private String author;  //  작성자
	private Date cdate;    //  등록날짜
	private Date udate;    //  수정날짜
	
	public Integer getbIdx() {
		return bIdx;
	}
	public void setbIdx(Integer bIdx) {
		this.bIdx = bIdx;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getCdate() {
		return cdate;
	}
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	public Date getUdate() {
		return udate;
	}
	public void setUdate(Date udate) {
		this.udate = udate;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append( getClass().getSimpleName() );
		sb.append( " [" );
		sb.append( "Hash = " ).append( hashCode() );
		sb.append( ", bIdx=" ).append( bIdx );
		sb.append( ", subject=" ).append( subject );
		sb.append( ", author=" ).append( author );
		sb.append( ", cdate=" ).append( cdate );
		sb.append( ", udate=" ).append( udate );
		sb.append( "]" );
		return sb.toString();
	}
	
}
